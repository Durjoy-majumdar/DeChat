package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import gy3.C87412m;
import kr0.C88267e;
import xm0.C91290b;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.h */
public final class C83328h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f243503d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandPluginUpdateStatusChangeIPCMessage f243504e;

    public C83328h(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandPluginUpdateStatusChangeIPCMessage appBrandPluginUpdateStatusChangeIPCMessage) {
        this.f243503d = appBrandRuntimeWC;
        this.f243504e = appBrandPluginUpdateStatusChangeIPCMessage;
    }

    public final void run() {
        C88267e eVar = (C88267e) this.f243503d.f238150p;
        AppBrandPluginUpdateStatusChangeIPCMessage appBrandPluginUpdateStatusChangeIPCMessage = this.f243504e;
        C91291c cVar = appBrandPluginUpdateStatusChangeIPCMessage.f243135g;
        String str = appBrandPluginUpdateStatusChangeIPCMessage.f243136h;
        int i = appBrandPluginUpdateStatusChangeIPCMessage.f243137i;
        String str2 = appBrandPluginUpdateStatusChangeIPCMessage.f243138j;
        C87412m.m108594g(cVar, "state");
        C87412m.m108594g(str, "pluginAppId");
        if (eVar != null) {
            C91290b bVar = new C91290b();
            bVar.mo115164n("pluginAppid", str);
            bVar.mo115164n("state", cVar.f261893d);
            bVar.mo115164n("appVersion", Integer.valueOf(i));
            bVar.mo115164n("customVersion", str2);
            bVar.mo115194p(eVar);
            bVar.mo115158h();
        }
    }
}
