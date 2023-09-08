package com.tencent.p014mm.plugin.webview.luggage.menu;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.j */
public class C43644j extends C53099d {
    public C43644j(C43645k kVar) {
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo14702b() {
        return "menu:share:appmessage";
    }
}
