package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C43704h2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$c0 */
public class WebViewUI$$c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118592d;

    public WebViewUI$$c0(WebViewUI webViewUI) {
        this.f118592d = webViewUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f118592d.f118577x1 = true;
        C44130p1.f119545i.mo68770a();
        C43704h2.C6037e.m5916a(this.f118592d.getCurrentURL(), 1);
        this.f118592d.finish();
    }
}
