package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j0 */
public final class C94648j0 extends C87413o implements C32226l<Integer, Float> {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273877d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94648j0(AdLandingMusicComponent adLandingMusicComponent) {
        super(1);
        this.f273877d = adLandingMusicComponent;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initSmallViews$1");
        int intValue = ((Number) obj).intValue();
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initSmallViews$1");
        AdLandingMusicComponent adLandingMusicComponent = this.f273877d;
        SnsMethodCalculate.markStartTimeMs("access$convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        float K = adLandingMusicComponent.mo130164K(intValue);
        SnsMethodCalculate.markEndTimeMs("access$convertXmlPx", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        Float valueOf = Float.valueOf(K);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initSmallViews$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initSmallViews$1");
        return valueOf;
    }
}
