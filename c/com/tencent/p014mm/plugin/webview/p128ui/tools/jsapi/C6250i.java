package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import kr0.C10403n0;
import rx3.C13598b0;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import yn0.C91518c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.i */
public final class C6250i extends C15053a {

    /* renamed from: d */
    public static final C6250i f23029d = new C6250i();

    /* renamed from: e */
    public static final int f23030e = JsApiOperateRecorder.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23031f = C91518c.NAME;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C13598b0 b0Var;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        C10403n0 n0Var = (C10403n0) C86312j.m106911c(C10403n0.class);
        if (n0Var != null) {
            String optString = h1Var.f38991d.optString("name");
            Object opt = h1Var.f38991d.opt("arg");
            f23029d.getClass();
            n0Var.mo10721rJ(jVar.f39001d.getBinderID(), optString, opt);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.WebView.JsApiInvokeMiniProgramAPI", "invoke but get NULL IAppBrandServiceForWebView");
        }
        jVar.f39001d.mo10774a(h1Var.f38990c, f23031f + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23030e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23031f;
    }
}
