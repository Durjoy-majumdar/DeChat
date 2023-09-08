package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;

/* renamed from: com.tencent.mm.plugin.aa.ui.l1 */
public class C68300l1 implements C87581a<Void, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196321a;

    public C68300l1(PaylistAAUI paylistAAUI) {
        this.f196321a = paylistAAUI;
    }

    public Object call(Object obj) {
        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "close pay list success: %s", (Boolean) obj);
        this.f196321a.hideLoading();
        Dialog dialog = this.f196321a.f196252n;
        if (dialog != null && dialog.isShowing()) {
            this.f196321a.f196252n.dismiss();
        }
        PaylistAAUI paylistAAUI = this.f196321a;
        paylistAAUI.f196240I = null;
        paylistAAUI.mo93852N7();
        this.f196321a.removeAllOptionMenu();
        PaylistAAUI paylistAAUI2 = this.f196321a;
        paylistAAUI2.getClass();
        Intent intent = new Intent();
        intent.putExtra("close_aa", true);
        intent.putExtra("item_position", paylistAAUI2.getIntent().getIntExtra("item_position", 0));
        intent.putExtra("item_offset", paylistAAUI2.getIntent().getIntExtra("item_offset", 0));
        paylistAAUI2.setResult(-1, intent);
        return null;
    }
}
