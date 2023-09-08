package com.tencent.p014mm.plugin.webview.luggage;

import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.WebViewSearchContentInputFooter;

/* renamed from: com.tencent.mm.plugin.webview.luggage.r */
public class C43671r implements WebViewSearchContentInputFooter.C44223g {

    /* renamed from: a */
    public final /* synthetic */ C43658n f118040a;

    public C43671r(C43658n nVar) {
        this.f118040a = nVar;
    }

    /* renamed from: a */
    public void mo67983a(WebViewSearchContentInputFooter webViewSearchContentInputFooter, String str) {
        if (webViewSearchContentInputFooter.getVisibility() == 0) {
            mo67985c(webViewSearchContentInputFooter);
        }
    }

    /* renamed from: b */
    public void mo67984b(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f118040a.mo67940s(0);
        this.f118040a.f117947q.clearMatches();
        this.f118040a.f117954x.f119842e.setText("");
    }

    /* renamed from: c */
    public void mo67985c(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f118040a.f117947q.clearMatches();
        webViewSearchContentInputFooter.mo68917c();
        this.f118040a.f117954x.mo68918d(0, 0, true);
        this.f118040a.f117947q.findAllAsync(webViewSearchContentInputFooter.getSearchContent());
    }

    /* renamed from: d */
    public void mo67986d(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f118040a.f117947q.findNext(false);
    }

    /* renamed from: e */
    public void mo67987e(WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f118040a.f117947q.findNext(true);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    public void onShow() {
    }
}
