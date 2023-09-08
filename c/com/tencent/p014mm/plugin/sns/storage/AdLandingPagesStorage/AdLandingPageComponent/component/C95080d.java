package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d */
public class C95080d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdLandingFloatBarCompWrapper.C950301 f275972d;

    public C95080d(AdLandingFloatBarCompWrapper.C950301 r1) {
        this.f275972d = r1;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1$1");
        if (!AdLandingFloatBarCompWrapper.m120780E(AdLandingFloatBarCompWrapper.this)) {
            AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = AdLandingFloatBarCompWrapper.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            adLandingFloatBarCompWrapper.mo131513X();
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            AdLandingFloatBarCompWrapper.this.mo131502J(true, true);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1$1");
    }
}
