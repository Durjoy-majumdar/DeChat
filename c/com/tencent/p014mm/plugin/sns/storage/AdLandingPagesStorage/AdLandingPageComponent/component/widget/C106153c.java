package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c */
public class C106153c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f316201d;

    /* renamed from: e */
    public final /* synthetic */ AdlandingSightPlayController f316202e;

    public C106153c(AdlandingSightPlayController adlandingSightPlayController, int i) {
        this.f316202e = adlandingSightPlayController;
        this.f316201d = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$2");
        long currentTimeMillis = System.currentTimeMillis();
        SightVideoJNI.freeObj(this.f316201d);
        Log.m105919d("MicroMsg.SightPlayController", "#0x%x tick: do clear video %d, use %d ms", Integer.valueOf(this.f316202e.hashCode()), Integer.valueOf(this.f316201d), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$2");
    }
}
