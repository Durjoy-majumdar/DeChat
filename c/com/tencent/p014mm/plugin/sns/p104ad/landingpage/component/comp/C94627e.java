package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import so2.C101671f;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e */
public class C94627e extends C95108i0 {

    /* renamed from: B */
    public final C101671f f273823B;

    public C94627e(Context context, C101671f fVar, ViewGroup viewGroup) {
        super(context, fVar, viewGroup);
        this.f273823B = fVar;
        this.f276010t.mo90729c("finderExportId", fVar.f297611Z);
        this.f276010t.mo90729c("finderUsername", fVar.f297613b0);
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderFeedsBtnComp");
        try {
            String l = mo131854m().mo140745l();
            String h = mo131854m().mo140741h();
            int i = mo131854m().mo140742i();
            Log.m105924i("AdLandingFinderFeedsBtnComp", "doBtnClick, uxInfo = " + l + ", snsId = " + h + ", source = " + i);
            AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
            C101671f fVar = this.f273823B;
            instance.doJumpToFinderFeedsDetailUI(fVar.f297613b0, fVar.f297612a0, fVar.f297611Z, l, h, i, 5);
        } catch (Throwable th) {
            Log.m105920e("AdLandingFinderFeedsBtnComp", "doBtnClick, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderFeedsBtnComp");
    }
}
