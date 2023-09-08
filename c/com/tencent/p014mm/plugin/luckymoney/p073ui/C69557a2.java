package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76912y0;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.a2 */
public class C69557a2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200849d;

    public C69557a2(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200849d = luckyMoneyNewYearReceiveUIV2;
    }

    public void run() {
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200849d;
        if (luckyMoneyNewYearReceiveUIV2.f200143e1) {
            int i = luckyMoneyNewYearReceiveUIV2.f200142d1;
            if (i == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "afterDownloadPlay download voice fail, tip retry");
                LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = this.f200849d;
                luckyMoneyNewYearReceiveUIV22.f200143e1 = false;
                C89779i0 i0Var = luckyMoneyNewYearReceiveUIV22.f200104A;
                if (i0Var != null && i0Var.isShowing()) {
                    this.f200849d.f200104A.dismiss();
                }
                C76912y0.m92773l(this.f200849d.getContext(), this.f200849d.getContext().getResources().getString(C0966R.string.nex));
            } else if (i == 3) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "afterUploadDoSend upload voice success, now doSend");
                LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV23 = this.f200849d;
                luckyMoneyNewYearReceiveUIV23.f200143e1 = false;
                luckyMoneyNewYearReceiveUIV23.f200124S0 = true;
                C69218g1.m81563j(luckyMoneyNewYearReceiveUIV23.f200172y0, C0966R.C0969drawable.cqp);
                LuckyMoneyNewYearReceiveUIV2.m81812J7(this.f200849d);
                LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV24 = this.f200849d;
                luckyMoneyNewYearReceiveUIV24.f200126T0.mo33329e(luckyMoneyNewYearReceiveUIV24.f200128U0, true);
                this.f200849d.f200120Q0.setVisibility(8);
                this.f200849d.f200138Z0 = Util.nowMilliSecond();
                this.f200849d.mo95630R7(14);
            }
        }
        if (this.f200849d.f200142d1 == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "download voice fail, tip retry");
        }
    }
}
