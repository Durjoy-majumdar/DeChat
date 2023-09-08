package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71652v;
import qo3.C101218e0;
import te3.C77977pf3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$p */
public class WalletLqtSaveFetchUI$$p implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f208276a;

    /* renamed from: b */
    public final /* synthetic */ C77977pf3 f208277b;

    /* renamed from: c */
    public final /* synthetic */ C71652v f208278c;

    /* renamed from: d */
    public final /* synthetic */ long f208279d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtSaveFetchUI f208280e;

    public WalletLqtSaveFetchUI$$p(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C101218e0 e0Var, C77977pf3 pf32, C71652v vVar, long j) {
        this.f208280e = walletLqtSaveFetchUI;
        this.f208276a = e0Var;
        this.f208277b = pf32;
        this.f208278c = vVar;
        this.f208279d = j;
    }

    /* renamed from: a */
    public void mo2001a() {
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208280e;
        walletLqtSaveFetchUI.f208172S0 = false;
        WalletLqtSaveFetchUI.m84236J7(walletLqtSaveFetchUI, this.f208276a, this.f208277b.f228015i);
        if (this.f208278c.f207656b == 100) {
            C115669n.INSTANCE.mo160131h(17084, 32, Long.valueOf(this.f208279d));
            WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = this.f208280e;
            walletLqtSaveFetchUI2.f208170R0 = true;
            walletLqtSaveFetchUI2.f208179W = true;
            this.f208276a.mo140680z();
        }
    }
}
