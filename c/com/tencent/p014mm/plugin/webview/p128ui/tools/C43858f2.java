package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.f2 */
public class C43858f2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118775d;

    public C43858f2(WebViewUI webViewUI) {
        this.f118775d = webViewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMWebView mMWebView = this.f118775d.f118523f;
        if (mMWebView != null && mMWebView.canGoForward()) {
            this.f118775d.f118523f.goForward();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
