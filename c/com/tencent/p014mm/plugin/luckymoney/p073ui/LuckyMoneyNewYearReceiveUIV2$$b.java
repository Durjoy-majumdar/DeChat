package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$b */
public class LuckyMoneyNewYearReceiveUIV2$$b implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200176d;

    public LuckyMoneyNewYearReceiveUIV2$$b(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200176d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C89779i0 i0Var = this.f200176d.f200104A;
        if (i0Var != null && i0Var.isShowing()) {
            this.f200176d.f200104A.dismiss();
        }
        this.f200176d.forceCancel();
        if (this.f200176d.getContentView().getVisibility() == 8 || this.f200176d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "usr cancel, & visibility not visiable, so finish");
            this.f200176d.finish();
        }
    }
}
