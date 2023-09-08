package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.i */
public class C82085i extends C82268c {
    public static final int CTRL_INDEX = 291;
    public static final String NAME = "createAudioInstanceAsync";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        Log.m105924i("MicroMsg.JsApiCreateAudioInstanceAsync", "hy: create audio instance async invoke");
        System.currentTimeMillis();
        Log.m105924i("MicroMsg.JsApiCreateAudioInstanceAsync", "hy: start create audio instance async");
        String v = C82082h.m100792v(fVar);
        HashMap hashMap = new HashMap();
        hashMap.put("audioId", v);
        C82077c.INSTANCE.mo114530a(fVar.getAppId()).f254568a.put(v, oVar);
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
