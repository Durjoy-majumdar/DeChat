package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import p375qh.C22086d;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$m */
public class LuckyMoneyNewYearSendUIV2$$m implements C22086d.C22087a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200383a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$m$a */
    public class C69449a implements Runnable {
        public C69449a() {
        }

        public void run() {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = LuckyMoneyNewYearSendUIV2$$m.this.f200383a;
            int i = LuckyMoneyNewYearSendUIV2.f200265V1;
            luckyMoneyNewYearSendUIV2.mo95679b8(true);
        }
    }

    public LuckyMoneyNewYearSendUIV2$$m(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200383a = luckyMoneyNewYearSendUIV2;
    }

    public void onCompletion() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "voicePlayer onCompletion");
        View view = this.f200383a.f200330h;
        if (view != null) {
            view.post(new C69449a());
        }
    }
}
