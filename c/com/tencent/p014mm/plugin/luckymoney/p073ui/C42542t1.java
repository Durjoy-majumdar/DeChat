package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.t1 */
public class C42542t1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f115098d;

    public C42542t1(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f115098d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f115098d.finish();
    }
}
