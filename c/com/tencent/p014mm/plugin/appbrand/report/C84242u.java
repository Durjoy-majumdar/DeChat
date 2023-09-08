package com.tencent.p014mm.plugin.appbrand.report;

import android.content.Context;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.autogen.mmdata.rpt.WechatAppJsErrorStruct;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import gy3.C87412m;
import kr0.C88267e;
import p206nj.C117627q;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.report.u */
public final class C84242u {

    /* renamed from: a */
    public static final C84242u f246074a = new C84242u();

    /* renamed from: b */
    public static final void m103849b(C88267e eVar, String str, String str2) {
        C87412m.m108594g(eVar, "service");
        QualitySessionRuntime c = C84185b.m103770c(eVar.getAppId(), true);
        if (c != null) {
            WechatAppJsErrorStruct wechatAppJsErrorStruct = new WechatAppJsErrorStruct();
            wechatAppJsErrorStruct.f237386d = wechatAppJsErrorStruct.mo86045b("appid", c.f245833e, true);
            wechatAppJsErrorStruct.f237387e = (long) c.f245837i;
            wechatAppJsErrorStruct.f237388f = (long) c.f245834f;
            wechatAppJsErrorStruct.f237389g = 9;
            wechatAppJsErrorStruct.f237391i = wechatAppJsErrorStruct.mo86045b("errorMessage", str, true);
            wechatAppJsErrorStruct.f237392j = wechatAppJsErrorStruct.mo86045b("errorStack", str2, true);
            ICommLibReader k = eVar.mo114272k();
            C87412m.m108591d(k);
            wechatAppJsErrorStruct.f237393k = wechatAppJsErrorStruct.mo86045b("sdkversion", k.mo113377i(), true);
            ICommLibReader k2 = eVar.mo114272k();
            C87412m.m108591d(k2);
            wechatAppJsErrorStruct.f237397o = wechatAppJsErrorStruct.mo86045b("sdkupdatetime", k2.mo113378ld(), true);
            wechatAppJsErrorStruct.f237394l = (long) c.f245835g;
            wechatAppJsErrorStruct.f237398p = (long) c.f245840A.get();
            C83928t1 M0 = eVar.mo114341l0();
            String Q0 = M0.mo116162Q0();
            String n = C90599h.m113521n(M0.mo116163R0(), Q0.length());
            if (n == null) {
                n = "";
            }
            wechatAppJsErrorStruct.f237395m = wechatAppJsErrorStruct.mo86045b("route", C117627q.m165908a(Q0), true);
            wechatAppJsErrorStruct.f237396n = wechatAppJsErrorStruct.mo86045b(SearchIntents.EXTRA_QUERY, C117627q.m165908a(n), true);
            wechatAppJsErrorStruct.f237400r = wechatAppJsErrorStruct.mo86045b("networkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
            wechatAppJsErrorStruct.mo86054n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
        if (r13.equals("WAService.js") == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        if (r13.equals("WAServiceMainContext.js") != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandServiceWCScriptReporter", "reportEvaluateResult, service_lib_script[" + r13 + "], succeed[" + r11 + ']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f9, code lost:
        if (r29.getRuntime() == null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fb, code lost:
        if (r11 == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fd, code lost:
        com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r29.getAppId(), com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAMainContext, "", r32, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020d, code lost:
        com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r29.getAppId(), com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAMainContext, "", "", r32, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021e, code lost:
        r12 = "WAServiceMainContext.js";
        com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a.mo116899c(r29, r13, r0.f260400k, r31, r32, r34, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0239, code lost:
        if (gy3.C87412m.m108589b(r13, "WAService.js") == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x023b, code lost:
        r0 = new rx3.C13605o(5, 6, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0254, code lost:
        if (gy3.C87412m.m108589b(r13, r12) == false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0256, code lost:
        r0 = new rx3.C13605o(61, 62, 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x026e, code lost:
        r0 = new rx3.C13605o(0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0273, code lost:
        r1 = ((java.lang.Number) r0.f38557d).intValue();
        r2 = ((java.lang.Number) r0.f38558e).intValue();
        r0 = ((java.lang.Number) r0.f38559f).intValue();
        r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r3.mo175911u(370, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0292, code lost:
        if (r11 == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0294, code lost:
        r3.mo175911u(370, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0299, code lost:
        r3.mo175911u(370, r2);
        com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r29.getAppId(), 24, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02aa, code lost:
        if (r29.getRuntime() == null) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ac, code lost:
        r14 = r29.getRuntime().mo113213o1().f261072r.pkgVersion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02b9, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02be, code lost:
        if (r29.getRuntime() == null) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c0, code lost:
        r16 = r29.getRuntime().mo113213o1().f261072r.f238585d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02ce, code lost:
        com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r29.getAppId(), r14, r16, 370, r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ec, code lost:
        if (z04.C112551y.m153808h(r13, "/app-service.js", false, 2, (java.lang.Object) null) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ee, code lost:
        r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE;
        r0.mo175911u(370, 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f7, code lost:
        if (r11 == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02f9, code lost:
        r0.mo175911u(370, 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ff, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandServiceWCScriptReporter", "inject module(" + r13 + ") script failed");
        r0.mo175911u(370, 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116921a(kr0.C88267e r29, p1044ub.C90636f.C90637a r30, boolean r31, long r32, long r34, java.lang.Object r36) {
        /*
            r28 = this;
            r0 = r30
            r11 = r31
            r10 = r36
            java.lang.String r1 = "service"
            r12 = r29
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = "scriptInfo"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r13 = r0.f260398i
            r1 = 1
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            if (r13 == 0) goto L_0x0027
            int r2 = r13.length()
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x002b
            return
        L_0x002b:
            r2 = 93
            java.lang.String r3 = "name"
            java.lang.String r8 = "WAService.js"
            java.lang.String r9 = "WAServiceMainContext.js"
            java.lang.String r4 = "MicroMsg.AppBrandServiceWCScriptReporter"
            r7 = 370(0x172, float:5.18E-43)
            if (r11 != 0) goto L_0x0083
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "reportEvaluateResult, !succeed name["
            r5.append(r6)
            r5.append(r13)
            java.lang.String r6 = "], appId["
            r5.append(r6)
            java.lang.String r6 = r29.getAppId()
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            long r5 = r0.f260400k
            r16 = 0
            int r18 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r18 > 0) goto L_0x0083
            gy3.C87412m.m108593f(r13, r3)
            boolean r5 = gy3.C87412m.m108589b(r13, r8)
            if (r5 == 0) goto L_0x0076
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 72
            r5.mo175911u(r7, r6)
            goto L_0x0083
        L_0x0076:
            boolean r5 = gy3.C87412m.m108589b(r13, r9)
            if (r5 == 0) goto L_0x0083
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 73
            r5.mo175911u(r7, r6)
        L_0x0083:
            gy3.C87412m.m108593f(r13, r3)
            int r3 = r13.hashCode()
            r5 = 2
            r16 = -1
            r6 = 24
            r2 = 0
            switch(r3) {
                case -979125780: goto L_0x01cd;
                case 293174862: goto L_0x010f;
                case 452806299: goto L_0x009d;
                case 2071195020: goto L_0x0095;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x02e5
        L_0x0095:
            boolean r1 = r13.equals(r8)
            if (r1 != 0) goto L_0x01d3
            goto L_0x02e5
        L_0x009d:
            java.lang.String r1 = "WAGame.js"
            boolean r1 = r13.equals(r1)
            if (r1 != 0) goto L_0x00a7
            goto L_0x02e5
        L_0x00a7:
            if (r11 != 0) goto L_0x00d0
            java.lang.String r0 = r29.getAppId()
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r0, r6, r14)
            java.lang.String r15 = r29.getAppId()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            int r16 = r0.mo121252j1()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r0.f238149o
            int r0 = r0.f239365g
            r18 = 778(0x30a, float:1.09E-42)
            r19 = 14
            r20 = 1
            r17 = r0
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r15, r16, r17, r18, r19, r20)
            goto L_0x00e3
        L_0x00d0:
            com.tencent.mm.plugin.appbrand.report.quality.e r1 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            long r3 = r0.f260400k
            r0 = r1
            r1 = r29
            r2 = r13
            r5 = r31
            r6 = r32
            r8 = r34
            r10 = r36
            r0.mo116899c(r1, r2, r3, r5, r6, r8, r10)
        L_0x00e3:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            if (r0 == 0) goto L_0x031f
            if (r11 == 0) goto L_0x00fc
            java.lang.String r1 = r29.getAppId()
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAGameContext
            java.lang.String r3 = "WAGame.js"
            r4 = r32
            r6 = r34
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r1, r2, r3, r4, r6)
            goto L_0x031f
        L_0x00fc:
            java.lang.String r4 = r29.getAppId()
            uo0.a r5 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAGameContext
            java.lang.String r6 = ""
            java.lang.String r7 = "WAGame.js"
            r8 = r32
            r10 = r34
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r4, r5, r6, r7, r8, r10)
            goto L_0x031f
        L_0x010f:
            java.lang.String r3 = "app-service.js"
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L_0x0119
            goto L_0x02e5
        L_0x0119:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 9
            r13.mo175911u(r7, r3)
            if (r11 == 0) goto L_0x0181
            boolean r3 = r29.mo114335b0()
            if (r3 != 0) goto L_0x0132
            boolean r3 = r29.isRunning()
            if (r3 == 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r15 = 370(0x172, float:5.18E-43)
            goto L_0x017a
        L_0x0132:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r29.getRuntime()
            boolean r6 = r10 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r6 == 0) goto L_0x013f
            r6 = r10
            com.tencent.mm.appbrand.v8.j$g r6 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r6
            r11 = r6
            goto L_0x0140
        L_0x013f:
            r11 = r2
        L_0x0140:
            if (r11 == 0) goto L_0x0145
            long r8 = r11.f236058a
            goto L_0x0147
        L_0x0145:
            r8 = r32
        L_0x0147:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r3 == 0) goto L_0x014d
            java.lang.String r2 = r3.f238147j
        L_0x014d:
            r5[r14] = r2
            if (r3 == 0) goto L_0x0156
            int r2 = r3.hashCode()
            goto L_0x0157
        L_0x0156:
            r2 = -1
        L_0x0157:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r1] = r2
            java.lang.String r1 = "[QualitySystem] app-service.js runtime.appId=[%s], runtime.hashCode = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r5)
            long r4 = r0.f260400k
            r0 = 0
            if (r3 == 0) goto L_0x016d
            int r1 = r3.hashCode()
            r10 = r1
            goto L_0x016e
        L_0x016d:
            r10 = -1
        L_0x016e:
            java.lang.String r3 = "app-service.js"
            java.lang.String r6 = ""
            r2 = r29
            r15 = 370(0x172, float:5.18E-43)
            r7 = r0
            com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103772e(r2, r3, r4, r6, r7, r8, r10, r11)
        L_0x017a:
            r0 = 11
            r13.mo175911u(r15, r0)
            goto L_0x031f
        L_0x0181:
            r15 = 370(0x172, float:5.18E-43)
            r0 = 10
            r13.mo175911u(r15, r0)     // Catch:{ NullPointerException -> 0x01c1 }
            java.lang.String r0 = r29.getAppId()     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r0, r6, r14)     // Catch:{ NullPointerException -> 0x01c1 }
            java.lang.String r0 = r29.getAppId()     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r29.getRuntime()     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = r2.mo113213o1()     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f261072r     // Catch:{ NullPointerException -> 0x01c1 }
            int r2 = r2.pkgVersion     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r29.getRuntime()     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r3 = r3.mo113213o1()     // Catch:{ NullPointerException -> 0x01c1 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r3 = r3.f261072r     // Catch:{ NullPointerException -> 0x01c1 }
            int r3 = r3.f238585d     // Catch:{ NullPointerException -> 0x01c1 }
            r5 = 370(0x172, float:5.18E-43)
            r6 = 10
            r7 = 1
            r29 = r0
            r30 = r2
            r31 = r3
            r32 = r5
            r33 = r6
            r34 = r7
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r29, r30, r31, r32, r33, r34)     // Catch:{ NullPointerException -> 0x01c1 }
            goto L_0x031f
        L_0x01c1:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r14] = r0
            java.lang.String r0 = "Inject External Service Script Failed, report npe = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
            goto L_0x031f
        L_0x01cd:
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x02e5
        L_0x01d3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reportEvaluateResult, service_lib_script["
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "], succeed["
            r1.append(r2)
            r1.append(r11)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r29.getRuntime()
            if (r1 == 0) goto L_0x021e
            if (r11 == 0) goto L_0x020d
            java.lang.String r17 = r29.getAppId()
            uo0.a r18 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAMainContext
            java.lang.String r19 = ""
            r20 = r32
            r22 = r34
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102129f(r17, r18, r19, r20, r22)
            goto L_0x021e
        L_0x020d:
            java.lang.String r20 = r29.getAppId()
            uo0.a r21 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAMainContext
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            r24 = r32
            r26 = r34
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102127d(r20, r21, r22, r23, r24, r26)
        L_0x021e:
            com.tencent.mm.plugin.appbrand.report.quality.e r1 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            long r3 = r0.f260400k
            r0 = r1
            r1 = r29
            r2 = r13
            r5 = r31
            r12 = 370(0x172, float:5.18E-43)
            r6 = r32
            r14 = r8
            r12 = r9
            r8 = r34
            r10 = r36
            r0.mo116899c(r1, r2, r3, r5, r6, r8, r10)
            boolean r0 = gy3.C87412m.m108589b(r13, r14)
            if (r0 == 0) goto L_0x0250
            rx3.o r0 = new rx3.o
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.<init>(r1, r2, r3)
            goto L_0x0273
        L_0x0250:
            boolean r0 = gy3.C87412m.m108589b(r13, r12)
            if (r0 == 0) goto L_0x026e
            rx3.o r0 = new rx3.o
            r1 = 61
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 62
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 63
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.<init>(r1, r2, r3)
            goto L_0x0273
        L_0x026e:
            rx3.o r0 = new rx3.o
            r0.<init>(r15, r15, r15)
        L_0x0273:
            A r1 = r0.f38557d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            B r2 = r0.f38558e
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            C r0 = r0.f38559f
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 370(0x172, float:5.18E-43)
            r3.mo175911u(r4, r1)
            if (r11 == 0) goto L_0x0299
            r3.mo175911u(r4, r0)
            goto L_0x031f
        L_0x0299:
            r3.mo175911u(r4, r2)
            java.lang.String r0 = r29.getAppId()
            r1 = 24
            r3 = 0
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r0, r1, r3)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            if (r0 == 0) goto L_0x02b9
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f261072r
            int r14 = r0.pkgVersion
            goto L_0x02ba
        L_0x02b9:
            r14 = 0
        L_0x02ba:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            if (r0 == 0) goto L_0x02ce
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r29.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = r0.f261072r
            int r0 = r0.f238585d
            r16 = r0
        L_0x02ce:
            java.lang.String r0 = r29.getAppId()
            r1 = 1
            r3 = 370(0x172, float:5.18E-43)
            r29 = r0
            r30 = r14
            r31 = r16
            r32 = r3
            r33 = r2
            r34 = r1
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103843i(r29, r30, r31, r32, r33, r34)
            goto L_0x031f
        L_0x02e5:
            java.lang.String r0 = "/app-service.js"
            r1 = 0
            boolean r0 = z04.C112551y.m153808h(r13, r0, r1, r5, r2)
            if (r0 == 0) goto L_0x031f
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 30
            r2 = 370(0x172, float:5.18E-43)
            r0.mo175911u(r2, r1)
            if (r11 == 0) goto L_0x02ff
            r1 = 31
            r0.mo175911u(r2, r1)
            goto L_0x031f
        L_0x02ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "inject module("
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ") script failed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r1 = 32
            r2 = 370(0x172, float:5.18E-43)
            r0.mo175911u(r2, r1)
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.C84242u.mo116921a(kr0.e, ub.f$a, boolean, long, long, java.lang.Object):void");
    }
}
