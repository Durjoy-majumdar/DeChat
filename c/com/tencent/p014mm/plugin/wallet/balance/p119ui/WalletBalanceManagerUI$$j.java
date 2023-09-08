package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.View;
import b63.C67203r0;
import b63.C67205s0;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$j */
public class WalletBalanceManagerUI$$j extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C67205s0 f207818g;

    /* renamed from: h */
    public final /* synthetic */ WalletBalanceManagerUI f207819h;

    public WalletBalanceManagerUI$$j(WalletBalanceManagerUI walletBalanceManagerUI, C67205s0 s0Var) {
        this.f207819h = walletBalanceManagerUI;
        this.f207818g = s0Var;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_LINK_RED_DOT_INT, -1);
        WalletBalanceManagerUI walletBalanceManagerUI = this.f207819h;
        C67203r0 r0Var = this.f207818g.f192953f;
        C75228t.m90221N(walletBalanceManagerUI, r0Var != null ? r0Var.field_lct_url : null, true);
    }
}
