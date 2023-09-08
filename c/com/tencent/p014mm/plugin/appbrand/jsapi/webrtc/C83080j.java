package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83090m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jk0.C87981f;
import org.json.JSONObject;
import org.webrtc.VideoSink;
import p1044ub.C90630c;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.j */
public class C83080j extends C87981f<C90630c> {
    public static final int CTRL_INDEX = 1119;
    public static final String NAME = "updateWebRTCRendererView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C91635f D1;
        C83165i jsRuntime;
        C83181q qVar;
        C90630c cVar = (C90630c) hVar;
        Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererView", "hy: try update webrtc view " + i);
        if (cVar == null || (D1 = cVar.mo116160O0()) == null || (jsRuntime = D1.getJsRuntime()) == null || (qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class)) == null) {
            return true;
        }
        qVar.post(new C83079i(view, jSONObject, cVar, this));
        return true;
    }

    /* renamed from: G */
    public void mo115330G(C82381f fVar, VideoSink videoSink, C83090m.C83091a aVar, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "appBrandComponent");
        C87412m.m108594g(videoSink, "videoSink");
        C87412m.m108594g(aVar, "videoSinkErrCode");
    }
}
