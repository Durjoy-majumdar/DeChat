package com.tencent.xweb;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.util.XWebLog;

public class XWebWebViewClientExtensionInterceptor {
    public static final String TAG = "XWebWebViewClientExtensionInterceptor";
    private int mContentHeight = -1;
    private final IWebView mWebView;

    public static class InterceptResult {
        public boolean intercepted;
        public Object result;

        public InterceptResult(boolean z, Object obj) {
            this.intercepted = z;
            this.result = obj;
        }
    }

    public XWebWebViewClientExtensionInterceptor(IWebView iWebView) {
        this.mWebView = iWebView;
    }

    public InterceptResult interceptOnMiscCallback(String str, Bundle bundle) {
        int i;
        if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("onContentHeightChanged") && (i = bundle.getInt("height")) != this.mContentHeight) {
            this.mContentHeight = i;
            IWebView iWebView = this.mWebView;
            if (!(iWebView == null || iWebView.getWebViewCallbackClient() == null)) {
                XWebLog.m21911i(TAG, "onContentHeightChanged, height:" + i);
                this.mWebView.getWebViewCallbackClient().onContentHeightChanged(i);
                return new InterceptResult(true, (Object) null);
            }
        }
        return new InterceptResult(false, (Object) null);
    }
}
