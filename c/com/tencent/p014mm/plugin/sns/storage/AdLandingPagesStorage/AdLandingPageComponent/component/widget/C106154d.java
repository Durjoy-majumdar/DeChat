package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.d */
public class C106154d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ double f316203d;

    /* renamed from: e */
    public final /* synthetic */ AdlandingSightPlayController f316204e;

    public C106154d(AdlandingSightPlayController adlandingSightPlayController, double d) {
        this.f316204e = adlandingSightPlayController;
        this.f316203d = d;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$3");
        Log.m105925i("MicroMsg.SightPlayController", "SeekToFrame   %f  %s", Double.valueOf(this.f316203d), Util.getStack().toString());
        AdlandingSightPlayController.m20429h(this.f316204e, this.f316203d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$3");
    }
}
