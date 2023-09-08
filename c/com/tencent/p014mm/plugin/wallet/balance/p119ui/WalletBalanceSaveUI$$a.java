package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$a */
public final /* synthetic */ class WalletBalanceSaveUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceSaveUI f207852d;

    /* renamed from: e */
    public final /* synthetic */ WalletGetBulletinEvent f207853e;

    public /* synthetic */ WalletBalanceSaveUI$$a(WalletBalanceSaveUI walletBalanceSaveUI, WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f207852d = walletBalanceSaveUI;
        this.f207853e = walletGetBulletinEvent;
    }

    public final void run() {
        this.f207852d.f207842q.setBannerData(this.f207853e.f79043e.f79050e);
    }
}
