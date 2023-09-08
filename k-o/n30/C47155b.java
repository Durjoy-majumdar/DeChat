package n30;

/* renamed from: n30.b */
public class C47155b {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.OutputStream, com.tencent.mm.vfs.f0$h] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bc */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[SYNTHETIC, Splitter:B:48:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[SYNTHETIC, Splitter:B:52:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0 A[SYNTHETIC, Splitter:B:58:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7 A[SYNTHETIC, Splitter:B:62:0x00e7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m52440a(java.lang.String r8, java.lang.String r9) {
        /*
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
            java.lang.String r0 = r9.getPath()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r1, r1)
            java.lang.String r2 = r9.getPath()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0025
            android.net.Uri$Builder r9 = r9.buildUpon()
            android.net.Uri$Builder r9 = r9.path(r0)
            android.net.Uri r9 = r9.build()
        L_0x0025:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r2 = 0
            com.tencent.mm.vfs.f0$h r0 = r0.mo177799l(r9, r2)
            boolean r3 = r0.mo177810a()
            if (r3 != 0) goto L_0x0034
            r3 = 0
            goto L_0x003c
        L_0x0034:
            com.tencent.mm.vfs.FileSystem$c r3 = r0.f348991a
            java.lang.String r4 = r0.f348992b
            boolean r3 = r3.mo119948x(r4)
        L_0x003c:
            r4 = 1
            java.lang.String r5 = "Kara.ZstdUtils"
            if (r3 == 0) goto L_0x0047
            java.lang.String r8 = "unzstd file exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            return r4
        L_0x0047:
            android.net.Uri r8 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)
            java.lang.String r3 = r8.getPath()
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r1, r1)
            java.lang.String r6 = r8.getPath()
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x006b
            android.net.Uri$Builder r8 = r8.buildUpon()
            android.net.Uri$Builder r8 = r8.path(r3)
            android.net.Uri r8 = r8.build()
        L_0x006b:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r8, r2)
            boolean r6 = r3.mo177810a()
            if (r6 != 0) goto L_0x0079
            r3 = 0
            goto L_0x0081
        L_0x0079:
            com.tencent.mm.vfs.FileSystem$c r6 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r6.mo119948x(r3)
        L_0x0081:
            if (r3 != 0) goto L_0x0089
            java.lang.String r8 = "src file not exist!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            return r1
        L_0x0089:
            com.tencent.mars.zstd.ZstdInputStream r3 = new com.tencent.mars.zstd.ZstdInputStream     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163865u(r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            java.io.InputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106423E(r6)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x00c5, all -> 0x00c2 }
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00c0 }
            com.tencent.mm.vfs.f0$h r0 = r6.mo177799l(r9, r0)     // Catch:{ Exception -> 0x00c0 }
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106425G(r9, r0, r1)     // Catch:{ Exception -> 0x00c0 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x00c0 }
        L_0x00a4:
            int r6 = r3.read(r0, r1, r9)     // Catch:{ Exception -> 0x00c0 }
            r7 = -1
            if (r6 == r7) goto L_0x00af
            r2.write(r0, r1, r6)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00a4
        L_0x00af:
            r2.flush()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163865u(r8)     // Catch:{ Exception -> 0x00c0 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)     // Catch:{ Exception -> 0x00c0 }
            r2.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            r3.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            return r4
        L_0x00c0:
            r8 = move-exception
            goto L_0x00c7
        L_0x00c2:
            r8 = move-exception
            r3 = r2
            goto L_0x00de
        L_0x00c5:
            r8 = move-exception
            r3 = r2
        L_0x00c7:
            java.lang.String r9 = "may ProcessZstd exp: %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x00dd }
            r0[r1] = r8     // Catch:{ all -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r9, r0)     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ IOException -> 0x00d6 }
            goto L_0x00d7
        L_0x00d6:
        L_0x00d7:
            if (r3 == 0) goto L_0x00dc
            r3.close()     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            return r1
        L_0x00dd:
            r8 = move-exception
        L_0x00de:
            if (r2 == 0) goto L_0x00e5
            r2.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            if (r3 == 0) goto L_0x00ea
            r3.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.C47155b.m52440a(java.lang.String, java.lang.String):boolean");
    }
}
