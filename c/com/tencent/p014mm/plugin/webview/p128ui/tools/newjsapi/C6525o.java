package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import cl0.C80050f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o */
public final class C6525o extends C15053a {

    /* renamed from: d */
    public static final C6525o f23678d = new C6525o();

    /* renamed from: e */
    public static final int f23679e = C80050f.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23680f = "downloadPageDataForFastLoad";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        Class cls = C45696d.class;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str = (String) h1Var2.f38983a.get("itemList");
        if (str == null || str.length() == 0) {
            C13849g gVar = jVar2.f39001d;
            String str2 = h1Var2.f38990c;
            gVar.mo10774a(str2, f23680f + ":fail invalid itemList", (Map<String, Object>) null);
            return true;
        }
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                Log.m105920e("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad invalid item index: " + i);
            } else {
                String optString = optJSONObject.optString("url");
                int optInt = optJSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                Log.m105925i("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: %s", optString);
                if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(optInt)) {
                    Log.m105929w("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad can not preload openScene: %d", Integer.valueOf(optInt));
                } else {
                    C87412m.m108593f(optString, "url");
                    if (optString.length() > 0) {
                        ((C45696d) C86709a0.m107533q(cls)).Tn0(optString, optInt2, optInt, new Object[0]);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            C13849g gVar2 = jVar2.f39001d;
            String str3 = h1Var2.f38990c;
            gVar2.mo10774a(str3, f23680f + ":ok", (Map<String, Object>) null);
        } else {
            C13849g gVar3 = jVar2.f39001d;
            String str4 = h1Var2.f38990c;
            gVar3.mo10774a(str4, f23680f + ":fail not valid url", (Map<String, Object>) null);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23679e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23680f;
    }
}
