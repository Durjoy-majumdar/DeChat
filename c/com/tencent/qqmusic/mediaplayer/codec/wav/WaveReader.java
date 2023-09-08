package com.tencent.qqmusic.mediaplayer.codec.wav;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

public class WaveReader {
    private static final String TAG = "WaveReader";
    private static final int WAV_FORMAT = 1463899717;
    private static final int WAV_FORMAT_CHUNK_ID = 1718449184;
    private static final int WAV_HEADER_CHUNK_ID = 1380533830;
    private static final int WAV_HEADER_SIZE = 50;

    private static short byteToShortLE(byte b, byte b2) {
        return (short) ((b & ExifInterface.MARKER) | ((b2 & ExifInterface.MARKER) << 8));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cf A[SYNTHETIC, Splitter:B:47:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC, Splitter:B:53:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isWavFormat(java.lang.String r7) {
        /*
            java.lang.String r0 = "WaveReader"
            r1 = 50
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00c9 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x00c9 }
            int r7 = readUnsignedInt(r1, r2)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r3 = 8
            r5 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r5) goto L_0x0035
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.<init>()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r3 = "isWavFormat Invalid WAVE header chunk ID = "
            r1.append(r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.append(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r4.close()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0034
        L_0x0030:
            r7 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x0034:
            return r2
        L_0x0035:
            int r7 = readUnsignedInt(r1, r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r3 = 12
            r5 = 1463899717(0x57415645, float:2.12576269E14)
            if (r7 == r5) goto L_0x005d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.<init>()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r3 = "isWavFormat Invalid WAVE format = "
            r1.append(r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.append(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r4.close()     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r7 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x005c:
            return r2
        L_0x005d:
            int r7 = readUnsignedInt(r1, r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r3 = 16
            r5 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r5) goto L_0x0085
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.<init>()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r3 = "isWavFormat Invalid WAVE format chunk ID formatId = "
            r1.append(r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.append(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r4.close()     // Catch:{ Exception -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r7 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x0084:
            return r2
        L_0x0085:
            int r7 = readUnsignedIntLE(r1, r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r3 = 20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r5.<init>()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r6 = "isWavFormat formatSize = "
            r5.append(r6)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r5.append(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            short r7 = readUnsignedShortLE(r1, r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.<init>()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r3 = "isWavFormat mAudioFormat = "
            r1.append(r3)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r1.append(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r7 = 1
            r4.close()     // Catch:{ Exception -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r1 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x00c0:
            return r7
        L_0x00c1:
            r7 = move-exception
            r3 = r4
            goto L_0x00d8
        L_0x00c4:
            r7 = move-exception
            r3 = r4
            goto L_0x00ca
        L_0x00c7:
            r7 = move-exception
            goto L_0x00d8
        L_0x00c9:
            r7 = move-exception
        L_0x00ca:
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r7)     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x00d7
            r3.close()     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r7 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x00d7:
            return r2
        L_0x00d8:
            if (r3 == 0) goto L_0x00e2
            r3.close()     // Catch:{ Exception -> 0x00de }
            goto L_0x00e2
        L_0x00de:
            r1 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x00e2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.wav.WaveReader.isWavFormat(java.lang.String):boolean");
    }

    private static int readUnsignedInt(byte[] bArr, int i) {
        if (i + 4 > bArr.length) {
            return -1;
        }
        return (bArr[i + 3] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 2] & ExifInterface.MARKER) << 8);
    }

    private static int readUnsignedIntLE(byte[] bArr, int i) {
        if (i + 4 > bArr.length) {
            return -1;
        }
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[0] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }

    private static short readUnsignedShortLE(byte[] bArr, int i) {
        if (i + 2 > bArr.length) {
            return -1;
        }
        return byteToShortLE(bArr[i], bArr[i + 1]);
    }
}
