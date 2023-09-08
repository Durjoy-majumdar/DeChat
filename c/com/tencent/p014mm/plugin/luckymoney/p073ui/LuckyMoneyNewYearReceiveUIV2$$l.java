package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76912y0;
import p375qh.C22086d;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$l */
public class LuckyMoneyNewYearReceiveUIV2$$l implements C22086d.C22088b {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200194a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$l$a */
    public class C69436a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$l$a$a */
        public class C69437a implements Runnable {
            public C69437a() {
            }

            public void run() {
                C76912y0.m92773l(LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a.getContext(), LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a.getContext().getResources().getString(C0966R.string.nez));
                LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a.f200120Q0.setVisibility(0);
            }
        }

        public C69436a() {
        }

        public void run() {
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a;
            luckyMoneyNewYearReceiveUIV2.f200124S0 = false;
            C69218g1.m81565l(luckyMoneyNewYearReceiveUIV2.f200172y0);
            LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a.f200120Q0.post(new C69437a());
            long milliSecondsToNow = Util.milliSecondsToNow(LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a.f200138Z0);
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = LuckyMoneyNewYearReceiveUIV2$$l.this.f200194a;
            luckyMoneyNewYearReceiveUIV22.f200138Z0 = 0;
            luckyMoneyNewYearReceiveUIV22.mo95631S7(16, milliSecondsToNow);
        }
    }

    public LuckyMoneyNewYearReceiveUIV2$$l(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200194a = luckyMoneyNewYearReceiveUIV2;
    }

    /* renamed from: a */
    public void mo35072a() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voicePlayer onError");
        View view = this.f200194a.f200147h;
        if (view != null) {
            view.post(new C69436a());
        }
    }
}
