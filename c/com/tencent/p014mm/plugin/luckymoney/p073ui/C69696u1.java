package com.tencent.p014mm.plugin.luckymoney.p073ui;

import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.u1 */
public class C69696u1 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f201096d;

    public C69696u1(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f201096d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f201096d;
        luckyMoneyNewYearReceiveUIV2.f200121R.post(new C69713w1(luckyMoneyNewYearReceiveUIV2, "loop"));
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }
}
