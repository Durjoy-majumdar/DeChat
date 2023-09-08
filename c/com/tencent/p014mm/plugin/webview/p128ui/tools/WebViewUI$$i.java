package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.WebViewSearchContentInputFooter;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$i */
public class WebViewUI$$i implements WebViewSearchContentInputFooter.C44223g {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118603a;

    public WebViewUI$$i(WebViewUI webViewUI) {
        this.f118603a = webViewUI;
    }

    /* renamed from: a */
    public void mo67983a(WebViewSearchContentInputFooter webViewSearchContentInputFooter, String str) {
        if (webViewSearchContentInputFooter.getVisibility() == 0) {
            mo67985c(webViewSearchContentInputFooter);
        }
    }

    /* renamed from: b */
    public void mo67984b(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        WebViewUI.m47806H7(this.f118603a, 0);
        this.f118603a.f118523f.clearMatches();
        this.f118603a.f118464H.f119842e.setText("");
    }

    /* renamed from: c */
    public void mo67985c(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f118603a.f118523f.clearMatches();
        webViewSearchContentInputFooter.mo68917c();
        this.f118603a.f118464H.mo68918d(0, 0, true);
        WebViewUI webViewUI = this.f118603a;
        webViewUI.f118466I = false;
        webViewUI.f118523f.findAllAsync(webViewSearchContentInputFooter.getSearchContent());
    }

    /* renamed from: d */
    public void mo67986d(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        C115669n.INSTANCE.idkeyStat(480, 5, 1, false);
        this.f118603a.f118523f.findNext(false);
    }

    /* renamed from: e */
    public void mo67987e(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        C115669n.INSTANCE.idkeyStat(480, 4, 1, false);
        this.f118603a.f118523f.findNext(true);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        C115669n.INSTANCE.idkeyStat(480, 6, 1, false);
        return false;
    }

    public void onShow() {
    }
}
