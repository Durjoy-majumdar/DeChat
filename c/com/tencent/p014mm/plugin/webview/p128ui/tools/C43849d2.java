package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.webkit.WebSettings;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.d2 */
public class C43849d2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118761d;

    public C43849d2(WebViewUI webViewUI) {
        this.f118761d = webViewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$43", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WebViewUI webViewUI = this.f118761d;
        WebSettings.RenderPriority renderPriority = WebViewUI.f118442D2;
        webViewUI.mo68247O7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$43", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
