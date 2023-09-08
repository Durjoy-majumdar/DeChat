package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.libpag.PAGView;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$h */
public class LuckyMoneyNewYearReceiveUIV2$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f200185d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200186e;

    public LuckyMoneyNewYearReceiveUIV2$$h(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, String str) {
        this.f200186e = luckyMoneyNewYearReceiveUIV2;
        this.f200185d = str;
    }

    public void run() {
        String d = C69218g1.m81557d(this.f200186e.f200127U.f199145p, this.f200185d);
        if (!Util.isNullOrNil(d)) {
            String str = this.f200185d;
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200186e;
            C69218g1.m81564k(str, d, luckyMoneyNewYearReceiveUIV2.f200129V, (PAGView) null, luckyMoneyNewYearReceiveUIV2.f200131W, luckyMoneyNewYearReceiveUIV2.f200133X);
            return;
        }
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = this.f200186e;
        luckyMoneyNewYearReceiveUIV22.f200129V.setVisibility(8);
        C69218g1.m81566m(luckyMoneyNewYearReceiveUIV22.f200129V, luckyMoneyNewYearReceiveUIV22.f200131W, luckyMoneyNewYearReceiveUIV22.f200133X);
    }
}
