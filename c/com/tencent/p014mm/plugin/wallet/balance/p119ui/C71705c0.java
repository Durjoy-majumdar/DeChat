package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.c0 */
public class C71705c0 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ Dialog f207889a;

    /* renamed from: b */
    public final /* synthetic */ WalletBalanceSaveUI f207890b;

    public C71705c0(WalletBalanceSaveUI walletBalanceSaveUI, Dialog dialog) {
        this.f207890b = walletBalanceSaveUI;
        this.f207889a = dialog;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Dialog dialog = this.f207889a;
        if (dialog != null) {
            dialog.dismiss();
        }
        Log.m105925i("MicroMsg.WalletBalanceSaveUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            C76701a.makeText((Context) this.f207890b.getContext(), (CharSequence) obj instanceof String ? obj.toString() : this.f207890b.getString(C0966R.string.kxh), 1).show();
        }
    }
}
