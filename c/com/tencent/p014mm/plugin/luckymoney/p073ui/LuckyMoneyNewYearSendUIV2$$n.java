package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import p375qh.C22086d;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$n */
public class LuckyMoneyNewYearSendUIV2$$n implements C22086d.C22088b {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200385a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$n$a */
    public class C69450a implements Runnable {
        public C69450a() {
        }

        public void run() {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = LuckyMoneyNewYearSendUIV2$$n.this.f200385a;
            int i = LuckyMoneyNewYearSendUIV2.f200265V1;
            luckyMoneyNewYearSendUIV2.mo95679b8(true);
        }
    }

    public LuckyMoneyNewYearSendUIV2$$n(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200385a = luckyMoneyNewYearSendUIV2;
    }

    /* renamed from: a */
    public void mo35072a() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "voicePlayer onError");
        View view = this.f200385a.f200330h;
        if (view != null) {
            view.post(new C69450a());
        }
    }
}
