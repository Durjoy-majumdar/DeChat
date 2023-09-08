package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1840q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f62.C7994b0;
import gy3.C87412m;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.d */
public final class C6417d extends C15053a {

    /* renamed from: d */
    public static final C6417d f23407d = new C6417d();

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("url");
        String str2 = obj instanceof String ? (String) obj : null;
        boolean z = false;
        if (str2 == null || str2.length() == 0) {
            Log.m105924i("MicroMsg.JsApiAppJoinGroup.", "url is null");
            jVar.f39001d.mo10774a(h1Var.f38990c, "joinGroup:fail", (Map<String, Object>) null);
            return true;
        }
        C13849g gVar = jVar.f39001d;
        if (gVar instanceof C48590l) {
            C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            str = ((C48590l) gVar).mo73253q(str2);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.JsApiAppJoinGroup.", "appId is null");
            jVar.f39001d.mo10774a(h1Var.f38990c, "joinGroup:fail", (Map<String, Object>) null);
            return true;
        }
        Object obj2 = h1Var.f38983a.get("signature");
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = h1Var.f38983a.get("groupId");
        String str4 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = h1Var.f38983a.get("nonceStr");
        String str5 = obj4 instanceof String ? (String) obj4 : null;
        C7994b0.C7996b bVar = new C7994b0.C7996b();
        bVar.f26678d = str;
        bVar.f26681g = str3;
        bVar.f26679e = str4;
        bVar.f26680f = str5;
        ((C7994b0) C86312j.m106911c(C7994b0.class)).vt0(jVar.f38998a, bVar);
        jVar.f39001d.mo10774a(h1Var.f38990c, "joinGroup:success", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 377;
    }

    /* renamed from: c */
    public String mo7288c() {
        return C1840q1.NAME;
    }
}
