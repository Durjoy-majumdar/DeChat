package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.c */
public class C72031c implements C72478z.C72479a {

    /* renamed from: a */
    public final /* synthetic */ WalletForgotPwdUI f208981a;

    public C72031c(WalletForgotPwdUI walletForgotPwdUI) {
        this.f208981a = walletForgotPwdUI;
    }

    public void onClick(View view) {
        WalletForgotPwdUI walletForgotPwdUI = this.f208981a;
        walletForgotPwdUI.f208811p = true;
        walletForgotPwdUI.mo99198I7();
    }
}
