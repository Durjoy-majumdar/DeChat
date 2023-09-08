package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.webkit.WebSettings;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.c2 */
public class C43846c2 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WebViewUI f118758d;

    public C43846c2(WebViewUI webViewUI) {
        this.f118758d = webViewUI;
    }

    public boolean onTimerExpired() {
        WebViewUI webViewUI = this.f118758d;
        WebSettings.RenderPriority renderPriority = WebViewUI.f118442D2;
        webViewUI.mo68247O7();
        return false;
    }
}
