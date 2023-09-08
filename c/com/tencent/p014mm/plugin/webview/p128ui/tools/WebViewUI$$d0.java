package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$d0 */
public class WebViewUI$$d0 implements C75018a.C75024d {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118595a;

    public WebViewUI$$d0(WebViewUI webViewUI) {
        this.f118595a = webViewUI;
    }

    /* renamed from: a */
    public void mo7429a() {
        try {
            this.f118595a.f118511a1.favEditTag();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewUI", "favorite edittag fail, ex = " + e.getMessage());
        }
    }
}
