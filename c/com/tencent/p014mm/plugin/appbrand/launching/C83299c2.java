package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPluginPkgInfo;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.c2 */
public final class C83299c2 implements C83368m1.C83373c {

    /* renamed from: a */
    public final /* synthetic */ String f243436a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f243437b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference<String> f243438c;

    public C83299c2(String str, AtomicInteger atomicInteger, AtomicReference<String> atomicReference) {
        this.f243436a = str;
        this.f243437b = atomicInteger;
        this.f243438c = atomicReference;
    }

    /* renamed from: a */
    public void mo115597a(C83368m1.C83374d dVar, int i, String str) {
        C87412m.m108594g(dVar, "request");
        AppBrandPluginUpdateStatusChangeIPCMessage.C83247a aVar = AppBrandPluginUpdateStatusChangeIPCMessage.f243132n;
        String str2 = this.f243436a;
        C87412m.m108593f(str2, "instanceId");
        aVar.mo115490a(str2, C91291c.UPDATING, dVar.f243616d, i, str);
        this.f243437b.set(i);
        this.f243438c.set(str);
    }

    /* renamed from: d */
    public void mo115598d(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(eVar, "response");
        IPkgInfo iPkgInfo = eVar.f243626a;
        C87412m.m108592e(iPkgInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo");
        WxaPluginPkgInfo wxaPluginPkgInfo = (WxaPluginPkgInfo) iPkgInfo;
        AppBrandPluginUpdateStatusChangeIPCMessage.C83247a aVar = AppBrandPluginUpdateStatusChangeIPCMessage.f243132n;
        String str = this.f243436a;
        C87412m.m108593f(str, "instanceId");
        aVar.mo115490a(str, C91291c.NO_UPDATE, dVar.f243616d, wxaPluginPkgInfo.version, wxaPluginPkgInfo.stringVersion);
    }

    /* renamed from: e */
    public void mo115599e(C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(eVar, "response");
        IPkgInfo iPkgInfo = eVar.f243626a;
        C87412m.m108592e(iPkgInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo");
        WxaPluginPkgInfo wxaPluginPkgInfo = (WxaPluginPkgInfo) iPkgInfo;
        AppBrandPluginUpdateStatusChangeIPCMessage.C83247a aVar = AppBrandPluginUpdateStatusChangeIPCMessage.f243132n;
        String str = this.f243436a;
        C87412m.m108593f(str, "instanceId");
        aVar.mo115490a(str, C91291c.UPDATE_READY, dVar.f243616d, wxaPluginPkgInfo.version, wxaPluginPkgInfo.stringVersion);
    }
}
