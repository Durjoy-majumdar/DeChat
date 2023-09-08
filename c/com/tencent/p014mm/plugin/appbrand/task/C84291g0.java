package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService1;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService3;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService4;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0;
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
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.task.g0 */
public final class C84291g0 extends AppBrandProcessesManager {

    /* renamed from: j */
    public static final Map<String, C84288f0> f246166j = C90364q0.m113147f(new C13604l(":appbrand0", new C84288f0(AppBrandUI.class, AppBrandPluginUI.class, AppBrandKeepAliveService.class, AppBrandForegroundNotificationService.class, AppBrandProcessTriggerService0.class, AppBrandPreLoadingUI.class)), new C13604l(":appbrand1", new C84288f0(AppBrandUI1.class, AppBrandPluginUI1.class, AppBrandKeepAliveService1.class, AppBrandForegroundNotificationService1.class, AppBrandProcessTriggerService1.class, AppBrandPreLoadingUI1.class)), new C13604l(":appbrand2", new C84288f0(AppBrandUI2.class, AppBrandPluginUI2.class, AppBrandKeepAliveService2.class, AppBrandForegroundNotificationService2.class, AppBrandProcessTriggerService2.class, AppBrandPreLoadingUI2.class)), new C13604l(":appbrand3", new C84288f0(AppBrandUI3.class, AppBrandPluginUI3.class, AppBrandKeepAliveService3.class, AppBrandForegroundNotificationService3.class, AppBrandProcessTriggerService3.class, AppBrandPreLoadingUI3.class)), new C13604l(":appbrand4", new C84288f0(AppBrandUI4.class, AppBrandPluginUI4.class, AppBrandKeepAliveService4.class, AppBrandForegroundNotificationService4.class, AppBrandProcessTriggerService4.class, AppBrandPreLoadingUI4.class)));

    public C84291g0() {
        Log.m105924i("MicroMsg.AppBrandWAServiceV8LiteProcessManager", "<init>");
    }

    /* renamed from: o */
    public C80250c[] mo111400o() {
        String[] strArr = C29553m0.f80472d;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C84288f0 f0Var = f246166j.get(str);
            C87412m.m108591d(f0Var);
            arrayList.add(f0Var);
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C84288f0 f0Var2 = (C84288f0) it.next();
            arrayList2.add(new C84312l(f0Var2.f246158a, f0Var2.f246159b, f0Var2.f246160c, f0Var2.f246161d, f0Var2.f246162e, f0Var2.f246163f));
        }
        String[] strArr2 = C29553m0.f80473e;
        ArrayList arrayList3 = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            C84288f0 f0Var3 = f246166j.get(str2);
            C87412m.m108591d(f0Var3);
            arrayList3.add(f0Var3);
        }
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C84288f0 f0Var4 = (C84288f0) it4.next();
            arrayList4.add(new C84313m(f0Var4.f246158a, f0Var4.f246159b, f0Var4.f246160c, f0Var4.f246161d, f0Var4.f246162e, f0Var4.f246163f));
        }
        ArrayList arrayList5 = new ArrayList(arrayList2);
        arrayList5.addAll(arrayList4);
        Object[] array = arrayList5.toArray(new C84310k[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (C84310k[]) array;
    }
}
