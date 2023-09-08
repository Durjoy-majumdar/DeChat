package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.l2 */
public class C44044l2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f119324d;

    /* renamed from: e */
    public final /* synthetic */ WebViewUIStyleHelper f119325e;

    public C44044l2(WebViewUIStyleHelper webViewUIStyleHelper, Bundle bundle) {
        this.f119325e = webViewUIStyleHelper;
        this.f119324d = bundle;
    }

    public void run() {
        WebViewUI webViewUI = this.f119325e.f118667d;
        if (webViewUI != null && !webViewUI.isFinishing()) {
            boolean z = this.f119324d.getBoolean("key_current_info_show");
            Map<String, Bundle> map = WebViewUIStyleHelper.f118663r;
            WebViewUIStyleHelper webViewUIStyleHelper = this.f119325e;
            Bundle bundle = (Bundle) ((HashMap) map).get(webViewUIStyleHelper.mo68373e(webViewUIStyleHelper.f118670g));
            if (bundle != null) {
                bundle.putBoolean("key_current_info_show", z);
            }
            if (z || this.f119325e.mo68376h(bundle)) {
                this.f119325e.mo68382o();
            } else {
                this.f119325e.mo68374f();
            }
        }
    }
}
