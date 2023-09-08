package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.g */
public class C72038g implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletForgotPwdVerifyIdUI f208991d;

    public C72038g(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f208991d = walletForgotPwdVerifyIdUI;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveNameext：" + this.f208991d.f208827d.getText());
        if (this.f208991d.f208827d.getText() == null || "".equals(this.f208991d.f208827d.getText().toString())) {
            this.f208991d.f208839s = false;
        } else {
            this.f208991d.f208839s = true;
        }
        WalletForgotPwdVerifyIdUI.m84414H7(this.f208991d);
    }
}
