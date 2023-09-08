package ci0;

/* renamed from: ci0.a */
public final class C0506a implements C0507b {

    /* renamed from: d */
    public String f1232d = "";

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a5, code lost:
        r6 = r6.f348991a.mo119945q(r6.f348992b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0506a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "uin"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r7, r0)
            r5.<init>()
            java.lang.String r0 = ""
            r5.f1232d = r0
            java.io.File r0 = new java.io.File
            java.lang.Class<a70.b> r1 = a70.C112760b.class
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r2.<init>()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = a70.C112760b.m154195C()     // Catch:{ all -> 0x00fe }
            r2.append(r3)     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "appbrand/appBrandXnetModelCache/"
            r2.append(r3)     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fe }
            monitor-exit(r1)
            r0.<init>(r2)
            com.tencent.mm.vfs.m1 r0 = com.tencent.p014mm.vfs.C86009m1.m106378c(r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = r0.mo119971i()
            java.lang.String r1 = "cacheRootDir.absolutePath"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = "/"
            r2 = 2
            r3 = 0
            r4 = 0
            boolean r1 = z04.C112551y.m153808h(r0, r1, r4, r2, r3)
            if (r1 != 0) goto L_0x005b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x005b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            r6 = 35
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r5.f1232d = r6
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r7 = r6.getPath()
            if (r7 == 0) goto L_0x0098
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r4, r4)
            java.lang.String r0 = r6.getPath()
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0098
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r7)
            android.net.Uri r6 = r6.build()
        L_0x0098:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r6 = r7.mo177799l(r6, r3)
            boolean r0 = r6.mo177810a()
            if (r0 != 0) goto L_0x00a5
            goto L_0x00b5
        L_0x00a5:
            com.tencent.mm.vfs.FileSystem$c r0 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            com.tencent.mm.vfs.b0 r6 = r0.mo119945q(r6)
            if (r6 == 0) goto L_0x00b5
            boolean r6 = r6.f250476f
            if (r6 != 0) goto L_0x00b5
            r6 = 1
            goto L_0x00b6
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            if (r6 == 0) goto L_0x00bd
            java.lang.String r6 = r5.f1232d
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
        L_0x00bd:
            java.lang.String r6 = r5.f1232d
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r0 = r6.getPath()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r4, r4)
            java.lang.String r1 = r6.getPath()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00e3
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r0)
            android.net.Uri r6 = r6.build()
        L_0x00e3:
            com.tencent.mm.vfs.f0$h r6 = r7.mo177799l(r6, r3)
            boolean r7 = r6.mo177810a()
            if (r7 != 0) goto L_0x00ee
            goto L_0x00f6
        L_0x00ee:
            com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            boolean r4 = r7.mo119948x(r6)
        L_0x00f6:
            if (r4 != 0) goto L_0x00fd
            java.lang.String r6 = r5.f1232d
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)
        L_0x00fd:
            return
        L_0x00fe:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ci0.C0506a.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: g0 */
    public String mo558g0() {
        return this.f1232d;
    }
}
