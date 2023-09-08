package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.accessibility.AccessibilityManager;
import d93.C45310h;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.x1 */
public class C44397x1 implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f120341a;

    public C44397x1(WebViewUI webViewUI) {
        this.f120341a = webViewUI;
    }

    public void onAccessibilityStateChanged(boolean z) {
        C45310h hVar = this.f120341a.f118491T0;
        if (hVar != null && hVar.mo70860c() != null && this.f120341a.f118491T0.mo70860c().mo69447f(413)) {
            HashMap hashMap = new HashMap();
            hashMap.put("isAccessibilityMode", Boolean.valueOf(z));
            this.f120341a.f118513b1.mo67720g0().mo8701f("onAccessibilityStateChange", hashMap);
        }
    }
}
