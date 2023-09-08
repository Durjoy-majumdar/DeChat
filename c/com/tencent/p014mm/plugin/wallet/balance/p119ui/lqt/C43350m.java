package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.C49960j83;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.m */
public class C43350m implements C87581a<Object, C89132b.C89134c<C49960j83>> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117221a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117222b;

    public C43350m(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, Dialog dialog) {
        this.f117222b = walletLqtBalanceAutoTransferUI;
        this.f117221a = dialog;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletLqtBalanceAutoTransferUI", "open back: %s, %s, %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256793a));
        Dialog dialog = this.f117221a;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            this.f117222b.f117171d.setCheck(false);
            C75228t.m90209B(this.f117222b.getContext(), cVar.f256795c);
            return null;
        } else if (((C49960j83) cVar.f256796d).f135921d == 0) {
            this.f117222b.f117171d.setCheck(true);
            this.f117222b.mo67541L7();
            return null;
        } else {
            this.f117222b.f117171d.setCheck(false);
            C75228t.m90211D(this.f117222b.getContext(), ((C49960j83) cVar.f256796d).f135922e);
            return null;
        }
    }
}
