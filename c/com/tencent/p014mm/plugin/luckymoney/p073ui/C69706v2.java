package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.v2 */
public class C69706v2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNotHookReceiveUI f201120d;

    public C69706v2(LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f201120d = luckyMoneyNotHookReceiveUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f201120d.finish();
    }
}
