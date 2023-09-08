package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.x */
public class C82103x implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f240753d;

    public C82103x(JsApiStartPlayVoice jsApiStartPlayVoice, C83780d1 d1Var) {
        this.f240753d = d1Var;
    }

    /* renamed from: b */
    public void mo22089b() {
        if (!Util.isNullOrNil(JsApiStartPlayVoice.f240653h)) {
            new JsApiStopPlayVoice.StopPlayVoice((JsApiStopPlayVoice.C82069a) null).mo114395c();
            JsApiStartPlayVoice.f240653h = null;
        }
        this.f240753d.mo114863i(this);
    }
}
