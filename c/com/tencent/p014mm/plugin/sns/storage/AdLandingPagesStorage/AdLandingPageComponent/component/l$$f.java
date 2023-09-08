package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C30610e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$f */
public class l$$f implements Runnable {
    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$1");
        try {
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            MMWebView mMWebView = C95136l.f276103E;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            if (mMWebView == null) {
                MMWebView a = C30610e0.C30611a.f82425a.mo57505a(MMApplicationContext.getContext());
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                C95136l.f276103E = a;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingNewH5Comp", "error with " + th.getMessage());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("final sWebViewInstance= ");
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        MMWebView mMWebView2 = C95136l.f276103E;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        sb.append(mMWebView2);
        Log.m105924i("AdLandingNewH5Comp", sb.toString());
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$1");
    }
}
