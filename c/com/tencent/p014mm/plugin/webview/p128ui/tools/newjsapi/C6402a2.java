package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import p244tt.C14088e;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.a2 */
public final class C6402a2 extends C15053a {

    /* renamed from: d */
    public static final C6402a2 f23373d = new C6402a2();

    /* renamed from: e */
    public static final int f23374e = 405;

    /* renamed from: f */
    public static final String f23375f = "preloadLiteApp";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        boolean optBoolean = h1Var.f38991d.has("onlyPreLoadBaseLib") ? h1Var.f38991d.optBoolean("onlyPreLoadBaseLib") : false;
        String str2 = "";
        if (optBoolean) {
            str = str2;
        } else if (h1Var.f38983a.get("appId") == null) {
            C13849g gVar = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar.mo10774a(str3, h1Var.f38996i + ": fail", (Map<String, Object>) null);
            return false;
        } else {
            Object obj = h1Var.f38983a.get("appId");
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj;
            if (h1Var.f38983a.get("page") != null) {
                Object obj2 = h1Var.f38983a.get("page");
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) obj2;
            }
            String str5 = str2;
            str2 = str4;
            str = str5;
        }
        ((C14088e) C86312j.m106911c(C14088e.class)).fh0(str2, str, optBoolean ? "updateBaseLibPath" : "preloadLiteApp");
        C13849g gVar2 = jVar.f39001d;
        String str6 = h1Var.f38990c;
        gVar2.mo10774a(str6, h1Var.f38996i + ": success", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23374e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23375f;
    }
}
