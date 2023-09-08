package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdBonusSlideEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3 */
class AdLandingFloatJumpComp$3 extends IListener<SnsAdBonusSlideEvent> {

    /* renamed from: d */
    public final /* synthetic */ C94646j f273698d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingFloatJumpComp$3(C94646j jVar, C0125s sVar) {
        super(sVar);
        this.f273698d = jVar;
        this.__eventId = 100492765;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
        C94646j jVar = this.f273698d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        jVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onSlideEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        SnsAdBonusSlideEvent.C92565a aVar = ((SnsAdBonusSlideEvent) iEvent).f265108d;
        int i = aVar.f265109a;
        int i2 = aVar.f265111c;
        Log.m105918d("SnsAd.FloatJumpComp", "the onSlideEventCall is called, the current Y is " + i + "; the oldY is " + i2);
        if (i2 == 0) {
            jVar.f273866E = true;
        }
        jVar.f273871v.setTranslationY((float) (-i));
        if (Math.abs(i) >= jVar.f273865D && jVar.f273866E) {
            jVar.f273866E = false;
            jVar.f273864C++;
            jVar.mo130227G(false);
        }
        SnsMethodCalculate.markEndTimeMs("onSlideEventCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$3");
        return false;
    }
}
