package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$e */
public class WebViewUI$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118596d;

    public WebViewUI$$e(WebViewUI webViewUI) {
        this.f118596d = webViewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f118596d.mo68318w9();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
