package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ob0.C89132b;
import te3.C51987xk3;
import te3.C52045y0;
import te3.gg4;
import te3.kg4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.l */
public class C43348l implements C87581a<Object, C89132b.C89134c<C51987xk3>> {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117218a;

    public C43348l(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        this.f117218a = walletLqtBalanceAutoTransferUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletLqtBalanceAutoTransferUI", "qry back: %s, %s, %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256793a));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C71648n1.m84125c(((C51987xk3) cVar.f256796d).f144728o);
            C51987xk3 xk32 = (C51987xk3) cVar.f256796d;
            if (xk32.f144720d == 0) {
                WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f117218a;
                walletLqtBalanceAutoTransferUI.f117181q = xk32.f144726j;
                walletLqtBalanceAutoTransferUI.f117182r = xk32.f144727n;
                walletLqtBalanceAutoTransferUI.f117175h.setText(xk32.f144722f);
                walletLqtBalanceAutoTransferUI.f117176i.setText(xk32.f144723g);
                C52045y0 y0Var = xk32.f144724h;
                if (y0Var != null) {
                    walletLqtBalanceAutoTransferUI.f117172e.setText(y0Var.f145053d);
                    int i = xk32.f144724h.f145054e;
                    if (i == 0) {
                        walletLqtBalanceAutoTransferUI.mo67540K7();
                    } else if (i == 1) {
                        walletLqtBalanceAutoTransferUI.mo67539J7();
                    } else if (i == 2) {
                        walletLqtBalanceAutoTransferUI.f117171d.setCheck(false);
                        walletLqtBalanceAutoTransferUI.f117171d.setEnabled(false);
                        View view = walletLqtBalanceAutoTransferUI.f117183s;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAcctountDisabled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAcctountDisabled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        walletLqtBalanceAutoTransferUI.mo67537H7();
                    }
                }
                gg4 gg4 = xk32.f144725i;
                if (gg4 == null) {
                    return null;
                }
                walletLqtBalanceAutoTransferUI.f117173f.setText(gg4.f134041d);
                kg4 kg4 = xk32.f144725i.f134042e;
                if (kg4 == null) {
                    return null;
                }
                walletLqtBalanceAutoTransferUI.getClass();
                walletLqtBalanceAutoTransferUI.f117179o = kg4.f136782d / 60;
                walletLqtBalanceAutoTransferUI.f117174g.setText(walletLqtBalanceAutoTransferUI.mo67538I7(kg4, C0966R.string.kw8));
                return null;
            }
            C75228t.m90211D(this.f117218a.getContext(), ((C51987xk3) cVar.f256796d).f144721e);
            return null;
        }
        C75228t.m90209B(this.f117218a.getContext(), cVar.f256795c);
        return null;
    }
}
