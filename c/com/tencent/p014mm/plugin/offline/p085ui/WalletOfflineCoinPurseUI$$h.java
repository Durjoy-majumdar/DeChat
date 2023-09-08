package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$h */
public class WalletOfflineCoinPurseUI$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletGetBulletinEvent f201958d;

    /* renamed from: e */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201959e;

    public WalletOfflineCoinPurseUI$$h(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f201959e = walletOfflineCoinPurseUI;
        this.f201958d = walletGetBulletinEvent;
    }

    public void run() {
        if (!Util.isNullOrNil(this.f201958d.f79043e.f79046a)) {
            WalletGetBulletinEvent.C28848b bVar = this.f201958d.f79043e;
            C75228t.m90247g0((View) null, (TextView) this.f201959e.findViewById(C0966R.C0970id.a7l), bVar.f79046a, bVar.f79047b, bVar.f79048c);
            return;
        }
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "no bulletin data");
    }
}
