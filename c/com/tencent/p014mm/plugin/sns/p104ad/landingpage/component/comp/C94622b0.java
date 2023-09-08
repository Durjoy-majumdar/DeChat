package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nb0.C88912b;
import nb0.C88913c;
import so2.C101687p;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 */
public final class C94622b0 extends C87413o implements C32226l<AudioPlayerEvent.C17674a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273812d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94622b0(AdLandingMusicComponent adLandingMusicComponent) {
        super(1);
        this.f273812d = adLandingMusicComponent;
    }

    public Object invoke(Object obj) {
        String str;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        AudioPlayerEvent.C17674a aVar = (AudioPlayerEvent.C17674a) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        if (aVar.f48074a == 4) {
            Log.m105920e("MicroMsg.Sns.AdLandingMusicComponent", "error occur! " + aVar.f48080g + ' ' + aVar.f48079f);
            if (this.f273812d.mo130171U()) {
                AdLandingMusicComponent adLandingMusicComponent = this.f273812d;
                adLandingMusicComponent.getClass();
                SnsMethodCalculate.markStartTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = adLandingMusicComponent.f273740J;
                SnsMethodCalculate.markEndTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                if (snsAdNativeLandingPagesUI != null) {
                    snsAdNativeLandingPagesUI.f277556X1 = false;
                }
            }
            this.f273812d.mo130168P().setRefreshing(false);
            this.f273812d.mo130168P().setProgress(0.0f);
            this.f273812d.mo130165M().setShowLoading(false);
            this.f273812d.mo130165M().setState(0);
            AdLandingMusicComponent adLandingMusicComponent2 = this.f273812d;
            SnsMethodCalculate.markStartTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            adLandingMusicComponent2.f273732B = false;
            SnsMethodCalculate.markEndTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        }
        if (aVar.f48074a == 5) {
            Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "completed");
            AdLandingMusicComponent adLandingMusicComponent3 = this.f273812d;
            SnsMethodCalculate.markStartTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i = adLandingMusicComponent3.f273746Q;
            SnsMethodCalculate.markEndTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            SnsMethodCalculate.markStartTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            adLandingMusicComponent3.f273746Q = i + 1;
            SnsMethodCalculate.markEndTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            C88912b bVar = new C88912b();
            AdLandingMusicComponent adLandingMusicComponent4 = this.f273812d;
            bVar.f256416a = AdLandingMusicComponent.m119664H(adLandingMusicComponent4);
            bVar.f256422g = true;
            SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            C101687p pVar = adLandingMusicComponent4.f273750t;
            SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            if (pVar == null || (str = pVar.f297684A) == null) {
                str = "";
            }
            bVar.f256417b = str;
            bVar.f256423h = false;
            C88913c.m111010h(bVar);
        }
        Boolean bool = Boolean.FALSE;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initAudioListener$1");
        return bool;
    }
}
