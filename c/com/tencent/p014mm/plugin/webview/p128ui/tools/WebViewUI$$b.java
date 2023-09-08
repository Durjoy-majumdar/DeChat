package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import we0.C53156a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$b */
public class WebViewUI$$b implements C53156a.C38082b {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118590d;

    public WebViewUI$$b(WebViewUI webViewUI) {
        this.f118590d = webViewUI;
    }

    /* renamed from: a */
    public void mo12953a(C53156a.C53157a aVar, C53156a.C53157a aVar2) {
        Log.m105924i("MicroMsg.WebViewUI", "OrientationListener lastOrientation:" + aVar.name() + "; newOrientation:" + aVar2.name());
        WebViewUI webViewUI = this.f118590d;
        webViewUI.f118447A = 4;
        webViewUI.setMMOrientation();
        C53156a aVar3 = this.f118590d.f118456D;
        if (aVar3 != null) {
            aVar3.disable();
        }
    }
}
