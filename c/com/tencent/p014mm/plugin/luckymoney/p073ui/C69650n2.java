package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.n2 */
public class C69650n2 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f201026d;

    public C69650n2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f201026d = luckyMoneyNewYearSendUIV2;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201026d;
        int i = LuckyMoneyNewYearSendUIV2.f200265V1;
        luckyMoneyNewYearSendUIV2.getClass();
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setMaskPAGAndStart：%s", "loop");
        luckyMoneyNewYearSendUIV2.f200314W.post(new C69670q2(luckyMoneyNewYearSendUIV2, "loop"));
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }
}
