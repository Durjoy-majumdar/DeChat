package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$i */
public class WalletBalanceManagerUI$$i extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceManagerUI f21751g;

    public WalletBalanceManagerUI$$i(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f21751g = walletBalanceManagerUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_LINK_RED_DOT_INT, -1);
        Intent intent = new Intent(this.f21751g, WalletLqtDetailUI.class);
        intent.putExtra("key_account_type", 1);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtDetailUseCase(this.f21751g.getContext(), intent)) {
            WalletBalanceManagerUI walletBalanceManagerUI = this.f21751g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WalletBalanceManagerUI walletBalanceManagerUI2 = walletBalanceManagerUI;
            C117292a.m165358d(walletBalanceManagerUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$8", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletBalanceManagerUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(walletBalanceManagerUI2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI$8", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
