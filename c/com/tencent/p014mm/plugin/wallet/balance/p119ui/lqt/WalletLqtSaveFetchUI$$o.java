package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71652v;
import qo3.C101218e0;
import te3.C77977pf3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$o */
public class WalletLqtSaveFetchUI$$o implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f208271a;

    /* renamed from: b */
    public final /* synthetic */ C77977pf3 f208272b;

    /* renamed from: c */
    public final /* synthetic */ C71652v f208273c;

    /* renamed from: d */
    public final /* synthetic */ long f208274d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtSaveFetchUI f208275e;

    public WalletLqtSaveFetchUI$$o(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C101218e0 e0Var, C77977pf3 pf32, C71652v vVar, long j) {
        this.f208275e = walletLqtSaveFetchUI;
        this.f208271a = e0Var;
        this.f208272b = pf32;
        this.f208273c = vVar;
        this.f208274d = j;
    }

    /* renamed from: a */
    public void mo2001a() {
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208275e;
        walletLqtSaveFetchUI.f208172S0 = false;
        WalletLqtSaveFetchUI.m84236J7(walletLqtSaveFetchUI, this.f208271a, this.f208272b.f228014h);
        if (this.f208273c.f207656b == 100) {
            C115669n.INSTANCE.mo160131h(17084, 31, Long.valueOf(this.f208274d));
        }
    }
}
