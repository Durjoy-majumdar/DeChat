package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p375qh.C22086d;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$k */
public class LuckyMoneyNewYearReceiveUIV2$$k implements C22086d.C22087a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200191a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$k$a */
    public class C69434a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$k$a$a */
        public class C69435a implements Runnable {
            public C69435a() {
            }

            public void run() {
                LuckyMoneyNewYearReceiveUIV2$$k.this.f200191a.f200120Q0.setVisibility(0);
            }
        }

        public C69434a() {
        }

        public void run() {
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = LuckyMoneyNewYearReceiveUIV2$$k.this.f200191a;
            luckyMoneyNewYearReceiveUIV2.f200124S0 = false;
            C69218g1.m81565l(luckyMoneyNewYearReceiveUIV2.f200172y0);
            LuckyMoneyNewYearReceiveUIV2$$k.this.f200191a.f200120Q0.post(new C69435a());
            long milliSecondsToNow = Util.milliSecondsToNow(LuckyMoneyNewYearReceiveUIV2$$k.this.f200191a.f200138Z0);
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = LuckyMoneyNewYearReceiveUIV2$$k.this.f200191a;
            luckyMoneyNewYearReceiveUIV22.f200138Z0 = 0;
            luckyMoneyNewYearReceiveUIV22.mo95631S7(16, milliSecondsToNow);
        }
    }

    public LuckyMoneyNewYearReceiveUIV2$$k(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200191a = luckyMoneyNewYearReceiveUIV2;
    }

    public void onCompletion() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voicePlayer onCompletion");
        View view = this.f200191a.f200147h;
        if (view != null) {
            view.post(new C69434a());
        }
    }
}
