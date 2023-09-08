package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.m1 */
public class C44340m1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewSearchContentInputFooter f120163d;

    public C44340m1(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f120163d = webViewSearchContentInputFooter;
    }

    public void run() {
        MMActivity.showVKB((Activity) this.f120163d.getContext());
    }
}
