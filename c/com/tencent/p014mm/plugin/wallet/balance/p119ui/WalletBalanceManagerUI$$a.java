package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$a */
public final /* synthetic */ class WalletBalanceManagerUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceManagerUI f207808d;

    /* renamed from: e */
    public final /* synthetic */ WalletGetBulletinEvent f207809e;

    public /* synthetic */ WalletBalanceManagerUI$$a(WalletBalanceManagerUI walletBalanceManagerUI, WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f207808d = walletBalanceManagerUI;
        this.f207809e = walletGetBulletinEvent;
    }

    public final void run() {
        WalletBalanceManagerUI walletBalanceManagerUI = this.f207808d;
        WalletGetBulletinEvent walletGetBulletinEvent = this.f207809e;
        int i = WalletBalanceManagerUI.f207786A;
        walletBalanceManagerUI.getClass();
        WalletGetBulletinEvent.C28848b bVar = walletGetBulletinEvent.f79043e;
        if (bVar.f79049d == 2) {
            walletBalanceManagerUI.f207796p.setBannerData(bVar.f79050e);
        } else if (!Util.isNullOrNil(bVar.f79046a)) {
            TextView textView = walletBalanceManagerUI.f207789f;
            WalletGetBulletinEvent.C28848b bVar2 = walletGetBulletinEvent.f79043e;
            C75228t.m90247g0((View) null, textView, bVar2.f79046a, bVar2.f79047b, bVar2.f79048c);
        }
    }
}
