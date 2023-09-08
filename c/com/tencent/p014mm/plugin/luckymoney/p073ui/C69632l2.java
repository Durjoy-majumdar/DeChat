package com.tencent.p014mm.plugin.luckymoney.p073ui;

import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l2 */
public class C69632l2 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f201005d;

    public C69632l2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f201005d = luckyMoneyNewYearSendUIV2;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201005d;
        if (luckyMoneyNewYearSendUIV2.f200302R1 == 5) {
            luckyMoneyNewYearSendUIV2.f200364y0 = "loop";
            luckyMoneyNewYearSendUIV2.mo95668Q7(5);
        }
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }
}
