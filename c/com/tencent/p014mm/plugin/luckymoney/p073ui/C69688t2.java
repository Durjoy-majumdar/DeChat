package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.t2 */
public class C69688t2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2$$p f201086d;

    public C69688t2(LuckyMoneyNewYearSendUIV2$$p luckyMoneyNewYearSendUIV2$$p) {
        this.f201086d = luckyMoneyNewYearSendUIV2$$p;
    }

    public void run() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201086d.f200388a;
        luckyMoneyNewYearSendUIV2.f200285J1 = 2;
        luckyMoneyNewYearSendUIV2.f200273D1 = 1;
        luckyMoneyNewYearSendUIV2.mo95681d8();
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f201086d.f200388a;
        luckyMoneyNewYearSendUIV22.getClass();
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setMaskPAGAndStart：%s", IXWebBroadcastListener.STAGE_START);
        luckyMoneyNewYearSendUIV22.f200314W.post(new C69670q2(luckyMoneyNewYearSendUIV22, IXWebBroadcastListener.STAGE_START));
        this.f201086d.f200388a.mo95672U7(12);
    }
}
