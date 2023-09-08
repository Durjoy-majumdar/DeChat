package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.model.gdpr.p795ui.C40351a;
import com.tencent.p014mm.model.gdpr.p795ui.MPGdprPolicyUI;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.xweb.WebView;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.j0 */
public class C44306j0 extends C44262h0 {

    /* renamed from: e */
    public final C44389z f120068e;

    public C44306j0(MMWebView mMWebView, C44389z zVar) {
        super((MMWebViewWithJsApi) mMWebView);
        this.f120068e = zVar;
    }

    public void onReceivedTitle(WebView webView, String str) {
        C44389z zVar = this.f120068e;
        if (zVar != null) {
            MMWebView mMWebView = (MMWebView) webView;
            MPGdprPolicyUI.C40349b bVar = (MPGdprPolicyUI.C40349b) zVar;
            MPGdprPolicyUI.this.runOnUiThread(new C40351a(bVar, str));
            return;
        }
        super.onReceivedTitle(webView, str);
    }
}
