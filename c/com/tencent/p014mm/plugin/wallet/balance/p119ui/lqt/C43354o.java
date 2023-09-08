package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import ob0.C89132b;
import te3.C49357f03;
import te3.kg4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.o */
public class C43354o implements C87581a<Object, C89132b.C89134c<C49357f03>> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117229a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117230b;

    public C43354o(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, Dialog dialog) {
        this.f117230b = walletLqtBalanceAutoTransferUI;
        this.f117229a = dialog;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletLqtBalanceAutoTransferUI", "modify back: %s, %s, %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256793a));
        Dialog dialog = this.f117229a;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            C75228t.m90209B(this.f117230b.getContext(), cVar.f256795c);
            return null;
        } else if (((C49357f03) cVar.f256796d).f133219d == 0) {
            WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f117230b;
            kg4 kg4 = walletLqtBalanceAutoTransferUI.f117180p;
            walletLqtBalanceAutoTransferUI.getClass();
            if (kg4 != null) {
                walletLqtBalanceAutoTransferUI.f117174g.setText(walletLqtBalanceAutoTransferUI.mo67538I7(kg4, C0966R.string.kw8));
                return null;
            }
            walletLqtBalanceAutoTransferUI.f117174g.setText("");
            return null;
        } else {
            C75228t.m90211D(this.f117230b.getContext(), ((C49357f03) cVar.f256796d).f133220e);
            return null;
        }
    }
}
