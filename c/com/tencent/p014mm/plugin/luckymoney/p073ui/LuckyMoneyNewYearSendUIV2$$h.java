package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.luckymoney.model.C69224g2;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$h */
public class LuckyMoneyNewYearSendUIV2$$h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C117747y f200377d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200378e;

    public LuckyMoneyNewYearSendUIV2$$h(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, C117747y yVar) {
        this.f200378e = luckyMoneyNewYearSendUIV2;
        this.f200377d = yVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C69224g2.m81567m1(this.f200377d)) {
            this.f200378e.finish();
        }
    }
}
