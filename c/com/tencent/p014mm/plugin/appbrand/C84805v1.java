package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.game.preload.C81889e;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.v1 */
public class C84805v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f247243d;

    public C84805v1(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f247243d = appBrandRuntimeWC;
    }

    public void run() {
        try {
            C81889e.m100570d().mo114286c();
        } catch (NullPointerException e) {
            if (this.f247243d.mo113064k0()) {
                Log.m105920e("MicroMsg.AppBrandRuntimeWC", "runtime has finished - downloadPreloadFiles!");
                return;
            }
            throw e;
        }
    }
}
