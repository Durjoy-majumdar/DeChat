package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletSecuritySettingUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.d0 */
public class C72034d0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletSecuritySettingUI.C72024h f208985d;

    /* renamed from: e */
    public final /* synthetic */ WalletSecuritySettingUI f208986e;

    public C72034d0(WalletSecuritySettingUI walletSecuritySettingUI, WalletSecuritySettingUI.C72024h hVar) {
        this.f208986e = walletSecuritySettingUI;
        this.f208985d = hVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WalletSecuritySettingUI.C72023g gVar = this.f208985d.f208962d;
        int i2 = gVar.f208955b;
        if (i2 == 1) {
            C75228t.m90221N(this.f208986e.getContext(), this.f208985d.f208962d.f208956c, true);
        } else if (i2 == 2) {
            C75228t.m90224Q(gVar.f208957d, gVar.f208958e, 0, 1000);
        } else {
            dialogInterface.dismiss();
        }
    }
}
