package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdQRBtnDownloadEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3 */
class AdLandingPageQRCodeBtnComp$3 extends IListener<SnsAdQRBtnDownloadEvent> {

    /* renamed from: d */
    public final /* synthetic */ C95206p1 f275842d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingPageQRCodeBtnComp$3(C95206p1 p1Var, C0125s sVar) {
        super(sVar);
        this.f275842d = p1Var;
        this.__eventId = 1862118658;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
        SnsAdQRBtnDownloadEvent snsAdQRBtnDownloadEvent = (SnsAdQRBtnDownloadEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
        try {
            this.f275842d.mo131710c0(snsAdQRBtnDownloadEvent);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
        return false;
    }
}
