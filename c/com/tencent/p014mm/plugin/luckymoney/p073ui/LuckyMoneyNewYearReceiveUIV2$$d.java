package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.plugin.luckymoney.model.C69237j2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import te3.C77935gl2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$d */
public class LuckyMoneyNewYearReceiveUIV2$$d implements C72506r.C72510d {

    /* renamed from: a */
    public final /* synthetic */ C69210e2 f200179a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200180b;

    public LuckyMoneyNewYearReceiveUIV2$$d(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, C69210e2 e2Var) {
        this.f200180b = luckyMoneyNewYearReceiveUIV2;
        this.f200179a = e2Var;
    }

    /* renamed from: a */
    public void mo95297a(C77935gl2 gl22) {
        if (gl22.f227479e == 2) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click left button");
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200180b;
            C69237j2 j2Var = luckyMoneyNewYearReceiveUIV2.f200150i1;
            int i = j2Var.f199242h;
            int i2 = j2Var.f199243i;
            String str = j2Var.f199244j;
            String str2 = j2Var.f199245n;
            String str3 = j2Var.f199237P;
            String str4 = this.f200179a.f199161w;
            luckyMoneyNewYearReceiveUIV2.f200146g1 = true;
            luckyMoneyNewYearReceiveUIV2.doSceneProgress(new C69210e2(i, i2, str, str2, C69242l1.m81601g(), C75592q0.m90783m(), luckyMoneyNewYearReceiveUIV2.getIntent().getStringExtra("key_username"), "v1.0", str3, str4), true);
            return;
        }
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click right button");
        this.f200180b.finish();
    }
}
