package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p008bq.C67305d1;
import p911ml.C76777a;
import p911ml.C76778b;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$j */
public class LuckyMoneyNewYearSendUIV2$$j implements C76777a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200380a;

    public LuckyMoneyNewYearSendUIV2$$j(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200380a = luckyMoneyNewYearSendUIV2;
    }

    /* renamed from: a */
    public void mo95657a(long j, boolean z, String str) {
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", Long.valueOf(this.f200380a.f200355u1), Long.valueOf(j), Boolean.valueOf(z), str);
        if (Util.isEqual(this.f200380a.f200355u1, j)) {
            if (z) {
                this.f200380a.mo95676Y7(str);
            } else if (!Util.isEqual(this.f200380a.f200305S1, 0) || !((C67305d1) C86312j.m106911c(C67305d1.class)).f10(this.f200380a.f200355u1)) {
                this.f200380a.mo95668Q7(4);
            } else {
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200380a;
                luckyMoneyNewYearSendUIV2.f200305S1++;
                luckyMoneyNewYearSendUIV2.mo95668Q7(2);
                return;
            }
            this.f200380a.mo95680c8(true);
            C76778b bVar = C76778b.f224582a;
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200380a;
            bVar.mo107031b(luckyMoneyNewYearSendUIV22.f200355u1, luckyMoneyNewYearSendUIV22.f200308T1);
        }
    }
}
