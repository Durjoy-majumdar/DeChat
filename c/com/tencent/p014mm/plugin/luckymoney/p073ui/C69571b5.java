package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import te3.C48730al;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.b5 */
public final class C69571b5 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneySpareActivityFirst f200873d;

    /* renamed from: e */
    public final /* synthetic */ C48730al f200874e;

    public C69571b5(LuckyMoneySpareActivityFirst luckyMoneySpareActivityFirst, C48730al alVar) {
        this.f200873d = luckyMoneySpareActivityFirst;
        this.f200874e = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        LuckyMoneySpareActivityFirst.m81969g8(this.f200873d, this.f200874e.f130603e);
    }
}
