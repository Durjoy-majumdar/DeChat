package com.tencent.wcdb.database;

import android.os.Process;
import android.util.Pair;
import android.util.Printer;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.extension.SQLiteExtension;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.LruCache;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
    private static final boolean DEBUG = false;
    /* access modifiers changed from: private */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final String[] HMAC_ALGO_MAPPING = {"HMAC_SHA1", "HMAC_SHA256", "HMAC_SHA512"};
    private static final String[] PBKDF2_ALGO_MAPPING = {"PBKDF2_HMAC_SHA1", "PBKDF2_HMAC_SHA256", "PBKDF2_HMAC_SHA512"};
    private static final String TAG = "WCDB.SQLiteConnection";
    private static final Pattern TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
    private StackTraceElement[] mAcquiredStack;
    /* access modifiers changed from: private */
    public Thread mAcquiredThread;
    /* access modifiers changed from: private */
    public int mAcquiredTid;
    private long mAcquiredTimestamp;
    private int mCancellationSignalAttachCount;
    private SQLiteCipherSpec mCipher;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private int mNativeHandleCount;
    private Operation mNativeOperation;
    private boolean mOnlyAllowReadOnlyOperations;
    private byte[] mPassword;
    /* access modifiers changed from: private */
    public final SQLiteConnectionPool mPool;
    private final PreparedStatementCache mPreparedStatementCache;
    private PreparedStatement mPreparedStatementPool;
    /* access modifiers changed from: private */
    public final OperationLog mRecentOperations = new OperationLog();

    public static final class Operation {
        private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        public ArrayList<Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public Exception mException;
        public boolean mFinished;
        public String mKind;
        public String mSql;
        public long mStartTime;
        public int mTid;
        public int mType;

        private Operation() {
        }

        /* access modifiers changed from: private */
        public String getFormattedStartTime() {
            return sDateFormat.format(new Date(this.mStartTime));
        }

        private String getStatus() {
            return !this.mFinished ? "running" : this.mException != null ? StateEvent.ProcessResult.FAILED : "succeeded";
        }

        public void describe(StringBuilder sb, boolean z) {
            ArrayList<Object> arrayList;
            sb.append(this.mKind);
            if (this.mFinished) {
                sb.append(" took ");
                sb.append(this.mEndTime - this.mStartTime);
                sb.append(LocaleUtil.MALAY);
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.mStartTime);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(getStatus());
            if (this.mSql != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb.append(FastJsonResponse.QUOTE);
            }
            if (this.mTid > 0) {
                sb.append(", tid=");
                sb.append(this.mTid);
            }
            if (!(!z || (arrayList = this.mBindArgs) == null || arrayList.size() == 0)) {
                sb.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.mBindArgs.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb.append(FastJsonResponse.QUOTE);
                        sb.append((String) obj);
                        sb.append(FastJsonResponse.QUOTE);
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append("]");
            }
            Exception exc = this.mException;
            if (exc != null && exc.getMessage() != null) {
                sb.append(", exception=\"");
                sb.append(this.mException.getMessage());
                sb.append(FastJsonResponse.QUOTE);
            }
        }

        public JSONObject dumpJSON(boolean z) {
            JSONObject putOpt = new JSONObject().put(IXWebBroadcastListener.STAGE_START, this.mStartTime).put("kind", this.mKind).put("duration", (this.mFinished ? this.mEndTime : System.currentTimeMillis()) - this.mStartTime).put("status", getStatus()).putOpt("sql", this.mSql);
            int i = this.mTid;
            return putOpt.putOpt("tid", i > 0 ? Integer.valueOf(i) : null).putOpt("exception", this.mException);
        }
    }

    public final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final Operation[] mOperations;

        private OperationLog() {
            this.mOperations = new Operation[20];
        }

        private boolean endOperationDeferLogLocked(Operation operation) {
            if (operation == null) {
                return false;
            }
            operation.mEndTime = System.currentTimeMillis();
            operation.mFinished = true;
            Exception exc = operation.mException;
            if (exc == null || exc.getMessage() == null) {
                return SQLiteDebug.shouldLogSlowQuery(operation.mEndTime - operation.mStartTime);
            }
            return true;
        }

        private Operation getOperationLocked(int i) {
            Operation operation = this.mOperations[i & 255];
            if (operation.mCookie == i) {
                return operation;
            }
            return null;
        }

        private void logOperationLocked(Operation operation, String str) {
            StringBuilder sb = new StringBuilder();
            operation.describe(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            Log.m164297i(SQLiteConnection.TAG, sb.toString());
        }

        private int newOperationCookieLocked(int i) {
            int i2 = this.mGeneration;
            this.mGeneration = i2 + 1;
            return i | (i2 << 8);
        }

        public Operation beginOperation(String str, String str2, Object[] objArr) {
            Operation operation;
            synchronized (this.mOperations) {
                int i = (this.mIndex + 1) % 20;
                operation = this.mOperations[i];
                if (operation == null) {
                    operation = new Operation();
                    this.mOperations[i] = operation;
                } else {
                    operation.mFinished = false;
                    operation.mException = null;
                    ArrayList<Object> arrayList = operation.mBindArgs;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                operation.mStartTime = System.currentTimeMillis();
                operation.mKind = str;
                operation.mSql = str2;
                if (objArr != null) {
                    ArrayList<Object> arrayList2 = operation.mBindArgs;
                    if (arrayList2 == null) {
                        operation.mBindArgs = new ArrayList<>();
                    } else {
                        arrayList2.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            operation.mBindArgs.add(obj);
                        } else {
                            operation.mBindArgs.add(SQLiteConnection.EMPTY_BYTE_ARRAY);
                        }
                    }
                }
                operation.mCookie = newOperationCookieLocked(i);
                operation.mTid = SQLiteConnection.this.mAcquiredTid;
                this.mIndex = i;
            }
            return operation;
        }

        public String describeCurrentOperation() {
            synchronized (this.mOperations) {
                Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                operation.describe(sb, false);
                String sb4 = sb.toString();
                return sb4;
            }
        }

        public void dump(Printer printer, boolean z) {
            synchronized (this.mOperations) {
                printer.println("  Most recently executed operations:");
                int i = this.mIndex;
                Operation operation = this.mOperations[i];
                if (operation != null) {
                    int i2 = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("    ");
                        sb.append(i2);
                        sb.append(": [");
                        sb.append(operation.getFormattedStartTime());
                        sb.append("] ");
                        operation.describe(sb, z);
                        printer.println(sb.toString());
                        i = i > 0 ? i - 1 : 19;
                        i2++;
                        operation = this.mOperations[i];
                        if (operation != null) {
                            if (i2 >= 20) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    printer.println("    <none>");
                }
            }
        }

        public JSONArray dumpJSON(boolean z) {
            JSONArray jSONArray = new JSONArray();
            synchronized (this.mOperations) {
                int i = this.mIndex;
                int i2 = 0;
                while (true) {
                    Operation operation = this.mOperations[i];
                    if (operation == null) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (i2 >= 20) {
                        break;
                    }
                    jSONArray.put(operation.dumpJSON(z));
                    i = i > 0 ? i - 1 : 19;
                    i2 = i3;
                }
            }
            return jSONArray;
        }

        public void endOperation(int i) {
            String str;
            String str2;
            int i2;
            long j;
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (endOperationDeferLogLocked(operationLocked)) {
                    logOperationLocked(operationLocked, (String) null);
                }
                str = operationLocked.mSql;
                str2 = operationLocked.mKind;
                i2 = operationLocked.mType;
                j = operationLocked.mEndTime - operationLocked.mStartTime;
            }
            if (!"prepare".equals(str2) && SQLiteConnection.this.mAcquiredThread != null) {
                SQLiteConnection.this.mPool.traceExecute(str, i2, j);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if ("prepare".equals(r3) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            if (com.tencent.wcdb.database.SQLiteConnection.access$1900(r9.this$0) == null) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
            com.tencent.wcdb.database.SQLiteConnection.access$2000(r9.this$0).traceExecute(r2, r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
            return r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean endOperationDeferLog(int r10) {
            /*
                r9 = this;
                com.tencent.wcdb.database.SQLiteConnection$Operation[] r0 = r9.mOperations
                monitor-enter(r0)
                com.tencent.wcdb.database.SQLiteConnection$Operation r10 = r9.getOperationLocked(r10)     // Catch:{ all -> 0x0036 }
                if (r10 != 0) goto L_0x000c
                r10 = 0
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                return r10
            L_0x000c:
                boolean r1 = r9.endOperationDeferLogLocked(r10)     // Catch:{ all -> 0x0036 }
                java.lang.String r2 = r10.mSql     // Catch:{ all -> 0x0036 }
                java.lang.String r3 = r10.mKind     // Catch:{ all -> 0x0036 }
                int r4 = r10.mType     // Catch:{ all -> 0x0036 }
                long r5 = r10.mEndTime     // Catch:{ all -> 0x0036 }
                long r7 = r10.mStartTime     // Catch:{ all -> 0x0036 }
                long r5 = r5 - r7
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                java.lang.String r10 = "prepare"
                boolean r10 = r10.equals(r3)
                if (r10 != 0) goto L_0x0035
                com.tencent.wcdb.database.SQLiteConnection r10 = com.tencent.wcdb.database.SQLiteConnection.this
                java.lang.Thread r10 = r10.mAcquiredThread
                if (r10 == 0) goto L_0x0035
                com.tencent.wcdb.database.SQLiteConnection r10 = com.tencent.wcdb.database.SQLiteConnection.this
                com.tencent.wcdb.database.SQLiteConnectionPool r10 = r10.mPool
                r10.traceExecute(r2, r4, r5)
            L_0x0035:
                return r1
            L_0x0036:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.OperationLog.endOperationDeferLog(int):boolean");
        }

        public void failOperation(int i, Exception exc) {
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (operationLocked != null) {
                    operationLocked.mException = exc;
                }
            }
        }

        public void logOperation(int i, String str) {
            synchronized (this.mOperations) {
                Operation operationLocked = getOperationLocked(i);
                if (operationLocked != null) {
                    logOperationLocked(operationLocked, str);
                }
            }
        }

        public SQLiteTrace.TraceInfo<String> traceCurrentOperation() {
            synchronized (this.mOperations) {
                Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                SQLiteTrace.TraceInfo<String> traceInfo = new SQLiteTrace.TraceInfo<>(operation.mSql, operation.mStartTime, operation.mTid);
                return traceInfo;
            }
        }
    }

    public static final class PreparedStatement {
        private WeakReference<SQLiteConnection> mConnection;
        /* access modifiers changed from: private */
        public boolean mInCache;
        /* access modifiers changed from: private */
        public boolean mInUse;
        /* access modifiers changed from: private */
        public int mNumParameters;
        private Operation mOperation;
        /* access modifiers changed from: private */
        public PreparedStatement mPoolNext;
        /* access modifiers changed from: private */
        public boolean mReadOnly;
        /* access modifiers changed from: private */
        public String mSql;
        /* access modifiers changed from: private */
        public long mStatementPtr;
        /* access modifiers changed from: private */
        public int mType;

        public PreparedStatement(SQLiteConnection sQLiteConnection) {
            this.mConnection = new WeakReference<>(sQLiteConnection);
        }

        public void attachCancellationSignal(CancellationSignal cancellationSignal) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.attachCancellationSignal(cancellationSignal);
            }
        }

        public void beginOperation(String str, Object[] objArr) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection != null) {
                Operation beginOperation = sQLiteConnection.mRecentOperations.beginOperation(str, this.mSql, objArr);
                this.mOperation = beginOperation;
                beginOperation.mType = this.mType;
            }
        }

        public void bindArguments(Object[] objArr) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.bindArguments(this, objArr);
            }
        }

        public void detachCancellationSignal(CancellationSignal cancellationSignal) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.detachCancellationSignal(cancellationSignal);
            }
        }

        public void endOperation(String str) {
            SQLiteConnection sQLiteConnection;
            if (this.mOperation != null && (sQLiteConnection = this.mConnection.get()) != null) {
                if (sQLiteConnection.mRecentOperations.endOperationDeferLog(this.mOperation.mCookie)) {
                    sQLiteConnection.mRecentOperations.logOperation(this.mOperation.mCookie, str);
                }
                this.mOperation = null;
            }
        }

        public void failOperation(Exception exc) {
            SQLiteConnection sQLiteConnection;
            if (this.mOperation != null && (sQLiteConnection = this.mConnection.get()) != null) {
                sQLiteConnection.mRecentOperations.failOperation(this.mOperation.mCookie, exc);
            }
        }

        public long getPtr() {
            return this.mStatementPtr;
        }

        public String getSQL() {
            return this.mSql;
        }

        public int getType() {
            return this.mType;
        }

        public boolean isReadOnly() {
            return this.mReadOnly;
        }

        public void reset(boolean z) {
            SQLiteConnection sQLiteConnection = this.mConnection.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.resetStatement(this, z);
            }
        }
    }

    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        public void dump(Printer printer) {
            printer.println("  Prepared statement cache:");
            Map snapshot = snapshot();
            if (!snapshot.isEmpty()) {
                int i = 0;
                for (Map.Entry entry : snapshot.entrySet()) {
                    PreparedStatement preparedStatement = (PreparedStatement) entry.getValue();
                    if (preparedStatement.mInCache) {
                        printer.println("    " + i + ": statementPtr=0x" + Long.toHexString(preparedStatement.getPtr()) + ", numParameters=" + preparedStatement.mNumParameters + ", type=" + preparedStatement.mType + ", readOnly=" + preparedStatement.mReadOnly + ", sql=\"" + SQLiteConnection.trimSqlForDisplay((String) entry.getKey()) + FastJsonResponse.QUOTE);
                    }
                    i++;
                }
                return;
            }
            printer.println("    <none>");
        }

        public void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            boolean unused = preparedStatement.mInCache = false;
            if (!preparedStatement.mInUse) {
                SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
            }
        }
    }

    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2 = null;
        this.mPassword = bArr;
        this.mCipher = sQLiteCipherSpec != null ? new SQLiteCipherSpec(sQLiteCipherSpec) : sQLiteCipherSpec2;
        this.mPool = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConfiguration = sQLiteDatabaseConfiguration2;
        this.mConnectionId = i;
        this.mIsPrimaryConnection = z;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) == 0 ? false : true;
        this.mPreparedStatementCache = new PreparedStatementCache(sQLiteDatabaseConfiguration2.maxSqlCacheSize);
    }

    private void applyBlockGuardPolicy(PreparedStatement preparedStatement) {
    }

    /* access modifiers changed from: private */
    public void attachCancellationSignal(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i = this.mCancellationSignalAttachCount + 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void bindArguments(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.mNumParameters) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.mNumParameters + " bind arguments but " + length + " were provided.");
        } else if (length != 0) {
            long ptr = preparedStatement.getPtr();
            for (int i = 0; i < length; i++) {
                Boolean bool = objArr[i];
                int typeOfObject = DatabaseUtils.getTypeOfObject(bool);
                if (typeOfObject == 0) {
                    nativeBindNull(this.mConnectionPtr, ptr, i + 1);
                } else if (typeOfObject == 1) {
                    nativeBindLong(this.mConnectionPtr, ptr, i + 1, ((Number) bool).longValue());
                } else if (typeOfObject == 2) {
                    nativeBindDouble(this.mConnectionPtr, ptr, i + 1, ((Number) bool).doubleValue());
                } else if (typeOfObject == 4) {
                    nativeBindBlob(this.mConnectionPtr, ptr, i + 1, (byte[]) bool);
                } else if (bool instanceof Boolean) {
                    nativeBindLong(this.mConnectionPtr, ptr, i + 1, bool.booleanValue() ? 1 : 0);
                } else {
                    nativeBindString(this.mConnectionPtr, ptr, i + 1, bool.toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void detachCancellationSignal(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i = this.mCancellationSignalAttachCount - 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 0) {
                cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener) null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    private void dispose(boolean z) {
        if (this.mConnectionPtr != 0) {
            int i = this.mRecentOperations.beginOperation("close", (String) null, (Object[]) null).mCookie;
            try {
                this.mPreparedStatementCache.evictAll();
                nativeClose(this.mConnectionPtr);
                this.mConnectionPtr = 0;
            } finally {
                this.mRecentOperations.endOperation(i);
            }
        }
    }

    /* access modifiers changed from: private */
    public void finalizePreparedStatement(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.getPtr());
        recyclePreparedStatement(preparedStatement);
    }

    private SQLiteDebug.DbStats getMainDbStatsUnsafe(int i, long j, long j2) {
        String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            str = str + " (" + this.mConnectionId + ")";
        }
        return new SQLiteDebug.DbStats(str, j, j2, i, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    }

    private static boolean isCacheable(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatement(long j, long j2, boolean z);

    private static native long nativeSQLiteHandle(long j, boolean z);

    private static native void nativeSetKey(long j, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j);

    private static native long nativeWalCheckpoint(long j, String str);

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.mPool.notifyChanges(str, str2, jArr, jArr2, jArr3);
    }

    private void notifyCheckpoint(String str, int i) {
        this.mPool.notifyCheckpoint(str, i);
    }

    private PreparedStatement obtainPreparedStatement(String str, long j, int i, int i2, boolean z) {
        PreparedStatement preparedStatement = this.mPreparedStatementPool;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            PreparedStatement unused = preparedStatement.mPoolNext = null;
            boolean unused2 = preparedStatement.mInCache = false;
        } else {
            preparedStatement = new PreparedStatement(this);
        }
        String unused3 = preparedStatement.mSql = str;
        long unused4 = preparedStatement.mStatementPtr = j;
        int unused5 = preparedStatement.mNumParameters = i;
        int unused6 = preparedStatement.mType = i2;
        boolean unused7 = preparedStatement.mReadOnly = z;
        return preparedStatement;
    }

    public static SQLiteConnection open(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z, bArr, sQLiteCipherSpec);
        try {
            sQLiteConnection.open();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            SQLiteDebug.collectLastIOTraceStats(sQLiteConnection);
            sQLiteConnection.dispose(false);
            throw e;
        }
    }

    private void recyclePreparedStatement(PreparedStatement preparedStatement) {
        String unused = preparedStatement.mSql = null;
        PreparedStatement unused2 = preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    /* access modifiers changed from: private */
    public void resetStatement(PreparedStatement preparedStatement, boolean z) {
        nativeResetStatement(this.mConnectionPtr, preparedStatement.getPtr(), z);
    }

    private void setCheckpointStrategy() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            if (this.mConfiguration.customWALHookEnabled) {
                nativeSetWalHook(this.mConnectionPtr);
            } else if (executeForLong("PRAGMA wal_autocheckpoint", (Object[]) null, (CancellationSignal) null) != 100) {
                executeForLong("PRAGMA wal_autocheckpoint=100", (Object[]) null, (CancellationSignal) null);
            }
        }
    }

    private void setCipherSpec() {
        SQLiteCipherSpec sQLiteCipherSpec = this.mCipher;
        if (sQLiteCipherSpec != null) {
            if (sQLiteCipherSpec.kdfIteration != 0) {
                execute("PRAGMA kdf_iter=" + this.mCipher.kdfIteration, (Object[]) null, (CancellationSignal) null);
            }
            execute("PRAGMA cipher_use_hmac=" + this.mCipher.hmacEnabled, (Object[]) null, (CancellationSignal) null);
            if (this.mCipher.hmacAlgorithm != -1) {
                execute("PRAGMA cipher_hmac_algorithm=" + HMAC_ALGO_MAPPING[this.mCipher.hmacAlgorithm], (Object[]) null, (CancellationSignal) null);
            }
            if (this.mCipher.kdfAlgorithm != -1) {
                execute("PRAGMA cipher_kdf_algorithm=" + PBKDF2_ALGO_MAPPING[this.mCipher.kdfAlgorithm], (Object[]) null, (CancellationSignal) null);
            }
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        if (!this.mIsReadOnlyConnection) {
            long j = this.mConfiguration.foreignKeyConstraintsEnabled ? 1 : 0;
            if (executeForLong("PRAGMA foreign_keys", (Object[]) null, (CancellationSignal) null) != j) {
                execute("PRAGMA foreign_keys=" + j, (Object[]) null, (CancellationSignal) null);
            }
        }
    }

    private void setJournalMode(String str) {
        String executeForString = executeForString("PRAGMA journal_mode", (Object[]) null, (CancellationSignal) null);
        if (!executeForString.equalsIgnoreCase(str)) {
            try {
                if (executeForString("PRAGMA journal_mode=" + str, (Object[]) null, (CancellationSignal) null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteDatabaseLockedException unused) {
            }
            Log.m164301w(TAG, "Could not change the database journal mode of '" + this.mConfiguration.label + "' from '" + executeForString + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        }
    }

    private void setJournalSizeLimit() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection && executeForLong("PRAGMA journal_size_limit", (Object[]) null, (CancellationSignal) null) != 524288) {
            executeForLong("PRAGMA journal_size_limit=524288", (Object[]) null, (CancellationSignal) null);
        }
    }

    private void setLocaleFromConfiguration() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        int i = sQLiteDatabaseConfiguration.openFlags | 16;
        sQLiteDatabaseConfiguration.openFlags = i;
        if ((i & 16) == 0) {
            String locale = sQLiteDatabaseConfiguration.locale.toString();
            nativeRegisterLocalizedCollators(this.mConnectionPtr, locale);
            if (!this.mIsReadOnlyConnection) {
                try {
                    execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", (Object[]) null, (CancellationSignal) null);
                    String executeForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", (Object[]) null, (CancellationSignal) null);
                    if (executeForString == null || !executeForString.equals(locale)) {
                        execute("BEGIN", (Object[]) null, (CancellationSignal) null);
                        execute("DELETE FROM android_metadata", (Object[]) null, (CancellationSignal) null);
                        execute("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, (CancellationSignal) null);
                        execute("REINDEX LOCALIZED", (Object[]) null, (CancellationSignal) null);
                        execute("COMMIT", (Object[]) null, (CancellationSignal) null);
                    }
                } catch (RuntimeException e) {
                    throw new SQLiteException("Failed to change locale for db '" + this.mConfiguration.label + "' to '" + locale + "'.", e);
                } catch (Throwable th) {
                    execute("ROLLBACK", (Object[]) null, (CancellationSignal) null);
                    throw th;
                }
            }
        }
    }

    private void setPageSize() {
        String str;
        long j;
        int i;
        if (!this.mConfiguration.isInMemoryDb()) {
            if (this.mPassword != null) {
                SQLiteCipherSpec sQLiteCipherSpec = this.mCipher;
                if (sQLiteCipherSpec == null || (i = sQLiteCipherSpec.pageSize) <= 0) {
                    i = SQLiteGlobal.defaultPageSize;
                }
                j = (long) i;
                str = "PRAGMA cipher_page_size";
            } else {
                j = (long) SQLiteGlobal.defaultPageSize;
                str = "PRAGMA page_size";
            }
            if (executeForLong(str, (Object[]) null, (CancellationSignal) null) != j) {
                execute(str + "=" + j, (Object[]) null, (CancellationSignal) null);
            }
        }
    }

    private void setReadOnlyFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            execute("PRAGMA query_only = 1", (Object[]) null, (CancellationSignal) null);
        }
    }

    private void setSyncModeFromConfiguration() {
        int i = this.mConfiguration.synchronousMode;
        execute("PRAGMA synchronous=" + i, (Object[]) null, (CancellationSignal) null);
    }

    private void setUpdateNotificationFromConfiguration() {
        long j = this.mConnectionPtr;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        nativeSetUpdateNotification(j, sQLiteDatabaseConfiguration.updateNotificationEnabled, sQLiteDatabaseConfiguration.updateNotificationRowID);
    }

    private void setWalModeFromConfiguration() {
        if (!this.mConfiguration.isInMemoryDb() && !this.mIsReadOnlyConnection) {
            setJournalMode((this.mConfiguration.openFlags & 536870912) != 0 ? "WAL" : SQLiteGlobal.defaultJournalMode);
        }
    }

    private void throwIfStatementForbidden(PreparedStatement preparedStatement) {
        if (this.mOnlyAllowReadOnlyOperations && !preparedStatement.mReadOnly) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* access modifiers changed from: private */
    public static String trimSqlForDisplay(String str) {
        return TRIM_SQL_PATTERN.matcher(str).replaceAll(" ");
    }

    public PreparedStatement acquirePreparedStatement(String str) {
        boolean z;
        PreparedStatement preparedStatement = (PreparedStatement) this.mPreparedStatementCache.get(str);
        if (preparedStatement == null) {
            z = false;
        } else if (!preparedStatement.mInUse) {
            boolean unused = preparedStatement.mInUse = true;
            return preparedStatement;
        } else {
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, nativePrepareStatement);
            int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
            PreparedStatement obtainPreparedStatement = obtainPreparedStatement(str, nativePrepareStatement, nativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, nativePrepareStatement));
            if (!z && isCacheable(sqlStatementType)) {
                this.mPreparedStatementCache.put(str, obtainPreparedStatement);
                boolean unused2 = obtainPreparedStatement.mInCache = true;
            }
            boolean unused3 = obtainPreparedStatement.mInUse = true;
            return obtainPreparedStatement;
        } catch (RuntimeException e) {
            if (preparedStatement == null || !preparedStatement.mInCache) {
                nativeFinalizeStatement(this.mConnectionPtr, nativePrepareStatement);
            }
            throw e;
        }
    }

    public void close() {
        dispose(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r17 = r5;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void collectDbStats(java.util.ArrayList<com.tencent.wcdb.database.SQLiteDebug.DbStats> r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = r26
            java.lang.String r10 = "PRAGMA "
            long r1 = r9.mConnectionPtr
            int r2 = nativeGetDbLookaside(r1)
            r11 = 0
            r13 = 0
            java.lang.String r1 = "PRAGMA page_count;"
            long r3 = r9.executeForLong(r1, r13, r13)     // Catch:{ SQLiteException -> 0x001c }
            java.lang.String r1 = "PRAGMA page_size;"
            long r5 = r9.executeForLong(r1, r13, r13)     // Catch:{ SQLiteException -> 0x001d }
            goto L_0x001e
        L_0x001c:
            r3 = r11
        L_0x001d:
            r5 = r11
        L_0x001e:
            r1 = r25
            com.tencent.wcdb.database.SQLiteDebug$DbStats r1 = r1.getMainDbStatsUnsafe(r2, r3, r5)
            r0.add(r1)
            com.tencent.wcdb.CursorWindow r14 = new com.tencent.wcdb.CursorWindow
            java.lang.String r1 = "collectDbStats"
            r14.<init>((java.lang.String) r1)
            java.lang.String r2 = "PRAGMA database_list;"
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r25
            r4 = r14
            r1.executeForCursorWindow(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r1 = 1
            r2 = 1
        L_0x003d:
            int r3 = r14.getNumRows()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            if (r2 >= r3) goto L_0x00cd
            java.lang.String r3 = r14.getString(r2, r1)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r4 = 2
            java.lang.String r4 = r14.getString(r2, r4)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            r5.append(r10)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            java.lang.String r6 = ".page_count;"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            long r5 = r9.executeForLong(r5, r13, r13)     // Catch:{ SQLiteException -> 0x0081, all -> 0x00c8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r7.append(r10)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r7.append(r3)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            java.lang.String r8 = ".page_size;"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            long r7 = r9.executeForLong(r7, r13, r13)     // Catch:{ SQLiteException -> 0x0082, all -> 0x00c8 }
            r17 = r5
            r19 = r7
            goto L_0x0086
        L_0x0081:
            r5 = r11
        L_0x0082:
            r17 = r5
            r19 = r11
        L_0x0086:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r6 = "  (attached) "
            r5.append(r6)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            int r5 = r4.length()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            if (r5 == 0) goto L_0x00b1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r5.append(r4)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
        L_0x00b1:
            r16 = r3
            com.tencent.wcdb.database.SQLiteDebug$DbStats r3 = new com.tencent.wcdb.database.SQLiteDebug$DbStats     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r15 = r3
            r15.<init>(r16, r17, r19, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00c8 }
            int r2 = r2 + 1
            goto L_0x003d
        L_0x00c8:
            r0 = move-exception
            r14.close()
            throw r0
        L_0x00cd:
            r14.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.collectDbStats(java.util.ArrayList):void");
    }

    public void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0, 0));
    }

    public String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    public void dump(Printer printer, boolean z) {
        printer.println("Connection #" + this.mConnectionId + XVFSFile.PATH_SEPARATOR);
        if (z) {
            printer.println("  connectionPtr: 0x" + Long.toHexString(this.mConnectionPtr));
        }
        printer.println("  isPrimaryConnection: " + this.mIsPrimaryConnection);
        printer.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
        if (this.mAcquiredThread != null) {
            printer.println("  acquiredThread: " + this.mAcquiredThread + " (tid: " + this.mAcquiredTid + ")");
        }
        this.mRecentOperations.dump(printer, z);
        if (z) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    public JSONObject dumpJSON(boolean z) {
        JSONObject put = new JSONObject().put("id", this.mConnectionId).put("ptr", Long.toHexString(this.mConnectionPtr)).put("primary", this.mIsPrimaryConnection).put("readOnly", this.mOnlyAllowReadOnlyOperations);
        Thread thread = this.mAcquiredThread;
        Integer num = null;
        JSONObject putOpt = put.putOpt("thread", thread != null ? thread.toString() : null);
        int i = this.mAcquiredTid;
        if (i > 0) {
            num = Integer.valueOf(i);
        }
        return putOpt.putOpt("tid", num).put("operations", this.mRecentOperations.dumpJSON(z));
    }

    public void endNativeHandle(Exception exc) {
        int i = this.mNativeHandleCount - 1;
        this.mNativeHandleCount = i;
        if (i == 0 && this.mNativeOperation != null) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            if (exc == null) {
                this.mRecentOperations.endOperationDeferLog(this.mNativeOperation.mCookie);
            } else {
                this.mRecentOperations.failOperation(this.mNativeOperation.mCookie, exc);
            }
            this.mNativeOperation = null;
        }
    }

    public void execute(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    nativeExecute(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(i, e);
                    throw e;
                } catch (Throwable th4) {
                    this.mRecentOperations.endOperation(i);
                    throw th4;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            int i = 0;
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", str, objArr);
            int i2 = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    i = nativeExecuteForChangedRowCount(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    if (this.mRecentOperations.endOperationDeferLog(i2)) {
                        OperationLog operationLog = this.mRecentOperations;
                        operationLog.logOperation(i2, "changedRows=" + i);
                    }
                    return i;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(i2, e);
                    throw e;
                } catch (Throwable th4) {
                    if (this.mRecentOperations.endOperationDeferLog(i2)) {
                        OperationLog operationLog2 = this.mRecentOperations;
                        operationLog2.logOperation(i2, "changedRows=" + i);
                    }
                    throw th4;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0177 A[Catch:{ all -> 0x01a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int executeForCursorWindow(java.lang.String r25, java.lang.Object[] r26, com.tencent.wcdb.CursorWindow r27, int r28, int r29, boolean r30, com.tencent.wcdb.support.CancellationSignal r31) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            r3 = r27
            r13 = r28
            r14 = r31
            java.lang.String r15 = ", countedRows="
            java.lang.String r12 = ", filledRows="
            java.lang.String r11 = ", actualPos="
            java.lang.String r10 = "', startPos="
            java.lang.String r8 = "window='"
            if (r0 == 0) goto L_0x01b1
            if (r3 == 0) goto L_0x01a9
            r27.acquireReference()
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r4 = r1.mRecentOperations     // Catch:{ all -> 0x01a4 }
            java.lang.String r5 = "executeForCursorWindow"
            com.tencent.wcdb.database.SQLiteConnection$Operation r4 = r4.beginOperation(r5, r0, r2)     // Catch:{ all -> 0x01a4 }
            int r9 = r4.mCookie     // Catch:{ all -> 0x01a4 }
            r16 = -1
            com.tencent.wcdb.database.SQLiteConnection$PreparedStatement r6 = r24.acquirePreparedStatement(r25)     // Catch:{ RuntimeException -> 0x0159, all -> 0x014a }
            int r0 = r6.mType     // Catch:{ RuntimeException -> 0x0159, all -> 0x014a }
            r4.mType = r0     // Catch:{ RuntimeException -> 0x0159, all -> 0x014a }
            r1.throwIfStatementForbidden(r6)     // Catch:{ all -> 0x0136 }
            r1.bindArguments(r6, r2)     // Catch:{ all -> 0x0136 }
            r1.applyBlockGuardPolicy(r6)     // Catch:{ all -> 0x0136 }
            r1.attachCancellationSignal(r14)     // Catch:{ all -> 0x0136 }
            long r4 = r1.mConnectionPtr     // Catch:{ all -> 0x0122 }
            long r17 = r6.getPtr()     // Catch:{ all -> 0x0122 }
            r2 = r8
            r19 = r9
            long r8 = r3.mWindowPtr     // Catch:{ all -> 0x0114 }
            r25 = r2
            r2 = r6
            r6 = r17
            r13 = r25
            r17 = r15
            r15 = r19
            r20 = r10
            r10 = r28
            r21 = r11
            r11 = r29
            r22 = r12
            r12 = r30
            long r4 = nativeExecuteForCursorWindow(r4, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x0107 }
            r0 = 32
            long r6 = r4 >> r0
            int r7 = (int) r6
            int r5 = (int) r4
            int r4 = r27.getNumRows()     // Catch:{ all -> 0x00f7 }
            r3.setStartPosition(r7)     // Catch:{ all -> 0x00e8 }
            r1.detachCancellationSignal(r14)     // Catch:{ all -> 0x00d8 }
            r1.releasePreparedStatement(r2)     // Catch:{ RuntimeException -> 0x00c8, all -> 0x00ba }
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r0 = r1.mRecentOperations     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.endOperationDeferLog(r15)     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x00b6
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r0 = r1.mRecentOperations     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r2.<init>()     // Catch:{ all -> 0x01a4 }
            r2.append(r13)     // Catch:{ all -> 0x01a4 }
            r2.append(r3)     // Catch:{ all -> 0x01a4 }
            r6 = r20
            r2.append(r6)     // Catch:{ all -> 0x01a4 }
            r8 = r28
            r2.append(r8)     // Catch:{ all -> 0x01a4 }
            r9 = r21
            r2.append(r9)     // Catch:{ all -> 0x01a4 }
            r2.append(r7)     // Catch:{ all -> 0x01a4 }
            r10 = r22
            r2.append(r10)     // Catch:{ all -> 0x01a4 }
            r2.append(r4)     // Catch:{ all -> 0x01a4 }
            r11 = r17
            r2.append(r11)     // Catch:{ all -> 0x01a4 }
            r2.append(r5)     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a4 }
            r0.logOperation(r15, r2)     // Catch:{ all -> 0x01a4 }
        L_0x00b6:
            r27.releaseReference()
            return r5
        L_0x00ba:
            r0 = move-exception
            r8 = r28
            r12 = r13
            r11 = r17
            r6 = r20
            r9 = r21
            r10 = r22
            goto L_0x016f
        L_0x00c8:
            r0 = move-exception
            r8 = r28
            r12 = r13
            r11 = r17
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            goto L_0x0166
        L_0x00d8:
            r0 = move-exception
            r8 = r28
            r12 = r13
            r11 = r17
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            goto L_0x0144
        L_0x00e8:
            r0 = move-exception
            r8 = r28
            r12 = r13
            r11 = r17
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            goto L_0x0130
        L_0x00f7:
            r0 = move-exception
            r8 = r28
            r12 = r13
            r11 = r17
            r6 = r20
            r9 = r21
            r10 = r22
            r16 = r7
            r4 = -1
            goto L_0x0130
        L_0x0107:
            r0 = move-exception
            r8 = r28
            r12 = r13
            r11 = r17
            r6 = r20
            r9 = r21
            r10 = r22
            goto L_0x012e
        L_0x0114:
            r0 = move-exception
            r9 = r11
            r8 = r13
            r11 = r15
            r15 = r19
            r23 = r12
            r12 = r2
            r2 = r6
            r6 = r10
            r10 = r23
            goto L_0x012e
        L_0x0122:
            r0 = move-exception
            r2 = r6
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
        L_0x012e:
            r4 = -1
            r5 = -1
        L_0x0130:
            r1.detachCancellationSignal(r14)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            goto L_0x0144
        L_0x0136:
            r0 = move-exception
            r2 = r6
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
            r4 = -1
            r5 = -1
        L_0x0144:
            r1.releasePreparedStatement(r2)     // Catch:{ RuntimeException -> 0x0148 }
            throw r0     // Catch:{ RuntimeException -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            goto L_0x0166
        L_0x014a:
            r0 = move-exception
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
            r4 = -1
            r5 = -1
            r7 = -1
            goto L_0x016f
        L_0x0159:
            r0 = move-exception
            r6 = r10
            r10 = r12
            r12 = r8
            r8 = r13
            r23 = r15
            r15 = r9
            r9 = r11
            r11 = r23
            r4 = -1
            r5 = -1
        L_0x0166:
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x016c }
            r2.failOperation(r15, r0)     // Catch:{ all -> 0x016c }
            throw r0     // Catch:{ all -> 0x016c }
        L_0x016c:
            r0 = move-exception
            r7 = r16
        L_0x016f:
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x01a4 }
            boolean r2 = r2.endOperationDeferLog(r15)     // Catch:{ all -> 0x01a4 }
            if (r2 == 0) goto L_0x01a3
            com.tencent.wcdb.database.SQLiteConnection$OperationLog r2 = r1.mRecentOperations     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r13.<init>()     // Catch:{ all -> 0x01a4 }
            r13.append(r12)     // Catch:{ all -> 0x01a4 }
            r13.append(r3)     // Catch:{ all -> 0x01a4 }
            r13.append(r6)     // Catch:{ all -> 0x01a4 }
            r13.append(r8)     // Catch:{ all -> 0x01a4 }
            r13.append(r9)     // Catch:{ all -> 0x01a4 }
            r13.append(r7)     // Catch:{ all -> 0x01a4 }
            r13.append(r10)     // Catch:{ all -> 0x01a4 }
            r13.append(r4)     // Catch:{ all -> 0x01a4 }
            r13.append(r11)     // Catch:{ all -> 0x01a4 }
            r13.append(r5)     // Catch:{ all -> 0x01a4 }
            java.lang.String r4 = r13.toString()     // Catch:{ all -> 0x01a4 }
            r2.logOperation(r15, r4)     // Catch:{ all -> 0x01a4 }
        L_0x01a3:
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            r0 = move-exception
            r27.releaseReference()
            throw r0
        L_0x01a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "window must not be null."
            r0.<init>(r2)
            throw r0
        L_0x01b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "sql must not be null."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.executeForCursorWindow(java.lang.String, java.lang.Object[], com.tencent.wcdb.CursorWindow, int, int, boolean, com.tencent.wcdb.support.CancellationSignal):int");
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                    return nativeExecuteForLastInsertedRowId;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(i, e);
                    throw e;
                } catch (Throwable th4) {
                    this.mRecentOperations.endOperation(i);
                    throw th4;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public long executeForLong(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    long nativeExecuteForLong = nativeExecuteForLong(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                    return nativeExecuteForLong;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(i, e);
                    throw e;
                } catch (Throwable th4) {
                    this.mRecentOperations.endOperation(i);
                    throw th4;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public String executeForString(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
            int i = beginOperation.mCookie;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    String nativeExecuteForString = nativeExecuteForString(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    detachCancellationSignal(cancellationSignal);
                    releasePreparedStatement(acquirePreparedStatement);
                    this.mRecentOperations.endOperation(i);
                    return nativeExecuteForString;
                } catch (Throwable th) {
                    releasePreparedStatement(acquirePreparedStatement);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(i, e);
                    throw e;
                } catch (Throwable th4) {
                    this.mRecentOperations.endOperation(i);
                    throw th4;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    public void finalize() {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.mPool;
            if (!(sQLiteConnectionPool == null || this.mConnectionPtr == 0)) {
                sQLiteConnectionPool.onConnectionLeaked();
            }
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public int getConnectionId() {
        return this.mConnectionId;
    }

    public long getNativeHandle(String str) {
        if (this.mConnectionPtr == 0) {
            return 0;
        }
        if (str != null && this.mNativeOperation == null) {
            Operation beginOperation = this.mRecentOperations.beginOperation(str, (String) null, (Object[]) null);
            this.mNativeOperation = beginOperation;
            beginOperation.mType = 99;
        }
        this.mNativeHandleCount++;
        return nativeSQLiteHandle(this.mConnectionPtr, true);
    }

    public boolean isPreparedStatementInCache(String str) {
        return this.mPreparedStatementCache.get(str) != null;
    }

    public boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    public void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    public void prepare(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        PreparedStatement acquirePreparedStatement;
        if (str != null) {
            Operation beginOperation = this.mRecentOperations.beginOperation("prepare", str, (Object[]) null);
            int i = beginOperation.mCookie;
            try {
                acquirePreparedStatement = acquirePreparedStatement(str);
                beginOperation.mType = acquirePreparedStatement.mType;
                if (sQLiteStatementInfo != null) {
                    sQLiteStatementInfo.numParameters = acquirePreparedStatement.mNumParameters;
                    sQLiteStatementInfo.readOnly = acquirePreparedStatement.mReadOnly;
                    int nativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, acquirePreparedStatement.getPtr());
                    if (nativeGetColumnCount == 0) {
                        sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                    } else {
                        sQLiteStatementInfo.columnNames = new String[nativeGetColumnCount];
                        for (int i2 = 0; i2 < nativeGetColumnCount; i2++) {
                            sQLiteStatementInfo.columnNames[i2] = nativeGetColumnName(this.mConnectionPtr, acquirePreparedStatement.getPtr(), i2);
                        }
                    }
                }
                releasePreparedStatement(acquirePreparedStatement);
                this.mRecentOperations.endOperation(i);
            } catch (RuntimeException e) {
                try {
                    this.mRecentOperations.failOperation(i, e);
                    throw e;
                } catch (Throwable th) {
                    this.mRecentOperations.endOperation(i);
                    throw th;
                }
            } catch (Throwable th4) {
                releasePreparedStatement(acquirePreparedStatement);
                throw th4;
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* JADX INFO: finally extract failed */
    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        boolean z = false;
        this.mOnlyAllowReadOnlyOperations = false;
        long j = WCDBInitializationProbe.apiEnv;
        long nativeSQLiteHandle = nativeSQLiteHandle(this.mConnectionPtr, true);
        try {
            Iterator<SQLiteExtension> it = sQLiteDatabaseConfiguration.extensions.iterator();
            while (it.hasNext()) {
                SQLiteExtension next = it.next();
                if (!this.mConfiguration.extensions.contains(next)) {
                    next.initialize(nativeSQLiteHandle, j);
                }
            }
            nativeSQLiteHandle(this.mConnectionPtr, false);
            int i = sQLiteDatabaseConfiguration.openFlags;
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
            boolean z2 = ((i ^ sQLiteDatabaseConfiguration2.openFlags) & 536870912) != 0;
            boolean z3 = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != sQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled;
            boolean z4 = !sQLiteDatabaseConfiguration.locale.equals(sQLiteDatabaseConfiguration2.locale);
            boolean z5 = sQLiteDatabaseConfiguration.customWALHookEnabled;
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration3 = this.mConfiguration;
            boolean z6 = z5 != sQLiteDatabaseConfiguration3.customWALHookEnabled;
            boolean z7 = sQLiteDatabaseConfiguration.synchronousMode != sQLiteDatabaseConfiguration3.synchronousMode;
            if (!(sQLiteDatabaseConfiguration.updateNotificationEnabled == sQLiteDatabaseConfiguration3.updateNotificationEnabled && sQLiteDatabaseConfiguration.updateNotificationRowID == sQLiteDatabaseConfiguration3.updateNotificationRowID)) {
                z = true;
            }
            sQLiteDatabaseConfiguration3.updateParametersFrom(sQLiteDatabaseConfiguration);
            this.mPreparedStatementCache.resize(sQLiteDatabaseConfiguration.maxSqlCacheSize);
            if (z3) {
                setForeignKeyModeFromConfiguration();
            }
            if (z2) {
                setWalModeFromConfiguration();
            }
            if (z7) {
                setSyncModeFromConfiguration();
            }
            if (z6) {
                setCheckpointStrategy();
            }
            if (z4) {
                setLocaleFromConfiguration();
            }
            if (z) {
                setUpdateNotificationFromConfiguration();
            }
        } catch (Throwable th) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            throw th;
        }
    }

    public void releasePreparedStatement(PreparedStatement preparedStatement) {
        boolean unused = preparedStatement.mInUse = false;
        if (preparedStatement.mInCache) {
            try {
                resetStatement(preparedStatement, true);
            } catch (SQLiteException unused2) {
                this.mPreparedStatementCache.remove(preparedStatement.mSql);
            }
        } else {
            finalizePreparedStatement(preparedStatement);
        }
    }

    public void setAcquisitionState(boolean z, boolean z2) {
        if (z) {
            this.mAcquiredThread = Thread.currentThread();
            this.mAcquiredTid = Process.myTid();
            if (z2) {
                this.mAcquiredStack = this.mAcquiredThread.getStackTrace();
                this.mAcquiredTimestamp = System.currentTimeMillis();
                return;
            }
            this.mAcquiredStack = null;
            this.mAcquiredTimestamp = 0;
            return;
        }
        this.mAcquiredThread = null;
        this.mAcquiredTid = 0;
        this.mAcquiredStack = null;
        this.mAcquiredTimestamp = 0;
    }

    public void setOnlyAllowReadOnlyOperations(boolean z) {
        this.mOnlyAllowReadOnlyOperations = z;
    }

    public String toString() {
        return "SQLiteConnection: " + this.mConfiguration.path + " (" + this.mConnectionId + ")";
    }

    public SQLiteTrace.TraceInfo<String> traceCurrentOperationUnsafe() {
        return this.mRecentOperations.traceCurrentOperation();
    }

    public SQLiteTrace.TraceInfo<StackTraceElement[]> tracePersistAcquisitionUnsafe() {
        StackTraceElement[] stackTraceElementArr = this.mAcquiredStack;
        if (stackTraceElementArr == null) {
            return null;
        }
        return new SQLiteTrace.TraceInfo<>(stackTraceElementArr, this.mAcquiredTimestamp, this.mAcquiredTid);
    }

    public Pair<Integer, Integer> walCheckpoint(String str) {
        if (str == null || str.isEmpty()) {
            str = FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
        }
        long nativeWalCheckpoint = nativeWalCheckpoint(this.mConnectionPtr, str);
        return new Pair<>(Integer.valueOf((int) (nativeWalCheckpoint >> 32)), Integer.valueOf((int) (nativeWalCheckpoint & Util.MAX_32BIT_VALUE)));
    }

    /* JADX INFO: finally extract failed */
    private void open() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        long nativeOpen = nativeOpen(sQLiteDatabaseConfiguration.path, sQLiteDatabaseConfiguration.openFlags, sQLiteDatabaseConfiguration.vfsName);
        this.mConnectionPtr = nativeOpen;
        byte[] bArr = this.mPassword;
        if (bArr != null && bArr.length == 0) {
            this.mPassword = null;
        }
        byte[] bArr2 = this.mPassword;
        if (bArr2 != null) {
            nativeSetKey(nativeOpen, bArr2);
            setCipherSpec();
        }
        setPageSize();
        setReadOnlyFromConfiguration();
        setForeignKeyModeFromConfiguration();
        setWalModeFromConfiguration();
        setSyncModeFromConfiguration();
        setJournalSizeLimit();
        setCheckpointStrategy();
        setLocaleFromConfiguration();
        long j = WCDBInitializationProbe.apiEnv;
        long nativeSQLiteHandle = nativeSQLiteHandle(this.mConnectionPtr, true);
        try {
            Iterator<SQLiteExtension> it = this.mConfiguration.extensions.iterator();
            while (it.hasNext()) {
                it.next().initialize(nativeSQLiteHandle, j);
            }
            nativeSQLiteHandle(this.mConnectionPtr, false);
            setUpdateNotificationFromConfiguration();
        } catch (Throwable th) {
            nativeSQLiteHandle(this.mConnectionPtr, false);
            throw th;
        }
    }
}
