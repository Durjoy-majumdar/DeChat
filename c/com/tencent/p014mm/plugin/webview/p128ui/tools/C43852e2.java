package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.e2 */
public class C43852e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118765d;

    public C43852e2(WebViewUI webViewUI) {
        this.f118765d = webViewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMWebView mMWebView = this.f118765d.f118523f;
        if (mMWebView != null && mMWebView.canGoBack()) {
            this.f118765d.mo68246N8();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
