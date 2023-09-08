package com.tencent.p014mm.plugin.webview.p128ui.tools;

import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.b2 */
public class C43835b2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f118707d;

    /* renamed from: e */
    public final /* synthetic */ int f118708e;

    /* renamed from: f */
    public final /* synthetic */ WebViewUI f118709f;

    public C43835b2(WebViewUI webViewUI, int i, int i2) {
        this.f118709f = webViewUI;
        this.f118707d = i;
        this.f118708e = i2;
    }

    public void run() {
        C48590l lVar = this.f118709f.f118508Z;
        if (lVar != null) {
            lVar.mo73215L(this.f118707d, this.f118708e);
        }
        WebViewUI webViewUI = this.f118709f;
        if (webViewUI.f118557r != null && webViewUI.mo68256S8()) {
            C44199u0 u0Var = this.f118709f.f118557r;
            u0Var.f119742g = true;
            u0Var.mo68845c();
        }
    }
}
