package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C20557b;
import nb0.C88911a;
import org.json.JSONObject;
import p1055vh.C90804a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.w */
public class C82102w extends C82268c {
    public static final int CTRL_INDEX = 481;
    public static final String NAME = "setInnerAudioOption";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String appId = fVar.getAppId();
        Log.m105925i("MicroMsg.Audio.JsApiSetInnerAudioOption", "data:%s, appId:%s", jSONObject, appId);
        Log.m105924i("MicroMsg.AudioPlayerHelper", "getAudioContextOption()");
        C90804a aVar = new C90804a();
        aVar.f260748a.f260750a = 20;
        C20557b.m22327a(aVar);
        C88911a aVar2 = aVar.f260749b.f260758c;
        if (aVar2 == null) {
            aVar2 = new C88911a();
        }
        if (!TextUtils.isEmpty(appId) && !TextUtils.isEmpty(aVar2.f256413c) && !appId.equalsIgnoreCase(aVar2.f256413c)) {
            aVar2.f256411a = true;
            aVar2.f256412b = true;
            Log.m105924i("MicroMsg.Audio.JsApiSetInnerAudioOption", "reset AudioContextParam");
        }
        aVar2.f256413c = appId;
        if (jSONObject.has("mixWithOther")) {
            aVar2.f256411a = jSONObject.optBoolean("mixWithOther", true);
        }
        if (jSONObject.has("speakerOn")) {
            aVar2.f256412b = jSONObject.optBoolean("speakerOn", true);
        }
        if (!aVar2.f256412b) {
            aVar2.f256411a = false;
        }
        Log.m105925i("MicroMsg.AudioPlayerHelper", "setAudioContextOption, mixWithOther:%b", Boolean.valueOf(aVar2.f256411a));
        C90804a aVar3 = new C90804a();
        C90804a.C90805a aVar4 = aVar3.f260748a;
        aVar4.f260750a = 19;
        aVar4.f260755f = aVar2;
        C20557b.m22327a(aVar3);
        boolean z = aVar3.f260749b.f260756a;
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
