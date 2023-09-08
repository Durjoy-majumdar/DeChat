package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.util.WebViewExtensionListener;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public class WebViewExtension {
    private static final String TAG = "WebViewExtension";

    public static int getHostByName(String str, List<String> list) {
        WebViewExtensionListener webViewExtensionListener = XWalkEnvironment.getWebViewExtensionListener();
        if (webViewExtensionListener != null) {
            Object onMiscCallBack = webViewExtensionListener.onMiscCallBack(ConstValue.EXTENSION_GET_HOST_NAME, str, list);
            if (onMiscCallBack instanceof Integer) {
                return ((Integer) onMiscCallBack).intValue();
            }
        }
        return 0;
    }

    public static Object onMiscCallBack(String str, Object... objArr) {
        WebViewExtensionListener webViewExtensionListener = XWalkEnvironment.getWebViewExtensionListener();
        if (webViewExtensionListener != null) {
            return webViewExtensionListener.onMiscCallBack(str, objArr);
        }
        return null;
    }
}
