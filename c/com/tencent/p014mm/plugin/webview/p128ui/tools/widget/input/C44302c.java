package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6425e3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.c */
public class C44302c implements C77382c.C77383a {

    /* renamed from: d */
    public final /* synthetic */ WebViewRedesignInputFooter f120053d;

    public C44302c(WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f120053d = webViewRedesignInputFooter;
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        WebViewRedesignInputFooter webViewRedesignInputFooter = this.f120053d;
        WebViewRedesignInputFooter.C44292h hVar = webViewRedesignInputFooter.f119998d;
        if (hVar != null) {
            String obj = webViewRedesignInputFooter.f120006o.getText().toString();
            Log.m105925i("MicroMsg.WebViewUI", "keyboard onTextSend, text = %s", obj);
            WebViewUI webViewUI = ((WebViewUI$$g) hVar).f118600a;
            C43522y yVar = webViewUI.f118513b1;
            if (yVar == null) {
                Log.m105924i("MicroMsg.WebViewUI", "controller == null");
            } else {
                C6425e3.f23429d.mo7433e(yVar.mo67720g0(), obj, false);
            }
            if (webViewUI.f118460F != null) {
                Log.m105924i("MicroMsg.WebViewUI", "keyboard hide onWebPlusKeyBoardTextSent");
                webViewUI.f118460F.mo68994b();
            }
        }
        WebViewRedesignInputFooter webViewRedesignInputFooter2 = this.f120053d;
        webViewRedesignInputFooter2.f120006o.clearComposingText();
        webViewRedesignInputFooter2.f120006o.setText("");
    }
}
