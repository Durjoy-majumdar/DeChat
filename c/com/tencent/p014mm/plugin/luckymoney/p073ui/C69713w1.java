package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.libpag.PAGView;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.w1 */
public class C69713w1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f201132d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f201133e;

    public C69713w1(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, String str) {
        this.f201133e = luckyMoneyNewYearReceiveUIV2;
        this.f201132d = str;
    }

    public void run() {
        String d = C69218g1.m81557d(this.f201133e.f200127U.f199139g, this.f201132d);
        if (!Util.isNullOrNil(d)) {
            String str = this.f201132d;
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f201133e;
            C69218g1.m81564k(str, d, luckyMoneyNewYearReceiveUIV2.f200121R, (PAGView) null, luckyMoneyNewYearReceiveUIV2.f200123S, luckyMoneyNewYearReceiveUIV2.f200125T);
            return;
        }
        this.f201133e.mo95627O7(0);
    }
}
