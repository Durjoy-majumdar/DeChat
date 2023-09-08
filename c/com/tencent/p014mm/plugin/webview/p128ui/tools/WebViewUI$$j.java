package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.webkit.WebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j */
public class WebViewUI$$j implements WebView.FindListener {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118612a;

    public WebViewUI$$j(WebViewUI webViewUI) {
        this.f118612a = webViewUI;
    }

    public void onFindResultReceived(int i, int i2, boolean z) {
        int i3 = i2;
        boolean z2 = z;
        if (z2) {
            WebViewUI webViewUI = this.f118612a;
            if (!webViewUI.f118466I && !Util.isNullOrNil(webViewUI.f118464H.getSearchContent())) {
                if (i3 == 0) {
                    C115669n.INSTANCE.idkeyStat(480, 3, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(480, 2, 1, false);
                }
                this.f118612a.f118466I = true;
            }
        }
        this.f118612a.f118464H.mo68918d(i, i3, z2);
    }
}
