package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.f */
public class C82960f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SendAppMessageTask f242585d;

    /* renamed from: e */
    public final /* synthetic */ C88267e f242586e;

    /* renamed from: f */
    public final /* synthetic */ int f242587f;

    /* renamed from: g */
    public final /* synthetic */ JsApiShareAppMessageBase.C82939f f242588g;

    /* renamed from: h */
    public final /* synthetic */ String f242589h;

    /* renamed from: i */
    public final /* synthetic */ JsApiShareAppMessageBase f242590i;

    public C82960f(JsApiShareAppMessageBase jsApiShareAppMessageBase, SendAppMessageTask sendAppMessageTask, C88267e eVar, int i, JsApiShareAppMessageBase.C82939f fVar, String str) {
        this.f242590i = jsApiShareAppMessageBase;
        this.f242585d = sendAppMessageTask;
        this.f242586e = eVar;
        this.f242587f = i;
        this.f242588g = fVar;
        this.f242589h = str;
    }

    public void run() {
        Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "task callback");
        this.f242585d.mo114397h();
        C88267e eVar = this.f242586e;
        int i = this.f242587f;
        JsApiShareAppMessageBase jsApiShareAppMessageBase = this.f242590i;
        eVar.mo109647a(i, jsApiShareAppMessageBase.mo115112m("ok", jsApiShareAppMessageBase.mo115201B(this.f242588g, this.f242585d, this.f242589h)));
        this.f242590i.mo115204E(true, this.f242588g, this.f242589h);
    }
}
