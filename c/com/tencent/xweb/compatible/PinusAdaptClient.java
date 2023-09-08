package com.tencent.xweb.compatible;

import com.tencent.xweb.XWebExtendInterface;
import com.tencent.xweb.pinus.sdk.WebView;
import com.tencent.xweb.util.XWebLog;

public class PinusAdaptClient {
    private static final String TAG = "PinusAdaptClient";
    public static final int XWEB_PINUS = 1;
    public WebView psWebview;
    public int xwebType = -1;

    public void init(XWebExtendInterface xWebExtendInterface) {
        if (xWebExtendInterface instanceof WebView) {
            initPSWebView((WebView) xWebExtendInterface);
        } else {
            XWebLog.m21909e(TAG, "PinusAdaptClient constructor error");
        }
        if (this.xwebType == -1) {
            XWebLog.m21909e(TAG, "xwebType = -1, super init not call view:" + xWebExtendInterface);
            throw new RuntimeException("PinusAdaptClient init error royle");
        }
    }

    public void initPSWebView(WebView webView) {
        this.xwebType = 1;
        this.psWebview = webView;
    }
}
