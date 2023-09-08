package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83090m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jk0.C87979e;
import org.json.JSONObject;
import org.webrtc.VideoSink;
import p1044ub.C90630c;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.f */
public class C83077f extends C87979e<C90630c> {
    public static final int CTRL_INDEX = 1118;
    public static final String NAME = "removeWebRTCRendererView";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.f$a */
    public static final class C83078a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f242836d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f242837e;

        /* renamed from: f */
        public final /* synthetic */ C90630c f242838f;

        public C83078a(View view, JSONObject jSONObject, C90630c cVar) {
            this.f242836d = view;
            this.f242837e = jSONObject;
            this.f242838f = cVar;
        }

        public final void run() {
            C83090m.C83091a aVar;
            View view = this.f242836d;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
            VideoSink a = ((C83068b) view).mo115316a();
            if (a != null) {
                aVar = C83090m.f242865a.mo115333a(this.f242837e, a, this.f242838f, C83090m.C83092b.Remove);
                Log.m105924i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + aVar);
            } else {
                aVar = null;
            }
            Log.m105924i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: webrtc remove result is " + aVar);
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public boolean mo110323D(C90630c cVar, int i, View view, JSONObject jSONObject) {
        C91635f D1;
        C83165i jsRuntime;
        C83181q qVar;
        Log.m105924i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: try remove webrtc view " + i);
        if (cVar == null || (D1 = cVar.mo116160O0()) == null || (jsRuntime = D1.getJsRuntime()) == null || (qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class)) == null) {
            return true;
        }
        qVar.post(new C83078a(view, jSONObject, cVar));
        return true;
    }
}
