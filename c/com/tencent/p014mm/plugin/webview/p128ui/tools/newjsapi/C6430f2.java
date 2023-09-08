package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import g93.C32355a;
import g93.C8250d;
import g93.C8251e;
import gy3.C87412m;
import j83.C9286a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f2 */
public final class C6430f2 extends C15053a {

    /* renamed from: d */
    public static final C6430f2 f23443d = new C6430f2();

    /* renamed from: e */
    public static final int f23444e = 331;

    /* renamed from: f */
    public static final String f23445f = "request";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f2$a */
    public static final class C6431a implements C8251e.C8252a {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23446a;

        public C6431a(C13855j jVar) {
            this.f23446a = jVar;
        }

        /* renamed from: a */
        public final void mo7434a(C13851h1 h1Var, String str, Map<String, Object> map) {
            this.f23446a.f39001d.mo10774a(h1Var.f38990c, str, map);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        C6431a aVar = new C6431a(jVar);
        List<String> list = C8251e.f27183a;
        C32355a.m39689a(70);
        String nullAs = Util.nullAs((String) h1Var.f38983a.get("key_request_full_url_query"), "");
        if (!Util.isNullOrNil(nullAs)) {
            nullAs = String.format("&wx_header=1&pass_ticket=%s", new Object[]{nullAs});
        }
        String str = h1Var.f38983a.get("url") + nullAs;
        String nullAs2 = Util.nullAs((String) h1Var.f38983a.get(FirebaseAnalytics.C113379b.METHOD), "GET");
        String nullAs3 = Util.nullAs((String) h1Var.f38983a.get("header"), "");
        String str2 = (String) h1Var.f38983a.get("data");
        Log.m105925i("MicroMsg.TmplWebViewJsAPi", "[doRequest]url:%s", str);
        String nullAs4 = Util.nullAs((String) h1Var.f38983a.get("key_request_header"), "");
        HashMap hashMap = new HashMap();
        try {
            if (!Util.isNullOrNil(nullAs4)) {
                JSONObject jSONObject = new JSONObject(nullAs4);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
            if (!Util.isNullOrNil(nullAs3)) {
                JSONObject jSONObject2 = new JSONObject(nullAs3);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    hashMap.put(next2, jSONObject2.optString(next2));
                }
            }
        } catch (JSONException e) {
            Log.printInfoStack("MicroMsg.TmplWebViewJsAPi", "", e);
        }
        Log.m105919d("MicroMsg.TmplWebViewJsAPi", "[doRequest]url:%s, method:%s, header:%s, data:%s", str, nullAs2, nullAs3, str2);
        C9286a.m8929a(new C8250d(nullAs2, str, hashMap, str2, aVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23444e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23445f;
    }
}
