package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import di3.C86312j;
import l31.C61212e;
import o31.C11345b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.MMWebViewUI */
public class MMWebViewUI extends WebViewUI {
    /* renamed from: R8 */
    public boolean mo68180R8() {
        return true;
    }

    /* renamed from: S7 */
    public boolean mo63702S7() {
        return getClass().equals(MMWebViewUI.class) && !getIntent().getBooleanExtra("disable_minimize", false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.WebViewUI);
    }
}
