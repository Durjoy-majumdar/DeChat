package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.AccessibilityUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.CookieManager;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$c */
public class WebViewUI$$c implements Runnable {
    public WebViewUI$$c(WebViewUI webViewUI) {
    }

    public void run() {
        if (WebViewUI.f118443E2 <= 0) {
            AccessibilityUtil.recoverAccessibilityEnable();
        }
        try {
            Log.m105924i("MicroMsg.WebViewUI", "now force sync the cookie between ram and db");
            CookieManager.getInstance().flush();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewUI", "syncCookie, error:%s", e);
        }
    }
}
