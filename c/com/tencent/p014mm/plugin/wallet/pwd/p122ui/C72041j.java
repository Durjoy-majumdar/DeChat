package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.j */
public class C72041j implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ WalletForgotPwdVerifyIdUI f208994d;

    public C72041j(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f208994d = walletForgotPwdVerifyIdUI;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " has focus");
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f208994d;
            int i = WalletForgotPwdVerifyIdUI.f208826u;
            walletForgotPwdVerifyIdUI.mo99207I7();
            return;
        }
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " lose focus");
    }
}
