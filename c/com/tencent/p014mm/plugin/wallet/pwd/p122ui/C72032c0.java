package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wallet.pwd.p122ui.WalletSecuritySettingUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.c0 */
public class C72032c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletSecuritySettingUI.C72024h f208982d;

    /* renamed from: e */
    public final /* synthetic */ WalletSecuritySettingUI f208983e;

    public C72032c0(WalletSecuritySettingUI walletSecuritySettingUI, WalletSecuritySettingUI.C72024h hVar) {
        this.f208983e = walletSecuritySettingUI;
        this.f208982d = hVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WalletSecuritySettingUI.C72023g gVar = this.f208982d.f208963e;
        int i2 = gVar.f208955b;
        if (i2 == 1) {
            C75228t.m90221N(this.f208983e.getContext(), this.f208982d.f208963e.f208956c, true);
        } else if (i2 == 2) {
            C75228t.m90224Q(gVar.f208957d, gVar.f208958e, 0, 1000);
        }
    }
}
