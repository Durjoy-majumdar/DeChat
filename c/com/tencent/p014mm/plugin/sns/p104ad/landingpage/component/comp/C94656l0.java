package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import nb0.C88913c;
import nb0.C88914d;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l0 */
public final class C94656l0 extends C87413o implements C32224a<Float> {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273918d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94656l0(AdLandingMusicComponent adLandingMusicComponent) {
        super(0);
        this.f273918d = adLandingMusicComponent;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$1");
        C88914d d = C88913c.m111006d(AdLandingMusicComponent.m119664H(this.f273918d));
        int i = d != null ? d.f256443b : 0;
        AdLandingMusicComponent adLandingMusicComponent = this.f273918d;
        SnsMethodCalculate.markStartTimeMs("access$getMaxPlayTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        int i2 = adLandingMusicComponent.f273747R;
        SnsMethodCalculate.markEndTimeMs("access$getMaxPlayTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        int max = Math.max(i2, i);
        SnsMethodCalculate.markStartTimeMs("access$setMaxPlayTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        adLandingMusicComponent.f273747R = max;
        SnsMethodCalculate.markEndTimeMs("access$setMaxPlayTime$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        Float valueOf = Float.valueOf((float) i);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$1");
        return valueOf;
    }
}
