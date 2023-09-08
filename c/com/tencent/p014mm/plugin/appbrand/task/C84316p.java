package com.tencent.p014mm.plugin.appbrand.task;

/* renamed from: com.tencent.mm.plugin.appbrand.task.p */
public class C84316p extends AppBrandProcessesManager {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x008c  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.task.C84310k[] mo111400o() {
        /*
            r16 = this;
            r0 = 5
            com.tencent.mm.plugin.appbrand.task.k[] r0 = new com.tencent.p014mm.plugin.appbrand.task.C84310k[r0]
            com.tencent.mm.plugin.appbrand.task.k r8 = new com.tencent.mm.plugin.appbrand.task.k
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandUI> r2 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI> r3 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService> r4 = com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService> r5 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0> r6 = com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService0.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI> r7 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI.class
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = 0
            r0[r1] = r8
            com.tencent.mm.plugin.appbrand.task.k r2 = new com.tencent.mm.plugin.appbrand.task.k
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandUI1> r10 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI1.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI1> r11 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI1.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1> r12 = com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1> r13 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService1> r14 = com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService1.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI1> r15 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI1.class
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3 = 1
            r0[r3] = r2
            com.tencent.mm.plugin.appbrand.task.k r2 = new com.tencent.mm.plugin.appbrand.task.k
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandUI2> r5 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI2.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI2> r6 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI2.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2> r7 = com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2> r8 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService2> r9 = com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService2.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI2> r10 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI2.class
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = 2
            r0[r3] = r2
            com.tencent.mm.plugin.appbrand.task.k r2 = new com.tencent.mm.plugin.appbrand.task.k
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandUI3> r5 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI3.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI3> r6 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI3.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3> r7 = com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3> r8 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService3> r9 = com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService3.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI3> r10 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI3.class
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = 3
            r0[r3] = r2
            com.tencent.mm.plugin.appbrand.task.k r2 = new com.tencent.mm.plugin.appbrand.task.k
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandUI4> r5 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI4.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI4> r6 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI4.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4> r7 = com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4> r8 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService4> r9 = com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService4.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI4> r10 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI4.class
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = 4
            r0[r3] = r2
            java.util.ArrayList r0 = sx3.C64197v.m75534c(r0)
            boolean r2 = com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2.m104152a()
            if (r2 == 0) goto L_0x0082
            int r2 = r0.size()
            com.tencent.mm.plugin.appbrand.task.n r3 = new com.tencent.mm.plugin.appbrand.task.n
            r3.<init>()
            r0.add(r2, r3)
        L_0x0082:
            java.util.Iterator r2 = r0.iterator()
        L_0x0086:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.appbrand.task.k r3 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r3
            com.tencent.luggage.sdk.processes.LuggageServiceType r4 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
            boolean r4 = r3.mo111374t(r4)
            if (r4 == 0) goto L_0x00a3
            com.tencent.luggage.sdk.processes.LuggageServiceType r4 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
            boolean r4 = r3.mo111374t(r4)
            if (r4 == 0) goto L_0x00a3
            goto L_0x0086
        L_0x00a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect declaration("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ") for AppBrandNormalProcessManager"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            com.tencent.mm.plugin.appbrand.task.k[] r1 = new com.tencent.p014mm.plugin.appbrand.task.C84310k[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.plugin.appbrand.task.k[] r0 = (com.tencent.p014mm.plugin.appbrand.task.C84310k[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.C84316p.mo111400o():com.tencent.mm.plugin.appbrand.task.k[]");
    }
}
