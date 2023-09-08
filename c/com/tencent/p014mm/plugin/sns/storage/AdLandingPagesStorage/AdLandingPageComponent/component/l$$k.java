package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100894u;
import qs2.C101286q0;
import qs2.C101295u0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$k */
public class l$$k implements C0120a0<Integer> {

    /* renamed from: d */
    public final /* synthetic */ C101286q0 f276123d;

    /* renamed from: e */
    public final /* synthetic */ C95136l f276124e;

    public l$$k(C95136l lVar, C101286q0 q0Var) {
        this.f276124e = lVar;
        this.f276123d = q0Var;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$6");
        Integer num = (Integer) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$6");
        Log.m105924i("AdLandingNewH5Comp", "rootViewHeight change with: height = [" + num + "]");
        if (!(num == null || C95136l.m121012G(this.f276124e) == null)) {
            ViewGroup.LayoutParams layoutParams = C95136l.m121012G(this.f276124e).getLayoutParams();
            C101286q0 q0Var = this.f276123d;
            C101295u0 u0Var = q0Var.f296685B;
            layoutParams.height = (int) (((float) num.intValue()) - C100894u.m132234n((double) q0Var.f296684A, u0Var.f296748a, u0Var.f296749b, u0Var.f296750c));
            C95136l.m121012G(this.f276124e).setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$6");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$6");
    }
}
