package com.tencent.xweb;

import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.WebViewWrapperFactory;

public class XWebProfileManager {
    public static void forceEnableFrameCostProfile(boolean z) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null && webViewProvider.getProfilerController() != null) {
            webViewProvider.getProfilerController().forceEnableFrameCostProfile(z);
        }
    }

    public static void forceFlushCategory(String str) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null && webViewProvider.getProfilerController() != null) {
            webViewProvider.getProfilerController().forceFlushCategory(str);
        }
    }

    public static void initProfile() {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null && webViewProvider.getProfilerController() != null) {
            webViewProvider.getProfilerController().initProfile();
        }
    }

    public static void setAllKindsFpsProfileEnable(boolean z) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider != null && webViewProvider.getProfilerController() != null) {
            webViewProvider.getProfilerController().setAllKindsFpsProfileEnable(z);
        }
    }

    public static boolean setProfileResultCallback(String str, IProfileResultCallback iProfileResultCallback) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
        if (webViewProvider == null || webViewProvider.getProfilerController() == null) {
            return false;
        }
        return webViewProvider.getProfilerController().setProfileResultCallback(str, iProfileResultCallback);
    }
}
