package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import android.view.View;
import vt0.C22778a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.o */
public class C17952o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22778a f49470d;

    public C17952o(C17947n nVar, C22778a aVar) {
        this.f49470d = aVar;
    }

    public void run() {
        if (this.f49470d.getPicker() != null && (this.f49470d.getPicker() instanceof View)) {
            ((View) this.f49470d.getPicker()).requestLayout();
        }
    }
}
