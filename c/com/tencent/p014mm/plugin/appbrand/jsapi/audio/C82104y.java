package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.y */
public class C82104y implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f240754d;

    public C82104y(JsApiStartPlayVoice jsApiStartPlayVoice, C83780d1 d1Var) {
        this.f240754d = d1Var;
    }

    public void onDestroy() {
        if (!Util.isNullOrNil(JsApiStartPlayVoice.f240653h)) {
            new JsApiStopPlayVoice.StopPlayVoice((JsApiStopPlayVoice.C82069a) null).mo114395c();
            JsApiStartPlayVoice.f240653h = null;
        }
        this.f240754d.mo114867r(this);
        C86493v0 d = C86493v0.m107224d();
        C86493v0.C86495c e = d.mo120948e("JsApi@" + this.f240754d.hashCode());
        if (e != null) {
            e.mo120961h();
        }
    }
}
