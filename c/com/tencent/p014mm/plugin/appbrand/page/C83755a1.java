package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84570o4;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.page.a1 */
public class C83755a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPageContainerWC f244477d;

    public C83755a1(AppBrandPageContainerWC appBrandPageContainerWC) {
        this.f244477d = appBrandPageContainerWC;
    }

    public void run() {
        AppBrandRuntimeWC runtime = this.f244477d.getRuntime();
        if (runtime != null) {
            C84560k4 k4Var = runtime.f238154s;
            if (k4Var instanceof C84570o4) {
                Log.m105924i("MicroMsg.AppBrandPageContainerWC", "[weishi] revealWeishiCoverImageIfNeed, hide");
                ((C84570o4) k4Var).mo117201k(true, "");
            }
        }
    }
}
