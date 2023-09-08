package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import p281yz.C79173v;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.e */
public class C72035e extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletForgotPwdVerifyIdUI f208987g;

    public C72035e(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f208987g = walletForgotPwdVerifyIdUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        String text = this.f208987g.f208830g.getText();
        int o = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91333o();
        String obj = this.f208987g.f208827d.getText().toString();
        if (!Util.isNullOrNil(text) && !Util.isNullOrNil(obj)) {
            this.f208987g.getInput().putString("key_identity", text);
            this.f208987g.getInput().putInt("key_id_type", o);
            this.f208987g.getInput().putString("key_true_name", obj);
            if (this.f208987g.getProcess() != null) {
                this.f208987g.getProcess().f232423c.putString("key_identity", text);
                this.f208987g.getProcess().f232423c.putInt("key_id_type", o);
                this.f208987g.getProcess().f232423c.putString("key_true_name", obj);
            }
            this.f208987g.getNetController().mo91271d(text, Integer.valueOf(o), obj);
        }
    }
}
