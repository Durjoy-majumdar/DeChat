package da3;

import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewSmileyPanel;

/* renamed from: da3.h */
public class C45321h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewSmileyPanel f122777d;

    public C45321h(WebViewSmileyPanel webViewSmileyPanel) {
        this.f122777d = webViewSmileyPanel;
    }

    public void run() {
        WebViewSmileyPanel webViewSmileyPanel = this.f122777d;
        webViewSmileyPanel.onPageSelected(webViewSmileyPanel.f120040i.getCurrentItem());
    }
}
