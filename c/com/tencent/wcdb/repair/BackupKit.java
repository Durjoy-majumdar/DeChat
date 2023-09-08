package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;

public class BackupKit implements CancellationSignal.OnCancelListener {
    public static final int FLAG_FIX_CORRUPTION = 4;
    public static final int FLAG_INCREMENTAL = 16;
    public static final int FLAG_NO_CIPHER = 1;
    public static final int FLAG_NO_COMPRESS = 2;
    public static final int FLAG_NO_CREATE_TABLE = 8;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;
    public static final String TAG = "WCDB.DBBackup";
    private SQLiteDatabase mDB;
    private String mLastError = null;
    private long mNativePtr;
    private int mStatementCount;
    private String[] mTableDesc;

    public BackupKit(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr, int i, String[] strArr) {
        this.mDB = sQLiteDatabase;
        String[] strArr2 = null;
        this.mTableDesc = strArr != null ? (String[]) Arrays.copyOf(strArr, strArr.length) : strArr2;
        if (str != null) {
            long nativeInit = nativeInit(str, bArr, i);
            this.mNativePtr = nativeInit;
            if (nativeInit == 0) {
                throw new SQLiteException("Failed initialize backup context.");
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private static native void nativeCancel(long j);

    private static native void nativeFinish(long j);

    private static native long nativeInit(String str, byte[] bArr, int i);

    private static native String nativeLastError(long j);

    private static native int nativeRun(long j, long j2, String[] strArr);

    private static native int nativeStatementCount(long j);

    public void finalize() {
        release();
        super.finalize();
    }

    public String lastError() {
        return this.mLastError;
    }

    public void onCancel() {
        long j = this.mNativePtr;
        if (j != 0) {
            nativeCancel(j);
        }
    }

    public void release() {
        long j = this.mNativePtr;
        if (j != 0) {
            nativeFinish(j);
            this.mNativePtr = 0;
        }
    }

    public int run() {
        if (this.mNativePtr != 0) {
            long acquireNativeConnectionHandle = this.mDB.acquireNativeConnectionHandle("backup", false, false);
            int nativeRun = nativeRun(this.mNativePtr, acquireNativeConnectionHandle, this.mTableDesc);
            this.mDB.releaseNativeConnection(acquireNativeConnectionHandle, (Exception) null);
            this.mStatementCount = nativeStatementCount(this.mNativePtr);
            this.mLastError = nativeLastError(this.mNativePtr);
            nativeFinish(this.mNativePtr);
            this.mNativePtr = 0;
            return nativeRun;
        }
        throw new IllegalStateException("BackupKit not initialized.");
    }

    public int statementCount() {
        return this.mStatementCount;
    }

    public int run(CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int run = run();
        cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener) null);
        return run;
    }
}
