package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import fy3.C32226l;
import fy3.C32227p;
import rx3.C13598b0;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.n1 */
public final class C83391n1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83368m1.C83374d f243652d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C83368m1.C83377e, C13598b0> f243653e;

    /* renamed from: f */
    public final /* synthetic */ C32227p<C83368m1.C83369a, String, C13598b0> f243654f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<WxaPkgLoadProgress, C13598b0> f243655g;

    /* renamed from: h */
    public final /* synthetic */ C83397o1 f243656h;

    /* renamed from: i */
    public final /* synthetic */ C90422jy f243657i;

    /* renamed from: j */
    public final /* synthetic */ C83368m1.C83373c f243658j;

    public C83391n1(C83368m1.C83374d dVar, C32226l<? super C83368m1.C83377e, C13598b0> lVar, C32227p<? super C83368m1.C83369a, ? super String, C13598b0> pVar, C32226l<? super WxaPkgLoadProgress, C13598b0> lVar2, C83397o1 o1Var, C90422jy jyVar, C83368m1.C83373c cVar) {
        this.f243652d = dVar;
        this.f243653e = lVar;
        this.f243654f = pVar;
        this.f243655g = lVar2;
        this.f243656h = o1Var;
        this.f243657i = jyVar;
        this.f243658j = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.tencent.mm.plugin.appbrand.launching.u0 r8 = new com.tencent.mm.plugin.appbrand.launching.u0
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r15.f243652d
            fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r2 = r15.f243653e
            fy3.p<com.tencent.mm.plugin.appbrand.launching.m1$a, java.lang.String, rx3.b0> r3 = r15.f243654f
            fy3.l<com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress, rx3.b0> r4 = r15.f243655g
            com.tencent.mm.plugin.appbrand.launching.o1 r5 = r15.f243656h
            te3.jy r6 = r15.f243657i
            com.tencent.mm.plugin.appbrand.launching.m1$c r7 = r15.f243658j
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage> r0 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.class
            com.tencent.mm.plugin.appbrand.launching.u0$b r1 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.f243932l
            com.tencent.mm.plugin.appbrand.appcache.q0 r2 = r8.mo115781a()
            com.tencent.mm.plugin.appbrand.appcache.j1 r3 = r8.f243941i
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            int r5 = r4.f243619g
            com.tencent.mm.plugin.appbrand.launching.m1$g r4 = r4.f243620h
            com.tencent.mm.plugin.appbrand.appcache.i r1 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83486b.m102448a(r1, r2, r3, r5, r4)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            com.tencent.mm.plugin.appbrand.launching.m1$g r5 = r4.f243620h
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b
            if (r5 == 0) goto L_0x003d
            int r4 = r4.f243619g
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r4)
            if (r4 == 0) goto L_0x003d
            goto L_0x0074
        L_0x003d:
            com.tencent.mm.plugin.appbrand.appcache.j1 r4 = r8.f243941i
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "$__PLUGINCODE__"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L_0x0056
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            int r4 = r4.f243619g
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r4)
            if (r4 == 0) goto L_0x0056
            goto L_0x0074
        L_0x0056:
            com.tencent.mm.plugin.appbrand.appcache.j1 r4 = r8.f243941i
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L_0x0076
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            int r4 = r4.f243619g
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99663a(r4)
            if (r4 == 0) goto L_0x0076
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            com.tencent.mm.plugin.appbrand.launching.m1$g r4 = r4.f243620h
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a
            if (r4 == 0) goto L_0x0076
        L_0x0074:
            r4 = 1
            goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            if (r4 == 0) goto L_0x007e
            r8.mo115783c()
            goto L_0x03f9
        L_0x007e:
            r4 = 0
            if (r1 != 0) goto L_0x008c
            fy3.p<com.tencent.mm.plugin.appbrand.launching.m1$a, java.lang.String, rx3.b0> r0 = r8.f243939g
            com.tencent.mm.plugin.appbrand.launching.m1$a r1 = com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83369a.PKG_RECORD_NULL
            com.tencent.mm.plugin.appbrand.launching.u0$d r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83488d) r0
            r0.invoke(r1, r4)
            goto L_0x03f9
        L_0x008c:
            java.lang.String r5 = r1.field_versionMd5
            if (r5 == 0) goto L_0x0099
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r5 = 0
            goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            java.lang.String r6 = "MicroMsg.AppBrand.CommonPkgFetcher"
            if (r5 == 0) goto L_0x00b7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "record.md5 is EMPTY, will download with request "
            r5.append(r7)
            com.tencent.mm.plugin.appbrand.launching.m1$d r7 = r8.f243934b
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            goto L_0x013a
        L_0x00b7:
            java.lang.String r5 = r1.field_pkgPath
            if (r5 == 0) goto L_0x00c4
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r5 = 0
            goto L_0x00c5
        L_0x00c4:
            r5 = 1
        L_0x00c5:
            if (r5 == 0) goto L_0x00df
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "record.path is EMPTY, will download with request "
            r5.append(r7)
            com.tencent.mm.plugin.appbrand.launching.m1$d r7 = r8.f243934b
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            goto L_0x013a
        L_0x00df:
            com.tencent.mm.plugin.appbrand.launching.m1$d r5 = r8.f243934b
            com.tencent.mm.plugin.appbrand.launching.m1$g r5 = r5.f243620h
            boolean r7 = r5 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b
            if (r7 == 0) goto L_0x0105
            r9 = r5
            com.tencent.mm.plugin.appbrand.launching.m1$g$b r9 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b) r9
            boolean r9 = r9.f243632b
            if (r9 == 0) goto L_0x0105
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "LATEST(forceUpdate) requested, will download with request "
            r5.append(r7)
            com.tencent.mm.plugin.appbrand.launching.m1$d r7 = r8.f243934b
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            goto L_0x013a
        L_0x0105:
            if (r7 == 0) goto L_0x013c
            com.tencent.mm.plugin.appbrand.launching.m1$g$b r5 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b) r5
            int r5 = r5.f243631a
            int r7 = r1.field_version
            if (r5 <= r7) goto L_0x013c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "LATEST(version:"
            r5.append(r7)
            com.tencent.mm.plugin.appbrand.launching.m1$d r7 = r8.f243934b
            com.tencent.mm.plugin.appbrand.launching.m1$g r7 = r7.f243620h
            com.tencent.mm.plugin.appbrand.launching.m1$g$b r7 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b) r7
            int r7 = r7.f243631a
            r5.append(r7)
            java.lang.String r7 = " requested, > record.version("
            r5.append(r7)
            int r7 = r1.field_version
            r5.append(r7)
            java.lang.String r7 = "))"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x013a:
            r5 = 1
            goto L_0x013d
        L_0x013c:
            r5 = 0
        L_0x013d:
            if (r5 == 0) goto L_0x0144
            r8.mo115783c()
            goto L_0x03f9
        L_0x0144:
            java.lang.Object r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r5 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage) r5
            com.tencent.mm.plugin.appbrand.launching.m1$d r7 = r8.f243934b
            java.lang.String r7 = r7.f243616d
            ki0.g r5 = r5.mo56572e(r7)
            if (r5 == 0) goto L_0x0157
            long r9 = r5.field_timestamp
            goto L_0x0159
        L_0x0157:
            r9 = -1
        L_0x0159:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ff
            java.lang.String r5 = r1.field_pkgPath     // Catch:{ Exception -> 0x01a5 }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r7 = r5.getPath()     // Catch:{ Exception -> 0x01a5 }
            if (r7 == 0) goto L_0x0189
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r3, r3)     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r13 = r5.getPath()     // Catch:{ Exception -> 0x01a5 }
            boolean r13 = r13.equals(r7)     // Catch:{ Exception -> 0x01a5 }
            if (r13 != 0) goto L_0x0189
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ Exception -> 0x01a5 }
            android.net.Uri$Builder r5 = r5.path(r7)     // Catch:{ Exception -> 0x01a5 }
            android.net.Uri r5 = r5.build()     // Catch:{ Exception -> 0x01a5 }
        L_0x0189:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x01a5 }
            com.tencent.mm.vfs.f0$h r4 = r7.mo177799l(r5, r4)     // Catch:{ Exception -> 0x01a5 }
            boolean r5 = r4.mo177810a()     // Catch:{ Exception -> 0x01a5 }
            if (r5 != 0) goto L_0x0196
            goto L_0x01a0
        L_0x0196:
            com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r4 = r4.f348992b     // Catch:{ Exception -> 0x01a5 }
            com.tencent.mm.vfs.b0 r4 = r5.mo119945q(r4)     // Catch:{ Exception -> 0x01a5 }
            if (r4 != 0) goto L_0x01a2
        L_0x01a0:
            r4 = r11
            goto L_0x01aa
        L_0x01a2:
            long r4 = r4.f250475e     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01aa
        L_0x01a5:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01aa:
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x01ff
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x01ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start(), request:"
            r1.append(r2)
            com.tencent.mm.plugin.appbrand.launching.m1$d r2 = r8.f243934b
            r1.append(r2)
            java.lang.String r2 = ", before check file checksum, lastModified("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ") is marked as invalid until "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r0 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage) r0
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r8.f243934b
            java.lang.String r1 = r1.f243616d
            ki0.g r0 = r0.mo56572e(r1)
            if (r0 == 0) goto L_0x01f0
            int r0 = r0.field_reportId
            goto L_0x01f1
        L_0x01f0:
            r0 = -1
        L_0x01f1:
            r8.f243943k = r0
            ii0.a r1 = ii0.C87732a.INSTANCE
            r2 = 189(0xbd, float:2.65E-43)
            r1.mo122144a(r0, r2)
            r8.mo115783c()
            goto L_0x03f9
        L_0x01ff:
            long r4 = r1.field_checksum
            java.lang.String r0 = "record.field_pkgPath"
            java.lang.String r7 = ", path:"
            java.lang.String r9 = ", version:"
            int r10 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0277
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            boolean r4 = r4.f243621i
            if (r4 != 0) goto L_0x0277
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99677c()
            if (r4 == 0) goto L_0x0277
            java.lang.String r4 = r1.field_pkgPath
            long r4 = js0.C9513g.m9208a(r4)
            long r10 = r1.field_checksum
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0277
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "start(), pkg cached with crc32, invoke onSuccess, request="
            r2.append(r4)
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            r2.append(r4)
            r2.append(r9)
            int r4 = r1.field_version
            r2.append(r4)
            java.lang.String r4 = ", checksum:"
            r2.append(r4)
            long r4 = r1.field_checksum
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = r1.field_pkgPath
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r8.mo115782b(r1)
            fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r2 = r8.f243938f
            com.tencent.mm.plugin.appbrand.launching.u0$c r9 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.f243945a
            com.tencent.mm.plugin.appbrand.launching.m1$d r10 = r8.f243934b
            java.lang.String r11 = r1.field_pkgPath
            gy3.C87412m.m108593f(r11, r0)
            java.lang.String r12 = r1.field_versionMd5
            int r13 = r1.field_version
            com.tencent.mm.plugin.appbrand.launching.m1$f$a r14 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
            r14.<init>(r3)
            com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r9.mo115784a(r10, r11, r12, r13, r14)
            com.tencent.mm.plugin.appbrand.launching.u0$f r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83490f) r2
            r2.invoke(r0)
            goto L_0x03f9
        L_0x0277:
            java.lang.String r4 = r1.field_pkgPath
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99520c(r4)
            java.lang.String r5 = r1.field_versionMd5
            boolean r5 = gy3.C87412m.m108589b(r5, r4)
            if (r5 == 0) goto L_0x02e6
            if (r4 == 0) goto L_0x0290
            int r5 = r4.length()
            if (r5 != 0) goto L_0x028e
            goto L_0x0290
        L_0x028e:
            r5 = 0
            goto L_0x0291
        L_0x0290:
            r5 = 1
        L_0x0291:
            if (r5 != 0) goto L_0x02e6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "start(), pkg cached with LegacyMd5, invoke onSuccess, request="
            r2.append(r4)
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            r2.append(r4)
            r2.append(r9)
            int r4 = r1.field_version
            r2.append(r4)
            java.lang.String r4 = ", md5:"
            r2.append(r4)
            java.lang.String r4 = r1.field_versionMd5
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = r1.field_pkgPath
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r8.mo115782b(r1)
            fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r2 = r8.f243938f
            com.tencent.mm.plugin.appbrand.launching.u0$c r9 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.f243945a
            com.tencent.mm.plugin.appbrand.launching.m1$d r10 = r8.f243934b
            java.lang.String r11 = r1.field_pkgPath
            gy3.C87412m.m108593f(r11, r0)
            java.lang.String r12 = r1.field_versionMd5
            int r13 = r1.field_version
            com.tencent.mm.plugin.appbrand.launching.m1$f$a r14 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
            r14.<init>(r3)
            com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r9.mo115784a(r10, r11, r12, r13, r14)
            com.tencent.mm.plugin.appbrand.launching.u0$f r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83490f) r2
            r2.invoke(r0)
            goto L_0x03f9
        L_0x02e6:
            java.lang.String r5 = r1.field_NewMd5
            boolean r5 = gy3.C87412m.m108589b(r5, r4)
            if (r5 == 0) goto L_0x0377
            if (r4 == 0) goto L_0x02f8
            int r5 = r4.length()
            if (r5 != 0) goto L_0x02f7
            goto L_0x02f8
        L_0x02f7:
            r2 = 0
        L_0x02f8:
            if (r2 != 0) goto L_0x0377
            com.tencent.mm.plugin.appbrand.launching.m1$d r2 = r8.f243934b
            boolean r2 = r2.f243621i
            if (r2 == 0) goto L_0x0324
            java.lang.String r2 = r1.field_pkgPath
            int r2 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.m99509d(r2)
            if (r2 <= 0) goto L_0x0324
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start(), pkg cached with NewMd5, but forceNoEncrypt, waitForDownload instead, request="
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r8.f243934b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r8.mo115783c()
            goto L_0x03f9
        L_0x0324:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "start(), pkg cached with NewMd5, invoke onSuccess, request="
            r2.append(r4)
            com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r8.f243934b
            r2.append(r4)
            r2.append(r9)
            int r4 = r1.field_version
            r2.append(r4)
            java.lang.String r4 = ", NewMd5:"
            r2.append(r4)
            java.lang.String r4 = r1.field_NewMd5
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = r1.field_pkgPath
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r8.mo115782b(r1)
            fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r2 = r8.f243938f
            com.tencent.mm.plugin.appbrand.launching.u0$c r9 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.f243945a
            com.tencent.mm.plugin.appbrand.launching.m1$d r10 = r8.f243934b
            java.lang.String r11 = r1.field_pkgPath
            gy3.C87412m.m108593f(r11, r0)
            java.lang.String r12 = r1.field_NewMd5
            int r13 = r1.field_version
            com.tencent.mm.plugin.appbrand.launching.m1$f$a r14 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
            r14.<init>(r3)
            com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r9.mo115784a(r10, r11, r12, r13, r14)
            com.tencent.mm.plugin.appbrand.launching.u0$f r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83490f) r2
            r2.invoke(r0)
            goto L_0x03f9
        L_0x0377:
            java.lang.String r0 = r1.field_pkgPath
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x03b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "start(), check existed pkg fileMd5("
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ")!=recordMd5("
            r0.append(r2)
            java.lang.String r2 = r1.field_versionMd5
            r0.append(r2)
            r2 = 124(0x7c, float:1.74E-43)
            r0.append(r2)
            java.lang.String r2 = r1.field_NewMd5
            r0.append(r2)
            java.lang.String r2 = "), request="
            r0.append(r2)
            com.tencent.mm.plugin.appbrand.launching.m1$d r2 = r8.f243934b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x03b2:
            com.tencent.mm.plugin.appbrand.launching.u0$c r0 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.f243945a
            com.tencent.mm.plugin.appbrand.appcache.q0 r2 = r8.mo115781a()
            com.tencent.mm.plugin.appbrand.launching.m1$d r3 = r8.f243934b
            com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r0.mo115785b(r2, r3, r1)
            if (r0 == 0) goto L_0x03df
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start(), pkg cached by reuse logic, request="
            r1.append(r2)
            com.tencent.mm.plugin.appbrand.launching.m1$d r2 = r8.f243934b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r1 = r8.f243938f
            com.tencent.mm.plugin.appbrand.launching.u0$f r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83490f) r1
            r1.invoke(r0)
            goto L_0x03f9
        L_0x03df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start(), no cached pkg, will download with request "
            r0.append(r1)
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r8.f243934b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r8.mo115783c()
        L_0x03f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83391n1.run():void");
    }
}
