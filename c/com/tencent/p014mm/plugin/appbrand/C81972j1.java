package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import fy3.C32224a;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.j1 */
public class C81972j1 implements C32224a<C86812g> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfig f240374d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeContainerWC f240375e;

    public C81972j1(AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, AppBrandInitConfig appBrandInitConfig) {
        this.f240375e = appBrandRuntimeContainerWC;
        this.f240374d = appBrandInitConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
        if (u24.C90595a.m113497a(r6, ((com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r10.f240374d).f234834c1.f245533f) != false) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            java.util.Set<com.tencent.mm.plugin.appbrand.f2> r0 = com.tencent.p014mm.plugin.appbrand.C81831f2.C81832a.f240098a
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0107 }
            r1.<init>(r0)     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            java.util.Iterator r0 = r1.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.f2 r1 = (com.tencent.p014mm.plugin.appbrand.C81831f2) r1
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r2 = r10.f240374d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r2
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r3 = r10.f240375e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.mo114226a(r2, r3)
            if (r1 == 0) goto L_0x000d
            goto L_0x0106
        L_0x0027:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r10.f240374d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r1 = r10.f240375e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = com.tencent.p014mm.plugin.appbrand.C84803v.m104483a(r0, r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0106
        L_0x0035:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r10.f240374d
            java.lang.String r0 = r0.f239362d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r0)
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r1.f238116N
            if (r0 == 0) goto L_0x00ff
            com.tencent.mm.plugin.appbrand.e3 r0 = r1.f238142e
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC
            if (r0 == 0) goto L_0x00ff
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r10.f240374d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            boolean r0 = r0.mo76931c()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0062
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r10.f240374d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r0
            boolean r0 = r0.f234817S0
            if (r0 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r0 = 0
            goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            com.tencent.mm.plugin.appbrand.e3 r4 = r1.f238142e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r4 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC) r4
            boolean r4 = r4.mo109912s5()
            r4 = r4 ^ r2
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r5 = r10.f240374d
            boolean r5 = com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2.m104182f(r5)
            if (r0 != 0) goto L_0x0078
            if (r4 != 0) goto L_0x0078
            if (r5 == 0) goto L_0x00ff
        L_0x0078:
            java.lang.String r6 = "MicroMsg.AppBrandRuntimeContainerWC"
            java.lang.String r7 = "createRuntime hit halfScreenCondition(%b), pluginUICondition(%b), multiTaskCondition(%b) runtime(%s) will be detached"
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9[r3] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r9[r2] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4 = 2
            r9[r4] = r0
            java.lang.String r0 = r1.f238147j
            r5 = 3
            r9[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)
            com.tencent.mm.plugin.appbrand.e3 r0 = r1.f238142e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC) r0
            java.util.Objects.requireNonNull(r0)
            com.tencent.mm.plugin.appbrand.widget.e r6 = r1.f238153r
            com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104352c(r6)
            r0.mo113131h0(r1)
            r6 = 5
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x00eb }
            r7 = 1195(0x4ab, float:1.675E-42)
            r6[r3] = r7     // Catch:{ Exception -> 0x00eb }
            r7 = 1177(0x499, float:1.65E-42)
            r6[r2] = r7     // Catch:{ Exception -> 0x00eb }
            r7 = 1065(0x429, float:1.492E-42)
            r6[r4] = r7     // Catch:{ Exception -> 0x00eb }
            r4 = 1069(0x42d, float:1.498E-42)
            r6[r5] = r4     // Catch:{ Exception -> 0x00eb }
            r4 = 1113(0x459, float:1.56E-42)
            r6[r8] = r4     // Catch:{ Exception -> 0x00eb }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r4 = r10.f240375e     // Catch:{ Exception -> 0x00eb }
            android.app.Activity r4 = r4.mo120548w()     // Catch:{ Exception -> 0x00eb }
            int r4 = r4.getTaskId()     // Catch:{ Exception -> 0x00eb }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r5 = r10.f240375e     // Catch:{ Exception -> 0x00eb }
            android.app.Activity r5 = r5.mo120548w()     // Catch:{ Exception -> 0x00eb }
            android.content.Intent r5 = r5.getIntent()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r7 = "key_appbrand_source_android_task_id"
            int r5 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r5, r7, r3)     // Catch:{ Exception -> 0x00eb }
            if (r4 != r5) goto L_0x00ec
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r4 = r10.f240374d     // Catch:{ Exception -> 0x00eb }
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r4     // Catch:{ Exception -> 0x00eb }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r4 = r4.f234834c1     // Catch:{ Exception -> 0x00eb }
            int r4 = r4.f245533f     // Catch:{ Exception -> 0x00eb }
            boolean r4 = u24.C90595a.m113497a(r6, r4)     // Catch:{ Exception -> 0x00eb }
            if (r4 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00eb:
        L_0x00ec:
            r2 = 0
        L_0x00ed:
            if (r2 != 0) goto L_0x00f2
            r0.mo113152n0()
        L_0x00f2:
            r1.mo113196a2(r3)
            r0 = 0
            r1.mo113033U0(r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = r10.f240375e
            r1.mo113033U0(r0)
            goto L_0x0106
        L_0x00ff:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = r10.f240375e
            r1.<init>((com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC) r0)
        L_0x0106:
            return r1
        L_0x0107:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81972j1.invoke():java.lang.Object");
    }
}
