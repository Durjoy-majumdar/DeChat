package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import androidx.lifecycle.C103769x;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t0 */
public final class C30429t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C103769x<Integer> f82071d;

    public C30429t0(C103769x<Integer> xVar) {
        this.f82071d = xVar;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$4");
        Log.m105918d("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "timeout called");
        this.f82071d.setValue(2);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$4");
    }
}
