package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import b63.C39735i0;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.u */
public class C72055u implements Preference.C44715b {

    /* renamed from: a */
    public final /* synthetic */ C39735i0 f209009a;

    /* renamed from: b */
    public final /* synthetic */ WalletPasswordSettingUI f209010b;

    public C72055u(WalletPasswordSettingUI walletPasswordSettingUI, C39735i0 i0Var) {
        this.f209010b = walletPasswordSettingUI;
        this.f209009a = i0Var;
    }

    /* renamed from: a */
    public boolean mo24588a(Preference preference) {
        WalletPasswordSettingUI walletPasswordSettingUI = this.f209010b;
        C39735i0 i0Var = this.f209009a;
        int i = WalletPasswordSettingUI.f208872G;
        walletPasswordSettingUI.mo99226N7(i0Var);
        this.f209010b.f208874B = true;
        return true;
    }
}
