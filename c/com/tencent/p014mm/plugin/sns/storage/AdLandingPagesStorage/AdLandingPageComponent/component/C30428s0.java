package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C103769x;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s0 */
public final class C30428s0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C103769x<Integer> f82070d;

    public C30428s0(C103769x<Integer> xVar) {
        this.f82070d = xVar;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$3");
        Integer num = (Integer) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$3");
        Log.m105918d("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "enterAnimStatusData called " + num);
        this.f82070d.setValue(num);
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$3");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$3");
    }
}
