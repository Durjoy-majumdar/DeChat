package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.u2 */
public class C69697u2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2$$p f201097d;

    public C69697u2(LuckyMoneyNewYearSendUIV2$$p luckyMoneyNewYearSendUIV2$$p) {
        this.f201097d = luckyMoneyNewYearSendUIV2$$p;
    }

    public void run() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201097d.f200388a;
        luckyMoneyNewYearSendUIV2.f200267A1 = 10;
        luckyMoneyNewYearSendUIV2.f200286K.setText(luckyMoneyNewYearSendUIV2.getContext().getString(C0966R.string.nf4, new Object[]{Integer.valueOf(this.f201097d.f200388a.f200267A1)}));
        this.f201097d.f200388a.f200286K.setVisibility(0);
        this.f201097d.f200388a.f200294O1.startTimer(1000);
    }
}
