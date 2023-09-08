package com.tencent.thumbplayer.datatransport.resourceloader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPReadWriteLock;
import java.io.RandomAccessFile;

public class TPAssetResourceLoadingDataRequest implements ITPAssetResourceLoadingDataRequest {
    private static final boolean ENV_DEBUG = false;
    private static final int MAX_ASSET_READ_LEN = 1048576;
    private static final int MSG_RESPOND_WITH_DATA = 256;
    /* access modifiers changed from: private */
    public static String TAG = "TPAssetResourceLoadingDataRequest";
    private long mCurrentOffset;
    /* access modifiers changed from: private */
    public String mDataWritePath;
    private EventHandler mEventHandler;
    /* access modifiers changed from: private */
    public TPReadWriteLock mLock = new TPReadWriteLock();
    private RandomAccessFile mRandomAccessFile;
    private long mReadyDataTotalSize;
    /* access modifiers changed from: private */
    public long mRealOffset;
    private int mRequestNum;
    private long mRequestedLength;
    private long mRequestedOffset;
    private boolean mRequestsAllDataToEndOfResource;

    public static class DataWriteParams {
        public byte[] data;
        public long writeOffset;

        private DataWriteParams() {
        }
    }

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 256) {
                DataWriteParams dataWriteParams = (DataWriteParams) message.obj;
                long j = dataWriteParams.writeOffset;
                byte[] bArr = dataWriteParams.data;
                int i = message.arg1;
                TPAssetResourceLoadingDataRequest tPAssetResourceLoadingDataRequest = TPAssetResourceLoadingDataRequest.this;
                if (!tPAssetResourceLoadingDataRequest.writeDataToPath(j, bArr, tPAssetResourceLoadingDataRequest.mDataWritePath)) {
                    TPLogUtil.m21894e(TPAssetResourceLoadingDataRequest.TAG, "write data failed");
                    return;
                }
                TPAssetResourceLoadingDataRequest.this.mLock.writeLock().lock();
                long unused = TPAssetResourceLoadingDataRequest.this.mRealOffset = ((long) i) + j;
                TPAssetResourceLoadingDataRequest.this.mLock.writeLock().unlock();
                String access$300 = TPAssetResourceLoadingDataRequest.TAG;
                TPLogUtil.m21897i(access$300, "write data from " + j + " , with dataLength" + i);
            }
        }
    }

    public TPAssetResourceLoadingDataRequest(long j, long j2, boolean z) {
        this.mRequestedOffset = j;
        this.mCurrentOffset = j;
        this.mRealOffset = j;
        this.mRequestedLength = j2;
        this.mRequestsAllDataToEndOfResource = z;
    }

    private void internalMessage(int i, int i2, int i3, Object obj) {
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            obtainMessage.obj = obj;
            this.mEventHandler.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        com.tencent.thumbplayer.utils.TPLogUtil.m21894e(TAG, "fail to write data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = r3.mRandomAccessFile;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r4 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.tencent.thumbplayer.utils.TPLogUtil.m21894e(TAG, "file not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r4 = r3.mRandomAccessFile;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r4 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        com.tencent.thumbplayer.utils.TPLogUtil.m21894e(TAG, "fail to close mRandomAccessFile");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r5 = r3.mRandomAccessFile;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r5 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        com.tencent.thumbplayer.utils.TPLogUtil.m21894e(TAG, "fail to close mRandomAccessFile");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0024, B:14:0x0030] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0030 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0030=Splitter:B:14:0x0030, B:10:0x0024=Splitter:B:10:0x0024} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeDataToPath(long r4, byte[] r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r0 = "fail to close mRandomAccessFile"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x0024 }
            java.lang.String r2 = "rw"
            r1.<init>(r7, r2)     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x0024 }
            r3.mRandomAccessFile = r1     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x0024 }
            r1.seek(r4)     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x0024 }
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x0024 }
            r4.write(r6)     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x0024 }
            r4 = 1
            java.io.RandomAccessFile r5 = r3.mRandomAccessFile
            if (r5 == 0) goto L_0x0045
            r5.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x0045
        L_0x001c:
            java.lang.String r5 = TAG
            com.tencent.thumbplayer.utils.TPLogUtil.m21894e((java.lang.String) r5, (java.lang.String) r0)
            goto L_0x0045
        L_0x0022:
            r4 = move-exception
            goto L_0x0046
        L_0x0024:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x0022 }
            java.lang.String r5 = "fail to write data"
            com.tencent.thumbplayer.utils.TPLogUtil.m21894e((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0022 }
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile
            if (r4 == 0) goto L_0x0044
            goto L_0x003b
        L_0x0030:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x0022 }
            java.lang.String r5 = "file not found"
            com.tencent.thumbplayer.utils.TPLogUtil.m21894e((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0022 }
            java.io.RandomAccessFile r4 = r3.mRandomAccessFile
            if (r4 == 0) goto L_0x0044
        L_0x003b:
            r4.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0044
        L_0x003f:
            java.lang.String r4 = TAG
            com.tencent.thumbplayer.utils.TPLogUtil.m21894e((java.lang.String) r4, (java.lang.String) r0)
        L_0x0044:
            r4 = 0
        L_0x0045:
            return r4
        L_0x0046:
            java.io.RandomAccessFile r5 = r3.mRandomAccessFile
            if (r5 == 0) goto L_0x0053
            r5.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0053
        L_0x004e:
            java.lang.String r5 = TAG
            com.tencent.thumbplayer.utils.TPLogUtil.m21894e((java.lang.String) r5, (java.lang.String) r0)
        L_0x0053:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest.writeDataToPath(long, byte[], java.lang.String):boolean");
    }

    public long getCurrentOffset() {
        this.mLock.readLock().lock();
        long j = this.mCurrentOffset;
        this.mLock.readLock().unlock();
        return j;
    }

    public int getDataReadyLength(long j) {
        this.mLock.readLock().lock();
        long j2 = this.mRealOffset;
        this.mLock.readLock().unlock();
        if (j >= j2) {
            return -1;
        }
        if (j >= this.mRequestedOffset) {
            return (int) (j2 - j);
        }
        TPLogUtil.m21894e(TAG, "Offset less than mRequestedOffset");
        return -1;
    }

    public int getRequestNum() {
        return this.mRequestNum;
    }

    public long getRequestedLength() {
        return this.mRequestedLength;
    }

    public long getRequestedOffset() {
        return this.mRequestedOffset;
    }

    public void notifyDataReady(long j, long j2) {
        long j3 = j2 + j;
        long j4 = this.mRequestedOffset;
        if (j3 > this.mRequestedLength + j4) {
            TPLogUtil.m21894e(TAG, "data exceed the max request offset");
            return;
        }
        if (j < j4) {
            TPLogUtil.m21899w(TAG, "the notify data offset is less than request offset");
        }
        if (j3 < this.mCurrentOffset) {
            TPLogUtil.m21894e(TAG, "data not reach current offset");
            return;
        }
        this.mLock.writeLock().lock();
        this.mCurrentOffset = j3;
        this.mRealOffset = j3;
        this.mLock.writeLock().unlock();
    }

    public void release() {
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages((Object) null);
            this.mEventHandler = null;
        }
    }

    public void respondWithData(byte[] bArr) {
        if (this.mReadyDataTotalSize > this.mRequestedLength) {
            TPLogUtil.m21897i(TAG, "respond full data");
            return;
        }
        int length = bArr.length;
        DataWriteParams dataWriteParams = new DataWriteParams();
        dataWriteParams.writeOffset = this.mCurrentOffset;
        dataWriteParams.data = bArr;
        internalMessage(256, length, 0, dataWriteParams);
        String str = TAG;
        TPLogUtil.m21897i(str, "respond data from:" + this.mCurrentOffset + ", dataLength:" + length);
        this.mLock.writeLock().lock();
        long j = (long) length;
        this.mCurrentOffset = this.mCurrentOffset + j;
        this.mReadyDataTotalSize = this.mReadyDataTotalSize + j;
        this.mLock.writeLock().unlock();
    }

    public void setDataWritePath(String str) {
        this.mDataWritePath = str;
    }

    public void setDataWriteThreadLooper(Looper looper) {
        this.mEventHandler = new EventHandler(looper);
    }

    public void setRequestNum(int i) {
        this.mRequestNum = i;
    }
}
