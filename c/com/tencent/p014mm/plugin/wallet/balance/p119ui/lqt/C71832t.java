package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.report.service.C115669n;
import qo3.C101218e0;
import te3.C77977pf3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.t */
public class C71832t implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C77977pf3 f208382a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtDetailUI f208383b;

    public C71832t(WalletLqtDetailUI walletLqtDetailUI, C77977pf3 pf32) {
        this.f208383b = walletLqtDetailUI;
        this.f208382a = pf32;
    }

    /* renamed from: a */
    public void mo2001a() {
        this.f208383b.f207958b1 = true;
        C115669n.INSTANCE.mo160131h(16807, 4);
        WalletLqtDetailUI walletLqtDetailUI = this.f208383b;
        WalletLqtDetailUI.m84195H7(walletLqtDetailUI, walletLqtDetailUI.f207957a1, this.f208382a.f228014h);
    }
}
