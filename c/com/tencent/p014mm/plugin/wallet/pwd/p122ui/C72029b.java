package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import f40.C86709a0;
import nj3.C76912y0;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.b */
public class C72029b implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f208978a;

    /* renamed from: b */
    public final /* synthetic */ WalletDelayTransferSettingUI f208979b;

    public C72029b(WalletDelayTransferSettingUI walletDelayTransferSettingUI, C101218e0 e0Var) {
        this.f208979b = walletDelayTransferSettingUI;
        this.f208978a = e0Var;
    }

    /* renamed from: a */
    public void mo2001a() {
        this.f208978a.mo140680z();
        WalletDelayTransferSettingUI walletDelayTransferSettingUI = this.f208979b;
        int i = WalletDelayTransferSettingUI.f208757u;
        if (walletDelayTransferSettingUI.mo99188H7(16)) {
            C115669n.INSTANCE.mo160131h(23319, Integer.valueOf(walletDelayTransferSettingUI.f208770s), Integer.valueOf(walletDelayTransferSettingUI.f208771t), 2);
        } else if (walletDelayTransferSettingUI.mo99188H7(32)) {
            C115669n.INSTANCE.mo160131h(23319, Integer.valueOf(walletDelayTransferSettingUI.f208770s), Integer.valueOf(walletDelayTransferSettingUI.f208771t), 3);
        } else {
            C115669n.INSTANCE.mo160131h(23319, Integer.valueOf(walletDelayTransferSettingUI.f208770s), Integer.valueOf(walletDelayTransferSettingUI.f208771t), 1);
        }
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(walletDelayTransferSettingUI.f208759e));
        C76912y0.m92769h(walletDelayTransferSettingUI.getContext(), walletDelayTransferSettingUI.getString(C0966R.string.ks7), C0966R.raw.icons_filled_done);
        walletDelayTransferSettingUI.finish();
    }
}
