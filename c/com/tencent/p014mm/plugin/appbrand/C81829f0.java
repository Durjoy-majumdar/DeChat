package com.tencent.p014mm.plugin.appbrand;

import hp3.C87581a;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.f0 */
public class C81829f0 implements C87581a<C88267e, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f240096a;

    public C81829f0(C81688d0 d0Var) {
        this.f240096a = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r5 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r1.f240096a.mo114031f("get process preloaded service, provided by AppBrandProcessPreloader", new java.lang.Object[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            com.tencent.mm.plugin.appbrand.d0 r2 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r2.f239736b
            boolean r2 = r2.mo121254q1()
            com.tencent.mm.plugin.appbrand.task.y r2 = com.tencent.p014mm.plugin.appbrand.task.C84343y.m103969a(r2)
            com.tencent.mm.plugin.appbrand.d0 r3 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r3.f239736b
            java.lang.String r3 = r3.f238147j
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r4.f239736b
            ai0.q r5 = r5.f238294v1
            r6 = 0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x002e
            kr0.e r5 = r5.f233332c
            if (r5 == 0) goto L_0x002f
            java.lang.String r9 = "get process preloaded service, provided by SplashAdLogic"
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r4.mo114031f(r9, r10)
            goto L_0x0064
        L_0x002e:
            r5 = r6
        L_0x002f:
            java.lang.Class<com.tencent.mm.plugin.appbrand.task.q> r4 = com.tencent.p014mm.plugin.appbrand.task.C84331q.class
            monitor-enter(r4)
            kr0.e r9 = com.tencent.p014mm.plugin.appbrand.task.C84331q.m103953h(r2)     // Catch:{ all -> 0x01aa }
            if (r9 == 0) goto L_0x0058
            com.tencent.mm.plugin.appbrand.d0 r5 = r1.f240096a     // Catch:{ all -> 0x01aa }
            boolean r5 = r5.f239738d     // Catch:{ all -> 0x01aa }
            if (r5 == 0) goto L_0x0054
            com.tencent.mm.plugin.appbrand.d0 r2 = r1.f240096a     // Catch:{ all -> 0x01aa }
            java.lang.String r3 = "preloadAppService, process preloaded, hasWait[%b], but EXPIRED"
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x01aa }
            r5[r7] = r0     // Catch:{ all -> 0x01aa }
            r2.mo114030e(r3, r5)     // Catch:{ all -> 0x01aa }
            lp3.b r0 = lp3.C88643g.m110544b()     // Catch:{ all -> 0x01aa }
            r0.mo72091a(r6)     // Catch:{ all -> 0x01aa }
            monitor-exit(r4)     // Catch:{ all -> 0x01aa }
            goto L_0x01a9
        L_0x0054:
            kr0.e r5 = com.tencent.p014mm.plugin.appbrand.task.C84331q.m103952g(r2)     // Catch:{ all -> 0x01aa }
        L_0x0058:
            monitor-exit(r4)     // Catch:{ all -> 0x01aa }
            if (r5 == 0) goto L_0x0064
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            java.lang.String r9 = "get process preloaded service, provided by AppBrandProcessPreloader"
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r4.mo114031f(r9, r10)
        L_0x0064:
            if (r5 == 0) goto L_0x0184
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r4.f239736b
            r4.mo113201f2(r5)
            boolean r4 = r0.booleanValue()
            if (r4 != 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r4.f239736b
            java.lang.String r4 = r4.f238147j
            uo0.a r9 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForAppServicePreloadDone
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r4, r9)
        L_0x007e:
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r4.f239736b
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r4 = r4.mo113184O1(r7)
            if (r4 != 0) goto L_0x00a6
            lp3.b r0 = lp3.C88643g.m110544b()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Runtime.getLibReader() == NULL"
            r2.<init>(r3)
            r0.mo72091a(r2)
            r5.mo114329F()     // Catch:{ all -> 0x0099 }
        L_0x0099:
            com.tencent.mm.plugin.appbrand.d0 r0 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.f239736b
            java.lang.String r0 = r0.f238147j
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForAppServicePreloadDone
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102125b(r0, r2)
            goto L_0x01a9
        L_0x00a6:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r4 = r5.mo114272k()
            com.tencent.mm.plugin.appbrand.d0 r9 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = r9.f239736b
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r9 = r9.mo113184O1(r7)
            int r4 = r4.compareTo(r9)
            if (r4 != 0) goto L_0x00ba
            r4 = 1
            goto L_0x00bb
        L_0x00ba:
            r4 = 0
        L_0x00bb:
            com.tencent.mm.plugin.appbrand.d0 r9 = r1.f240096a
            java.lang.String r10 = "preloadAppService, process preloaded, hasWait[%b] commLibMatched[%b]"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r7] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r12[r8] = r0
            r9.mo114031f(r10, r12)
            if (r4 == 0) goto L_0x0184
            java.util.concurrent.ConcurrentHashMap<com.tencent.mm.plugin.appbrand.task.y, com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler> r0 = com.tencent.p014mm.plugin.appbrand.task.C84331q.f246225e
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler r0 = (com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler) r0
            if (r0 == 0) goto L_0x0153
            com.tencent.mm.plugin.appbrand.report.quality.e r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct
            r2.<init>()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r4 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r3, r8)
            if (r4 != 0) goto L_0x00e9
            goto L_0x0153
        L_0x00e9:
            java.lang.String r9 = r4.f245833e
            java.lang.String r10 = "AppId"
            java.lang.String r9 = r2.mo86045b(r10, r9, r8)
            r2.f237242e = r9
            java.lang.String r9 = r4.f245832d
            java.lang.String r10 = "InstanceId"
            java.lang.String r9 = r2.mo86045b(r10, r9, r8)
            r2.f237241d = r9
            int r9 = r4.f245834f
            if (r9 == r8) goto L_0x010d
            if (r9 == r11) goto L_0x010a
            r10 = 3
            if (r9 == r10) goto L_0x0107
            goto L_0x010f
        L_0x0107:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct$a r6 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct.C80786a.demo
            goto L_0x010f
        L_0x010a:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct$a r6 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct.C80786a.debug
            goto L_0x010f
        L_0x010d:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct$a r6 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct.C80786a.release
        L_0x010f:
            r2.f237244g = r6
            int r6 = r4.f245835g
            long r9 = (long) r6
            r2.f237245h = r9
            int r4 = r4.f245837i
            long r9 = (long) r4
            r2.f237243f = r9
            long r9 = r0.f246129j
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x012f
            long r11 = r0.f246123d
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            long r9 = r9 - r11
            goto L_0x0131
        L_0x012f:
            r9 = 0
        L_0x0131:
            r2.f237246i = r9
            java.lang.String r4 = "CostTimeMs"
            r2.mo86046c(r4, r9)
            long r9 = r0.f246130n
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0147
            long r11 = r0.f246129j
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            long r11 = r11 - r9
            goto L_0x0149
        L_0x0147:
            r11 = 0
        L_0x0149:
            r2.f237247j = r11
            java.lang.String r0 = "WaitingTimeMs"
            r2.mo86046c(r0, r11)
            r2.mo86054n()
        L_0x0153:
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r0 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r3, r8)     // Catch:{ Exception -> 0x015c }
            com.tencent.mm.plugin.appbrand.report.quality.q r2 = com.tencent.p014mm.plugin.appbrand.report.quality.C84217q.PreloadOnProcessCreated     // Catch:{ Exception -> 0x015c }
            r0.f245842C = r2     // Catch:{ Exception -> 0x015c }
            goto L_0x0166
        L_0x015c:
            com.tencent.mm.plugin.appbrand.d0 r0 = r1.f240096a
            java.lang.String r2 = "preloadAppService, wait process preload done but get NULL session"
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r0.mo114030e(r2, r3)
        L_0x0166:
            com.tencent.mm.plugin.appbrand.d0 r0 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.f239736b
            java.lang.String r0 = r0.f238147j
            uo0.a r2 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForAppServicePreloadDone
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r0, r2)
            com.tencent.mm.plugin.appbrand.jsruntime.i r0 = r5.getJsRuntime()
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.v> r2 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83186v.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r0 = r0.mo63321n0(r2)
            com.tencent.mm.plugin.appbrand.jsruntime.v r0 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83186v) r0
            if (r0 == 0) goto L_0x0182
            r0.resume()
        L_0x0182:
            r6 = r5
            goto L_0x01a9
        L_0x0184:
            com.tencent.mm.plugin.appbrand.d0 r0 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r0.f239736b
            java.lang.String r0 = r0.f238147j
            uo0.a r4 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForAppServiceAheadPreloadDone
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102130g(r0, r4)
            lp3.b r0 = lp3.C88643g.m110545c()
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            java.lang.String r5 = "preloadAppService ahead preload START"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r4.mo114031f(r5, r7)
            com.tencent.mm.plugin.appbrand.d0 r4 = r1.f240096a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r4.f239736b
            com.tencent.mm.plugin.appbrand.e0 r5 = new com.tencent.mm.plugin.appbrand.e0
            r5.<init>(r15, r0, r2, r3)
            r4.mo113022O0(r5)
        L_0x01a9:
            return r6
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81829f0.call(java.lang.Object):java.lang.Object");
    }
}
