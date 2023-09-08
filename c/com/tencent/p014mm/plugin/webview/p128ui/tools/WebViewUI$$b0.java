package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C43704h2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$b0 */
public class WebViewUI$$b0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118591d;

    public WebViewUI$$b0(WebViewUI webViewUI) {
        this.f118591d = webViewUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f118591d.f118577x1 = true;
        C44130p1.f119545i.mo68770a();
        C43704h2.C6037e.m5916a(this.f118591d.getCurrentURL(), 1);
        this.f118591d.finish();
    }
}
