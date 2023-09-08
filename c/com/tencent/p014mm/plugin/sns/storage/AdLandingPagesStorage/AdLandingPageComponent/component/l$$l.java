package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$l */
public class l$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95136l f82069d;

    public l$$l(C95136l lVar) {
        this.f82069d = lVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$7");
        try {
            C95136l.m121013H(this.f82069d);
        } catch (Throwable unused) {
            Log.m105928w("AdLandingNewH5Comp", "there is something in wevView fix!");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$7");
    }
}
