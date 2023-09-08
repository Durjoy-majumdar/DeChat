package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.n */
public class C82093n extends C83231l.C83234d {

    /* renamed from: d */
    public final /* synthetic */ C86493v0.C86495c f240734d;

    /* renamed from: e */
    public final /* synthetic */ String f240735e;

    /* renamed from: f */
    public final /* synthetic */ C82094o f240736f;

    public C82093n(C82094o oVar, C86493v0.C86495c cVar, String str) {
        this.f240736f = oVar;
        this.f240734d = cVar;
        this.f240735e = str;
    }

    /* renamed from: c */
    public void mo109497c() {
        String f = this.f240734d.mo120959f("appId", "");
        Log.m105925i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onDestroy, appId:%s", f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (JSONException unused) {
        }
        C82094o oVar = this.f240736f;
        JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask = oVar.f240527g;
        JsApiOperateBackgroundAudio.OperateBackgroundAudioTask operateBackgroundAudioTask = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(oVar, setBackgroundAudioListenerTask.f240625g, setBackgroundAudioListenerTask.f240626h);
        operateBackgroundAudioTask.f240532j = jSONObject.toString();
        operateBackgroundAudioTask.f240531i = f;
        operateBackgroundAudioTask.mo114396f();
        JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask setBackgroundAudioListenerTask2 = this.f240736f.f240527g;
        if (setBackgroundAudioListenerTask2 != null) {
            setBackgroundAudioListenerTask2.mo114397h();
        }
        C86493v0.C86495c e = C86493v0.m107224d().mo120948e(this.f240735e);
        if (e != null) {
            e.mo120961h();
        }
    }
}
