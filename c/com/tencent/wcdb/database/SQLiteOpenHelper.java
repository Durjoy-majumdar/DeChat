package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.Log;

public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final String TAG = "WCDB.SQLiteOpenHelper";
    private SQLiteCipherSpec mCipher;
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mForcedSingleConnection;
    private boolean mIsInitializing;
    private int mMode;
    private final String mName;
    private boolean mNeedMode;
    private final int mNewVersion;
    private byte[] mPassword;

    static {
        SQLiteGlobal.initialize();
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, (DatabaseErrorHandler) null);
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
        SQLiteDatabase openDatabase;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            try {
                this.mIsInitializing = true;
                if (sQLiteDatabase2 == null) {
                    String str = this.mName;
                    if (str == null) {
                        openDatabase = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null);
                    } else {
                        boolean z2 = this.mForcedSingleConnection;
                        this.mNeedMode = true;
                        int i = this.mEnableWriteAheadLogging ? 8 : 0;
                        this.mMode = i;
                        openDatabase = com.tencent.wcdb.support.Context.openOrCreateDatabase(this.mContext, str, this.mPassword, this.mCipher, i, this.mFactory, this.mErrorHandler, z2 ? 1 : 0);
                    }
                    sQLiteDatabase2 = openDatabase;
                } else if (z && sQLiteDatabase2.isReadOnly()) {
                    sQLiteDatabase2.reopenReadWrite();
                }
            } catch (SQLiteException e) {
                if (!z) {
                    Log.m164294e(TAG, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                    openDatabase = SQLiteDatabase.openDatabase(this.mContext.getDatabasePath(this.mName).getPath(), this.mPassword, this.mCipher, this.mFactory, 1, this.mErrorHandler);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.mDatabase)) {
                    sQLiteDatabase2.close();
                }
                throw th;
            }
            SQLiteDatabase databaseLockedLast = getDatabaseLockedLast(sQLiteDatabase2);
            this.mIsInitializing = false;
            if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.mDatabase)) {
                sQLiteDatabase2.close();
            }
            return databaseLockedLast;
        }
        throw new IllegalStateException("getDatabase called recursively");
    }

    private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase sQLiteDatabase) {
        onConfigure(sQLiteDatabase);
        int version = sQLiteDatabase.getVersion();
        if (version != this.mNewVersion) {
            if (!sQLiteDatabase.isReadOnly()) {
                sQLiteDatabase.beginTransaction();
                if (version == 0) {
                    try {
                        onCreate(sQLiteDatabase);
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    int i = this.mNewVersion;
                    if (version > i) {
                        onDowngrade(sQLiteDatabase, version, i);
                    } else {
                        onUpgrade(sQLiteDatabase, version, i);
                    }
                }
                sQLiteDatabase.setVersion(this.mNewVersion);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } else {
                throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
            }
        }
        onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            Log.m164301w(TAG, "Opened " + this.mName + " in read-only mode");
        }
        this.mDatabase = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public synchronized void close() {
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setForcedSingleConnection(boolean z) {
        synchronized (this) {
            this.mForcedSingleConnection = z;
        }
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                }
                this.mEnableWriteAheadLogging = z;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (i >= 1) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mErrorHandler = databaseErrorHandler;
            this.mPassword = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            this.mCipher = sQLiteCipherSpec2;
            this.mNeedMode = false;
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was " + i);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, bArr, (SQLiteCipherSpec) null, cursorFactory, i, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, (byte[]) null, (SQLiteCipherSpec) null, cursorFactory, i, databaseErrorHandler);
    }
}
