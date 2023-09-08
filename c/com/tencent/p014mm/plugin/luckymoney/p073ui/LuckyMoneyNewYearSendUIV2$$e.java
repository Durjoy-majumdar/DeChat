package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$e */
public class LuckyMoneyNewYearSendUIV2$$e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200374d;

    public LuckyMoneyNewYearSendUIV2$$e(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200374d = luckyMoneyNewYearSendUIV2;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f200374d.f200307T0;
        if (dialog != null && dialog.isShowing()) {
            this.f200374d.f200307T0.dismiss();
        }
        if (this.f200374d.getContentView().getVisibility() == 8 || this.f200374d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "usr cancel, & visibility not visiable, so finish");
            this.f200374d.finish();
        }
        this.f200374d.forceCancel();
    }
}
