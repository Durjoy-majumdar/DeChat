package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1909x5;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import p166hy.C8831u0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.n2 */
public final class C6524n2 extends C15053a {

    /* renamed from: d */
    public static final C6524n2 f23674d = new C6524n2();

    /* renamed from: e */
    public static final String f23675e = "MicroMsg.JsApiSaveWaid";

    /* renamed from: f */
    public static final int f23676f = 363;

    /* renamed from: g */
    public static final String f23677g = C1909x5.NAME;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        HashMap hashMap = new HashMap();
        try {
            Log.m105924i(f23675e, "h5 JsApiSaveWaid");
            String jSONObject = h1Var.f38991d.toString();
            C87412m.m108593f(jSONObject, "msg.rawParams.toString()");
            hashMap.put("result", String.valueOf(((C8831u0) C86312j.m106911c(C8831u0.class)).dc0(jSONObject)));
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":ok", hashMap);
            return true;
        } catch (Exception e) {
            String str2 = f23675e;
            Log.m105920e(str2, "h5 JsApiSaveWaid exp=" + e);
            hashMap.put("result", "0");
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar2.mo10774a(str3, h1Var.f38996i + ":fail", hashMap);
            return false;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23676f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23677g;
    }
}
