package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$f */
public class LuckyMoneyNewYearSendUIV2$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200375d;

    public LuckyMoneyNewYearSendUIV2$$f(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200375d = luckyMoneyNewYearSendUIV2;
    }

    public void run() {
        C69218g1.m81561h(this.f200375d.f200366z, 0);
        this.f200375d.f200272D.setVisibility(4);
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200375d;
        if (!luckyMoneyNewYearSendUIV2.f200359w1) {
            luckyMoneyNewYearSendUIV2.f200280H.setVisibility(4);
        }
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200375d;
        LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = luckyMoneyNewYearSendUIV22.f200276F;
        luckyMoneyAutoScrollView.f199659y = new C69617j2(luckyMoneyNewYearSendUIV22);
        MMHandlerThread.postToMainThread(new C69572c(luckyMoneyAutoScrollView));
    }
}
