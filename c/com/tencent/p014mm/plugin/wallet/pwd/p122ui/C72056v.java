package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75122k;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.v */
public class C72056v implements C75122k {

    /* renamed from: a */
    public final /* synthetic */ int f209011a;

    /* renamed from: b */
    public final /* synthetic */ WalletPasswordSettingUI f209012b;

    public C72056v(WalletPasswordSettingUI walletPasswordSettingUI, int i) {
        this.f209012b = walletPasswordSettingUI;
        this.f209011a = i;
    }

    /* renamed from: a */
    public void mo95653a(int i, String str) {
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog click next");
        C115669n.INSTANCE.mo160131h(24835, 2, 2);
        WalletPasswordSettingUI walletPasswordSettingUI = this.f209012b;
        walletPasswordSettingUI.f208892t.f125040g = false;
        walletPasswordSettingUI.f208875C = true;
        walletPasswordSettingUI.mo99221I7(this.f209011a);
    }

    public void onCancel() {
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog click cancel");
        C115669n.INSTANCE.mo160131h(24835, 2, 3);
        WalletPasswordSettingUI walletPasswordSettingUI = this.f209012b;
        walletPasswordSettingUI.f208875C = true;
        CheckBoxPreference checkBoxPreference = walletPasswordSettingUI.f208882g;
        checkBoxPreference.mo6805K(!checkBoxPreference.mo6804J());
        this.f209012b.f208879d.notifyDataSetChanged();
    }
}
