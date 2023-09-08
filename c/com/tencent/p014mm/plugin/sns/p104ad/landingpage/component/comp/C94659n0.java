package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import nb0.C88913c;
import nb0.C88914d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n0 */
public final class C94659n0 extends C87413o implements C32226l<AudioPlayerEvent.C17674a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273923d;

    /* renamed from: e */
    public final /* synthetic */ C59741c0 f273924e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f273925f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94659n0(AdLandingMusicComponent adLandingMusicComponent, C59741c0 c0Var, C32224a<C13598b0> aVar) {
        super(1);
        this.f273923d = adLandingMusicComponent;
        this.f273924e = c0Var;
        this.f273925f = aVar;
    }

    public Object invoke(Object obj) {
        Boolean bool;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        AudioPlayerEvent.C17674a aVar = (AudioPlayerEvent.C17674a) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        C87412m.m108594g(aVar, "data");
        if (aVar.f48074a == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("seek end! ");
            C88914d d = C88913c.m111006d(AdLandingMusicComponent.m119664H(this.f273923d));
            sb.append(d != null ? d.f256446e : 0);
            sb.append(' ');
            sb.append(this.f273924e.f170634d);
            Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", sb.toString());
            this.f273925f.invoke();
            bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        } else {
            bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$3$1");
        return bool;
    }
}
