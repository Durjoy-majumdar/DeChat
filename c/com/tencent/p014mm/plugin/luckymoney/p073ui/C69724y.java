package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import u32.C65209a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.y */
public class C69724y implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f201147d;

    public C69724y(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201147d = luckyMoneyDetailUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f201147d.f199817M;
        if (dialog != null && dialog.isShowing()) {
            this.f201147d.f199817M.dismiss();
        }
        this.f201147d.forceCancel();
        C65209a aVar = this.f201147d.f199874i2;
        if (aVar != null) {
            aVar.mo85581g();
        }
        if (this.f201147d.getContentView().getVisibility() == 8 || this.f201147d.getContentView().getVisibility() == 4) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "user cancel & finish");
            this.f201147d.finish();
        }
    }
}
