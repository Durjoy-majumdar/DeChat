package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$a */
public final /* synthetic */ class WalletBankcardManageUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletBankcardManageUI f208464d;

    /* renamed from: e */
    public final /* synthetic */ WalletGetBulletinEvent f208465e;

    public /* synthetic */ WalletBankcardManageUI$$a(WalletBankcardManageUI walletBankcardManageUI, WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f208464d = walletBankcardManageUI;
        this.f208465e = walletGetBulletinEvent;
    }

    public final void run() {
        WalletBankcardManageUI walletBankcardManageUI = this.f208464d;
        WalletGetBulletinEvent walletGetBulletinEvent = this.f208465e;
        int i = WalletBankcardManageUI.f208441y;
        walletBankcardManageUI.getClass();
        WalletGetBulletinEvent.C28848b bVar = walletGetBulletinEvent.f79043e;
        if (bVar.f79049d == 2) {
            walletBankcardManageUI.f208456u.setBannerData(bVar.f79050e);
        } else if (!Util.isNullOrNil(bVar.f79046a)) {
            WalletGetBulletinEvent.C28848b bVar2 = walletGetBulletinEvent.f79043e;
            C75228t.m90247g0((View) null, (TextView) walletBankcardManageUI.findViewById(C0966R.C0970id.a7l), bVar2.f79046a, bVar2.f79047b, bVar2.f79048c);
        } else {
            Log.m105924i("MicroMsg.WalletBankcardManageUI", "no bulletin data");
        }
    }
}
