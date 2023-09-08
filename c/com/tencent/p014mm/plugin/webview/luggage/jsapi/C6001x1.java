package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.x1 */
public class C6001x1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setNavigationBarButtons";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiSetNavigationBarButtons", "invokeInOwn");
        String optString = aVar.f148190b.f129368c.optString("left");
        String optString2 = aVar.f148190b.f129368c.optString("right");
        if (!Util.isNullOrNil(optString) || !Util.isNullOrNil(optString2)) {
            Bundle bundle = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(optString);
                String d = C44625c2.m49071d(jSONObject.optString("wxcolor", ""));
                if (Util.isNullOrNil(d)) {
                    d = jSONObject.optString("color", "");
                }
                if (!Util.isNullOrNil(d)) {
                    bundle.putString("set_navigation_bar_buttons_left_text_color", d);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e, "setNavigationBarButtons opt left ", new Object[0]);
            }
            try {
                JSONObject jSONObject2 = new JSONObject(optString2);
                boolean optBoolean = jSONObject2.optBoolean("hidden", false);
                String optString3 = jSONObject2.optString(MimeTypes.BASE_TYPE_TEXT, "");
                String nullAsNil = Util.nullAsNil(C44625c2.m49075h(jSONObject2.optString("iconData", "")));
                String d2 = C44625c2.m49071d(jSONObject2.optString("wxcolor", ""));
                if (Util.isNullOrNil(d2)) {
                    d2 = jSONObject2.optString("color", "");
                }
                boolean optBoolean2 = jSONObject2.optBoolean("needClickEvent", false);
                if (!optBoolean) {
                    bundle.putString("set_navigation_bar_buttons_text", optString3);
                    bundle.putString("set_navigation_bar_buttons_icon_data", nullAsNil);
                    bundle.putString("set_navigation_bar_buttons_text_color", d2);
                    bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean2);
                } else {
                    bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.JsApiSetNavigationBarButtons", e2, "setNavigationBarButtons opt right ", new Object[0]);
            }
            if (bundle.size() < 0) {
                aVar.mo73778c("fail", (JSONObject) null);
                return;
            }
            C43661n0 n0Var = ((C43658n) aVar.f148189a).f117951u;
            if (n0Var == null) {
                aVar.mo73778c("fail", (JSONObject) null);
                return;
            }
            n0Var.setNavigationBarButtons(bundle);
            aVar.mo73776a();
            return;
        }
        aVar.mo73778c("fail", (JSONObject) null);
    }
}
