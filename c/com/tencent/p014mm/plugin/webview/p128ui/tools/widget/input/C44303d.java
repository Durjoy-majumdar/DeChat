package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$h;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.d */
public class C44303d implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ WebViewRedesignInputFooter f120054a;

    public C44303d(WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f120054a = webViewRedesignInputFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        try {
            WebViewRedesignInputFooter webViewRedesignInputFooter = this.f120054a;
            if (webViewRedesignInputFooter.f120014w) {
                ((WebViewUI$$h) webViewRedesignInputFooter.f119999e).mo68341a(str);
            } else {
                webViewRedesignInputFooter.mo68993a(str);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        WebViewRedesignInputFooter.C44291g gVar;
        WebViewRedesignInputFooter webViewRedesignInputFooter = this.f120054a;
        if (!webViewRedesignInputFooter.f120014w || (gVar = webViewRedesignInputFooter.f119999e) == null) {
            MMEditText mMEditText = webViewRedesignInputFooter.f120006o;
            if (mMEditText != null) {
                mMEditText.mo104263r();
                return;
            }
            return;
        }
        ((WebViewUI$$h) gVar).mo68341a("[DELETE_EMOTION]");
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
