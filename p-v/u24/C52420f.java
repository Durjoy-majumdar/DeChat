package u24;

/* renamed from: u24.f */
public class C52420f {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033 A[SYNTHETIC, Splitter:B:25:0x0033] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m58686a(byte[] r2) {
        /*
            if (r2 == 0) goto L_0x0037
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            r2 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0028, IOException -> 0x001f, all -> 0x001b }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0028, IOException -> 0x001f, all -> 0x001b }
            java.lang.Object r2 = r1.readObject()     // Catch:{ ClassNotFoundException -> 0x0019, IOException -> 0x0017 }
            r1.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r2
        L_0x0015:
            r2 = move-exception
            goto L_0x0031
        L_0x0017:
            r2 = move-exception
            goto L_0x0022
        L_0x0019:
            r2 = move-exception
            goto L_0x002b
        L_0x001b:
            r0 = move-exception
            r1 = r2
            r2 = r0
            goto L_0x0031
        L_0x001f:
            r0 = move-exception
            r1 = r2
            r2 = r0
        L_0x0022:
            u24.e r0 = new u24.e     // Catch:{ all -> 0x0015 }
            r0.<init>(r2)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0028:
            r0 = move-exception
            r1 = r2
            r2 = r0
        L_0x002b:
            u24.e r0 = new u24.e     // Catch:{ all -> 0x0015 }
            r0.<init>(r2)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            throw r2
        L_0x0037:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The byte[] must not be null"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u24.C52420f.m58686a(byte[]):java.lang.Object");
    }
}
