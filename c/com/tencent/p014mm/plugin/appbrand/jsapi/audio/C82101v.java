package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.v */
public class C82101v implements C84498l {

    /* renamed from: d */
    public final /* synthetic */ C86493v0.C86495c f240751d;

    /* renamed from: e */
    public final /* synthetic */ JsApiSetBackgroundAudioStateWC f240752e;

    public C82101v(JsApiSetBackgroundAudioStateWC jsApiSetBackgroundAudioStateWC, C86493v0.C86495c cVar) {
        this.f240752e = jsApiSetBackgroundAudioStateWC;
        this.f240751d = cVar;
    }

    /* renamed from: R3 */
    public void mo94342R3(String str, int i) {
        String f = this.f240751d.mo120959f("appId", "");
        int e = this.f240751d.mo120958e("pkgType", 0);
        if ((!f.equals(str) || e != i) && this.f240751d.mo120960g("setBackgroundAudioState#isPlaying") && C83231l.m102141b(f) != C83231l.C83233c.ON_RESUME) {
            Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onStickyBannerChanged, pause the music");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operationType", "pause");
            } catch (JSONException unused) {
            }
            JsApiSetBackgroundAudioStateWC jsApiSetBackgroundAudioStateWC = this.f240752e;
            JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask = jsApiSetBackgroundAudioStateWC.f240623g;
            C82381f fVar = setBackgroundAudioListenerTask.f240625g;
            int i2 = setBackgroundAudioListenerTask.f240626h;
            jsApiSetBackgroundAudioStateWC.getClass();
            JsApiSetBackgroundAudioStateWC.SetBackgroundAudioStateTaskWC setBackgroundAudioStateTaskWC = new JsApiSetBackgroundAudioStateWC.SetBackgroundAudioStateTaskWC(jsApiSetBackgroundAudioStateWC, fVar, i2);
            setBackgroundAudioStateTaskWC.f240641n = jSONObject.toString();
            setBackgroundAudioStateTaskWC.f240639i = f;
            setBackgroundAudioStateTaskWC.mo114395c();
        }
    }
}
