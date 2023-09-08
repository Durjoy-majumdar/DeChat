package i52;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import java.util.Iterator;

/* renamed from: i52.c */
public final class C33208c {

    /* renamed from: a */
    public static final C33208c f90103a = new C33208c();

    static {
        Log.m105924i("MicroMsg.MagicPkgCleaner", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: a */
    public final void mo59019a(String str, WxaMagicPkgInfo wxaMagicPkgInfo) {
        C87412m.m108594g(str, "pkgId");
        Log.m105925i("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg start pkgId:%s", str);
        WxaMagicPkgInfo e = C87661e.m109006d().mo122082e(str);
        if (e == null || Util.isNullOrNil(e.f81564d) || wxaMagicPkgInfo == null || Util.isNullOrNil(wxaMagicPkgInfo.f81564d)) {
            Log.m105920e("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg invaild pkgInfo");
            return;
        }
        String d = C33209f.m39988d(e.f81564d);
        if (d != null) {
            String i = C86013q1.m106448i(d, true);
            C87412m.m108591d(i);
            C86009m1 m1Var = new C86009m1(i);
            if (m1Var.mo119967g()) {
                Log.m105925i("MicroMsg.MagicPkgCleaner", "pkg patchId:%s,lastpkg patchId:%s", e.f81571n, wxaMagicPkgInfo.f81571n);
                C86009m1[] u = m1Var.mo119984u();
                if (u != null) {
                    Iterator a = C32617c.m39769a(u);
                    while (true) {
                        C32616b bVar = (C32616b) a;
                        if (!bVar.hasNext()) {
                            break;
                        }
                        C86009m1 m1Var2 = (C86009m1) bVar.next();
                        Log.m105925i("MicroMsg.MagicPkgCleaner", "local path:%s", m1Var2.mo119976n());
                        if (!C87412m.m108589b(m1Var2.mo119976n(), C86013q1.m106448i(e.f81567g, true)) && !C87412m.m108589b(m1Var2.mo119976n(), C86013q1.m106448i(e.f81568h, true)) && !C87412m.m108589b(m1Var2.mo119976n(), C86013q1.m106448i(wxaMagicPkgInfo.f81567g, true)) && !C87412m.m108589b(m1Var2.mo119976n(), C86013q1.m106448i(wxaMagicPkgInfo.f81568h, true))) {
                            Log.m105924i("MicroMsg.MagicPkgCleaner", "delete old version folder.");
                            C86013q1.m106445f(m1Var2.mo119976n());
                            C86013q1.m106447h(m1Var2.mo119976n());
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.MagicPkgCleaner", "files is empty");
                }
            } else {
                Log.m105925i("MicroMsg.MagicPkgCleaner", "pkgId %s dir not exist", e.f81564d);
            }
            Log.m105924i("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg end");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59020b() {
        /*
            r21 = this;
            java.lang.String r0 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r1 = "doCleanMagicPkg start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            i52.e r0 = i52.C87661e.m109006d()
            java.util.List r0 = r0.mo122083f()
            if (r0 == 0) goto L_0x01cf
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01cf
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01cf
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r1 = (com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo) r1
            java.lang.String r3 = r1.f81564d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 0
            if (r3 != 0) goto L_0x01be
            java.lang.String r3 = r1.f81564d
            java.lang.String r5 = "pkg.pkgId"
            gy3.C87412m.m108593f(r3, r5)
            monitor-enter(r21)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.k0> r5 = com.tencent.p014mm.plugin.magicbrush.C30204k0.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x01bb }
            com.tencent.mm.plugin.magicbrush.k0 r5 = (com.tencent.p014mm.plugin.magicbrush.C30204k0) r5     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = "MagicPkgSyncSTORAGE"
            r7 = 0
            d42.j r5 = r5.wt0(r6, r7)     // Catch:{ all -> 0x01bb }
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bb }
            r8.<init>()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "MagicPkgClean"
            r8.append(r9)     // Catch:{ all -> 0x01bb }
            r8.append(r3)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "MagicPkgSyncSTORAGE"
            java.lang.Object[] r5 = r5.mo57966w(r9, r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = "mbKVStorage[IMBConstants…IC_PKG_SYNC_STORAGE, key]"
            gy3.C87412m.m108593f(r5, r8)     // Catch:{ all -> 0x01bb }
            r8 = r5[r4]     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo"
            gy3.C87412m.m108592e(r8, r9)     // Catch:{ all -> 0x01bb }
            e42.g r8 = (e42.C31415g) r8     // Catch:{ all -> 0x01bb }
            e42.g r9 = e42.C31415g.C7595b.f25862a     // Catch:{ all -> 0x01bb }
            if (r8 != r9) goto L_0x007e
            r5 = r5[r2]     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r5, r7)     // Catch:{ all -> 0x01bb }
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bb }
        L_0x007e:
            if (r7 == 0) goto L_0x0085
            long r9 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x01bb }
            goto L_0x0087
        L_0x0085:
            r9 = 0
        L_0x0087:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bb }
            long r13 = r11 - r9
            java.lang.String r5 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r7 = "bizStillValid:%s,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s"
            r15 = 6
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ all -> 0x01bb }
            r6[r4] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01bb }
            r6[r2] = r17     // Catch:{ all -> 0x01bb }
            java.lang.Long r17 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r16 = 2
            r6[r16] = r17     // Catch:{ all -> 0x01bb }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x01bb }
            r18 = 3
            r6[r18] = r17     // Catch:{ all -> 0x01bb }
            int r2 = r8.f84089a     // Catch:{ all -> 0x01bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01bb }
            r19 = 4
            r6[r19] = r2     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = r8.f84090b     // Catch:{ all -> 0x01bb }
            r20 = 5
            r6[r20] = r2     // Catch:{ all -> 0x01bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r6)     // Catch:{ all -> 0x01bb }
            r5 = 1209600000(0x48190800, double:5.97621805E-315)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f4
            java.lang.String r2 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r5 = "bizStillValid %s It's not time to clean,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s"
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ all -> 0x01bb }
            r6[r4] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01bb }
            r7 = 1
            r6[r7] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r7 = 2
            r6[r7] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x01bb }
            r6[r18] = r3     // Catch:{ all -> 0x01bb }
            int r3 = r8.f84089a     // Catch:{ all -> 0x01bb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01bb }
            r6[r19] = r3     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = r8.f84090b     // Catch:{ all -> 0x01bb }
            r6[r20] = r3     // Catch:{ all -> 0x01bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)     // Catch:{ all -> 0x01bb }
            monitor-exit(r21)
            r2 = 1
            goto L_0x0121
        L_0x00f4:
            java.lang.String r2 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r5 = "bizStillValid %s could clean,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s"
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ all -> 0x01bb }
            r6[r4] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01bb }
            r7 = 1
            r6[r7] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r7 = 2
            r6[r7] = r3     // Catch:{ all -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x01bb }
            r6[r18] = r3     // Catch:{ all -> 0x01bb }
            int r3 = r8.f84089a     // Catch:{ all -> 0x01bb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01bb }
            r6[r19] = r3     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = r8.f84090b     // Catch:{ all -> 0x01bb }
            r6[r20] = r3     // Catch:{ all -> 0x01bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)     // Catch:{ all -> 0x01bb }
        L_0x011f:
            monitor-exit(r21)
            r2 = 0
        L_0x0121:
            if (r2 != 0) goto L_0x01be
            java.lang.String r2 = r1.f81564d
            java.lang.String r2 = i52.C33209f.m39988d(r2)
            if (r2 != 0) goto L_0x012d
            goto L_0x01cc
        L_0x012d:
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r5 = 1
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106448i(r2, r5)
            gy3.C87412m.m108591d(r2)
            r3.<init>((java.lang.String) r2)
            boolean r2 = r3.mo119967g()
            if (r2 == 0) goto L_0x01ac
            com.tencent.mm.vfs.m1[] r2 = r3.mo119984u()
            if (r2 == 0) goto L_0x01a4
            java.util.Iterator r2 = gy3.C32617c.m39769a(r2)
        L_0x014a:
            r3 = r2
            gy3.b r3 = (gy3.C32616b) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01cc
            java.lang.Object r3 = r3.next()
            com.tencent.mm.vfs.m1 r3 = (com.tencent.p014mm.vfs.C86009m1) r3
            java.lang.String r5 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r6 = "local path:%s,pkg patchId:%s"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r3.mo119976n()
            r8[r4] = r9
            java.lang.String r9 = r1.f81571n
            r10 = 1
            r8[r10] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            java.lang.String r5 = r3.mo119976n()
            java.lang.String r6 = r1.f81567g
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r10)
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = r3.mo119976n()
            java.lang.String r6 = r1.f81568h
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r10)
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r6 = "delete old version folder."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.String r5 = r3.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r5)
            java.lang.String r3 = r3.mo119976n()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
            goto L_0x014a
        L_0x01a4:
            java.lang.String r1 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r2 = "files is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x01cc
        L_0x01ac:
            java.lang.String r2 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r3 = "pkgId %s dir not exist"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r1 = r1.f81564d
            r6[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r6)
            goto L_0x01cc
        L_0x01bb:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        L_0x01be:
            java.lang.String r2 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r3 = "pkgId %s is busy now"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r1 = r1.f81564d
            r6[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r6)
        L_0x01cc:
            r2 = 1
            goto L_0x001d
        L_0x01cf:
            java.lang.String r0 = "MicroMsg.MagicPkgCleaner"
            java.lang.String r1 = "doCleanMagicPkg end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.C33208c.mo59020b():void");
    }
}
