package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.view.WindowInsets;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C76866m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.w0 */
public class C72627w0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewKeyboardLinearLayout f211270d;

    public C72627w0(WebViewKeyboardLinearLayout webViewKeyboardLinearLayout) {
        this.f211270d = webViewKeyboardLinearLayout;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z = false;
        Log.m105925i("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets %s, %s , %s ", windowInsets.getInsets(WindowInsets.Type.ime()), Boolean.valueOf(windowInsets.isVisible(WindowInsets.Type.ime())), windowInsets);
        boolean isVisible = windowInsets.isVisible(WindowInsets.Type.ime());
        if (C76866m.m92677f()) {
            if (isVisible || windowInsets.isVisible(256)) {
                z = true;
            }
            isVisible = z;
        }
        if (isVisible) {
            WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f211270d;
            webViewKeyboardLinearLayout.f118384p = webViewKeyboardLinearLayout.getRootWindowInsets().getSystemWindowInsetBottom();
            this.f211270d.mo68189b(-3);
            Log.m105928w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!!mKBHeight: " + this.f211270d.f118384p);
        } else {
            this.f211270d.mo68189b(-2);
            Log.m105928w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!!mKBHeight: " + this.f211270d.f118384p);
        }
        return windowInsets;
    }
}
