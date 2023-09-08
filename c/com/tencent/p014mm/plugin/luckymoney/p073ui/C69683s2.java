package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.s2 */
public class C69683s2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f201079d;

    public C69683s2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f201079d = luckyMoneyNewYearSendUIV2;
    }

    public void run() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201079d;
        if (luckyMoneyNewYearSendUIV2.f200281H1) {
            int i = luckyMoneyNewYearSendUIV2.f200273D1;
            if (i == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "afterUploadDoSend upload voice fail, tip retry");
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f201079d;
                luckyMoneyNewYearSendUIV22.f200281H1 = false;
                Dialog dialog = luckyMoneyNewYearSendUIV22.f200307T0;
                if (dialog != null && dialog.isShowing()) {
                    luckyMoneyNewYearSendUIV22.f200307T0.dismiss();
                }
            } else if (i == 3) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "afterUploadDoSend upload voice success, now doSend");
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f201079d;
                luckyMoneyNewYearSendUIV23.f200281H1 = false;
                luckyMoneyNewYearSendUIV23.mo95665N7(0);
            }
        }
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f201079d;
        if (luckyMoneyNewYearSendUIV24.f200273D1 == 4) {
            C76912y0.m92773l(luckyMoneyNewYearSendUIV24.getContext(), this.f201079d.getContext().getResources().getString(C0966R.string.f361004nf3));
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f201079d;
            luckyMoneyNewYearSendUIV25.f200285J1 = 1;
            luckyMoneyNewYearSendUIV25.mo95681d8();
        }
    }
}
