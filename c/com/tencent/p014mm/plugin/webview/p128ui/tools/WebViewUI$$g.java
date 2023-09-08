package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6425e3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$g */
public class WebViewUI$$g implements WebViewRedesignInputFooter.C44292h {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118600a;

    public WebViewUI$$g(WebViewUI webViewUI) {
        this.f118600a = webViewUI;
    }

    /* renamed from: a */
    public void mo68333a(String str) {
        Log.m105925i("MicroMsg.WebViewUI", "keyboard onTextCancel, text = %s", str);
        C43522y yVar = this.f118600a.f118513b1;
        if (yVar == null) {
            Log.m105924i("MicroMsg.WebViewUI", "controller == null");
        } else {
            C6425e3.f23429d.mo7433e(yVar.mo67720g0(), str, true);
        }
    }
}
