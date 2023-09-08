package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.SystemClock;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C29303u0;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.io.IOException;
import java.util.List;
import p170ic.C87690d;
import rx3.C13604l;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;

@C86522b(creator = C29303u0.C29304a.class, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.t0 */
public final class C81354t0 extends C86301e implements C81396z3 {

    /* renamed from: d */
    public static final C81354t0 f238835d = new C81354t0();

    public void Lr0(String str) {
        C87412m.m108594g(str, "appId");
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "removeIndexByAppId(" + str + "), account().hasInitialized()==FALSE");
            return;
        }
        C86009m1 m1Var = new C86009m1(xx0());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            try {
                m1Var.mo119966f();
            } catch (Exception unused) {
            }
        } else {
            C86009m1[] u = m1Var.mo119984u();
            if (u != null) {
                int length = u.length;
                for (int i = 0; i < length; i++) {
                    C86009m1 m1Var2 = u[i];
                    String str2 = null;
                    String name = m1Var2 != null ? m1Var2.getName() : null;
                    if (!(name == null || name.length() == 0)) {
                        C81354t0 t0Var = f238835d;
                        C87412m.m108591d(m1Var2);
                        String name2 = m1Var2.getName();
                        C87412m.m108593f(name2, "file!!.name");
                        C13604l<String, Integer> wx02 = t0Var.wx0(name2);
                        if (wx02 != null) {
                            str2 = (String) wx02.f38555d;
                        }
                        if (C87412m.m108589b(str, str2)) {
                            m1Var2.mo119966f();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0104 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void iq0() {
        /*
            r16 = this;
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM"
            java.lang.String r1 = "cleanExpiredIndex(), account().hasInitialized()==FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0012:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = r16.xx0()
            r0.<init>((java.lang.String) r1)
            boolean r1 = r0.mo119967g()
            if (r1 == 0) goto L_0x0109
            boolean r1 = r0.mo119977o()
            if (r1 != 0) goto L_0x0029
            goto L_0x0109
        L_0x0029:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            if (r1 != 0) goto L_0x0031
            return
        L_0x0031:
            com.tencent.mm.vfs.m1[] r2 = r0.mo119984u()
            if (r2 == 0) goto L_0x0108
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x003a:
            if (r5 >= r3) goto L_0x0108
            r6 = r2[r5]
            if (r6 == 0) goto L_0x0045
            java.lang.String r0 = r6.getName()
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r7 = 1
            if (r0 == 0) goto L_0x0052
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r0 = 0
            goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            if (r0 == 0) goto L_0x0057
            goto L_0x0104
        L_0x0057:
            com.tencent.mm.plugin.appbrand.appcache.t0 r0 = f238835d
            gy3.C87412m.m108591d(r6)
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "file!!.name"
            gy3.C87412m.m108593f(r8, r9)
            rx3.l r0 = r0.wx0(r8)
            if (r0 != 0) goto L_0x006d
            goto L_0x0104
        L_0x006d:
            A r8 = r0.f38555d
            java.lang.String r8 = (java.lang.String) r8
            B r0 = r0.f38556e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x0082
        L_0x007f:
            r0 = 0
            goto L_0x00ff
        L_0x0082:
            boolean r9 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99663a(r4)
            if (r9 == 0) goto L_0x008a
            r9 = 1
            goto L_0x008b
        L_0x008a:
            r9 = r0
        L_0x008b:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = "AppBrandWxaPkgManifestRecord"
            r11[r4] = r12
            java.lang.String r12 = "appId"
            r11[r7] = r12
            r12 = 2
            java.lang.String r13 = "version"
            r11[r12] = r13
            java.lang.String r13 = "select count(*) from %s where %s like ? and %s=?"
            java.lang.String r0 = java.lang.String.format(r0, r13, r11)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r1.f238664d     // Catch:{ Exception -> 0x00e7 }
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x00e7 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e7 }
            r14.<init>()     // Catch:{ Exception -> 0x00e7 }
            r14.append(r8)     // Catch:{ Exception -> 0x00e7 }
            r15 = 37
            r14.append(r15)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00e7 }
            r13[r4] = r14     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r14 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00e7 }
            r13[r7] = r14     // Catch:{ Exception -> 0x00e7 }
            android.database.Cursor r11 = r11.rawQuery(r0, r13, r12)     // Catch:{ Exception -> 0x00e7 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d4
            int r0 = r11.getInt(r4)     // Catch:{ all -> 0x00d9 }
            if (r0 <= 0) goto L_0x00d4
            r0 = 1
            goto L_0x00d5
        L_0x00d4:
            r0 = 0
        L_0x00d5:
            r11.close()     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00ff
        L_0x00d9:
            r0 = move-exception
            r13 = r0
            if (r11 == 0) goto L_0x00e6
            r11.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            r11 = r0
            r13.addSuppressed(r11)     // Catch:{ Exception -> 0x00e7 }
        L_0x00e6:
            throw r13     // Catch:{ Exception -> 0x00e7 }
        L_0x00e7:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0[r7] = r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r0[r12] = r7
            java.lang.String r7 = "MicroMsg.AppBrandWxaPkgStorage"
            java.lang.String r8 = "checkManifestsExisted(appId:%s, versionType:%d, version:%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r0)
            goto L_0x007f
        L_0x00ff:
            if (r0 != 0) goto L_0x0104
            r6.mo119966f()
        L_0x0104:
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0108:
            return
        L_0x0109:
            r0.mo119966f()     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81354t0.iq0():void");
    }

    /* renamed from: jA */
    public boolean mo113625jA(String str, int i) {
        C87412m.m108594g(str, "appId");
        if (C86709a0.m107523b().mo121114l()) {
            return C86013q1.m106450k(vx0(str, i));
        }
        Log.m105920e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "checkIsPageIndexExisted(appId:" + str + ", appVersion:" + i + "), account().hasInitialized()==FALSE");
        return false;
    }

    public final String vx0(String str, int i) {
        String xx02 = xx0();
        String i2 = new C86009m1(xx02, str + '_' + i + ".idx").mo119971i();
        C87412m.m108593f(i2, "VFSFile(DIR_PATH, \"${app…LE_SUFFIX}\").absolutePath");
        return i2;
    }

    public final C13604l<String, Integer> wx0(String str) {
        List T = C112550d0.m153784T(C112550d0.m153780P(str, ".idx"), new char[]{'_'}, false, 0, 6, (Object) null);
        try {
            return new C13604l<>((String) T.get(0), Integer.valueOf(Integer.parseInt((String) T.get(1))));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String xx0() {
        String str = C86709a0.m107535s().f251807e;
        C87412m.m108593f(str, "accPath");
        if (!C112551y.m153808h(str, "/", false, 2, (Object) null)) {
            str = str + XVFSFile.SEPARATOR_CHAR;
        }
        String str2 = str + "appbrand/pagesidx/";
        FilePathGenerator.checkMkdir(str2);
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb A[Catch:{ Exception -> 0x0174 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3 A[Catch:{ Exception -> 0x0174 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y00(java.lang.String r21, int r22, java.lang.String r23) {
        /*
            r20 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "pagePath"
            gy3.C87412m.m108594g(r3, r0)
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            r4 = 0
            java.lang.String r5 = ", pagePath:"
            java.lang.String r6 = ", appVersion:"
            java.lang.String r7 = "checkIsPagePathIncluded(appId:"
            java.lang.String r8 = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM"
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r6)
            r0.append(r2)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r1 = "), account().hasInitialized()==FALSE"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return r4
        L_0x0048:
            java.lang.String r0 = p225rc.C89925n.m112488a(r23)
            java.lang.String r9 = ""
            if (r0 != 0) goto L_0x0051
            r0 = r9
        L_0x0051:
            java.lang.String r10 = ".html"
            java.lang.String r0 = z04.C112550d0.m153780P(r0, r10)
            int r10 = r0.length()
            r11 = 1
            if (r10 != 0) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 == 0) goto L_0x0064
            return r4
        L_0x0064:
            java.lang.String r10 = r20.vx0(r21, r22)     // Catch:{ IOException -> 0x006d }
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106432N(r10)     // Catch:{ IOException -> 0x006d }
            goto L_0x006f
        L_0x006d:
            r10 = r9
        L_0x006f:
            if (r10 == 0) goto L_0x007a
            int r12 = r10.length()
            if (r12 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r12 = 0
            goto L_0x007b
        L_0x007a:
            r12 = 1
        L_0x007b:
            if (r12 == 0) goto L_0x007e
            return r4
        L_0x007e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174 }
            r12.<init>()     // Catch:{ Exception -> 0x0174 }
            java.lang.String r13 = "checkIsPagePathIncluded(pagesJson.length="
            r12.append(r13)     // Catch:{ Exception -> 0x0174 }
            int r13 = r10.length()     // Catch:{ Exception -> 0x0174 }
            r12.append(r13)     // Catch:{ Exception -> 0x0174 }
            r13 = 41
            r12.append(r13)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0174 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0174 }
            j6.h r10 = p571j6.C87884a.m109365a(r10)     // Catch:{ Exception -> 0x0174 }
            boolean r15 = r10 instanceof p571j6.C87889e     // Catch:{ Exception -> 0x0174 }
            if (r15 == 0) goto L_0x00ad
            j6.e r10 = (p571j6.C87889e) r10     // Catch:{ Exception -> 0x0174 }
            j6.h r0 = r10.mo122344l(r0)     // Catch:{ Exception -> 0x0174 }
            if (r0 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00ad:
            boolean r11 = r10 instanceof p571j6.C87885b     // Catch:{ Exception -> 0x0174 }
            if (r11 == 0) goto L_0x00c2
            java.lang.String r11 = "it"
            gy3.C87412m.m108593f(r10, r11)     // Catch:{ Exception -> 0x0174 }
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ Exception -> 0x0174 }
            j6.g r11 = new j6.g     // Catch:{ Exception -> 0x0174 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0174 }
            boolean r11 = sx3.C110818d0.m150903D(r10, r11)     // Catch:{ Exception -> 0x0174 }
            goto L_0x00c3
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x0174 }
            boolean r10 = r0 instanceof p170ic.C87690d.C87691a     // Catch:{ Exception -> 0x0174 }
            if (r10 == 0) goto L_0x00d3
            r9 = r0
            ic.d$a r9 = (p170ic.C87690d.C87691a) r9     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = r9.mo63320l()     // Catch:{ Exception -> 0x0174 }
            goto L_0x00db
        L_0x00d3:
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x0174 }
            if (r10 != 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r9 = r10
        L_0x00db:
            boolean r10 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()     // Catch:{ Exception -> 0x0174 }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0174 }
            long r13 = r15 - r13
            java.lang.String r11 = " isMainThread: "
            java.lang.String r4 = " ms result:"
            java.lang.String r15 = " cost "
            r16 = r8
            java.lang.String r8 = "Luggage.Utils.Profile"
            r17 = 32
            int r19 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x013d
            if (r10 == 0) goto L_0x013d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139 }
            r3.<init>()     // Catch:{ Exception -> 0x0139 }
            r18 = r5
            java.lang.String r5 = "block main thread and skip "
            r3.append(r5)     // Catch:{ Exception -> 0x0135 }
            r5 = 16
            r19 = r6
            long r5 = (long) r5
            long r5 = r13 / r5
            int r6 = (int) r5     // Catch:{ Exception -> 0x0172 }
            r3.append(r6)     // Catch:{ Exception -> 0x0172 }
            java.lang.String r5 = " frames! runProfiled:log:"
            r3.append(r5)     // Catch:{ Exception -> 0x0172 }
            r3.append(r12)     // Catch:{ Exception -> 0x0172 }
            r3.append(r15)     // Catch:{ Exception -> 0x0172 }
            r3.append(r13)     // Catch:{ Exception -> 0x0172 }
            r3.append(r4)     // Catch:{ Exception -> 0x0172 }
            r3.append(r9)     // Catch:{ Exception -> 0x0172 }
            r3.append(r11)     // Catch:{ Exception -> 0x0172 }
            r3.append(r10)     // Catch:{ Exception -> 0x0172 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x0172 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)     // Catch:{ Exception -> 0x0172 }
            goto L_0x016d
        L_0x0135:
            r0 = move-exception
        L_0x0136:
            r19 = r6
            goto L_0x017b
        L_0x0139:
            r0 = move-exception
            r18 = r5
            goto L_0x0136
        L_0x013d:
            r18 = r5
            r19 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0172 }
            r3.<init>()     // Catch:{ Exception -> 0x0172 }
            java.lang.String r5 = "runProfiled:log:"
            r3.append(r5)     // Catch:{ Exception -> 0x0172 }
            r3.append(r12)     // Catch:{ Exception -> 0x0172 }
            r3.append(r15)     // Catch:{ Exception -> 0x0172 }
            r3.append(r13)     // Catch:{ Exception -> 0x0172 }
            r3.append(r4)     // Catch:{ Exception -> 0x0172 }
            r3.append(r9)     // Catch:{ Exception -> 0x0172 }
            r3.append(r11)     // Catch:{ Exception -> 0x0172 }
            r3.append(r10)     // Catch:{ Exception -> 0x0172 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x0172 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)     // Catch:{ Exception -> 0x0172 }
        L_0x016d:
            boolean r4 = r0.booleanValue()     // Catch:{ Exception -> 0x0172 }
            goto L_0x01aa
        L_0x0172:
            r0 = move-exception
            goto L_0x017b
        L_0x0174:
            r0 = move-exception
            r18 = r5
            r19 = r6
            r16 = r8
        L_0x017b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r1 = r19
            r3.append(r1)
            r3.append(r2)
            r1 = r18
            r3.append(r1)
            r1 = r23
            r3.append(r1)
            java.lang.String r1 = "), parse pagesJson failed by "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r4 = 0
        L_0x01aa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81354t0.y00(java.lang.String, int, java.lang.String):boolean");
    }

    public void yx0(String str, int i, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = str;
        int i2 = i;
        String str7 = str2;
        C87412m.m108594g(str6, "appId");
        C87412m.m108594g(str7, "pagesJson");
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM", "updatePageIndex(appId:" + str6 + ", appVersion:" + i2 + "), account().hasInitialized()==FALSE");
            return;
        }
        try {
            String str8 = "updatePageIndex(appId:" + str6 + ", appVersion:" + i2 + ", pagesJson.length=" + str2.length() + ')';
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String vx02 = f238835d.vx0(str6, i2);
            byte[] bytes = str7.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            Integer valueOf = Integer.valueOf(C86013q1.m106438T(vx02, bytes, 0, bytes.length));
            if (valueOf instanceof C87690d.C87691a) {
                str5 = ((C87690d.C87691a) valueOf).mo63320l();
            } else {
                str5 = valueOf.toString();
                if (str5 == null) {
                    str5 = "";
                }
            }
            boolean a = C2039g2.m1987a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 <= 32 || !a) {
                Object obj = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM";
                Object obj2 = ", appVersion:";
                Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + str8 + " cost " + elapsedRealtime2 + " ms result:" + str5 + " isMainThread: " + a + ' ');
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("block main thread and skip ");
            str4 = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM";
            str3 = ", appVersion:";
            try {
                sb.append((int) (elapsedRealtime2 / ((long) 16)));
                sb.append(" frames! runProfiled:log:");
                sb.append(str8);
                sb.append(" cost ");
                sb.append(elapsedRealtime2);
                sb.append(" ms result:");
                sb.append(str5);
                sb.append(" isMainThread: ");
                sb.append(a);
                sb.append(' ');
                Log.m105928w("Luggage.Utils.Profile", sb.toString());
            } catch (IOException e) {
                e = e;
                Log.m105920e(str4, "updatePageIndex(appId:" + str6 + str3 + i2 + "), writeFile failed by " + e);
            }
        } catch (IOException e2) {
            e = e2;
            str4 = "MicroMsg.WxaVersionPagePathIndexStorage.IndexStorageMM";
            str3 = ", appVersion:";
            Log.m105920e(str4, "updatePageIndex(appId:" + str6 + str3 + i2 + "), writeFile failed by " + e);
        }
    }
}
