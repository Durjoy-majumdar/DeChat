package com.tencent.p014mm.plugin.luckymoney.p073ui;

import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.x1 */
public class C69717x1 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f201137d;

    public C69717x1(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f201137d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f201137d;
        int i = LuckyMoneyNewYearReceiveUIV2.f200103p1;
        luckyMoneyNewYearReceiveUIV2.mo95632T7("loop");
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }
}
