package com.tencent.p014mm.sdk.platformtools;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.tencent.mm.sdk.platformtools.MMImageChecker */
public final class MMImageChecker {
    private static final IImageChecker[] sCheckers = {new BmpBadAllocChecker(104857600)};

    /* renamed from: com.tencent.mm.sdk.platformtools.MMImageChecker$IImageChecker */
    public interface IImageChecker {
        boolean isLegalImage(FileDescriptor fileDescriptor);

        boolean isLegalImage(InputStream inputStream);

        boolean isLegalImage(byte[] bArr);
    }

    private MMImageChecker() {
        throw new UnsupportedOperationException();
    }

    public static boolean isLegalImage(InputStream inputStream) {
        if (inputStream == null) {
            return false;
        }
        for (IImageChecker isLegalImage : sCheckers) {
            if (!isLegalImage.isLegalImage(inputStream)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLegalImage(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (IImageChecker isLegalImage : sCheckers) {
            if (!isLegalImage.isLegalImage(bArr)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMImageChecker$BmpBadAllocChecker */
    public static class BmpBadAllocChecker implements IImageChecker {
        private static final long BMP_SECOND_HEADER_SIZE_OFFSET = 14;
        private static final String TAG = "MicroMsg.BmpBadAllocChecker";
        private final long mImageSizeLimit;

        public BmpBadAllocChecker(int i) {
            this.mImageSizeLimit = (long) i;
        }

        private boolean isLegalImageInMarkableStream(InputStream inputStream) {
            if (inputStream.markSupported()) {
                inputStream.mark(32);
                boolean z = false;
                try {
                    DataInputStream dataInputStream = new DataInputStream(inputStream);
                    byte readByte = dataInputStream.readByte();
                    byte readByte2 = dataInputStream.readByte();
                    if (readByte == 66) {
                        if (readByte2 == 77) {
                            dataInputStream.skip(12);
                            byte[] bArr = new byte[4];
                            dataInputStream.read(bArr);
                            if ((((long) (((bArr[3] & ExifInterface.MARKER) << 24) | ((bArr[2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[1] & ExifInterface.MARKER) << 8) | (bArr[0] & ExifInterface.MARKER))) & Util.MAX_32BIT_VALUE) <= this.mImageSizeLimit) {
                                z = true;
                            }
                            try {
                                inputStream.reset();
                            } catch (Throwable unused) {
                            }
                            return z;
                        }
                    }
                    try {
                        inputStream.reset();
                    } catch (Throwable unused2) {
                    }
                    return true;
                } catch (Throwable unused3) {
                }
            } else {
                throw new IllegalArgumentException("not a markable input stream.");
            }
            return false;
        }

        public boolean isLegalImage(InputStream inputStream) {
            InputStream inputStream2;
            if (!inputStream.markSupported()) {
                if (inputStream instanceof FileInputStream) {
                    inputStream2 = new FileSeekingInputStream((FileInputStream) inputStream);
                } else {
                    inputStream2 = new BufferedInputStream(inputStream);
                }
                inputStream = inputStream2;
            }
            return isLegalImageInMarkableStream(inputStream);
        }

        public boolean isLegalImage(byte[] bArr) {
            if (((long) bArr.length) < BMP_SECOND_HEADER_SIZE_OFFSET) {
                return true;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            boolean isLegalImageInMarkableStream = isLegalImageInMarkableStream(byteArrayInputStream);
            try {
                byteArrayInputStream.close();
            } catch (Throwable unused) {
            }
            return isLegalImageInMarkableStream;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[SYNTHETIC, Splitter:B:16:0x0023] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isLegalImage(java.io.FileDescriptor r6) {
            /*
                r5 = this;
                r0 = 0
                java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0016 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0016 }
                r2.<init>(r6)     // Catch:{ all -> 0x0016 }
                r1.<init>(r2)     // Catch:{ all -> 0x0016 }
                boolean r6 = r5.isLegalImageInMarkableStream(r1)     // Catch:{ all -> 0x0013 }
                r1.close()     // Catch:{ all -> 0x0012 }
            L_0x0012:
                return r6
            L_0x0013:
                r6 = move-exception
                r0 = r1
                goto L_0x0017
            L_0x0016:
                r6 = move-exception
            L_0x0017:
                java.lang.String r1 = "MicroMsg.BmpBadAllocChecker"
                java.lang.String r2 = ""
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0027 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r2, r4)     // Catch:{ all -> 0x0027 }
                if (r0 == 0) goto L_0x0026
                r0.close()     // Catch:{ all -> 0x0026 }
            L_0x0026:
                return r3
            L_0x0027:
                r6 = move-exception
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ all -> 0x002d }
            L_0x002d:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMImageChecker.BmpBadAllocChecker.isLegalImage(java.io.FileDescriptor):boolean");
        }
    }

    public static boolean isLegalImage(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null || !fileDescriptor.valid()) {
            return false;
        }
        for (IImageChecker isLegalImage : sCheckers) {
            if (!isLegalImage.isLegalImage(fileDescriptor)) {
                return false;
            }
        }
        return true;
    }
}
