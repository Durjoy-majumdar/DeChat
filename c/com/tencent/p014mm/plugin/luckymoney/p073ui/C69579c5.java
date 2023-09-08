package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import te3.C48730al;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.c5 */
public final class C69579c5 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneySpareActivityFirst f200889d;

    /* renamed from: e */
    public final /* synthetic */ C48730al f200890e;

    public C69579c5(LuckyMoneySpareActivityFirst luckyMoneySpareActivityFirst, C48730al alVar) {
        this.f200889d = luckyMoneySpareActivityFirst;
        this.f200890e = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        LuckyMoneySpareActivityFirst.m81969g8(this.f200889d, this.f200890e.f130603e);
    }
}
