package aa3;

import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;

/* renamed from: aa3.a */
public final class C39531a extends C43519u {
    /* renamed from: d */
    public void mo62156d(WebView webView, String str) {
        WebSettings settings;
        if (webView != null && (settings = webView.getSettings()) != null) {
            settings.setDisabledActionModeMenuItems(0);
        }
    }
}
