package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityOpenStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemLaunchCGIStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.i */
public final class C84201i {
    /* renamed from: a */
    public static final WeAppQualitySystemContactCGIStruct m103804a(QualitySession qualitySession) {
        C87412m.m108594g(qualitySession, "session");
        WeAppQualitySystemContactCGIStruct weAppQualitySystemContactCGIStruct = new WeAppQualitySystemContactCGIStruct();
        weAppQualitySystemContactCGIStruct.f237139e = weAppQualitySystemContactCGIStruct.mo86045b("AppId", qualitySession.f245833e, true);
        weAppQualitySystemContactCGIStruct.f237138d = weAppQualitySystemContactCGIStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
        int i = qualitySession.f245834f;
        weAppQualitySystemContactCGIStruct.f237141g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualitySystemContactCGIStruct.C80776a.demo : WeAppQualitySystemContactCGIStruct.C80776a.debug : WeAppQualitySystemContactCGIStruct.C80776a.release;
        weAppQualitySystemContactCGIStruct.f237142h = (long) qualitySession.f245835g;
        weAppQualitySystemContactCGIStruct.f237144j = (long) qualitySession.f245836h;
        weAppQualitySystemContactCGIStruct.f237140f = (long) qualitySession.f245837i;
        return weAppQualitySystemContactCGIStruct;
    }

    /* renamed from: b */
    public static final WeAppQualitySystemLaunchCGIStruct m103805b(QualitySession qualitySession) {
        C87412m.m108594g(qualitySession, "session");
        WeAppQualitySystemLaunchCGIStruct weAppQualitySystemLaunchCGIStruct = new WeAppQualitySystemLaunchCGIStruct();
        weAppQualitySystemLaunchCGIStruct.f237211e = weAppQualitySystemLaunchCGIStruct.mo86045b("AppId", qualitySession.f245833e, true);
        weAppQualitySystemLaunchCGIStruct.f237210d = weAppQualitySystemLaunchCGIStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
        int i = qualitySession.f245834f;
        weAppQualitySystemLaunchCGIStruct.f237213g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualitySystemLaunchCGIStruct.C80783a.demo : WeAppQualitySystemLaunchCGIStruct.C80783a.debug : WeAppQualitySystemLaunchCGIStruct.C80783a.release;
        weAppQualitySystemLaunchCGIStruct.f237214h = (long) qualitySession.f245835g;
        weAppQualitySystemLaunchCGIStruct.f237216j = (long) qualitySession.f245836h;
        weAppQualitySystemLaunchCGIStruct.f237212f = (long) qualitySession.f245837i;
        return weAppQualitySystemLaunchCGIStruct;
    }

    /* renamed from: c */
    public static final int m103806c() {
        String b = C84116i0.m103659b(MMApplicationContext.getContext());
        if (C87412m.m108589b(b, "unknown")) {
            return 0;
        }
        if (C87412m.m108589b(b, "wifi")) {
            return 1;
        }
        if (C87412m.m108589b(b, "2g")) {
            return 2;
        }
        if (C87412m.m108589b(b, "3g")) {
            return 3;
        }
        if (C87412m.m108589b(b, "4g")) {
            return 4;
        }
        return C87412m.m108589b(b, "offline") ? 5 : 10000;
    }

    /* renamed from: d */
    public static final void m103807d(AppBrandRuntimeWC appBrandRuntimeWC, boolean z, boolean z2) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        QualitySessionRuntime a = C84185b.m103768a(appBrandRuntimeWC);
        C87412m.m108591d(a);
        WeAppQualityOpenStruct weAppQualityOpenStruct = new WeAppQualityOpenStruct();
        weAppQualityOpenStruct.f236939e = weAppQualityOpenStruct.mo86045b("AppId", a.f245833e, true);
        weAppQualityOpenStruct.f236940f = (long) a.f245837i;
        int i = a.f245834f;
        String str = null;
        weAppQualityOpenStruct.f236941g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityOpenStruct.C80769a.demo : WeAppQualityOpenStruct.C80769a.debug : WeAppQualityOpenStruct.C80769a.release;
        weAppQualityOpenStruct.f236942h = (long) a.f245835g;
        weAppQualityOpenStruct.f236943i = (long) appBrandRuntimeWC.mo121253n1().f245533f;
        weAppQualityOpenStruct.f236959y = weAppQualityOpenStruct.mo86045b("SceneNote", appBrandRuntimeWC.mo121253n1().f245534g, true);
        if (1036 == appBrandRuntimeWC.mo121253n1().f245533f) {
            AppBrandLaunchReferrer appBrandLaunchReferrer = appBrandRuntimeWC.mo113210l1().f234846y;
            if (appBrandLaunchReferrer != null) {
                str = appBrandLaunchReferrer.f239397e;
            }
            weAppQualityOpenStruct.f236949o = weAppQualityOpenStruct.mo86045b("scene_data", str, true);
        }
        weAppQualityOpenStruct.f236945k = weAppQualityOpenStruct.mo86045b("networkType", C84116i0.m103659b(MMApplicationContext.getContext()), true);
        weAppQualityOpenStruct.f236947m = weAppQualityOpenStruct.mo86045b("UserName", appBrandRuntimeWC.mo113210l1().f234839s, true);
        weAppQualityOpenStruct.f236938d = weAppQualityOpenStruct.mo86045b("InstanceId", a.f245832d, true);
        weAppQualityOpenStruct.f236958x = weAppQualityOpenStruct.mo86045b("sessionId", appBrandRuntimeWC.mo113210l1().f234837q, true);
        long j = 0;
        weAppQualityOpenStruct.f236946l = z ? 0 : 1;
        long j2 = a.f245855p;
        weAppQualityOpenStruct.f236944j = j2;
        weAppQualityOpenStruct.mo86048e("StartTimeStampMs", j2);
        if (z2) {
            j = 1;
        }
        weAppQualityOpenStruct.f236948n = Long.valueOf(j).longValue();
        weAppQualityOpenStruct.f236950p = a.mo116872b();
        weAppQualityOpenStruct.f236951q = weAppQualityOpenStruct.mo86045b("path", C117627q.m165908a(appBrandRuntimeWC.mo113030T()), true);
        AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle = appBrandRuntimeWC.mo113210l1().f234833b1;
        if (appBrandRuntimeReloadReportBundle != null) {
            weAppQualityOpenStruct.f236952r = weAppQualityOpenStruct.mo86045b("reload_referrer", appBrandRuntimeReloadReportBundle.f243875d, true);
            weAppQualityOpenStruct.f236953s = weAppQualityOpenStruct.mo86045b("reload_reason", appBrandRuntimeReloadReportBundle.f243876e, true);
        }
        weAppQualityOpenStruct.f236954t = a.f245839n ? 1 : 0;
        weAppQualityOpenStruct.f236955u = (long) appBrandRuntimeWC.mo113210l1().f234813Q0;
        weAppQualityOpenStruct.f236956v = (long) appBrandRuntimeWC.mo113210l1().f234829Y0.f234929d;
        weAppQualityOpenStruct.f236960z = (long) C84116i0.m103658a(a.f245844E);
        Log.m105924i("MicroMsg.AppStartupPerformanceReportUtil", "qualityOpen report username[" + appBrandRuntimeWC.mo113210l1().f234839s + "] appId[" + appBrandRuntimeWC.f238147j + "], instanceId[" + weAppQualityOpenStruct.f236938d + "], sessionId[" + weAppQualityOpenStruct.f236958x + ']');
        weAppQualityOpenStruct.mo86054n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r10 = r10.mo111392g(r9, r7);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m103808e(com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.String r0 = "parcel"
            gy3.C87412m.m108594g(r8, r0)
            long r0 = r8.f243741r
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0011
            r8.mo115684d()
        L_0x0011:
            r0 = 1
            r4 = 0
            r5 = 0
            r6 = 1
            if (r10 == 0) goto L_0x0023
            sb.d r10 = p1031sb.C90157d.C90158a.f258859a
            long r2 = r8.f243741r
            com.tencent.mm.plugin.appbrand.report.f0 r10 = (com.tencent.p014mm.plugin.appbrand.report.C84112f0) r10
            java.lang.String r10 = r10.mo116785b(r2)
            goto L_0x0053
        L_0x0023:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r10 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r10 = r10.mo116962a()
            int r7 = r8.f243733g
            if (r9 != 0) goto L_0x002e
            goto L_0x0037
        L_0x002e:
            com.tencent.luggage.sdk.processes.l r10 = r10.mo111392g(r9, r7)
            if (r10 == 0) goto L_0x0037
            java.lang.String r10 = r10.f234971g
            goto L_0x0038
        L_0x0037:
            r10 = r4
        L_0x0038:
            if (r10 == 0) goto L_0x0043
            int r7 = r10.length()
            if (r7 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r7 = 0
            goto L_0x0044
        L_0x0043:
            r7 = 1
        L_0x0044:
            if (r7 != 0) goto L_0x0047
            goto L_0x0052
        L_0x0047:
            sb.d r10 = p1031sb.C90157d.C90158a.f258859a
            long r2 = r8.f243741r
            com.tencent.mm.plugin.appbrand.report.f0 r10 = (com.tencent.p014mm.plugin.appbrand.report.C84112f0) r10
            java.lang.String r10 = r10.mo116785b(r2)
            r2 = r0
        L_0x0052:
            r0 = r2
        L_0x0053:
            com.tencent.luggage.sdk.config.a r2 = com.tencent.luggage.sdk.config.C0926a.C0928b.f2135a
            com.tencent.mm.plugin.appbrand.report.f0 r2 = (com.tencent.p014mm.plugin.appbrand.report.C84112f0) r2
            java.lang.String r2 = r2.mo879a()
            r8.f243737n = r2
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct
            r3.<init>()
            java.lang.String r7 = "InstanceId"
            java.lang.String r7 = r3.mo86045b(r7, r10, r6)
            r3.f236938d = r7
            r3.f236946l = r0
            java.lang.String r0 = r8.f243731e
            java.lang.String r1 = "AppId"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236939e = r0
            int r0 = r8.f243732f
            long r0 = (long) r0
            r3.f236940f = r0
            int r0 = r8.f243733g
            int r0 = r0 + r6
            if (r0 == r6) goto L_0x008e
            r1 = 2
            if (r0 == r1) goto L_0x008b
            r1 = 3
            if (r0 == r1) goto L_0x0088
            r0 = r4
            goto L_0x0090
        L_0x0088:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityOpenStruct.C80769a.demo
            goto L_0x0090
        L_0x008b:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityOpenStruct.C80769a.debug
            goto L_0x0090
        L_0x008e:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityOpenStruct$a r0 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityOpenStruct.C80769a.release
        L_0x0090:
            r3.f236941g = r0
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r8.f243738o
            int r0 = r0.f245533f
            long r0 = (long) r0
            r3.f236943i = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r0)
            java.lang.String r1 = "networkType"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236945k = r0
            java.lang.String r0 = r8.f243730d
            java.lang.String r1 = "UserName"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236947m = r0
            java.lang.String r0 = r8.f243735i
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = ""
        L_0x00b9:
            java.lang.String r0 = p206nj.C117627q.m165908a(r0)
            java.lang.String r1 = "path"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236951q = r0
            com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle r0 = r8.f243718J
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle
            if (r1 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r0 = r4
        L_0x00ce:
            if (r0 == 0) goto L_0x00e6
            java.lang.String r1 = r0.f243875d
            java.lang.String r7 = "reload_referrer"
            java.lang.String r1 = r3.mo86045b(r7, r1, r6)
            r3.f236952r = r1
            java.lang.String r0 = r0.f243876e
            java.lang.String r1 = "reload_reason"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236953s = r0
        L_0x00e6:
            java.lang.String r0 = r8.f243730d
            if (r0 == 0) goto L_0x00f3
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r0 = 0
            goto L_0x00f4
        L_0x00f3:
            r0 = 1
        L_0x00f4:
            if (r0 != 0) goto L_0x010d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x010d
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.r> r0 = com.tencent.p014mm.plugin.appbrand.appusage.C29384r.class
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appusage.r r0 = (com.tencent.p014mm.plugin.appbrand.appusage.C29384r) r0
            java.lang.String r1 = r8.f243730d
            boolean r0 = r0.mo56651jo(r1)
            r0 = r0 ^ r6
            r3.f236954t = r0
        L_0x010d:
            int r0 = r8.f243711C
            long r0 = (long) r0
            r3.f236955u = r0
            com.tencent.luggage.sdk.launching.h r0 = r8.f243720L
            int r0 = r0.f234929d
            long r0 = (long) r0
            r3.f236956v = r0
            java.lang.String r0 = r8.f243722N
            java.lang.String r1 = "shortLink"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236957w = r0
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r8.f243738o
            if (r0 == 0) goto L_0x0130
            r1 = 1036(0x40c, float:1.452E-42)
            int r0 = r0.f245533f
            if (r1 != r0) goto L_0x0130
            r0 = 1
            goto L_0x0131
        L_0x0130:
            r0 = 0
        L_0x0131:
            if (r0 == 0) goto L_0x0144
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r0 = r8.f243739p
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = r0.f239397e
            goto L_0x013b
        L_0x013a:
            r0 = r4
        L_0x013b:
            java.lang.String r1 = "scene_data"
            java.lang.String r0 = r3.mo86045b(r1, r0, r6)
            r3.f236949o = r0
        L_0x0144:
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r8.f243738o
            if (r0 == 0) goto L_0x014a
            java.lang.String r4 = r0.f245534g
        L_0x014a:
            java.lang.String r0 = "SceneNote"
            java.lang.String r0 = r3.mo86045b(r0, r4, r6)
            r3.f236959y = r0
            long r0 = r8.f243741r
            r3.f236944j = r0
            java.lang.String r4 = "StartTimeStampMs"
            r3.mo86048e(r4, r0)
            java.lang.String r0 = "sessionId"
            java.lang.String r0 = r3.mo86045b(r0, r2, r6)
            r3.f236958x = r0
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            int r0 = zp0.C91828f.m115345a()
            int r0 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103658a(r0)
            long r0 = (long) r0
            r3.f236960z = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "qualityOpenBeforeLaunch username["
            r0.append(r1)
            java.lang.String r1 = r8.f243730d
            r0.append(r1)
            java.lang.String r1 = "] appId["
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = "] instanceId["
            r0.append(r9)
            java.lang.String r9 = r3.f236938d
            r0.append(r9)
            java.lang.String r9 = "] sessionId["
            r0.append(r9)
            java.lang.String r9 = r3.f236958x
            r0.append(r9)
            r9 = 93
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "MicroMsg.AppStartupPerformanceReportUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            r3.mo86054n()
            java.lang.Class<com.tencent.mm.plugin.appbrand.task.c> r9 = com.tencent.p014mm.plugin.appbrand.task.C29636c.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            com.tencent.mm.plugin.appbrand.task.c r9 = (com.tencent.p014mm.plugin.appbrand.task.C29636c) r9
            gy3.C87412m.m108591d(r9)
            if (r10 == 0) goto L_0x01c2
            int r0 = r10.length()
            if (r0 != 0) goto L_0x01c3
        L_0x01c2:
            r5 = 1
        L_0x01c3:
            if (r5 != 0) goto L_0x01f1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r9.hashCode()
            r0.append(r1)
            java.lang.String r1 = "]add(instanceId:"
            r0.append(r1)
            r0.append(r10)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrandLaunchParcelStoreService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel> r9 = r9.f80569d
            r9.put(r10, r8)
        L_0x01f1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84201i.m103808e(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: f */
    public static final void m103809f(LaunchParcel launchParcel, String str, String str2) {
        C87412m.m108594g(launchParcel, "parcel");
        C87412m.m108594g(str, "instanceId");
        if (launchParcel.f243738o.f245540p != null) {
            WeAppQualityCGISpeedStruct weAppQualityCGISpeedStruct = new WeAppQualityCGISpeedStruct();
            weAppQualityCGISpeedStruct.f236761d = weAppQualityCGISpeedStruct.mo86045b("instanceId", str, true);
            weAppQualityCGISpeedStruct.f236771n = launchParcel.f243738o.f245540p.getInt("CgiSpeedOutSideStructCgiNo");
            weAppQualityCGISpeedStruct.f236767j = weAppQualityCGISpeedStruct.mo86045b("networkType", launchParcel.f243738o.f245540p.getString("CgiSpeedOutSideStructNetworkType"), true);
            weAppQualityCGISpeedStruct.f236763f = weAppQualityCGISpeedStruct.mo86045b("username", launchParcel.f243730d, true);
            weAppQualityCGISpeedStruct.f236762e = weAppQualityCGISpeedStruct.mo86045b("appid", str2, true);
            weAppQualityCGISpeedStruct.f236770m = launchParcel.f243738o.f245540p.getInt("CgiSpeedOutSideStructBizRet");
            weAppQualityCGISpeedStruct.f236766i = launchParcel.f243738o.f245540p.getLong("CgiSpeedOutSideStructCostTime");
            weAppQualityCGISpeedStruct.f236765h = launchParcel.f243738o.f245540p.getLong("CgiSpeedOutSideStructEndTimeStamp");
            weAppQualityCGISpeedStruct.f236768k = launchParcel.f243738o.f245540p.getLong("CgiSpeedOutSideStructResponseSize");
            weAppQualityCGISpeedStruct.f236769l = launchParcel.f243738o.f245540p.getInt("CgiSpeedOutSideStructRet");
            weAppQualityCGISpeedStruct.f236764g = launchParcel.f243738o.f245540p.getLong("CgiSpeedOutSideStructStartTimeStamp");
            weAppQualityCGISpeedStruct.mo86054n();
        }
    }
}
