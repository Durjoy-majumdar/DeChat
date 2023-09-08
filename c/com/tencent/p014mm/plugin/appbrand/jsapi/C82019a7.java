package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kr0.C88273g1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a7 */
public final class C82019a7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C82019a7 f240486d = new C82019a7();

    public C82019a7() {
        super(0);
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.AppBrand.PrivateJSApiPreloadMiniProgramEnv", "IPC_PreloadNextGame.invoke()");
        AppBrandProcessesManager.f246131g.mo116962a().mo116954S(LuggageServiceType.WAGAME, C88273g1.WXA_JSAPI_PRELOAD);
        return C13598b0.f38549a;
    }
}
