package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n */
public class C95189n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95136l f276242d;

    public C95189n(C95136l lVar) {
        this.f276242d = lVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$13");
        if (C95136l.m121017M(this.f276242d) != null && C95136l.m121017M(this.f276242d).isShowing()) {
            Log.m105924i("AdLandingNewH5Comp", "hideLoading");
            C95136l.m121017M(this.f276242d).dismiss();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$13");
    }
}
