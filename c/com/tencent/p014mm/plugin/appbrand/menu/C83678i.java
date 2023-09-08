package com.tencent.p014mm.plugin.appbrand.menu;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import qp0.C89784b;
import qp0.C89787d;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.i */
public class C83678i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f244305d;

    public C83678i(C83679j jVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f244305d = appBrandRuntimeWC;
    }

    public void run() {
        C89787d dVar = this.f244305d.f238293u1;
        C89784b bVar = dVar != null ? dVar.f258168a : null;
        if (bVar != null) {
            bVar.mo67895G(true);
        } else {
            Log.m105928w("MicroMsg.AppBrand.MenuDelegate_Minimize", "performItemClick, no float ball helper");
        }
    }
}
