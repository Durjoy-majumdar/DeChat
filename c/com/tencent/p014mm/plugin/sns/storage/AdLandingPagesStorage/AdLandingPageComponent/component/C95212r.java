package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100894u;
import qs2.C101286q0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r */
public class C95212r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f276289d;

    /* renamed from: e */
    public final /* synthetic */ C95136l f276290e;

    public C95212r(C95136l lVar, int i) {
        this.f276290e = lVar;
        this.f276289d = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$8");
        View view = this.f276290e.f276586n;
        if (view != null && this.f276289d >= 0) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int n = (int) C100894u.m132234n((double) this.f276289d, 1, 750, 1);
                Log.m105924i("AdLandingNewH5Comp", "adJuestHeight, curH=" + layoutParams.height + ", newH=" + this.f276289d + ", newPx=" + n);
                if (layoutParams.height != n) {
                    ((C101286q0) this.f276290e.mo131856q()).f296502h = (float) n;
                    this.f276290e.mo124363d();
                }
            } catch (Exception e) {
                Log.m105920e("AdLandingNewH5Comp", "adJuestHeight exp=" + e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$8");
    }
}
