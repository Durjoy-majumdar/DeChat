package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import nb0.C88913c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o0 */
public final class C94661o0 extends C87413o implements C32227p<Float, C32224a<? extends C13598b0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273927d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f273928e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94661o0(AdLandingMusicComponent adLandingMusicComponent, C0125s sVar) {
        super(2);
        this.f273927d = adLandingMusicComponent;
        this.f273928e = sVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        float floatValue = ((Number) obj).floatValue();
        C32224a aVar = (C32224a) obj2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        C87412m.m108594g(aVar, "canRefresh");
        C59741c0 c0Var = new C59741c0();
        c0Var.f170634d = floatValue;
        AdLandingMusicComponent adLandingMusicComponent = this.f273927d;
        C0125s sVar = this.f273928e;
        String H = AdLandingMusicComponent.m119664H(adLandingMusicComponent);
        C94659n0 n0Var = new C94659n0(this.f273927d, c0Var, aVar);
        SnsMethodCalculate.markStartTimeMs("listenAudioEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        adLandingMusicComponent.mo130172V(sVar, H, true, n0Var);
        SnsMethodCalculate.markEndTimeMs("listenAudioEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        C88913c.m111009g(AdLandingMusicComponent.m119664H(this.f273927d), (int) c0Var.f170634d);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3");
        return b0Var;
    }
}
