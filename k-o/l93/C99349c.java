package l93;

import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.WebViewBagBgView;

/* renamed from: l93.c */
public class C99349c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewBagBgView f291338d;

    public C99349c(WebViewBagBgView webViewBagBgView) {
        this.f291338d = webViewBagBgView;
    }

    public void run() {
        WebViewBagBgView webViewBagBgView = this.f291338d;
        webViewBagBgView.f283083q = true;
        webViewBagBgView.invalidate();
    }
}
