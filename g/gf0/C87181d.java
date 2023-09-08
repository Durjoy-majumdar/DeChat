package gf0;

/* renamed from: gf0.d */
public class C87181d {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[SYNTHETIC, Splitter:B:18:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC, Splitter:B:26:0x0066] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m108227a(java.io.File r8) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
        L_0x0014:
            int r6 = r4.read(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            r7 = -1
            if (r6 == r7) goto L_0x0020
            r7 = 0
            r3.update(r5, r7, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            goto L_0x0014
        L_0x0020:
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            byte[] r3 = r3.digest()     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            java.lang.String r3 = gf0.C8272b.m8352a(r3)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            long r6 = r6 - r0
            java.lang.String r0 = "HdiffApk-MD5Utils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            r1.<init>()     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            java.lang.String r3 = "getMD5, costtime = "
            r1.append(r3)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            r1.append(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            java.lang.String r3 = "，file.size = "
            r1.append(r3)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            long r6 = r8.length()     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            r1.append(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            java.lang.String r8 = r1.toString()     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            com.tencent.stubs.logger.Log.m106505i(r0, r8)     // Catch:{ Exception -> 0x0064, all -> 0x0059 }
            r4.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            return r5
        L_0x0059:
            r8 = move-exception
            r2 = r4
            goto L_0x005d
        L_0x005c:
            r8 = move-exception
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r8
        L_0x0063:
            r4 = r2
        L_0x0064:
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C87181d.m108227a(java.io.File):java.lang.String");
    }
}
