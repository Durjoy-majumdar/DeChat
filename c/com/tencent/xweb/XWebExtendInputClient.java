package com.tencent.xweb;

import android.os.ResultReceiver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import com.tencent.xweb.compatible.PinusAdaptClient;
import com.tencent.xweb.pinus.sdk.WebView;

public class XWebExtendInputClient extends PinusAdaptClient {
    private static final String TAG = "XWebExtendInputClient";

    public XWebExtendInputClient(XWebExtendInterface xWebExtendInterface) {
        super.init(xWebExtendInterface);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (this.xwebType == 1) {
            this.psWebview.evaluateJavascript(str, valueCallback);
        }
    }

    public int getToolBarHeight(int i) {
        return 0;
    }

    public void initPSWebView(WebView webView) {
        super.initPSWebView(webView);
    }

    public void onExtraInfoChanged(String str) {
    }

    public boolean onHideKeyboard(String str, InputConnection inputConnection) {
        return false;
    }

    public void onKeyboardHeightChanged(boolean z, int i, boolean z2) {
        if (this.xwebType == 1) {
            this.psWebview.onExtendInputKeyboardHeightChanged(z, i, z2);
        }
    }

    public boolean onShowKeyboard(String str, String str2, InputConnection inputConnection, ResultReceiver resultReceiver) {
        return false;
    }

    public boolean onShowKeyboardConfig(String str, int i, int i2, String str2, int i3, int i4, EditorInfo editorInfo) {
        return false;
    }

    public boolean performEditorAction(int i) {
        return true;
    }
}
