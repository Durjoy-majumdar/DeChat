package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.h2 */
public final class C1735h2 extends C87413o implements C32224a<AppBrandRuntime> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C82381f> f11446d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1735h2(C32224a<? extends C82381f> aVar) {
        super(0);
        this.f11446d = aVar;
    }

    public Object invoke() {
        C82381f invoke = this.f11446d.invoke();
        if (invoke == null) {
            Log.m105920e("MicroMsg.AppBrand.WxaAudioFocusComponent", "runtimeProvider, hostComponent is null");
            return null;
        }
        C83780d1 l0 = invoke instanceof C83780d1 ? (C83780d1) invoke : invoke instanceof C81925i2 ? ((C81925i2) invoke).mo114341l0() : null;
        if (l0 != null) {
            return l0.getRuntime();
        }
        Log.m105920e("MicroMsg.AppBrand.WxaAudioFocusComponent", "runtimeProvider, pageView is null");
        return null;
    }
}
