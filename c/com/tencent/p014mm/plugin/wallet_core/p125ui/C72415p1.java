package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p281yz.C79173v;
import te3.C77958k9;
import v53.C78358z;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.p1 */
public class C72415p1 implements C72478z.C72479a {

    /* renamed from: a */
    public final /* synthetic */ C77958k9 f210658a;

    /* renamed from: b */
    public final /* synthetic */ WalletSwitchVerifyPhoneUI f210659b;

    public C72415p1(WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI, C77958k9 k9Var) {
        this.f210659b = walletSwitchVerifyPhoneUI;
        this.f210658a = k9Var;
    }

    public void onClick(View view) {
        Log.m105918d("MicroMsg.WalletSwitchVerifyPhoneUI", "span click");
        WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI = this.f210659b;
        C77958k9 k9Var = this.f210658a;
        int i = WalletSwitchVerifyPhoneUI.f210294g;
        walletSwitchVerifyPhoneUI.getClass();
        Bankcard bankcard = new Bankcard();
        String str = k9Var.f227737g;
        bankcard.field_bindSerial = str;
        String str2 = k9Var.f227735e;
        bankcard.field_mobile = str2;
        String str3 = k9Var.f227736f;
        bankcard.field_bankcardType = str3;
        bankcard.field_desc = k9Var.f227738h;
        Log.m105919d("MicroMsg.WalletSwitchVerifyPhoneUI", "serial: %s,mobile: %s, bankcardType: %s, desc: %s", str, str2, str3, bankcard.field_bankName);
        walletSwitchVerifyPhoneUI.getInput().putParcelable("key_bankcard", bankcard);
        if (((C79173v) C86312j.m106911c(C79173v.class)).f232472d.mo91345a(bankcard.field_bankcardType) != null) {
            Log.m105924i("MicroMsg.WalletSwitchVerifyPhoneUI", "go to reset directly");
            walletSwitchVerifyPhoneUI.mo99642H7();
            return;
        }
        walletSwitchVerifyPhoneUI.doSceneProgress(new C78358z("", "", (PayInfo) null), true);
    }
}
