package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.C51335t24;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$b */
public final /* synthetic */ class WalletOfflineCoinPurseUI$$b implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201937a;

    /* renamed from: b */
    public final /* synthetic */ int f201938b;

    public /* synthetic */ WalletOfflineCoinPurseUI$$b(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, int i) {
        this.f201937a = walletOfflineCoinPurseUI;
        this.f201938b = i;
    }

    public final Object call(Object obj) {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201937a;
        int i = this.f201938b;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i2 = WalletOfflineCoinPurseUI.f201810W1;
        if (walletOfflineCoinPurseUI.isFinishing() || walletOfflineCoinPurseUI.isDestroyed()) {
            return null;
        }
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response: %s, %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            return null;
        }
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response retcode: %s, %s", Integer.valueOf(((C51335t24) cVar.f256796d).f141910d), ((C51335t24) cVar.f256796d).f141911e);
        if (((C51335t24) cVar.f256796d).f141910d != 0) {
            return null;
        }
        walletOfflineCoinPurseUI.mo96310e8(i);
        walletOfflineCoinPurseUI.mo96291L7(true);
        return null;
    }
}
