package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;
import uo2.C90717a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m */
public class C95143m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95136l f276147d;

    public C95143m(C95136l lVar) {
        this.f276147d = lVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$12");
        if (C95136l.m121017M(this.f276147d) == null) {
            Context context = this.f276147d.f276579d;
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                C95136l lVar = this.f276147d;
                C89779i0 f = C90717a.m113753f(lVar.f276579d, C0966R.string.j_t, (DialogInterface.OnCancelListener) null);
                SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                lVar.f276105B = f;
                SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            }
        }
        if (C95136l.m121017M(this.f276147d) != null && !C95136l.m121017M(this.f276147d).isShowing()) {
            Log.m105924i("AdLandingNewH5Comp", "showLoading");
            C95136l.m121017M(this.f276147d).show();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$12");
    }
}
