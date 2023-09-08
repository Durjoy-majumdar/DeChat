package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.e2 */
public class C69584e2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUI f200895d;

    public C69584e2(LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f200895d = luckyMoneyNewYearSendUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f200895d.f200204F;
        if (dialog != null && dialog.isShowing()) {
            this.f200895d.f200204F.dismiss();
        }
        if (this.f200895d.getContentView().getVisibility() == 8 || this.f200895d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "usr cancel, & visibility not visiable, so finish");
            this.f200895d.finish();
        }
        this.f200895d.forceCancel();
    }
}
