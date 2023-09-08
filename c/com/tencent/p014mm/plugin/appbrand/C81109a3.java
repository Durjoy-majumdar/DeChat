package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.a3 */
public final class C81109a3 implements C81691d3 {

    /* renamed from: a */
    public AppBrandInitConfigWC f238379a;

    /* renamed from: b */
    public int f238380b;

    public C81109a3(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "initialConfig");
        this.f238379a = appBrandInitConfigWC;
        this.f238380b = appBrandInitConfigWC.f234834c1.f245533f;
    }

    /* renamed from: a */
    public void mo113277a(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "newConfig");
        this.f238379a = appBrandInitConfigWC;
        int i = appBrandInitConfigWC.f234834c1.f245533f;
        if (1038 != i) {
            this.f238380b = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[SYNTHETIC, Splitter:B:25:0x007b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo113278b(com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newConfig"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r6.f238379a
            boolean r0 = r0.f239373d1
            if (r0 != 0) goto L_0x000d
            r7 = 0
            return r7
        L_0x000d:
            r0 = 1038(0x40e, float:1.455E-42)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = r7.f234834c1     // Catch:{ all -> 0x00ca }
            int r1 = r1.f245533f     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = "MicroMsg.AppBrandRuntimeWC.FakeNativeRuntimeAutoReLaunchLogic"
            if (r0 != r1) goto L_0x003b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r0.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "shouldRelaunch return false. appId["
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r6.f238379a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r1.f239362d     // Catch:{ all -> 0x00ca }
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "], reason=1038 back from other MiniProgram"
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ca }
            r6.mo113277a(r7)
            return r0
        L_0x003b:
            java.lang.String r0 = r7.f239367i     // Catch:{ all -> 0x00ca }
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            int r0 = r0.length()     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r0 = 0
            goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            r4 = 93
            if (r0 != 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r0.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "shouldRelaunch return true appId["
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r6.f238379a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r1.f239362d     // Catch:{ all -> 0x00ca }
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "] enterPath["
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r7.f239367i     // Catch:{ all -> 0x00ca }
            r0.append(r1)     // Catch:{ all -> 0x00ca }
            r0.append(r4)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ca }
            r6.mo113277a(r7)
            return r0
        L_0x007b:
            int r0 = r6.f238380b     // Catch:{ all -> 0x00ca }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r5 = r7.f234834c1     // Catch:{ all -> 0x00ca }
            int r5 = r5.f245533f     // Catch:{ all -> 0x00ca }
            if (r0 == r5) goto L_0x0084
            r1 = 1
        L_0x0084:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00ca }
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r3.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r5 = "shouldRelaunch return "
            r3.append(r5)     // Catch:{ all -> 0x00ca }
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = " appId["
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r6.f238379a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r1.f239362d     // Catch:{ all -> 0x00ca }
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "] mLastAcceptableScene["
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            int r1 = r6.f238380b     // Catch:{ all -> 0x00ca }
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "] newScene["
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = r7.f234834c1     // Catch:{ all -> 0x00ca }
            int r1 = r1.f245533f     // Catch:{ all -> 0x00ca }
            r3.append(r1)     // Catch:{ all -> 0x00ca }
            r3.append(r4)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)     // Catch:{ all -> 0x00ca }
            r6.mo113277a(r7)
            return r0
        L_0x00ca:
            r0 = move-exception
            r6.mo113277a(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81109a3.mo113278b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):java.lang.Boolean");
    }
}
