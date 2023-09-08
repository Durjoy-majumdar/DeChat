package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.k2 */
public class C69625k2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f200987d;

    public C69625k2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, MMActivity mMActivity) {
        this.f200987d = mMActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f200987d.finish();
    }
}
