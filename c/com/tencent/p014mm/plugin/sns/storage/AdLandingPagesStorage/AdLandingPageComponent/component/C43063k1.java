package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k1 */
public class C43063k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95129j1 f116562d;

    public C43063k1(C95129j1 j1Var) {
        this.f116562d = j1Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$2");
        try {
            if (this.f116562d.f276080C.isShowing()) {
                this.f116562d.f276080C.dismiss();
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "showLoading exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$2");
    }
}
