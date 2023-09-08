package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.p136ui.KeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.o0 */
public final class C44352o0 implements KeyboardLinearLayout.C44683b {

    /* renamed from: a */
    public final /* synthetic */ WebViewKeyboardLinearLayout f120207a;

    /* renamed from: b */
    public final /* synthetic */ C44341n0 f120208b;

    public C44352o0(WebViewKeyboardLinearLayout webViewKeyboardLinearLayout, C44341n0 n0Var) {
        this.f120207a = webViewKeyboardLinearLayout;
        this.f120208b = n0Var;
    }

    /* renamed from: a */
    public final void mo67991a(int i) {
        Log.m105924i("MicroMsg.MMWebViewWithController", "onKeyBoardStateChange, state = " + i);
        if (i == -3) {
            int keyBoardHeight = this.f120207a.getKeyBoardHeight();
            if (keyBoardHeight > 0) {
                this.f120208b.mo69078B(keyBoardHeight);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.MMWebViewWithController", "keyboard kbListener onKeyBoardStateChange");
        this.f120208b.mo69078B(0);
    }
}
