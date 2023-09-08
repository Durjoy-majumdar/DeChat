package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.C50188kx;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.n */
public class C43352n implements C87581a<Object, C89132b.C89134c<C50188kx>> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117225a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117226b;

    public C43352n(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, Dialog dialog) {
        this.f117226b = walletLqtBalanceAutoTransferUI;
        this.f117225a = dialog;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletLqtBalanceAutoTransferUI", "close back: %s, %s, %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256793a));
        Dialog dialog = this.f117225a;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            this.f117226b.f117171d.setCheck(true);
            C75228t.m90209B(this.f117226b.getContext(), cVar.f256795c);
            return null;
        } else if (((C50188kx) cVar.f256796d).f137075d == 0) {
            this.f117226b.f117171d.setCheck(false);
            this.f117226b.mo67537H7();
            return null;
        } else {
            this.f117226b.f117171d.setCheck(true);
            C75228t.m90211D(this.f117226b.getContext(), ((C50188kx) cVar.f256796d).f137076e);
            return null;
        }
    }
}
