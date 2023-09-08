package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import qs2.C101286q0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$g */
public class l$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95136l f276118d;

    public l$$g(C95136l lVar) {
        this.f276118d = lVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$2");
        C101286q0 q0Var = (C101286q0) this.f276118d.mo131856q();
        StringBuilder sb = new StringBuilder();
        sb.append("postDelayRunnable, cid is ");
        sb.append(this.f276118d.mo131857r());
        sb.append(", showLoadAnimation is ");
        sb.append(q0Var != null ? Boolean.valueOf(q0Var.f296687D) : "info is null");
        sb.append(", mPageStartDisplay is ");
        sb.append(C95136l.m121011E(this.f276118d));
        Log.m105924i("AdLandingNewH5Comp", sb.toString());
        if (C95136l.m121012G(this.f276118d) != null && q0Var != null && q0Var.f296687D && !C95136l.m121011E(this.f276118d)) {
            C95136l lVar = this.f276118d;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            lVar.f276113x = true;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            C95136l.m121012G(this.f276118d).setAlpha(1.0f);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$2");
    }
}
