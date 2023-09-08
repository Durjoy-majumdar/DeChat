package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$o */
public class LuckyMoneyNewYearSendUIV2$$o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200387d;

    public LuckyMoneyNewYearSendUIV2$$o(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200387d = luckyMoneyNewYearSendUIV2;
    }

    public boolean onTimerExpired() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200387d;
        int i = luckyMoneyNewYearSendUIV2.f200267A1 - 1;
        luckyMoneyNewYearSendUIV2.f200267A1 = i;
        if (i <= 0) {
            luckyMoneyNewYearSendUIV2.f200294O1.stopTimer();
            this.f200387d.f200286K.setVisibility(8);
            this.f200387d.f200290M.mo95809a();
        } else {
            luckyMoneyNewYearSendUIV2.f200286K.setText(luckyMoneyNewYearSendUIV2.getContext().getString(C0966R.string.nf4, new Object[]{Integer.valueOf(this.f200387d.f200267A1)}));
        }
        return true;
    }
}
