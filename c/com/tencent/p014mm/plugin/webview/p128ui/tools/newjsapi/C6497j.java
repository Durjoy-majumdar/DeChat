package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44044l2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import gy3.C87412m;
import java.util.Map;
import sl0.C90225m;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.j */
public final class C6497j extends C15053a {

    /* renamed from: d */
    public static final C6497j f23595d = new C6497j();

    /* renamed from: e */
    public static final int f23596e = C90225m.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23597f = "currentMpInfoHide";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Context context = jVar.f38998a;
        if (context instanceof WebViewUI) {
            WebViewUI webViewUI = (WebViewUI) context;
            if (webViewUI.f118477N1 != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_current_info_show", false);
                WebViewUIStyleHelper webViewUIStyleHelper = webViewUI.f118477N1;
                webViewUIStyleHelper.getClass();
                ((C119157j) C119157j.f356862d).mo183895z(new C44044l2(webViewUIStyleHelper, bundle));
            }
        }
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        gVar.mo10774a(str, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23596e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23597f;
    }
}
