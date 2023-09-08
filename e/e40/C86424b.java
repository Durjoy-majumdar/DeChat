package e40;

/* renamed from: e40.b */
public class C86424b {
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0021 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m107090a(byte[] r4) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r0.setInput(r4)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r4 = r4.length
            r1.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0021, all -> 0x0025 }
        L_0x0012:
            boolean r2 = r0.finished()     // Catch:{ Exception -> 0x0021, all -> 0x0025 }
            if (r2 != 0) goto L_0x0021
            int r2 = r0.inflate(r4)     // Catch:{ Exception -> 0x0021, all -> 0x0025 }
            r3 = 0
            r1.write(r4, r3, r2)     // Catch:{ Exception -> 0x0021, all -> 0x0025 }
            goto L_0x0012
        L_0x0021:
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002a
        L_0x0025:
            r4 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            throw r4
        L_0x002a:
            r0.end()
            byte[] r4 = r1.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.C86424b.m107090a(byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m107091b(byte[] r7) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "Kara.ZipUtil"
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
        throw new UnsupportedOperationException("Method not decompiled: e40.C86424b.m107091b(byte[]):byte[]");
    }
}
