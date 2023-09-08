package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h0 */
public final class C6487h0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f23571d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f23572e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23573f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6487h0(WebViewUI webViewUI, C13855j jVar, C13851h1 h1Var) {
        super(0);
        this.f23571d = webViewUI;
        this.f23572e = jVar;
        this.f23573f = h1Var;
    }

    public Object invoke() {
        WebViewUI webViewUI = this.f23571d;
        if (webViewUI.f118572w != null) {
            webViewUI.hideVKB();
            webViewUI.f118572w.mo68189b(-2);
        }
        C13849g gVar = this.f23572e.f39001d;
        String str = this.f23573f.f38990c;
        gVar.mo10774a(str, this.f23573f.f38996i + ":ok", (Map<String, Object>) null);
        return C13598b0.f38549a;
    }
}
