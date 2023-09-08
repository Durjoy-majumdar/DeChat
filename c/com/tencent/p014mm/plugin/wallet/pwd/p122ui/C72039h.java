package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.h */
public class C72039h implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletForgotPwdVerifyIdUI f208992d;

    public C72039h(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f208992d = walletForgotPwdVerifyIdUI;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f208992d.f208830g.getText() != null) {
            this.f208992d.f208840t = true;
        } else {
            this.f208992d.f208840t = false;
        }
        WalletForgotPwdVerifyIdUI.m84414H7(this.f208992d);
    }
}
