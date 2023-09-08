package com.tencent.xweb;

import android.os.ResultReceiver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import com.tencent.xweb.compatible.PinusAdaptClient;
import com.tencent.xweb.pinus.sdk.WebView;

public class XWebExtendTextAreaClient extends PinusAdaptClient {
    private static final String TAG = "XWebExtendTextAreaClient";

    public XWebExtendTextAreaClient(XWebExtendInterface xWebExtendInterface) {
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

    public boolean onHideKeyboard(String str, InputConnection inputConnection) {
        return false;
    }

    public void onKeyboardHeightChanged(boolean z, int i, boolean z2) {
        if (this.xwebType == 1) {
            this.psWebview.onExtendTextAreaKeyboardHeightChanged(z, i, z2);
        }
    }

    public boolean onShowKeyboard(String str, InputConnection inputConnection, ResultReceiver resultReceiver) {
        return false;
    }

    public boolean onShowKeyboardConfig(int i, int i2, String str, int i3, int i4, EditorInfo editorInfo) {
        return false;
    }

    public boolean performEditorAction(int i) {
        return true;
    }
}
