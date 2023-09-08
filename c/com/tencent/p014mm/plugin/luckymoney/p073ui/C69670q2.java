package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.q2 */
public class C69670q2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f201060d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f201061e;

    public C69670q2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, String str) {
        this.f201061e = luckyMoneyNewYearSendUIV2;
        this.f201060d = str;
    }

    public void run() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201061e;
        int i = luckyMoneyNewYearSendUIV2.f200285J1;
        if (i == 1 || i == 0) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setMaskPAGAndStart end mask pag, viewState:%s", Integer.valueOf(i));
            return;
        }
        String d = C69218g1.m81557d(luckyMoneyNewYearSendUIV2.f200317X0, this.f201060d);
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setMaskPAGAndStart start mask pag ：%s", d);
        if (Util.isNullOrNil(d)) {
            return;
        }
        if (this.f201060d.equals("loop")) {
            if (this.f201061e.f200314W.getVisibility() == 0) {
                String str = this.f201060d;
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f201061e;
                C69218g1.m81564k(str, d, luckyMoneyNewYearSendUIV22.f200314W, luckyMoneyNewYearSendUIV22.f200316X, luckyMoneyNewYearSendUIV22.f200318Y, luckyMoneyNewYearSendUIV22.f200320Z);
                return;
            }
            String str2 = this.f201060d;
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f201061e;
            C69218g1.m81564k(str2, d, luckyMoneyNewYearSendUIV23.f200316X, luckyMoneyNewYearSendUIV23.f200314W, luckyMoneyNewYearSendUIV23.f200318Y, luckyMoneyNewYearSendUIV23.f200320Z);
        } else if (this.f201061e.f200314W.getVisibility() == 0) {
            String str3 = this.f201060d;
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f201061e;
            C69218g1.m81564k(str3, d, luckyMoneyNewYearSendUIV24.f200316X, luckyMoneyNewYearSendUIV24.f200314W, luckyMoneyNewYearSendUIV24.f200318Y, luckyMoneyNewYearSendUIV24.f200320Z);
        } else {
            String str4 = this.f201060d;
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f201061e;
            C69218g1.m81564k(str4, d, luckyMoneyNewYearSendUIV25.f200314W, luckyMoneyNewYearSendUIV25.f200316X, luckyMoneyNewYearSendUIV25.f200318Y, luckyMoneyNewYearSendUIV25.f200320Z);
        }
    }
}
