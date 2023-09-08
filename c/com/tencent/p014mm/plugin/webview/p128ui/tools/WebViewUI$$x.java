package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import l31.C61212e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$x */
public class WebViewUI$$x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118659d;

    public WebViewUI$$x(WebViewUI webViewUI) {
        this.f118659d = webViewUI;
    }

    public void run() {
        Class cls = C61212e.class;
        View findViewById = this.f118659d.findViewById(C0966R.C0970id.f5422ep);
        if (findViewById != null) {
            ((C61212e) C86312j.m106911c(cls)).o30(findViewById, "split_view_icon");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById, 40, 26430);
            ((C61212e) C86312j.m106911c(cls)).mo86176qF(findViewById, "split_view_scene_info", this.f118659d.getCurrentURL());
        }
    }
}
