package com.tencent.wcdb.repair;

import android.database.Cursor;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.IOException;

public class RepairKit implements CancellationSignal.OnCancelListener {
    public static final int FLAG_ALL_TABLES = 2;
    public static final int FLAG_CHECK_TABLE_COLUMNS = 4;
    public static final int FLAG_NO_CREATE_TABLES = 1;
    private static final int INTEGRITY_DATA = 2;
    private static final int INTEGRITY_HEADER = 1;
    private static final int INTEGRITY_KDF_SALT = 4;
    public static final int RESULT_CANCELED = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_IGNORE = 2;
    public static final int RESULT_OK = 0;
    private static final String TAG = "WCDB.RepairKit";
    private Callback mCallback;
    private RepairCursor mCurrentCursor;
    private int mIntegrityFlags;
    private LeafInfo mLeafInfo;
    private MasterInfo mMasterInfo;
    private long mNativePtr;

    public interface Callback {
        int onProgress(String str, int i, Cursor cursor);
    }

    public static class LeafInfo {
        public long mLeafPtr;

        private LeafInfo(long j) {
            this.mLeafPtr = j;
        }

        public static LeafInfo load(String str) {
            long access$900 = RepairKit.nativeLoadLeaf(str);
            if (access$900 != 0) {
                return new LeafInfo(access$900);
            }
            throw new IOException("Cannot load leaf info.");
        }

        public static LeafInfo scan(SQLiteDatabase sQLiteDatabase, String[] strArr, CancellationSignal cancellationSignal) {
            Throwable th;
            Exception exc;
            final long[] jArr = new long[1];
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() {
                    public void onCancel() {
                        long j = jArr[0];
                        if (j != 0) {
                            RepairKit.nativeCancelScanLeaf(j);
                        }
                    }
                });
            }
            if (strArr != null && strArr.length == 0) {
                strArr = null;
            }
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("scanLeaf", true, false);
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.throwIfCanceled();
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    exc = e;
                    th = th5;
                }
            }
            if (cancellationSignal == null) {
                jArr = null;
            }
            long access$700 = RepairKit.nativeScanLeaf(acquireNativeConnectionHandle, strArr, jArr);
            if (access$700 != 0) {
                LeafInfo leafInfo = new LeafInfo(access$700);
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener) null);
                }
                sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, (Exception) null);
                return leafInfo;
            }
            throw new SQLiteException("Cannot scan leaf info.");
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener) null);
            }
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, exc);
            throw th;
        }

        public void finalize() {
            release();
            super.finalize();
        }

        public void release() {
            long j = this.mLeafPtr;
            if (j != 0) {
                RepairKit.nativeFreeLeaf(j);
                this.mLeafPtr = 0;
            }
        }

        public void save(String str) {
            long j = this.mLeafPtr;
            if (j != 0 && !RepairKit.nativeSaveLeaf(j, str)) {
                throw new IOException("Cannot save leaf info.");
            }
        }
    }

    public static class MasterInfo {
        public byte[] mKDFSalt;
        public long mMasterPtr;

        private MasterInfo(long j, byte[] bArr) {
            this.mMasterPtr = j;
            this.mKDFSalt = bArr;
        }

        public static MasterInfo load(String str, byte[] bArr, String[] strArr) {
            if (str == null) {
                return make(strArr);
            }
            byte[] bArr2 = new byte[16];
            long access$200 = RepairKit.nativeLoadMaster(str, bArr, strArr, bArr2);
            if (access$200 != 0) {
                return new MasterInfo(access$200, bArr2);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        public static MasterInfo make(String[] strArr) {
            long access$100 = RepairKit.nativeMakeMaster(strArr);
            if (access$100 != 0) {
                return new MasterInfo(access$100, (byte[]) null);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }

        public static boolean save(SQLiteDatabase sQLiteDatabase, String str, byte[] bArr) {
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("backupMaster", true, false);
            boolean access$300 = RepairKit.nativeSaveMaster(acquireNativeConnectionHandle, str, bArr);
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, (Exception) null);
            return access$300;
        }

        public void finalize() {
            release();
            super.finalize();
        }

        public void release() {
            long j = this.mMasterPtr;
            if (j != 0) {
                RepairKit.nativeFreeMaster(j);
                this.mMasterPtr = 0;
            }
        }
    }

    public static class RepairCursor extends AbstractCursor {
        public long mPtr;

        private RepairCursor() {
        }

        private static native byte[] nativeGetBlob(long j, int i);

        private static native int nativeGetColumnCount(long j);

        private static native double nativeGetDouble(long j, int i);

        private static native long nativeGetLong(long j, int i);

        private static native String nativeGetString(long j, int i);

        private static native int nativeGetType(long j, int i);

        public byte[] getBlob(int i) {
            return nativeGetBlob(this.mPtr, i);
        }

        public int getColumnCount() {
            return nativeGetColumnCount(this.mPtr);
        }

        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        public int getCount() {
            throw new UnsupportedOperationException();
        }

        public double getDouble(int i) {
            return nativeGetDouble(this.mPtr, i);
        }

        public float getFloat(int i) {
            return (float) getDouble(i);
        }

        public int getInt(int i) {
            return (int) getLong(i);
        }

        public long getLong(int i) {
            return nativeGetLong(this.mPtr, i);
        }

        public short getShort(int i) {
            return (short) ((int) getLong(i));
        }

        public String getString(int i) {
            return nativeGetString(this.mPtr, i);
        }

        public int getType(int i) {
            return nativeGetType(this.mPtr, i);
        }

        public boolean isNull(int i) {
            return getType(i) == 0;
        }
    }

    public static class Statistics {
        public final int damagedPages;
        public final int parsedPages;
        public final int totalPages;
        public final int validPages;

        public Statistics(int[] iArr) {
            this.totalPages = iArr[0];
            this.validPages = iArr[1];
            this.parsedPages = iArr[2];
            this.damagedPages = iArr[3];
        }
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, MasterInfo masterInfo) {
        this(str, bArr, sQLiteCipherSpec, masterInfo, (LeafInfo) null);
    }

    public static String lastError() {
        return nativeLastError();
    }

    private static native void nativeCancel(long j);

    /* access modifiers changed from: private */
    public static native void nativeCancelScanLeaf(long j);

    private static native void nativeFini(long j);

    /* access modifiers changed from: private */
    public static native void nativeFreeLeaf(long j);

    /* access modifiers changed from: private */
    public static native void nativeFreeMaster(long j);

    private static native int[] nativeGetStatistics(long j);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    private static native int nativeIntegrityFlags(long j);

    private static native String nativeLastError();

    /* access modifiers changed from: private */
    public static native long nativeLoadLeaf(String str);

    /* access modifiers changed from: private */
    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    /* access modifiers changed from: private */
    public static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j, long j2, long j3, long j4, int i);

    /* access modifiers changed from: private */
    public static native boolean nativeSaveLeaf(long j, String str);

    /* access modifiers changed from: private */
    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    /* access modifiers changed from: private */
    public static native long nativeScanLeaf(long j, String[] strArr, long[] jArr);

    private int onProgress(String str, int i, long j) {
        if (this.mCallback == null) {
            return 0;
        }
        if (this.mCurrentCursor == null) {
            this.mCurrentCursor = new RepairCursor();
        }
        RepairCursor repairCursor = this.mCurrentCursor;
        repairCursor.mPtr = j;
        return this.mCallback.onProgress(str, i, repairCursor);
    }

    public void finalize() {
        release();
        super.finalize();
    }

    public Callback getCallback() {
        return this.mCallback;
    }

    public Statistics getStatistics() {
        long j = this.mNativePtr;
        if (j != 0) {
            return new Statistics(nativeGetStatistics(j));
        }
        throw new IllegalArgumentException();
    }

    public boolean isDataCorrupted() {
        return (this.mIntegrityFlags & 2) == 0;
    }

    public boolean isHeaderCorrupted() {
        return (this.mIntegrityFlags & 1) == 0;
    }

    public boolean isSaltCorrupted() {
        return (this.mIntegrityFlags & 4) == 0;
    }

    public void onCancel() {
        long j = this.mNativePtr;
        if (j != 0) {
            nativeCancel(j);
        }
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (this.mNativePtr != 0) {
            MasterInfo masterInfo = this.mMasterInfo;
            long j = masterInfo == null ? 0 : masterInfo.mMasterPtr;
            LeafInfo leafInfo = this.mLeafInfo;
            long j2 = leafInfo == null ? 0 : leafInfo.mLeafPtr;
            long acquireNativeConnectionHandle = sQLiteDatabase.acquireNativeConnectionHandle("repair", false, false);
            int nativeOutput = nativeOutput(this.mNativePtr, acquireNativeConnectionHandle, j, j2, i);
            sQLiteDatabase.releaseNativeConnection(acquireNativeConnectionHandle, (Exception) null);
            this.mCurrentCursor = null;
            this.mIntegrityFlags = nativeIntegrityFlags(this.mNativePtr);
            return nativeOutput;
        }
        throw new IllegalArgumentException();
    }

    public void release() {
        LeafInfo leafInfo = this.mLeafInfo;
        if (leafInfo != null) {
            leafInfo.release();
            this.mLeafInfo = null;
        }
        MasterInfo masterInfo = this.mMasterInfo;
        if (masterInfo != null) {
            masterInfo.release();
            this.mMasterInfo = null;
        }
        long j = this.mNativePtr;
        if (j != 0) {
            nativeFini(j);
            this.mNativePtr = 0;
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, MasterInfo masterInfo, LeafInfo leafInfo) {
        byte[] bArr2;
        if (str != null) {
            if (masterInfo == null) {
                bArr2 = null;
            } else {
                bArr2 = masterInfo.mKDFSalt;
            }
            long nativeInit = nativeInit(str, bArr, sQLiteCipherSpec, bArr2);
            this.mNativePtr = nativeInit;
            if (nativeInit != 0) {
                this.mIntegrityFlags = nativeIntegrityFlags(nativeInit);
                this.mMasterInfo = masterInfo;
                this.mLeafInfo = leafInfo;
                return;
            }
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        throw new IllegalArgumentException();
    }

    public int output(SQLiteDatabase sQLiteDatabase, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal.isCanceled()) {
            return 1;
        }
        cancellationSignal.setOnCancelListener(this);
        int output = output(sQLiteDatabase, i);
        cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener) null);
        return output;
    }
}
