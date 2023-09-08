package com.tencent.p014mm.plugin.webview.p128ui.tools;

import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.a2 */
public class C43832a2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f118702d;

    /* renamed from: e */
    public final /* synthetic */ int f118703e;

    /* renamed from: f */
    public final /* synthetic */ WebViewUI f118704f;

    public C43832a2(WebViewUI webViewUI, int i, int i2) {
        this.f118704f = webViewUI;
        this.f118702d = i;
        this.f118703e = i2;
    }

    public void run() {
        C48590l lVar = this.f118704f.f118508Z;
        if (lVar != null) {
            lVar.mo73215L(this.f118702d, this.f118703e);
        }
        C44199u0 u0Var = this.f118704f.f118557r;
        if (u0Var != null) {
            u0Var.f119742g = false;
            u0Var.mo68844b();
        }
    }
}
