package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import so2.C101670e;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h */
public class C94644h extends C95108i0 {

    /* renamed from: B */
    public final C101670e f273860B;

    public C94644h(Context context, C101670e eVar, ViewGroup viewGroup) {
        super(context, eVar, viewGroup);
        this.f273860B = eVar;
        this.f276010t.mo90729c("finderUsername", eVar.f297610Z);
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderProfileBtnComp");
        try {
            String l = mo131854m().mo140745l();
            String h = mo131854m().mo140741h();
            Log.m105924i("AdLandingFinderProfileBtnComp", "doBtnClick, uxInfo=" + l + ", snsId=" + h);
            AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(this.f276579d, this.f273860B.f297610Z, l, h, 5);
        } catch (Throwable th) {
            Log.m105920e("AdLandingFinderProfileBtnComp", "doBtnClick, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderProfileBtnComp");
    }
}
