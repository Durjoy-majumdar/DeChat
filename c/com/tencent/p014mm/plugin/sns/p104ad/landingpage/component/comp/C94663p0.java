package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import a14.C53916l;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97621e;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import nb0.C88913c;
import nb0.C88914d;
import tq2.C101915a;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.p0 */
public final class C94663p0 extends C87413o implements C32226l<AudioPlayerEvent.C17674a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ AdLandingMusicComponent f273930d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<Boolean> f273931e;

    /* renamed from: f */
    public final /* synthetic */ C0125s f273932f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94663p0(AdLandingMusicComponent adLandingMusicComponent, C53916l<? super Boolean> lVar, C0125s sVar) {
        super(1);
        this.f273930d = adLandingMusicComponent;
        this.f273931e = lVar;
        this.f273932f = sVar;
    }

    public Object invoke(Object obj) {
        Boolean bool;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        AudioPlayerEvent.C17674a aVar = (AudioPlayerEvent.C17674a) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        C87412m.m108594g(aVar, "data");
        int i = aVar.f48074a;
        if (i == 4) {
            Log.m105920e("MicroMsg.Sns.AdLandingMusicComponent", "music comp error =  " + aVar.f48079f + "  " + aVar.f48080g);
            C53916l<Boolean> lVar = this.f273931e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            C97621e E = AdLandingMusicComponent.m119662E(this.f273930d);
            if (E != null) {
                E.mo136889a();
            }
            bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        } else if (i != 7) {
            bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        } else {
            Log.m105924i("MicroMsg.Sns.AdLandingMusicComponent", "music comp dur =  " + aVar.f48075b);
            AdLandingMusicComponent adLandingMusicComponent = this.f273930d;
            SnsMethodCalculate.markStartTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            adLandingMusicComponent.f273748S = (int) aVar.f48075b;
            SnsMethodCalculate.markEndTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            AdLandingMusicComponent adLandingMusicComponent2 = this.f273930d;
            SnsMethodCalculate.markStartTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            adLandingMusicComponent2.f273732B = true;
            SnsMethodCalculate.markEndTimeMs("access$setPrepared$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            SeekBarView P = this.f273930d.mo130168P();
            C94656l0 l0Var = new C94656l0(this.f273930d);
            C88914d d = C88913c.m111006d(AdLandingMusicComponent.m119664H(this.f273930d));
            P.mo130421c(l0Var, d != null ? (float) d.f256442a : 0.0f, C57333m0.f164238d);
            this.f273930d.mo130168P().setProgress(0.0f);
            SeekBarView P2 = this.f273930d.mo130168P();
            C94661o0 o0Var = new C94661o0(this.f273930d, this.f273932f);
            P2.getClass();
            SnsMethodCalculate.markStartTimeMs("initDragControl", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            P2.f274196f.setOnTouchListener(new C101915a(P2, o0Var));
            SnsMethodCalculate.markEndTimeMs("initDragControl", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            C53916l<Boolean> lVar2 = this.f273931e;
            Result.Companion companion2 = Result.Companion;
            Boolean bool2 = Boolean.TRUE;
            lVar2.resumeWith(Result.m168114constructorimpl(bool2));
            this.f273930d.mo130165M().setShowLoading(false);
            this.f273930d.mo130166N().mo142084b();
            C97621e E2 = AdLandingMusicComponent.m119662E(this.f273930d);
            if (E2 != null) {
                AdLandingMusicComponent adLandingMusicComponent3 = this.f273930d;
                adLandingMusicComponent3.getClass();
                SnsMethodCalculate.markStartTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                C97621e.C97622a aVar2 = adLandingMusicComponent3.f273741K;
                SnsMethodCalculate.markEndTimeMs("getAudioRespond", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
                E2.mo136891c(aVar2);
            }
            AdLandingMusicComponent adLandingMusicComponent4 = this.f273930d;
            SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i2 = adLandingMusicComponent4.f273745P;
            SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            adLandingMusicComponent4.f273745P = i2 + 1;
            SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
            bool = bool2;
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1");
        return bool;
    }
}
