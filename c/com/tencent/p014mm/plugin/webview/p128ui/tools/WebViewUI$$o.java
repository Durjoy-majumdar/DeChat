package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$o */
public class WebViewUI$$o implements View.OnLongClickListener {
    public WebViewUI$$o(WebViewUI webViewUI) {
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
