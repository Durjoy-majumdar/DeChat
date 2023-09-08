package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4;
import com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService;
import com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService1;
import com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService2;
import com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService3;
import com.tencent.p014mm.plugin.appbrand.keepalive.AppBrandKeepAliveService4;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService0;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService1;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService2;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService3;
import com.tencent.p014mm.plugin.appbrand.loading.AppBrandProcessTriggerService4;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI4;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI4;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI00;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI01;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI02;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI03;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI04;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.task.a0 */
public class C84273a0 extends AppBrandProcessesManager {

    /* renamed from: j */
    public static final String f246143j = (MMApplicationContext.getApplicationId() + ":appbrand0");

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.task.C84310k mo116948L(com.tencent.luggage.sdk.processes.LuggageServiceType r7) {
        /*
            r6 = this;
            com.tencent.luggage.sdk.processes.LuggageServiceType r0 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
            java.lang.String r1 = "serviceType"
            gy3.C87412m.m108594g(r7, r1)
            int r1 = r7.ordinal()
            if (r1 == 0) goto L_0x0096
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r6.mo116952Q(r0)
            if (r1 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "tryPreloadNextTaskProcess serviceType = ["
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = "] reachedMaxLimit"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MicroMsg.AppBrandSingleProcessManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            return r2
        L_0x0036:
            java.util.List r7 = r6.mo111395j()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0043:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.tencent.mm.plugin.appbrand.task.k r4 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r4
            boolean r5 = r4.mo111374t(r0)
            if (r5 == 0) goto L_0x0064
            java.lang.String r5 = f246143j
            java.lang.String r4 = r4.mo111363h()
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 != 0) goto L_0x0064
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r4 == 0) goto L_0x0043
            r1.add(r2)
            goto L_0x0043
        L_0x006b:
            java.util.Iterator r7 = r1.iterator()
        L_0x006f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r7.next()
            com.tencent.mm.plugin.appbrand.task.k r0 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r0
            boolean r2 = r0.mo111366k()
            if (r2 == 0) goto L_0x0088
            boolean r2 = r0.mo111367l()
            if (r2 == 0) goto L_0x0088
            return r0
        L_0x0088:
            boolean r2 = r0.mo111366k()
            if (r2 == 0) goto L_0x006f
            return r0
        L_0x008f:
            java.lang.Object r7 = sx3.C110818d0.m150914L(r1)
            com.tencent.mm.plugin.appbrand.task.k r7 = (com.tencent.p014mm.plugin.appbrand.task.C84310k) r7
            return r7
        L_0x0096:
            com.tencent.mm.plugin.appbrand.task.k r7 = super.mo116948L(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.task.C84273a0.mo116948L(com.tencent.luggage.sdk.processes.LuggageServiceType):com.tencent.mm.plugin.appbrand.task.k");
    }

    /* renamed from: T */
    public final void mo116967T(ArrayList<C84310k> arrayList) {
        ArrayList<C84310k> arrayList2 = arrayList;
        C87412m.m108594g(arrayList2, "<this>");
        C84313m[] mVarArr = {new C84313m(AppBrandUI1.class, AppBrandPluginUI1.class, AppBrandKeepAliveService1.class, AppBrandForegroundNotificationService1.class, AppBrandProcessTriggerService1.class, AppBrandPreLoadingUI1.class), new C84313m(AppBrandUI2.class, AppBrandPluginUI2.class, AppBrandKeepAliveService2.class, AppBrandForegroundNotificationService2.class, AppBrandProcessTriggerService2.class, AppBrandPreLoadingUI2.class), new C84313m(AppBrandUI3.class, AppBrandPluginUI3.class, AppBrandKeepAliveService3.class, AppBrandForegroundNotificationService3.class, AppBrandProcessTriggerService3.class, AppBrandPreLoadingUI3.class), new C84313m(AppBrandUI4.class, AppBrandPluginUI4.class, AppBrandKeepAliveService4.class, AppBrandForegroundNotificationService4.class, AppBrandProcessTriggerService4.class, AppBrandPreLoadingUI4.class), new C84313m(AppBrandUI.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class)};
        int b = C84343y.m103970b();
        if (b >= 1) {
            arrayList2.add(mVarArr[0]);
        }
        if (b >= 2) {
            arrayList2.add(mVarArr[1]);
        }
        if (b >= 3) {
            arrayList2.add(mVarArr[2]);
        }
        if (b >= 4) {
            arrayList2.add(mVarArr[3]);
        }
        if (b >= 5) {
            arrayList2.add(mVarArr[4]);
        }
    }

    /* renamed from: U */
    public C84310k[] mo111400o() {
        ArrayList<C84310k> c = C64197v.m75534c(new C84310k(AppBrandUI00.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class), new C84310k(AppBrandUI01.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class), new C84310k(AppBrandUI02.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class), new C84310k(AppBrandUI03.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class), new C84310k(AppBrandUI04.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class));
        for (C84310k s : c) {
            s.mo111373s(LuggageServiceType.WASERVICE);
        }
        mo116967T(c);
        if (C84566n2.m104152a()) {
            c.add(c.size(), new C84314n());
        }
        Object[] array = c.toArray(new C84310k[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (C84310k[]) array;
    }
}
