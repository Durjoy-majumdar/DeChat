package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.r2 */
public final class C6552r2 extends C15053a {

    /* renamed from: d */
    public static final C6552r2 f23744d = new C6552r2();

    /* renamed from: e */
    public static final String f23745e = "MicroMsg.JsApiSetNavigationBarButtons";

    /* renamed from: f */
    public static final int f23746f = 195;

    /* renamed from: g */
    public static final String f23747g = "setNavigationBarButtons";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("left");
        String str2 = (String) h1Var.f38983a.get("right");
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            Bundle bundle = new Bundle();
            if (str != null) {
                try {
                    String str3 = f23745e;
                    Log.m105924i(str3, "parsing left");
                    if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                        Log.m105924i(str3, "left: " + str);
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    String d = C44625c2.m49071d(jSONObject.optString("wxcolor", ""));
                    if (Util.isNullOrNil(d)) {
                        d = jSONObject.optString("color", "");
                    }
                    if (!Util.isNullOrNil(d)) {
                        bundle.putString("set_navigation_bar_buttons_left_text_color", d);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(f23745e, e, "setNavigationBarButtons opt left ", new Object[0]);
                }
            }
            try {
                String str4 = f23745e;
                Log.m105924i(str4, "parsing right");
                if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                    Log.m105924i(str4, "right: " + str2);
                }
                JSONObject jSONObject2 = new JSONObject(str2);
                boolean optBoolean = jSONObject2.optBoolean("hidden", false);
                String optString = jSONObject2.optString(MimeTypes.BASE_TYPE_TEXT, "");
                String nullAsNil = Util.nullAsNil(C44625c2.m49075h(jSONObject2.optString("iconData", "")));
                String d2 = C44625c2.m49071d(jSONObject2.optString("wxcolor", ""));
                if (Util.isNullOrNil(d2)) {
                    d2 = jSONObject2.optString("color", "");
                }
                boolean optBoolean2 = jSONObject2.optBoolean("needClickEvent", false);
                if (!optBoolean) {
                    bundle.putString("set_navigation_bar_buttons_text", optString);
                    bundle.putString("set_navigation_bar_buttons_icon_data", nullAsNil);
                    bundle.putString("set_navigation_bar_buttons_text_color", d2);
                    bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean2);
                } else {
                    bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
                }
                bundle.putBoolean("set_navigation_bar_right_style", true);
            } catch (Exception e2) {
                Log.printErrStackTrace(f23745e, e2, "setNavigationBarButtons opt right ", new Object[0]);
            }
            if (bundle.size() < 0) {
                Log.m105924i(f23745e, "params size = 0");
                jVar.f39001d.mo10774a(h1Var.f38990c, "setNavigationBarButtons:fail_invalid_params", (Map<String, Object>) null);
            } else {
                try {
                    C6107m d3 = jVar.mo13184d();
                    if (d3 != null) {
                        d3.mo7031V5(44, bundle);
                    }
                    jVar.f39001d.mo10774a(h1Var.f38990c, "setNavigationBarButtons:ok", (Map<String, Object>) null);
                } catch (Exception e3) {
                    Log.printErrStackTrace(f23745e, e3, "setNavigationBarButtons invoke ", new Object[0]);
                    jVar.f39001d.mo10774a(h1Var.f38990c, "setNavigationBarButtons:fail_invoke", (Map<String, Object>) null);
                }
            }
        } else {
            jVar.f39001d.mo10774a(h1Var.f38990c, "setNavigationBarButtons:fail", (Map<String, Object>) null);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23746f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23747g;
    }
}
