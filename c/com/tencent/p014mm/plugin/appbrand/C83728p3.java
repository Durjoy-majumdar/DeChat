package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.page.C83864o3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.BuildConfig;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import sx3.C64197v;
import u24.C90595a;
import u24.C90599h;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.p3 */
public final class C83728p3 {

    /* renamed from: a */
    public final AtomicBoolean f244377a = new AtomicBoolean();

    /* renamed from: a */
    public final void mo116010a(HashMap<String, C1953r3> hashMap, List<String> list) {
        C86009m1 m1Var = new C86009m1(C83864o3.f244851c.mo116423c());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119966f();
            return;
        }
        C86009m1[] u = m1Var.mo119984u();
        if (u != null) {
            if (!(u.length == 0)) {
                HashMap hashMap2 = new HashMap();
                mo116012c();
                Iterator a = C32617c.m39769a(u);
                while (true) {
                    C32616b bVar = (C32616b) a;
                    if (bVar.hasNext()) {
                        C86009m1 m1Var2 = (C86009m1) bVar.next();
                        String name = m1Var2.getName();
                        C87412m.m108593f(name, "file.name");
                        String quote = Pattern.quote("-");
                        C87412m.m108593f(quote, "quote(MPPageScriptProvid…eCacheImpl.SPLITTER + \"\")");
                        Object[] array = C112550d0.m153785U(name, new String[]{quote}, false, 0, 6, (Object) null).toArray(new String[0]);
                        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        String[] strArr = (String[]) array;
                        if (strArr.length < 2) {
                            C86013q1.m106447h(m1Var2.mo119971i());
                            C86013q1.m106446g(m1Var2.mo119971i(), true);
                        } else {
                            mo116012c();
                            String str = strArr[0];
                            if (C87412m.m108589b(BuildConfig.INSTALL_TYPE, str)) {
                                str = "@LibraryAppId";
                            }
                            if (list.contains(str)) {
                                Log.m105924i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, exclude appId: " + str);
                            } else {
                                int i = Util.getInt(C90599h.m113521n(strArr[1], 1), 0);
                                int[] iArr = (int[]) hashMap2.get(str);
                                if (iArr == null) {
                                    C81161g2.requireAccountInitializedOnDemand();
                                    iArr = C81161g2.f238471g.mo113543y(str);
                                    if (iArr == null) {
                                        iArr = new int[]{0};
                                    }
                                    Log.m105925i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, C90595a.m113499c(iArr, "-1"));
                                    hashMap2.put(str, iArr);
                                }
                                if (!C90595a.m113497a(iArr, i)) {
                                    mo116014e(hashMap, str, m1Var2.mo119971i());
                                    Log.m105925i("MicroMsg.AppBrand.PkgCalculateLogic", "calculateExpiredWebViewCodeCache, file(%s) deleted", m1Var2.mo119971i());
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        m1Var.mo119966f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116011b(java.util.HashMap<java.lang.String, com.tencent.p014mm.plugin.appbrand.C1953r3> r17, java.util.List<java.lang.String> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            r2.getClass()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            java.lang.String r7 = "appId"
            r5[r6] = r7
            java.lang.String r8 = "AppBrandWxaPkgManifestRecord"
            r9 = 1
            r5[r9] = r8
            java.lang.String r8 = "select distinct %s from %s"
            java.lang.String r3 = java.lang.String.format(r3, r8, r5)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r2.f238664d
            r8 = 0
            android.database.Cursor r3 = r5.rawQuery(r3, r8)
            if (r3 == 0) goto L_0x0070
            boolean r5 = r3.moveToFirst()     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x0070
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0064 }
            r5.<init>()     // Catch:{ all -> 0x0064 }
        L_0x0036:
            java.lang.String r10 = r3.getString(r6)     // Catch:{ all -> 0x0064 }
            r11 = 36
            int r11 = r10.indexOf(r11)     // Catch:{ all -> 0x0064 }
            if (r11 >= 0) goto L_0x0046
            r5.add(r10)     // Catch:{ all -> 0x0064 }
            goto L_0x0055
        L_0x0046:
            java.lang.String r12 = "__PLUGINCODE__"
            boolean r12 = r10.endsWith(r12)     // Catch:{ all -> 0x0064 }
            if (r12 != 0) goto L_0x0055
            java.lang.String r10 = r10.substring(r6, r11)     // Catch:{ all -> 0x0064 }
            r5.add(r10)     // Catch:{ all -> 0x0064 }
        L_0x0055:
            boolean r10 = r3.moveToNext()     // Catch:{ all -> 0x0064 }
            if (r10 != 0) goto L_0x0036
            java.util.LinkedList r10 = new java.util.LinkedList     // Catch:{ all -> 0x0064 }
            r10.<init>(r5)     // Catch:{ all -> 0x0064 }
            r3.close()
            goto L_0x0079
        L_0x0064:
            r0 = move-exception
            r2 = r0
            r3.close()     // Catch:{ all -> 0x006a }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)
        L_0x006f:
            throw r2
        L_0x0070:
            if (r3 == 0) goto L_0x0075
            r3.close()
        L_0x0075:
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x0079:
            java.lang.String r3 = "wxaPkgStorage.allAppIdsWithoutPlugin"
            gy3.C87412m.m108593f(r10, r3)
            r16.mo116012c()
            java.util.Iterator r3 = r10.iterator()
        L_0x0086:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01ce
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r10 = "@LibraryAppId"
            boolean r10 = gy3.C87412m.m108589b(r10, r5)
            if (r10 == 0) goto L_0x009b
            goto L_0x0086
        L_0x009b:
            wi0.e0 r10 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r11 = "versionInfo"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r10 = r10.mo114011mL(r5, r11)
            if (r10 == 0) goto L_0x01c8
            java.lang.String r10 = r10.field_versionInfo
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x00b6
            goto L_0x01c8
        L_0x00b6:
            r10 = r18
            boolean r11 = r10.contains(r5)
            if (r11 == 0) goto L_0x00d5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "calculateRelease, exclude appId: "
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            java.lang.String r11 = "MicroMsg.AppBrand.PkgCalculateLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            goto L_0x0086
        L_0x00d5:
            r16.mo116012c()
            java.util.List r11 = r2.mo113538t(r5, r6)
            java.lang.String r12 = "wxaPkgStorage.selectAllI…EBUG_PKG_TYPE_AS_RELEASE)"
            gy3.C87412m.m108593f(r11, r12)
            java.util.Iterator r11 = r11.iterator()
        L_0x00e6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00fb
            java.lang.Object r12 = r11.next()
            com.tencent.mm.plugin.appbrand.appcache.z2 r12 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r12
            gy3.C87412m.m108593f(r5, r7)
            java.lang.String r12 = r12.field_pkgPath
            r1.mo116014e(r0, r5, r12)
            goto L_0x00e6
        L_0x00fb:
            r16.mo116012c()
            f40.o r11 = f40.C86709a0.m107535s()
            java.lang.String r11 = r11.f251807e
            java.lang.String r12 = "accPath"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.String r12 = "/"
            boolean r12 = z04.C112551y.m153808h(r11, r12, r6, r4, r8)
            r13 = 47
            if (r12 != 0) goto L_0x0122
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r13)
            java.lang.String r11 = r12.toString()
        L_0x0122:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "appbrand/pagesidx/"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r11)
            java.lang.Iterable r12 = com.tencent.p014mm.vfs.C86013q1.m106459t(r11, r9)
            if (r12 == 0) goto L_0x0190
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0145:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0168
            java.lang.Object r15 = r12.next()
            r4 = r15
            com.tencent.mm.vfs.b0 r4 = (com.tencent.p014mm.vfs.C86001b0) r4
            java.lang.String r4 = r4.f250472b
            java.lang.String r8 = "it.name"
            gy3.C87412m.m108593f(r4, r8)
            gy3.C87412m.m108593f(r5, r7)
            boolean r4 = z04.C112551y.m153819s(r4, r5, r6)
            if (r4 == 0) goto L_0x0165
            r14.add(r15)
        L_0x0165:
            r4 = 2
            r8 = 0
            goto L_0x0145
        L_0x0168:
            java.util.Iterator r4 = r14.iterator()
        L_0x016c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0190
            java.lang.Object r8 = r4.next()
            com.tencent.mm.vfs.b0 r8 = (com.tencent.p014mm.vfs.C86001b0) r8
            gy3.C87412m.m108593f(r5, r7)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r8 = r8.f250472b
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r1.mo116014e(r0, r5, r8)
            goto L_0x016c
        L_0x0190:
            r16.mo116012c()
            gy3.C87412m.m108593f(r5, r7)
            java.lang.String r4 = vq0.C90865l.m113956a(r5)
            java.lang.Iterable r8 = com.tencent.p014mm.vfs.C86013q1.m106459t(r4, r9)
            if (r8 == 0) goto L_0x01ca
            java.util.Iterator r8 = r8.iterator()
        L_0x01a4:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x01ca
            java.lang.Object r11 = r8.next()
            com.tencent.mm.vfs.b0 r11 = (com.tencent.p014mm.vfs.C86001b0) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r13)
            java.lang.String r11 = r11.f250472b
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r1.mo116014e(r0, r5, r11)
            goto L_0x01a4
        L_0x01c8:
            r10 = r18
        L_0x01ca:
            r4 = 2
            r8 = 0
            goto L_0x0086
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C83728p3.mo116011b(java.util.HashMap, java.util.List):void");
    }

    /* renamed from: c */
    public final void mo116012c() {
        if (this.f244377a.get()) {
            throw new InterruptedException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        cy3.C58003b.m67160a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo116013d() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d0> r1 = com.tencent.p014mm.plugin.appbrand.appusage.C81477d0.class
            java.lang.Object r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r1)
            com.tencent.mm.plugin.appbrand.appusage.d0 r1 = (com.tencent.p014mm.plugin.appbrand.appusage.C81477d0) r1
            if (r1 == 0) goto L_0x0044
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "select appId from AppBrandMessInfoRecord where wechatPluginApp > 0 or appServiceType = 7"
            android.database.Cursor r1 = r1.rawQuery(r5, r4)
            if (r1 == 0) goto L_0x0041
            r4 = 0
            boolean r5 = r1.moveToFirst()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0034
        L_0x0027:
            java.lang.String r5 = r1.getString(r3)     // Catch:{ all -> 0x003a }
            r2.add(r5)     // Catch:{ all -> 0x003a }
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x003a }
            if (r5 != 0) goto L_0x0027
        L_0x0034:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003a }
            cy3.C58003b.m67160a(r1, r4)
            goto L_0x0041
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r2 = move-exception
            cy3.C58003b.m67160a(r1, r0)
            throw r2
        L_0x0041:
            r0.addAll(r2)
        L_0x0044:
            java.lang.Class<kr0.b1> r1 = kr0.C33987b1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p r1 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p) r1
            java.util.List r1 = r1.vx0()
            java.util.Iterator r1 = r1.iterator()
        L_0x0059:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.appbrand.appcache.predownload.export.p$b r2 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p.C29266b) r2
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = r2.f79951d
            r0.add(r2)
            goto L_0x0059
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C83728p3.mo116013d():java.util.List");
    }

    /* renamed from: e */
    public final void mo116014e(HashMap<String, C1953r3> hashMap, String str, String str2) {
        ArrayList<String> arrayList;
        if (str2 != null) {
            C86001b0 n = C86013q1.m106453n(str2);
            int i = 0;
            int i2 = n != null ? (int) n.f250474d : 0;
            if (!hashMap.containsKey(str) || hashMap.get(str) == null) {
                hashMap.put(str, new C1953r3(str, i2, C64197v.m75534c(str2)));
                return;
            }
            C1953r3 r3Var = hashMap.get(str);
            if (r3Var != null) {
                C1953r3 r3Var2 = hashMap.get(str);
                if (r3Var2 != null) {
                    i = r3Var2.f11861b + i2;
                }
                r3Var.f11861b = i;
            }
            C1953r3 r3Var3 = hashMap.get(str);
            if (r3Var3 != null && (arrayList = r3Var3.f11862c) != null) {
                arrayList.add(str2);
            }
        }
    }
}
