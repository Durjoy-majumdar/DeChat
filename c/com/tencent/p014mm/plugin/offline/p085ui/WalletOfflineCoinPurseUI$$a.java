package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import hp3.C87581a;
import nj3.C76879j;
import ob0.C89132b;
import te3.C51335t24;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$a */
public final /* synthetic */ class WalletOfflineCoinPurseUI$$a implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201930a;

    /* renamed from: b */
    public final /* synthetic */ Bankcard f201931b;

    /* renamed from: c */
    public final /* synthetic */ boolean f201932c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f201933d;

    public /* synthetic */ WalletOfflineCoinPurseUI$$a(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, Bankcard bankcard, boolean z, Runnable runnable) {
        this.f201930a = walletOfflineCoinPurseUI;
        this.f201931b = bankcard;
        this.f201932c = z;
        this.f201933d = runnable;
    }

    public final Object call(Object obj) {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201930a;
        Bankcard bankcard = this.f201931b;
        boolean z = this.f201932c;
        Runnable runnable = this.f201933d;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = WalletOfflineCoinPurseUI.f201810W1;
        walletOfflineCoinPurseUI.hideLoading();
        if (!walletOfflineCoinPurseUI.isFinishing() && !walletOfflineCoinPurseUI.isDestroyed()) {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response: %s, %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "setpayment response retcode: %s, %s", Integer.valueOf(((C51335t24) cVar.f256796d).f141910d), ((C51335t24) cVar.f256796d).f141911e);
                C51335t24 t242 = (C51335t24) cVar.f256796d;
                if (t242.f141910d == 0) {
                    walletOfflineCoinPurseUI.f201816C1 = null;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
                    walletOfflineCoinPurseUI.mo96311f8();
                    walletOfflineCoinPurseUI.mo96292M7(bankcard, z);
                    if (runnable != null) {
                        runnable.run();
                    }
                } else if (!Util.isNullOrNil(t242.f141911e)) {
                    C76879j.m92749t(walletOfflineCoinPurseUI.getContext(), ((C51335t24) cVar.f256796d).f141911e, "", new WalletOfflineCoinPurseUI$$c());
                }
            } else {
                C76879j.m92754y(walletOfflineCoinPurseUI.getContext(), walletOfflineCoinPurseUI.getString(C0966R.string.m0i), "", walletOfflineCoinPurseUI.getString(C0966R.string.f8029zr), new WalletOfflineCoinPurseUI$$d());
            }
        }
        return null;
    }
}
