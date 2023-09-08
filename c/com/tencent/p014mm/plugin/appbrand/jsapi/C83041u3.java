package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u3 */
public class C83041u3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f242770d;

    public C83041u3(JsApiNavigateBackApplication jsApiNavigateBackApplication, C81879g gVar) {
        this.f242770d = gVar;
    }

    public void run() {
        C81879g gVar = this.f242770d;
        if (gVar != null && gVar.getRuntime() != null) {
            this.f242770d.getRuntime().mo113006E();
        }
    }
}
