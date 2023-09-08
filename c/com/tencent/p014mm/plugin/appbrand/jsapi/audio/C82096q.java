package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84496e;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import java.util.Set;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.q */
public class C82096q extends C83231l.C83234d {

    /* renamed from: d */
    public final /* synthetic */ C86493v0.C86495c f240740d;

    /* renamed from: e */
    public final /* synthetic */ C88267e f240741e;

    /* renamed from: f */
    public final /* synthetic */ JsApiOperateMusicPlayer f240742f;

    public C82096q(JsApiOperateMusicPlayer jsApiOperateMusicPlayer, C86493v0.C86495c cVar, C88267e eVar) {
        this.f240742f = jsApiOperateMusicPlayer;
        this.f240740d = cVar;
        this.f240741e = eVar;
    }

    /* renamed from: c */
    public void mo109497c() {
        Log.m105918d("MicroMsg.JsApiOperateMusicPlayer", "onDestroy");
        String f = this.f240740d.mo120959f("appId", "");
        this.f240740d.mo120958e("pkgType", 0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (JSONException unused) {
        }
        JsApiOperateMusicPlayer jsApiOperateMusicPlayer = this.f240742f;
        JsApiOperateMusicPlayer.OperateMusicPlayer operateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(jsApiOperateMusicPlayer, this.f240741e, jsApiOperateMusicPlayer.f240537g.f240543n);
        operateMusicPlayer.f240544o = jSONObject.toString();
        operateMusicPlayer.f240545p = f;
        operateMusicPlayer.f240548s = -1;
        operateMusicPlayer.f240538f = this.f240740d;
        operateMusicPlayer.mo114396f();
    }

    /* renamed from: e */
    public void mo74049e(C83231l.C83235e eVar) {
        String f = this.f240740d.mo120959f("appId", "");
        this.f240740d.mo120958e("pkgType", 0);
        int ordinal = eVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            int i = this.f240741e.getRuntime().mo121253n1().f245533f;
            Set<C84498l> set = C84496e.f246615a;
            if (i != 1023) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("operationType", "pause");
                } catch (JSONException unused) {
                }
                JsApiOperateMusicPlayer jsApiOperateMusicPlayer = this.f240742f;
                JsApiOperateMusicPlayer.OperateMusicPlayer operateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(jsApiOperateMusicPlayer, this.f240741e, jsApiOperateMusicPlayer.f240537g.f240543n);
                operateMusicPlayer.f240544o = jSONObject.toString();
                operateMusicPlayer.f240545p = f;
                operateMusicPlayer.f240538f = this.f240740d;
                operateMusicPlayer.mo114395c();
            }
        }
    }
}
