package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.NavigateBackMiniProgramEvent;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiOpenBusinessView$3 */
class JsApiOpenBusinessView$3 extends IListener<NavigateBackMiniProgramEvent> {

    /* renamed from: d */
    public final /* synthetic */ C81879g f241438d;

    /* renamed from: e */
    public final /* synthetic */ int f241439e;

    /* renamed from: f */
    public final /* synthetic */ C82398i f241440f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsApiOpenBusinessView$3(C82398i iVar, C0125s sVar, C81879g gVar, int i) {
        super(sVar);
        this.f241440f = iVar;
        this.f241438d = gVar;
        this.f241439e = i;
        this.__eventId = -1201570635;
    }

    public boolean callback(IEvent iEvent) {
        JSONObject jSONObject;
        NavigateBackMiniProgramEvent navigateBackMiniProgramEvent = (NavigateBackMiniProgramEvent) iEvent;
        int i = navigateBackMiniProgramEvent.f236239d.f236240a;
        if (i < 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            String str = i == -2 ? "fail CGI error" : i == -3 ? "fail cancel" : i == -4 ? "fail invalid businessType" : "fail system error";
            Log.m105925i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram fail, errCode:%s, errMsg:%s", Integer.valueOf(i), str);
            this.f241438d.mo109647a(this.f241439e, this.f241440f.mo115112m(str, hashMap));
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", Integer.valueOf(i));
            try {
                jSONObject = new JSONObject(Util.nullAs(navigateBackMiniProgramEvent.f236239d.f236242c, "{}"));
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram, parse extraData fail", e);
                jSONObject = new JSONObject();
            }
            hashMap2.put("extraData", jSONObject);
            Log.m105924i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram success");
            this.f241438d.mo109647a(this.f241439e, this.f241440f.mo115112m("ok", hashMap2));
        }
        dead();
        return false;
    }
}
