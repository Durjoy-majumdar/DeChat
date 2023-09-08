package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.r1 */
public class C42540r1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUI f115095d;

    public C42540r1(LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI) {
        this.f115095d = luckyMoneyNewYearReceiveUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f115095d.finish();
    }
}
