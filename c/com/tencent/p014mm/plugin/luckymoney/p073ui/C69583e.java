package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a42.C67004b;
import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.e */
public class C69583e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyBeforeDetailUI f200894d;

    public C69583e(LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI) {
        this.f200894d = luckyMoneyBeforeDetailUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        P p;
        Dialog dialog = this.f200894d.f199664g;
        if (dialog != null && dialog.isShowing()) {
            this.f200894d.f199664g.dismiss();
        }
        this.f200894d.forceCancel();
        C67004b bVar = this.f200894d.f199668n;
        if (!(bVar == null || (p = bVar.f221004c) == null)) {
            p.mo85581g();
        }
        if (this.f200894d.getContentView().getVisibility() == 8 || this.f200894d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "user cancel & finish");
            this.f200894d.finish();
        }
    }
}
