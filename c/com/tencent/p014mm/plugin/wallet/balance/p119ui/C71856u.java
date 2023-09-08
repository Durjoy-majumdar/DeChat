package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.C50042jv1;
import te3.C50765p1;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.u */
public class C71856u implements C87581a<Object, C89132b.C89134c<C50042jv1>> {

    /* renamed from: a */
    public final /* synthetic */ WalletBalanceManagerUI f208414a;

    public C71856u(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f208414a = walletBalanceManagerUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletBalanceManagerUI", "errCode: %s, errType: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            WalletBalanceManagerUI walletBalanceManagerUI = this.f208414a;
            C50765p1 p1Var = ((C50042jv1) cVar.f256796d).f136352d;
            int i = WalletBalanceManagerUI.f207786A;
            walletBalanceManagerUI.getClass();
            this.f208414a.mo98861I7();
        }
        this.f208414a.f207799s = null;
        return null;
    }
}
