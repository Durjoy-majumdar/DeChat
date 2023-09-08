package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.v0 */
public class C82771v0 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C82381f f242112a;

    /* renamed from: b */
    public final /* synthetic */ int f242113b;

    /* renamed from: c */
    public final /* synthetic */ JsApiChooseMedia f242114c;

    public C82771v0(JsApiChooseMedia jsApiChooseMedia, C82381f fVar, int i) {
        this.f242114c = jsApiChooseMedia;
        this.f242112a = fVar;
        this.f242113b = i;
    }

    public void onDismiss() {
        Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
        this.f242112a.mo109647a(this.f242113b, this.f242114c.mo115109j("fail:cancel"));
    }
}
