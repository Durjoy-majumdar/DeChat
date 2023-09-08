package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.report.service.C115669n;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.u */
public class C71835u implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtDetailUI f208387a;

    public C71835u(WalletLqtDetailUI walletLqtDetailUI) {
        this.f208387a = walletLqtDetailUI;
    }

    public void dismiss() {
        if (!this.f208387a.f207958b1) {
            C115669n.INSTANCE.mo160131h(16807, 6);
        }
    }
}
