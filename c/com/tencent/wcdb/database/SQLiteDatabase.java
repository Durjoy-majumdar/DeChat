package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Printer;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.DefaultDatabaseErrorHandler;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SQLiteDatabase extends SQLiteClosable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_IO_TRACE = 256;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final int SYNCHRONOUS_EXTRA = 3;
    public static final int SYNCHRONOUS_FULL = 2;
    public static final int SYNCHRONOUS_NORMAL = 1;
    public static final int SYNCHRONOUS_OFF = 0;
    private static final String TAG = "WCDB.SQLiteDatabase";
    private static final WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private final SQLiteDatabaseConfiguration mConfigurationLocked;
    private SQLiteConnectionPool mConnectionPoolLocked;
    private final CursorFactory mCursorFactory;
    private final DatabaseErrorHandler mErrorHandler;
    private boolean mHasAttachedDbsLocked;
    private final Object mLock = new Object();
    private final ThreadLocal<SQLiteSession> mThreadSession = new ThreadLocal<SQLiteSession>() {
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.createSession();
        }
    };

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram);

        SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal);
    }

    public interface CustomFunction {
        void callback(String[] strArr);
    }

    static {
        Class<SQLiteDatabase> cls = SQLiteDatabase.class;
        SQLiteGlobal.initialize();
    }

    private SQLiteDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        this.mCursorFactory = cursorFactory;
        this.mErrorHandler = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler(true) : databaseErrorHandler;
        this.mConfigurationLocked = new SQLiteDatabaseConfiguration(str, i);
    }

    private void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.collectDbStats(arrayList);
            }
        }
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory) {
        return openDatabase(SQLiteDatabaseConfiguration.MEMORY_DB_PATH, cursorFactory, 268435456);
    }

    public static boolean deleteDatabase(File file) {
        if (file != null) {
            boolean delete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                final String str = file.getName() + "-mj";
                File[] listFiles = parentFile.listFiles(new FileFilter() {
                    public boolean accept(File file) {
                        return file.getName().startsWith(str);
                    }
                });
                if (listFiles != null) {
                    for (File delete2 : listFiles) {
                        delete |= delete2.delete();
                    }
                }
            }
            return delete;
        }
        throw new IllegalArgumentException("file must not be null");
    }

    private void dispose(boolean z) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            sQLiteConnectionPool = this.mConnectionPoolLocked;
            this.mConnectionPoolLocked = null;
        }
        if (!z) {
            WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
            synchronized (weakHashMap) {
                weakHashMap.remove(this);
            }
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.close();
            }
        }
    }

    public static void dumpAll(Printer printer, boolean z) {
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().dump(printer, z);
        }
    }

    public static JSONArray dumpAllJSON(boolean z) {
        JSONArray jSONArray = new JSONArray();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().dumpJSON(z));
        }
        return jSONArray;
    }

    private int executeSql(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        SQLiteStatement sQLiteStatement;
        acquireReference();
        try {
            if (DatabaseUtils.getSqlStatementType(str) == 3) {
                boolean z = false;
                synchronized (this.mLock) {
                    if (!this.mHasAttachedDbsLocked) {
                        this.mHasAttachedDbsLocked = true;
                        z = true;
                    }
                }
                if (z) {
                    disableWriteAheadLogging();
                }
            }
            sQLiteStatement = new SQLiteStatement(this, str, objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete(cancellationSignal);
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            return (indexOf <= 0 || (indexOf >= indexOf2 && indexOf2 >= 0)) ? indexOf2 > 0 ? (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str : str : str.substring(0, indexOf);
        }
        throw new IllegalStateException("Invalid tables");
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = sActiveDatabases;
        synchronized (weakHashMap) {
            arrayList.addAll(weakHashMap.keySet());
        }
        return arrayList;
    }

    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().collectDbStats(arrayList);
        }
        return arrayList;
    }

    private static boolean isMainThread() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null && myLooper == Looper.getMainLooper();
    }

    private boolean isReadOnlyLocked() {
        return (this.mConfigurationLocked.openFlags & 1) == 1;
    }

    private Set<String> keySet(ContentValues contentValues) {
        return contentValues.keySet();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|3|4|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        com.tencent.wcdb.support.Log.m164294e(TAG, "Failed to open database '" + getLabel() + "'.", r2);
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void open(byte[] r2, com.tencent.wcdb.database.SQLiteCipherSpec r3, int r4) {
        /*
            r1 = this;
            r1.openInner(r2, r3, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0006 }
            goto L_0x000c
        L_0x0004:
            r2 = move-exception
            goto L_0x000d
        L_0x0006:
            r1.onCorruption()     // Catch:{ SQLiteException -> 0x0004 }
            r1.openInner(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0004 }
        L_0x000c:
            return
        L_0x000d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to open database '"
            r3.append(r4)
            java.lang.String r4 = r1.getLabel()
            r3.append(r4)
            java.lang.String r4 = "'."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            com.tencent.wcdb.support.Log.m164294e(r0, r3, r4)
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.open(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cursorFactory, i, (DatabaseErrorHandler) null);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 121 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openInner(byte[] r3, com.tencent.wcdb.database.SQLiteCipherSpec r4, int r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r1 = r2.mConfigurationLocked     // Catch:{ all -> 0x001a }
            com.tencent.wcdb.database.SQLiteConnectionPool r3 = com.tencent.wcdb.database.SQLiteConnectionPool.open(r2, r1, r3, r4, r5)     // Catch:{ all -> 0x001a }
            r2.mConnectionPoolLocked = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteDatabase, java.lang.Object> r3 = sActiveDatabases
            monitor-enter(r3)
            r4 = 0
            r3.put(r2, r4)     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0015 }
            throw r4
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        L_0x001a:
            r3 = move-exception
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.openInner(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file.getPath(), cursorFactory);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, 805306368, (DatabaseErrorHandler) null, 0);
    }

    public static SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(CursorFactory cursorFactory) {
        return openDatabase(SQLiteDatabaseConfiguration.MEMORY_DB_PATH, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, 805306368, (DatabaseErrorHandler) null, 0);
    }

    public static int releaseMemory() {
        return SQLiteGlobal.releaseMemory();
    }

    private void throwIfNotOpenLocked() {
        if (this.mConnectionPoolLocked == null) {
            throw new IllegalStateException("The database '" + this.mConfigurationLocked.label + "' is not open.");
        }
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        acquireReference();
        try {
            return getThreadSession().yieldTransaction(j, z, (CancellationSignal) null);
        } finally {
            releaseReference();
        }
    }

    public long acquireNativeConnectionHandle(String str, boolean z, boolean z2) {
        if (str == null) {
            str = "unnamedNative";
        }
        int i = z ? 1 : 2;
        if (z2) {
            i |= 4;
        }
        long nativeHandle = getThreadSession().acquireConnectionForNativeHandle(i).getNativeHandle(str);
        if (nativeHandle != 0) {
            return nativeHandle;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    public void addExtension(SQLiteExtension sQLiteExtension) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (this.mConfigurationLocked.extensions.add(sQLiteExtension)) {
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.extensions.remove(sQLiteExtension);
                    throw e;
                }
            }
        }
    }

    public void beginTransaction() {
        beginTransaction((SQLiteTransactionListener) null, true);
    }

    public void beginTransactionNonExclusive() {
        beginTransaction((SQLiteTransactionListener) null, false);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, true);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, false);
    }

    public SQLiteStatement compileStatement(String str) {
        acquireReference();
        try {
            return new SQLiteStatement(this, str, (Object[]) null);
        } finally {
            releaseReference();
        }
    }

    public SQLiteSession createSession() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            sQLiteConnectionPool = this.mConnectionPoolLocked;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    public int delete(String str, String str2, String[] strArr) {
        SQLiteStatement sQLiteStatement;
        String str3;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE " + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), strArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public void disableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i = sQLiteDatabaseConfiguration.openFlags;
            if ((i & 536870912) != 0) {
                sQLiteDatabaseConfiguration.openFlags = i & -536870913;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
                    sQLiteDatabaseConfiguration2.openFlags = 536870912 | sQLiteDatabaseConfiguration2.openFlags;
                    throw e;
                }
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.dump(printer, z);
            }
        }
    }

    public JSONObject dumpJSON(boolean z) {
        synchronized (this.mLock) {
            SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                JSONObject dumpJSON = sQLiteConnectionPool.dumpJSON(z);
                return dumpJSON;
            }
            JSONObject jSONObject = new JSONObject();
            return jSONObject;
        }
    }

    public boolean enableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & 536870912) != 0) {
                return true;
            }
            if (isReadOnlyLocked()) {
                return false;
            }
            if (this.mConfigurationLocked.isInMemoryDb()) {
                Log.m164297i(TAG, "can't enable WAL for memory databases.");
                return false;
            } else if (this.mHasAttachedDbsLocked) {
                Log.m164297i(TAG, "this database: " + this.mConfigurationLocked.label + " has attached databases. can't  enable WAL.");
                return false;
            } else {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                sQLiteDatabaseConfiguration.openFlags = 536870912 | sQLiteDatabaseConfiguration.openFlags;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                    return true;
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.openFlags &= -536870913;
                    throw e;
                }
            }
        }
    }

    public void endTransaction() {
        acquireReference();
        try {
            getThreadSession().endTransaction((CancellationSignal) null);
        } finally {
            releaseReference();
        }
    }

    public void execSQL(String str) {
        executeSql(str, (Object[]) null, (CancellationSignal) null);
    }

    public void finalize() {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public boolean getAsyncCheckpointEnabled() {
        SQLiteCheckpointListener checkpointCallback = getCheckpointCallback();
        return checkpointCallback != null && (checkpointCallback instanceof SQLiteAsyncCheckpointer);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<android.util.Pair<java.lang.String, java.lang.String>>, com.tencent.wcdb.Cursor, java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = rawQuery("pragma database_list;", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3.moveToNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0.add(new android.util.Pair(r3.getString(1), r3.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r3 != 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            com.tencent.wcdb.database.SQLiteConnectionPool r2 = r5.mConnectionPoolLocked     // Catch:{ all -> 0x0059 }
            r3 = 0
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return r3
        L_0x000f:
            boolean r2 = r5.mHasAttachedDbsLocked     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0023
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "main"
            com.tencent.wcdb.database.SQLiteDatabaseConfiguration r4 = r5.mConfigurationLocked     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.path     // Catch:{ all -> 0x0059 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0059 }
            r0.add(r2)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return r0
        L_0x0023:
            r5.acquireReference()     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "pragma database_list;"
            com.tencent.wcdb.Cursor r3 = r5.rawQuery(r1, r3)     // Catch:{ all -> 0x004d }
        L_0x002d:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0046
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x004d }
            r2 = 1
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x004d }
            r4 = 2
            java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x004d }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x004d }
            r0.add(r1)     // Catch:{ all -> 0x004d }
            goto L_0x002d
        L_0x0046:
            r3.close()     // Catch:{ all -> 0x0054 }
            r5.releaseReference()
            return r0
        L_0x004d:
            r0 = move-exception
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ all -> 0x0054 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r5.releaseReference()
            throw r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.getAttachedDbs():java.util.List");
    }

    public SQLiteChangeListener getChangeListener() {
        SQLiteChangeListener changeListener;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            changeListener = this.mConnectionPoolLocked.getChangeListener();
        }
        return changeListener;
    }

    public SQLiteCheckpointListener getCheckpointCallback() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (!this.mConfigurationLocked.customWALHookEnabled) {
                return null;
            }
            SQLiteCheckpointListener checkpointListener = this.mConnectionPoolLocked.getCheckpointListener();
            return checkpointListener;
        }
    }

    public String getLabel() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.label;
        }
        return str;
    }

    public long getMaximumSize() {
        return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", (String[]) null) * getPageSize();
    }

    public long getPageSize() {
        return DatabaseUtils.longForQuery(this, "PRAGMA page_size;", (String[]) null);
    }

    public final String getPath() {
        String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.path;
        }
        return str;
    }

    @Deprecated
    public Map<String, String> getSyncedTables() {
        return new HashMap(0);
    }

    public int getSynchronousMode() {
        int i;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            i = this.mConfigurationLocked.synchronousMode;
        }
        return i;
    }

    public int getThreadDefaultConnectionFlags(boolean z) {
        int i = z ? 1 : 2;
        return isMainThread() ? i | 4 : i;
    }

    public SQLiteSession getThreadSession() {
        return this.mThreadSession.get();
    }

    public SQLiteTrace getTraceCallback() {
        SQLiteTrace traceCallback;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            traceCallback = this.mConnectionPoolLocked.getTraceCallback();
        }
        return traceCallback;
    }

    public int getVersion() {
        return Long.valueOf(DatabaseUtils.longForQuery(this, "PRAGMA user_version;", (String[]) null)).intValue();
    }

    public boolean inTransaction() {
        acquireReference();
        try {
            return getThreadSession().hasTransaction();
        } finally {
            releaseReference();
        }
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLException e2) {
            Log.m164294e(TAG, "Error inserting %s: %s", contentValues, e2);
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        SQLiteStatement sQLiteStatement;
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            int i2 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new Object[size];
                int i3 = 0;
                for (String next : keySet(contentValues)) {
                    sb.append(i3 > 0 ? "," : "");
                    sb.append(next);
                    objArr[i3] = contentValues.get(next);
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                while (i2 < size) {
                    sb.append(i2 > 0 ? ",?" : "?");
                    i2++;
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            long executeInsert = sQLiteStatement.executeInsert();
            sQLiteStatement.close();
            releaseReference();
            return executeInsert;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r4 != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        releaseReference();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.util.ArrayList();
        r0.add(new android.util.Pair(p172io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, getPath()));
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isDatabaseIntegrityOk() {
        /*
            r7 = this;
            r7.acquireReference()
            java.util.List r0 = r7.getAttachedDbs()     // Catch:{ SQLiteException -> 0x002d }
            if (r0 == 0) goto L_0x000a
            goto L_0x0040
        L_0x000a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteException -> 0x002d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x002d }
            r1.<init>()     // Catch:{ SQLiteException -> 0x002d }
            java.lang.String r2 = "databaselist for: "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002d }
            java.lang.String r2 = r7.getPath()     // Catch:{ SQLiteException -> 0x002d }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002d }
            java.lang.String r2 = " couldn't be retrieved. probably because the database is closed"
            r1.append(r2)     // Catch:{ SQLiteException -> 0x002d }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x002d }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x002d }
            throw r0     // Catch:{ SQLiteException -> 0x002d }
        L_0x002a:
            r0 = move-exception
            goto L_0x00b4
        L_0x002d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x002a }
            r0.<init>()     // Catch:{ all -> 0x002a }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "main"
            java.lang.String r3 = r7.getPath()     // Catch:{ all -> 0x002a }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x002a }
            r0.add(r1)     // Catch:{ all -> 0x002a }
        L_0x0040:
            r1 = 0
            r2 = 0
        L_0x0042:
            int r3 = r0.size()     // Catch:{ all -> 0x002a }
            if (r2 >= r3) goto L_0x00af
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x002a }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x002a }
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r5.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "PRAGMA "
            r5.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = r3.first     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00a8 }
            r5.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = ".integrity_check(1);"
            r5.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a8 }
            com.tencent.wcdb.database.SQLiteStatement r4 = r7.compileStatement(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r4.simpleQueryForString()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "ok"
            boolean r6 = com.tencent.wcdb.DatabaseUtils.objectEquals(r5, r6)     // Catch:{ all -> 0x00a8 }
            if (r6 != 0) goto L_0x00a2
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r2.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "PRAGMA integrity_check on "
            r2.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a8 }
            r2.append(r3)     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = " returned: "
            r2.append(r3)     // Catch:{ all -> 0x00a8 }
            r2.append(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a8 }
            com.tencent.wcdb.support.Log.m164293e(r0, r2)     // Catch:{ all -> 0x00a8 }
            r4.close()     // Catch:{ all -> 0x002a }
            r7.releaseReference()
            return r1
        L_0x00a2:
            r4.close()     // Catch:{ all -> 0x002a }
            int r2 = r2 + 1
            goto L_0x0042
        L_0x00a8:
            r0 = move-exception
            if (r4 == 0) goto L_0x00ae
            r4.close()     // Catch:{ all -> 0x002a }
        L_0x00ae:
            throw r0     // Catch:{ all -> 0x002a }
        L_0x00af:
            r7.releaseReference()
            r0 = 1
            return r0
        L_0x00b4:
            r7.releaseReference()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.isDatabaseIntegrityOk():boolean");
    }

    public boolean isDbLockedByCurrentThread() {
        acquireReference();
        try {
            return getThreadSession().hasConnection();
        } finally {
            releaseReference();
        }
    }

    @Deprecated
    public boolean isDbLockedByOtherThreads() {
        return false;
    }

    public boolean isInMemoryDatabase() {
        boolean isInMemoryDb;
        synchronized (this.mLock) {
            isInMemoryDb = this.mConfigurationLocked.isInMemoryDb();
        }
        return isInMemoryDb;
    }

    public boolean isOpen() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnectionPoolLocked != null;
        }
        return z;
    }

    public boolean isReadOnly() {
        boolean isReadOnlyLocked;
        synchronized (this.mLock) {
            isReadOnlyLocked = isReadOnlyLocked();
        }
        return isReadOnlyLocked;
    }

    public boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            z = (this.mConfigurationLocked.openFlags & 536870912) != 0;
        }
        return z;
    }

    @Deprecated
    public void markTableSyncable(String str, String str2) {
    }

    @Deprecated
    public void markTableSyncable(String str, String str2, String str3) {
    }

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    public void onAllReferencesReleased() {
        dispose(false);
    }

    public void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory((CursorFactory) null, z, str, strArr, str2, objArr, str3, str4, str5, str6, (CancellationSignal) null);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return queryWithFactory(cursorFactory, z, str, strArr, str2, objArr, str3, str4, str5, str6, (CancellationSignal) null);
    }

    public Cursor rawQuery(String str, Object[] objArr) {
        return rawQueryWithFactory((CursorFactory) null, str, objArr, (String) null, (CancellationSignal) null);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2) {
        return rawQueryWithFactory(cursorFactory, str, objArr, str2, (CancellationSignal) null);
    }

    public void releaseNativeConnection(long j, Exception exc) {
        getThreadSession().releaseConnectionForNativeHandle(exc);
    }

    public void reopenReadWrite() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (isReadOnlyLocked()) {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                int i = sQLiteDatabaseConfiguration.openFlags;
                sQLiteDatabaseConfiguration.openFlags = (i & -2) | 0;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.openFlags = i;
                    throw e;
                }
            }
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLException e2) {
            Log.m164294e(TAG, "Error inserting " + contentValues, e2);
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void setAsyncCheckpointEnabled(boolean z) {
        setCheckpointCallback(z ? new SQLiteAsyncCheckpointer() : null);
    }

    public void setChangeListener(SQLiteChangeListener sQLiteChangeListener, boolean z) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setChangeListener(sQLiteChangeListener, z);
        }
    }

    public void setCheckpointCallback(SQLiteCheckpointListener sQLiteCheckpointListener) {
        boolean z = true;
        boolean z2 = sQLiteCheckpointListener != null;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            if (sQLiteDatabaseConfiguration.customWALHookEnabled != z2) {
                sQLiteDatabaseConfiguration.customWALHookEnabled = z2;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
                    if (z2) {
                        z = false;
                    }
                    sQLiteDatabaseConfiguration2.customWALHookEnabled = z;
                    throw e;
                }
            }
            this.mConnectionPoolLocked.setCheckpointListener(sQLiteCheckpointListener);
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != z) {
                sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled = z;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.foreignKeyConstraintsEnabled = !z;
                    throw e;
                }
            }
        }
    }

    public void setLocale(Locale locale) {
        if (locale != null) {
            synchronized (this.mLock) {
                throwIfNotOpenLocked();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                Locale locale2 = sQLiteDatabaseConfiguration.locale;
                sQLiteDatabaseConfiguration.locale = locale;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.locale = locale2;
                    throw e;
                }
            }
            return;
        }
        throw new IllegalArgumentException("locale must not be null.");
    }

    @Deprecated
    public void setLockingEnabled(boolean z) {
    }

    public void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i2 = sQLiteDatabaseConfiguration.maxSqlCacheSize;
            sQLiteDatabaseConfiguration.maxSqlCacheSize = i;
            try {
                this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                this.mConfigurationLocked.maxSqlCacheSize = i2;
                throw e;
            }
        }
    }

    public long setMaximumSize(long j) {
        long pageSize = getPageSize();
        long j2 = j / pageSize;
        if (j % pageSize != 0) {
            j2++;
        }
        return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = " + j2, (String[]) null) * pageSize;
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void setSynchronousMode(int i) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            int i2 = sQLiteDatabaseConfiguration.synchronousMode;
            if (i2 != i) {
                sQLiteDatabaseConfiguration.synchronousMode = i;
                try {
                    this.mConnectionPoolLocked.reconfigure(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.mConfigurationLocked.synchronousMode = i2;
                    throw e;
                }
            }
        }
    }

    public void setTraceCallback(SQLiteTrace sQLiteTrace) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConnectionPoolLocked.setTraceCallback(sQLiteTrace);
        }
    }

    public void setTransactionSuccessful() {
        acquireReference();
        try {
            getThreadSession().setTransactionSuccessful();
        } finally {
            releaseReference();
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        SQLiteStatement sQLiteStatement;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            Object[] objArr = new Object[length];
            int i2 = 0;
            for (String next : keySet(contentValues)) {
                sb.append(i2 > 0 ? "," : "");
                sb.append(next);
                objArr[i2] = contentValues.get(next);
                sb.append("=?");
                i2++;
            }
            if (strArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr[i3] = strArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            sQLiteStatement.close();
            releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            releaseReference();
            throw th;
        }
    }

    public Pair<Integer, Integer> walCheckpoint(String str, boolean z) {
        acquireReference();
        try {
            return getThreadSession().walCheckpoint(str, z ? 2 : 0);
        } finally {
            releaseReference();
        }
    }

    @Deprecated
    public boolean yieldIfContended() {
        return yieldIfContendedHelper(false, -1);
    }

    public boolean yieldIfContendedSafely() {
        return yieldIfContendedHelper(true, -1);
    }

    private void beginTransaction(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        acquireReference();
        try {
            getThreadSession().beginTransaction(z ? 2 : 1, sQLiteTransactionListener, getThreadDefaultConnectionFlags(false), (CancellationSignal) null);
        } finally {
            releaseReference();
        }
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, int i2) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i, cursorFactory, databaseErrorHandler);
        sQLiteDatabase.open(bArr, sQLiteCipherSpec, i2);
        return sQLiteDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, 805306368, (DatabaseErrorHandler) null, i);
    }

    public void execSQL(String str, Object[] objArr) {
        executeSql(str, objArr, (CancellationSignal) null);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        return queryWithFactory((CursorFactory) null, z, str, strArr, str2, objArr, str3, str4, str5, str6, cancellationSignal);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), objArr, findEditTable(str), cancellationSignal);
        } finally {
            releaseReference();
        }
    }

    public Cursor rawQuery(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        return rawQueryWithFactory((CursorFactory) null, str, objArr, (String) null, cancellationSignal);
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, Object[] objArr, String str2, CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.mCursorFactory;
            }
            return sQLiteDirectCursorDriver.query(cursorFactory, objArr);
        } finally {
            releaseReference();
        }
    }

    public boolean yieldIfContendedSafely(long j) {
        return yieldIfContendedHelper(true, j);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(file.getPath(), bArr, sQLiteCipherSpec, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, databaseErrorHandler, i);
    }

    public void execSQL(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        executeSql(str, objArr, cancellationSignal);
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, (String) null);
    }

    public static SQLiteDatabase openDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, i, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file.getPath(), bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabaseInWalMode(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 805306368, (DatabaseErrorHandler) null, 0);
    }

    public Cursor query(String str, String[] strArr, String str2, Object[] objArr, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, objArr, str3, str4, str5, str6);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, i, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(file.getPath(), bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, int i2) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, i, databaseErrorHandler, i2);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, int i) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, 268435456, (DatabaseErrorHandler) null, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, 268435456, (DatabaseErrorHandler) null, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, boolean z) {
        return openDatabase(str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, z ? 805306368 : 268435456, (DatabaseErrorHandler) null, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openDatabase(str, bArr, sQLiteCipherSpec, cursorFactory, 268435456, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, int i) {
        return openOrCreateDatabase(str, bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, i);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(str, bArr, (SQLiteCipherSpec) null, cursorFactory, databaseErrorHandler, 0);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cursorFactory, 268435456, databaseErrorHandler);
    }
}
