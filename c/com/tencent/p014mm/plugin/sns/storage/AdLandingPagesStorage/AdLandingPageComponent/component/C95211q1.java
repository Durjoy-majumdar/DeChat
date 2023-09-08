package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q1 */
public class C95211q1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C95206p1 f276288d;

    public C95211q1(C95206p1 p1Var) {
        this.f276288d = p1Var;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$2");
        try {
            C95206p1 p1Var = this.f276288d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            C89779i0 i0Var = p1Var.f276277E;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            if (i0Var != null) {
                C95206p1 p1Var2 = this.f276288d;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                C89779i0 i0Var2 = p1Var2.f276277E;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                if (i0Var2.isShowing()) {
                    C95206p1 p1Var3 = this.f276288d;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                    C89779i0 i0Var3 = p1Var3.f276277E;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
                    i0Var3.dismiss();
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$2");
    }
}
