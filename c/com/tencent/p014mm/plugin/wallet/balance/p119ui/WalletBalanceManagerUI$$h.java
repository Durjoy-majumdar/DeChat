package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import f40.C86709a0;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$h */
public class WalletBalanceManagerUI$$h extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceManagerUI f207817g;

    public WalletBalanceManagerUI$$h(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f207817g = walletBalanceManagerUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_LINK_RED_DOT_INT, -1);
        Bundle bundle = new Bundle();
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putString("realname_verify_process_jump_plugin", "wallet");
        bundle.putString("realname_verify_process_jump_activity", "com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI");
        bundle.putInt("entry_scene", 1009);
        C79143a.m95771j(this.f207817g, RealNameVerifyProcess.class, bundle, (C79148e.C79149a) null);
    }
}
