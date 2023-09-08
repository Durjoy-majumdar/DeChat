package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.b2 */
public class C69567b2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f200868d;

    public C69567b2(LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI, MMActivity mMActivity) {
        this.f200868d = mMActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f200868d.finish();
    }
}
