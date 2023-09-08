package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.c0 */
public final class C6413c0 extends C15053a {

    /* renamed from: d */
    public static final C6413c0 f23397d = new C6413c0();

    /* renamed from: e */
    public static final int f23398e = 367;

    /* renamed from: f */
    public static final String f23399f = "handleAdAction";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("action");
        boolean z = false;
        Log.m105925i("MicroMsg.JsApiHandleMPPageAction", "alvinfluo handleAdAction action: %s", str);
        if (str == null || str.length() == 0) {
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + ":fail action is empty", (Map<String, Object>) null);
            return true;
        } else if (!C87412m.m108589b(str, "report")) {
            return false;
        } else {
            String str3 = (String) h1Var.f38983a.get("data");
            if (str3 == null || str3.length() == 0) {
                C13849g gVar2 = jVar.f39001d;
                String str4 = h1Var.f38990c;
                gVar2.mo10774a(str4, h1Var.f38996i + ":fail data is empty", (Map<String, Object>) null);
            } else {
                JSONObject jSONObject = new JSONObject(str3);
                int safeParseInt = Util.safeParseInt(jSONObject.optString("logid"));
                String optString = jSONObject.optString("logstr");
                Log.m105927v("MicroMsg.JsApiHandleMPPageAction", "alvinluo handleAdAction doReport logId: %s, logStr: %s", Integer.valueOf(safeParseInt), optString);
                C87412m.m108593f(optString, "logStr");
                if (optString.length() > 0) {
                    z = true;
                }
                if (z) {
                    C115669n.INSTANCE.kvStat(safeParseInt, optString);
                }
                C13849g gVar3 = jVar.f39001d;
                String str5 = h1Var.f38990c;
                gVar3.mo10774a(str5, h1Var.f38996i + ":ok", (Map<String, Object>) null);
            }
            return true;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23398e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23399f;
    }
}
