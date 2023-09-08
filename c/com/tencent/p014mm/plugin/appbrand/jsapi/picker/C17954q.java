package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import android.view.View;
import vt0.C22778a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.q */
public class C17954q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22778a f49474d;

    public C17954q(C17947n nVar, C22778a aVar) {
        this.f49474d = aVar;
    }

    public void run() {
        if (this.f49474d.getPicker() != null && (this.f49474d.getPicker() instanceof View)) {
            ((View) this.f49474d.getPicker()).requestLayout();
        }
    }
}
