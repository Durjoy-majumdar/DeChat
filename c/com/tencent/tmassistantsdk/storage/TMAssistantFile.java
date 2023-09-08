package com.tencent.tmassistantsdk.storage;

import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidParameterException;

public class TMAssistantFile {
    public static final int DataBufferMaxLen = 16384;
    public static final String TAG = "TMAssistantFile";
    public int mDataBufferDataLen = 0;
    public long mFileDataLen = 0;
    public OutputStream mFileOutputStream = null;
    public String mFinalFileName;
    public String mTempFileName;
    public byte[] mWriteDataBuffer = null;

    public TMAssistantFile(String str, String str2) {
        this.mTempFileName = str;
        this.mFinalFileName = str2;
        this.mFileDataLen = length();
        TMLog.m164114i(TAG, "mFileDataLen = " + this.mFileDataLen);
    }

    public static String getSaveFilePath(String str) {
        String savePathRootDir;
        if (str == null || (savePathRootDir = getSavePathRootDir()) == null) {
            return null;
        }
        return savePathRootDir + "/" + str;
    }

    public static String getSavePathRootDir() {
        return MMApplicationContext.getContext().getExternalCacheDir() + "/TMAssistantSDK/Download";
    }

    public static boolean isSDCardExistAndCanWrite() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.getExternalStorageDirectory().canWrite();
    }

    private boolean moveFileFromTmpToSavaPath(String str, String str2) {
        TMLog.m164114i(TAG, "moveFileFromTmpToSavaPath, tmpFilePath = " + str + ", saveFilePath = " + str2);
        boolean z = false;
        if (!(str == null || str2 == null)) {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g()) {
                Uri n = C116299g2.m163858n(str2);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h z2 = m1Var.mo119989z();
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (z2.mo177810a() && l.mo177810a()) {
                    try {
                        z = l.f348991a.mo119946t(l.f348992b, z2.f348991a, z2.f348992b);
                    } catch (IOException unused) {
                    }
                }
                if (z) {
                    GlobalUtil.updateFilePathAuthorized(str2);
                }
                return z;
            }
        }
        TMLog.m164116w(TAG, "moveFileFromTmpToSavaPath failed ");
        return false;
    }

    private boolean writeData(OutputStream outputStream, byte[] bArr, int i, int i2, long j) {
        if (outputStream == null || bArr == null) {
            return false;
        }
        if (j != this.mFileDataLen) {
            TMLog.m164114i(TAG, "writeData0 failed,filelen:" + this.mFileDataLen + ",offset:" + j + ",filename:" + this.mTempFileName);
            return false;
        } else if (i2 >= 16384) {
            try {
                int i3 = this.mDataBufferDataLen;
                if (i3 > 0) {
                    outputStream.write(this.mWriteDataBuffer, 0, i3);
                    this.mDataBufferDataLen = 0;
                }
                outputStream.write(bArr, i, i2);
                this.mFileDataLen += (long) i2;
                return true;
            } catch (IOException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                TMLog.m164116w(TAG, "writeData1 failed " + e.getMessage());
                return false;
            }
        } else {
            int i4 = this.mDataBufferDataLen;
            if (i4 + i2 > 16384 && i4 > 0) {
                try {
                    outputStream.write(this.mWriteDataBuffer, 0, i4);
                    this.mDataBufferDataLen = 0;
                } catch (IOException e2) {
                    Log.printErrStackTrace(TAG, e2, "", new Object[0]);
                    TMLog.m164116w(TAG, "writeData2 failed " + e2.getMessage());
                    return false;
                }
            }
            System.arraycopy(bArr, i, this.mWriteDataBuffer, this.mDataBufferDataLen, i2);
            this.mDataBufferDataLen += i2;
            this.mFileDataLen += (long) i2;
            return true;
        }
    }

    public synchronized void close() {
        flush();
        try {
            OutputStream outputStream = this.mFileOutputStream;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        this.mFileOutputStream = null;
        this.mWriteDataBuffer = null;
        this.mFileDataLen = 0;
    }

    public void deleteTempFile() {
        String tmpFilePath = getTmpFilePath(this.mTempFileName);
        TMLog.m164114i(TAG, "deleteFile 1 tmpFilePathString: " + tmpFilePath);
        if (!TextUtils.isEmpty(tmpFilePath)) {
            C86009m1 m1Var = new C86009m1(tmpFilePath);
            TMLog.m164114i(TAG, "deleteFile 2 file: " + m1Var);
            if (m1Var.mo119967g()) {
                boolean f = m1Var.mo119966f();
                TMLog.m164114i(TAG, "deleteFile result:" + f + ",filename:" + tmpFilePath);
                return;
            }
            TMLog.m164114i(TAG, "deleteFile 3");
        }
    }

    public void ensureFilePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                boolean z = true;
                if (str.length() != 1) {
                    if (lastIndexOf > 0) {
                        str = str.substring(0, lastIndexOf);
                    }
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                        z = !l2.mo177810a() ? false : l2.f348991a.mo119937g(l2.f348992b);
                    }
                    if (!z) {
                        TMLog.m164114i(TAG, "Failed to create directory. dir: " + str);
                        throw new IOException("Failed to create directory. dir: " + str);
                    }
                    return;
                }
            }
            TMLog.m164114i(TAG, "fileFullPath is not a valid full path. fileName: " + str);
            throw new InvalidParameterException("fileFullPath is not a valid full path. fileName: " + str);
        }
        TMLog.m164114i(TAG, "fileFullPath is null or the filename.size is zero.");
        throw new InvalidParameterException("fileFullPath is null or the filename.size is zero.");
    }

    public synchronized boolean flush() {
        int i;
        OutputStream outputStream = this.mFileOutputStream;
        if (outputStream != null && (i = this.mDataBufferDataLen) > 0) {
            try {
                outputStream.write(this.mWriteDataBuffer, 0, i);
                this.mDataBufferDataLen = 0;
                return true;
            } catch (IOException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                TMLog.m164116w(TAG, "flush failed " + e);
                return false;
            }
        }
    }

    public String getTmpFilePath(String str) {
        String savePathRootDir;
        if (str == null || (savePathRootDir = getSavePathRootDir()) == null) {
            return null;
        }
        return savePathRootDir + "/.tmp/" + str + ".tmp";
    }

    public long length() {
        String saveFilePath = getSaveFilePath(this.mFinalFileName);
        if (saveFilePath == null) {
            return 0;
        }
        C86009m1 m1Var = new C86009m1(saveFilePath);
        if (!m1Var.mo119967g()) {
            String tmpFilePath = getTmpFilePath(this.mTempFileName);
            if (tmpFilePath != null) {
                C86009m1 m1Var2 = new C86009m1(tmpFilePath);
                if (!m1Var2.mo119967g()) {
                    this.mFileDataLen = 0;
                } else {
                    TMLog.m164114i(TAG, tmpFilePath + " exists");
                    this.mFileDataLen = m1Var2.mo119980r();
                }
            }
        } else {
            this.mFileDataLen = m1Var.mo119980r();
        }
        return this.mFileDataLen;
    }

    public void moveFileToSavaPath() {
        moveFileFromTmpToSavaPath(getTmpFilePath(this.mTempFileName), getSaveFilePath(this.mFinalFileName));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean write(byte[] r10, int r11, int r12, long r13, boolean r15) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.OutputStream r0 = r9.mFileOutputStream     // Catch:{ all -> 0x007f }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = r9.mTempFileName     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r9.getTmpFilePath(r0)     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x003f
            r9.ensureFilePath(r0)     // Catch:{ Exception -> 0x0019 }
            java.io.OutputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106429K(r0, r1)     // Catch:{ Exception -> 0x0019 }
            r9.mFileOutputStream = r0     // Catch:{ Exception -> 0x0019 }
            goto L_0x0048
        L_0x0019:
            r10 = move-exception
            java.lang.String r11 = "TMAssistantFile"
            java.lang.String r12 = ""
            java.lang.Object[] r13 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r12, r13)     // Catch:{ all -> 0x007f }
            java.lang.String r11 = "TMAssistantFile"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r12.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "write failed"
            r12.append(r13)     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x007f }
            r12.append(r10)     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x007f }
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r11, r10)     // Catch:{ all -> 0x007f }
            monitor-exit(r9)
            return r2
        L_0x003f:
            java.lang.String r10 = "TMAssistantFile"
            java.lang.String r11 = "write failed tmpFilePathString is null"
            com.tencent.tmassistantsdk.util.TMLog.m164116w(r10, r11)     // Catch:{ all -> 0x007f }
            monitor-exit(r9)
            return r2
        L_0x0048:
            byte[] r0 = r9.mWriteDataBuffer     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0054
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x007f }
            r9.mWriteDataBuffer = r0     // Catch:{ all -> 0x007f }
            r9.mDataBufferDataLen = r2     // Catch:{ all -> 0x007f }
        L_0x0054:
            java.io.OutputStream r3 = r9.mFileOutputStream     // Catch:{ all -> 0x007f }
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            boolean r10 = r2.writeData(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007f }
            if (r10 != 0) goto L_0x0063
            monitor-exit(r9)
            return r10
        L_0x0063:
            if (r15 != r1) goto L_0x007d
            boolean r10 = r9.flush()     // Catch:{ all -> 0x007f }
            if (r10 != r1) goto L_0x007d
            java.lang.String r10 = r9.mTempFileName     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r9.getTmpFilePath(r10)     // Catch:{ all -> 0x007f }
            java.lang.String r11 = r9.mFinalFileName     // Catch:{ all -> 0x007f }
            java.lang.String r11 = getSaveFilePath(r11)     // Catch:{ all -> 0x007f }
            boolean r10 = r9.moveFileFromTmpToSavaPath(r10, r11)     // Catch:{ all -> 0x007f }
            monitor-exit(r9)
            return r10
        L_0x007d:
            monitor-exit(r9)
            return r1
        L_0x007f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.storage.TMAssistantFile.write(byte[], int, int, long, boolean):boolean");
    }
}
