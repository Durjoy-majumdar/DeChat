package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdVideoBonusSceneEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2 */
class AdLandingFloatJumpComp$2 extends IListener<SnsAdVideoBonusSceneEvent> {

    /* renamed from: d */
    public final /* synthetic */ C94646j f273697d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingFloatJumpComp$2(C94646j jVar, C0125s sVar) {
        super(sVar);
        this.f273697d = jVar;
        this.__eventId = 1309014301;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
        SnsAdVideoBonusSceneEvent snsAdVideoBonusSceneEvent = (SnsAdVideoBonusSceneEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
        try {
            C94646j.m119766E(this.f273697d, snsAdVideoBonusSceneEvent);
        } catch (Throwable unused) {
            Log.m105928w("SnsAd.FloatJumpComp", "onEventCall called has wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFloatJumpComp$2");
        return true;
    }
}
