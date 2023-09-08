package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import ym0.C91508e;
import ym0.C91510h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.JsApiLoadVideoResource$1$1 */
class JsApiLoadVideoResource$1$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C91510h f242775d;

    /* renamed from: e */
    public final /* synthetic */ C91508e f242776e;

    public JsApiLoadVideoResource$1$1(C83051d.C83052a aVar, C91510h hVar, C91508e eVar) {
        this.f242775d = hVar;
        this.f242776e = eVar;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onDestroyed() {
        this.f242775d.mo125421w3(this.f242776e);
    }
}
