package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.w */
public class C72057w implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ WalletPasswordSettingUI f209013a;

    public C72057w(WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f209013a = walletPasswordSettingUI;
    }

    public void dismiss() {
        WalletPasswordSettingUI walletPasswordSettingUI = this.f209013a;
        if (!walletPasswordSettingUI.f208875C) {
            CheckBoxPreference checkBoxPreference = walletPasswordSettingUI.f208882g;
            checkBoxPreference.mo6805K(!checkBoxPreference.mo6804J());
            this.f209013a.f208879d.notifyDataSetChanged();
        }
    }
}
