package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.s0 */
public class C82762s0 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C82381f f242090a;

    /* renamed from: b */
    public final /* synthetic */ int f242091b;

    /* renamed from: c */
    public final /* synthetic */ JsApiChooseMedia f242092c;

    public C82762s0(JsApiChooseMedia jsApiChooseMedia, C82381f fVar, int i) {
        this.f242092c = jsApiChooseMedia;
        this.f242090a = fVar;
        this.f242091b = i;
    }

    public void onDismiss() {
        Log.m105920e("MicroMsg.JsApiChooseMedia", "cancel chooseMedia");
        Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
        this.f242090a.mo109647a(this.f242091b, this.f242092c.mo115109j("fail:cancel"));
    }
}
