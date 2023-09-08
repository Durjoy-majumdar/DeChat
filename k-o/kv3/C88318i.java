package kv3;

/* renamed from: kv3.i */
public class C88318i {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m110094a(kv3.C88314f r4, java.io.File r5, long r6, kv3.C88317h r8) {
        /*
            kv3.f r0 = new kv3.f
            r0.<init>(r4)
            r4 = 0
            r0.mo122689a(r4)
            long r1 = r5.length()
            r0.mo122690b(r1)
            long r1 = r5.length()
            r0.f255286g = r1
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x005a
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x005a
            r0.f255285f = r6
            r6 = 0
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0053 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0053 }
            r1.<init>(r5)     // Catch:{ all -> 0x0053 }
            r7.<init>(r1)     // Catch:{ all -> 0x0053 }
            kv3.f r5 = new kv3.f     // Catch:{ all -> 0x0050 }
            r5.<init>(r0)     // Catch:{ all -> 0x0050 }
            r8.mo122705c(r5)     // Catch:{ all -> 0x0050 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0050 }
        L_0x003e:
            int r6 = r7.read(r5)     // Catch:{ all -> 0x0050 }
            r0 = -1
            if (r6 == r0) goto L_0x0049
            r8.write(r5, r4, r6)     // Catch:{ all -> 0x0050 }
            goto L_0x003e
        L_0x0049:
            r8.mo122704b()     // Catch:{ all -> 0x0050 }
            r7.close()
            return
        L_0x0050:
            r4 = move-exception
            r6 = r7
            goto L_0x0054
        L_0x0053:
            r4 = move-exception
        L_0x0054:
            if (r6 == 0) goto L_0x0059
            r6.close()
        L_0x0059:
            throw r4
        L_0x005a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Bad CRC32: "
            r5.append(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kv3.C88318i.m110094a(kv3.f, java.io.File, long, kv3.h):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m110095b(kv3.C88315g r2, kv3.C88314f r3, kv3.C88317h r4) {
        /*
            java.io.InputStream r2 = r2.mo122697c(r3)     // Catch:{ all -> 0x0025 }
            kv3.f r0 = new kv3.f     // Catch:{ all -> 0x0023 }
            r0.<init>(r3)     // Catch:{ all -> 0x0023 }
            r4.mo122705c(r0)     // Catch:{ all -> 0x0023 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0023 }
        L_0x0010:
            int r0 = r2.read(r3)     // Catch:{ all -> 0x0023 }
            r1 = -1
            if (r0 == r1) goto L_0x001c
            r1 = 0
            r4.write(r3, r1, r0)     // Catch:{ all -> 0x0023 }
            goto L_0x0010
        L_0x001c:
            r4.mo122704b()     // Catch:{ all -> 0x0023 }
            r2.close()
            return
        L_0x0023:
            r3 = move-exception
            goto L_0x0027
        L_0x0025:
            r3 = move-exception
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            r2.close()
        L_0x002c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kv3.C88318i.m110095b(kv3.g, kv3.f, kv3.h):void");
    }
}
