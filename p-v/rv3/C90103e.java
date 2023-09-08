package rv3;

/* renamed from: rv3.e */
public class C90103e {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC, Splitter:B:21:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m112733a(java.io.File r6) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0025 }
            long r2 = r1.length()     // Catch:{ all -> 0x0024 }
            int r6 = (int) r2     // Catch:{ all -> 0x0024 }
            long r4 = (long) r6     // Catch:{ all -> 0x0024 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0024 }
            r1.readFully(r6)     // Catch:{ all -> 0x0024 }
            r1.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r6
        L_0x001c:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = ""
            r6.<init>(r0)     // Catch:{ all -> 0x0024 }
            throw r6     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = r1
        L_0x0025:
            r6 = 0
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r6
        L_0x002e:
            r6 = move-exception
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.C90103e.m112733a(java.io.File):byte[]");
    }
}
