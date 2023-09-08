package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y0 */
public class C95286y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageGetHBCoverBtnComp.C950432 f276557d;

    public C95286y0(AdLandingPageGetHBCoverBtnComp.C950432 r1) {
        this.f276557d = r1;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2$1");
        AdLandingPageGetHBCoverBtnComp adLandingPageGetHBCoverBtnComp = AdLandingPageGetHBCoverBtnComp.this;
        adLandingPageGetHBCoverBtnComp.f276027v.setText(adLandingPageGetHBCoverBtnComp.f275836B.f296596Z);
        AdLandingPageGetHBCoverBtnComp.this.mo131532c0();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2$1");
    }
}
