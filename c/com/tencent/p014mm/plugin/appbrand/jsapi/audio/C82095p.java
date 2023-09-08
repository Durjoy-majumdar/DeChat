package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import eb0.C86493v0;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.p */
public class C82095p implements C84498l {

    /* renamed from: d */
    public final /* synthetic */ C86493v0.C86495c f240737d;

    /* renamed from: e */
    public final /* synthetic */ C88267e f240738e;

    /* renamed from: f */
    public final /* synthetic */ JsApiOperateMusicPlayer f240739f;

    public C82095p(JsApiOperateMusicPlayer jsApiOperateMusicPlayer, C86493v0.C86495c cVar, C88267e eVar) {
        this.f240739f = jsApiOperateMusicPlayer;
        this.f240737d = cVar;
        this.f240738e = eVar;
    }

    /* renamed from: R3 */
    public void mo94342R3(String str, int i) {
        String f = this.f240737d.mo120959f("appId", "");
        int e = this.f240737d.mo120958e("pkgType", 0);
        if ((!f.equals(str) || e != i) && this.f240737d.mo120960g("Music#isPlaying") && C83231l.m102141b(f) != C83231l.C83233c.ON_RESUME) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operationType", "pause");
            } catch (JSONException unused) {
            }
            JsApiOperateMusicPlayer jsApiOperateMusicPlayer = this.f240739f;
            JsApiOperateMusicPlayer.OperateMusicPlayer operateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(jsApiOperateMusicPlayer, this.f240738e, jsApiOperateMusicPlayer.f240537g.f240543n);
            operateMusicPlayer.f240544o = jSONObject.toString();
            operateMusicPlayer.f240545p = f;
            operateMusicPlayer.f240538f = this.f240737d;
            operateMusicPlayer.mo114395c();
        }
    }
}
