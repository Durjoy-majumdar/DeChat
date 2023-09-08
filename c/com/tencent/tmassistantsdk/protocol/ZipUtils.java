package com.tencent.tmassistantsdk.protocol;

public class ZipUtils {
    private static final String TAG = "ZipUtils";

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[SYNTHETIC, Splitter:B:23:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004e A[SYNTHETIC, Splitter:B:32:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] unzip(byte[] r5) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r1 = 0
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ DataFormatException -> 0x0031 }
            int r4 = r5.length     // Catch:{ DataFormatException -> 0x0031 }
            r3.<init>(r4)     // Catch:{ DataFormatException -> 0x0031 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ DataFormatException -> 0x002c, all -> 0x0029 }
            r0.setInput(r5)     // Catch:{ DataFormatException -> 0x002c, all -> 0x0029 }
        L_0x0014:
            boolean r5 = r0.finished()     // Catch:{ DataFormatException -> 0x002c, all -> 0x0029 }
            if (r5 != 0) goto L_0x0022
            int r5 = r0.inflate(r2)     // Catch:{ DataFormatException -> 0x002c, all -> 0x0029 }
            r3.write(r2, r1, r5)     // Catch:{ DataFormatException -> 0x002c, all -> 0x0029 }
            goto L_0x0014
        L_0x0022:
            r0.end()
            r3.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0044
        L_0x0029:
            r5 = move-exception
            r2 = r3
            goto L_0x0049
        L_0x002c:
            r5 = move-exception
            r2 = r3
            goto L_0x0032
        L_0x002f:
            r5 = move-exception
            goto L_0x0049
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            java.lang.String r3 = "ZipUtils"
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x002f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r4, r1)     // Catch:{ all -> 0x002f }
            r0.end()
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r3 = r2
        L_0x0044:
            byte[] r5 = r3.toByteArray()
            return r5
        L_0x0049:
            r0.end()
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.protocol.ZipUtils.unzip(byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] zip(byte[] r7) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ZipUtils"
            java.util.zip.Deflater r2 = new java.util.zip.Deflater
            r2.<init>()
            r3 = 0
            r4 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0043 }
            int r6 = r7.length     // Catch:{ all -> 0x0043 }
            r5.<init>(r6)     // Catch:{ all -> 0x0043 }
            r4 = 9
            r2.setLevel(r4)     // Catch:{ all -> 0x0040 }
            r2.setInput(r7)     // Catch:{ all -> 0x0040 }
            r2.finish()     // Catch:{ all -> 0x0040 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0040 }
        L_0x0020:
            boolean r4 = r2.finished()     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x002e
            int r4 = r2.deflate(r7)     // Catch:{ all -> 0x0040 }
            r5.write(r7, r3, r4)     // Catch:{ all -> 0x0040 }
            goto L_0x0020
        L_0x002e:
            r2.end()
            r5.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r2)
        L_0x003b:
            byte[] r7 = r5.toByteArray()
            return r7
        L_0x0040:
            r7 = move-exception
            r4 = r5
            goto L_0x0044
        L_0x0043:
            r7 = move-exception
        L_0x0044:
            r2.end()
            if (r4 == 0) goto L_0x0053
            r4.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0053:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.protocol.ZipUtils.zip(byte[]):byte[]");
    }
}
