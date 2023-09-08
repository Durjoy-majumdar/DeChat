package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83090m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import org.webrtc.VideoSink;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.i */
public final class C83079i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f242839d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f242840e;

    /* renamed from: f */
    public final /* synthetic */ C90630c f242841f;

    /* renamed from: g */
    public final /* synthetic */ C83080j f242842g;

    public C83079i(View view, JSONObject jSONObject, C90630c cVar, C83080j jVar) {
        this.f242839d = view;
        this.f242840e = jSONObject;
        this.f242841f = cVar;
        this.f242842g = jVar;
    }

    public final void run() {
        C83090m.C83091a aVar;
        View view = this.f242839d;
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
        VideoSink a = ((C83068b) view).mo115316a();
        if (a != null) {
            JSONObject jSONObject = this.f242840e;
            C90630c cVar = this.f242841f;
            C83080j jVar = this.f242842g;
            aVar = C83090m.f242865a.mo115333a(jSONObject, a, cVar, C83090m.C83092b.AddOrUpdate);
            Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + aVar);
            jVar.mo115330G(cVar, a, aVar, jSONObject);
        } else {
            aVar = null;
        }
        Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: webrtc remove result is " + aVar);
    }
}
