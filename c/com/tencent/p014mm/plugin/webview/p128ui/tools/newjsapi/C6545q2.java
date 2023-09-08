package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q2 */
public final class C6545q2 extends C15053a {

    /* renamed from: d */
    public static final C6545q2 f23722d = new C6545q2();

    /* renamed from: e */
    public static final String f23723e = "MicroMsg.JsApiSetFontSizeCallback";

    /* renamed from: f */
    public static final int f23724f = -2;

    /* renamed from: g */
    public static final String f23725g = "setFontSizeCallback";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("fontSize");
        if (str == null || C112551y.m153811k(str)) {
            Log.m105920e(f23723e, "doSetFontSizeCb, fontSize is null");
            return false;
        }
        String str2 = f23723e;
        Log.m105924i(str2, "doSetFontSizeCb, fontSize = " + str);
        try {
            C6107m d = jVar.mo13184d();
            if (d != null) {
                d.mo7025B7(str);
            }
        } catch (Exception e) {
            String str3 = f23723e;
            Log.m105928w(str3, "setFontSizeCb, ex = " + e.getMessage());
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23724f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23725g;
    }
}
