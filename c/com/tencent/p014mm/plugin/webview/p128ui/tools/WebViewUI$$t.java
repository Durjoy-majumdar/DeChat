package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.TmplWebViewToolUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$t */
public class WebViewUI$$t implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118655d;

    public WebViewUI$$t(WebViewUI webViewUI) {
        this.f118655d = webViewUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$34", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (this.f118655d.f118549o2 == null || (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger())) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$34", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        ((TmplWebViewToolUI.C40775b) this.f118655d.f118549o2).onLongClick(view);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$34", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
