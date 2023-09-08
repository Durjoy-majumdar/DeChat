package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.m */
public class C82092m implements C84498l {

    /* renamed from: d */
    public final /* synthetic */ C86493v0.C86495c f240732d;

    /* renamed from: e */
    public final /* synthetic */ C82094o f240733e;

    public C82092m(C82094o oVar, C86493v0.C86495c cVar) {
        this.f240733e = oVar;
        this.f240732d = cVar;
    }

    /* renamed from: R3 */
    public void mo94342R3(String str, int i) {
        String f = this.f240732d.mo120959f("appId", "");
        int e = this.f240732d.mo120958e("pkgType", 0);
        if ((!f.equals(str) || e != i) && this.f240732d.mo120960g("operateBackgroundAudio#isPlaying") && C83231l.m102141b(f) != C83231l.C83233c.ON_RESUME) {
            Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onStickyBannerChanged, pause the music");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operationType", "pause");
            } catch (JSONException unused) {
            }
            C82094o oVar = this.f240733e;
            JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask = oVar.f240527g;
            JsApiOperateBackgroundAudio.OperateBackgroundAudioTask operateBackgroundAudioTask = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(oVar, setBackgroundAudioListenerTask.f240625g, setBackgroundAudioListenerTask.f240626h);
            operateBackgroundAudioTask.f240532j = jSONObject.toString();
            operateBackgroundAudioTask.f240531i = f;
            operateBackgroundAudioTask.mo114395c();
        }
    }
}
