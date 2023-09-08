package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.i */
public class C72040i implements C75217h {

    /* renamed from: a */
    public final /* synthetic */ WalletForgotPwdVerifyIdUI f208993a;

    public C72040i(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f208993a = walletForgotPwdVerifyIdUI;
    }

    public void onVisibleStateChange(boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS visible");
            WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f208993a;
            walletForgotPwdVerifyIdUI.scrollToFormEditPosAfterShowTenPay(walletForgotPwdVerifyIdUI.f208833j, walletForgotPwdVerifyIdUI.f208830g, 10);
            this.f208993a.mo99207I7();
            return;
        }
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS unvisible");
        WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI2 = this.f208993a;
        int i = WalletForgotPwdVerifyIdUI.f208826u;
        walletForgotPwdVerifyIdUI2.getClass();
        Log.m105924i("MicroMsg.WalletForgotPwdVerifyIdUI", " resetParams()");
        walletForgotPwdVerifyIdUI2.f208829f.setVisibility(0);
        walletForgotPwdVerifyIdUI2.f208832i.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI2.f208834n.getLayoutParams();
        walletForgotPwdVerifyIdUI2.f208835o = marginLayoutParams;
        marginLayoutParams.topMargin = C74942w4.m89784a(walletForgotPwdVerifyIdUI2, 59);
        walletForgotPwdVerifyIdUI2.f208834n.setLayoutParams(walletForgotPwdVerifyIdUI2.f208835o);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) walletForgotPwdVerifyIdUI2.f208831h.getLayoutParams();
        walletForgotPwdVerifyIdUI2.f208836p = marginLayoutParams2;
        marginLayoutParams2.topMargin = C74942w4.m89784a(walletForgotPwdVerifyIdUI2, 114);
        walletForgotPwdVerifyIdUI2.f208831h.setLayoutParams(walletForgotPwdVerifyIdUI2.f208836p);
        this.f208993a.f208833j.scrollTo(0, 0);
    }
}
