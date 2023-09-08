package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import sx3.C36903g0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.e */
public final class C6226e extends C15053a {

    /* renamed from: d */
    public static final C6226e f22965d = new C6226e();

    /* renamed from: e */
    public static final String f22966e = "MicroMsg.JsApiGetPasteboardContent";

    /* renamed from: f */
    public static final int f22967f = 364;

    /* renamed from: g */
    public static final String f22968g = "getPasteboardContent";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i(f22966e, "do get pasteboard content: handleMsg");
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        gVar.mo10774a(str, h1Var.f38996i + ":fail nocontent", C36903g0.f97931d);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f22967f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f22968g;
    }
}
