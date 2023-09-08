package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.MenuItem;
import java.util.List;
import k53.C76492a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.y */
public class C71863y implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ List f208425d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceSaveUI f208426e;

    public C71863y(WalletBalanceSaveUI walletBalanceSaveUI, List list) {
        this.f208426e = walletBalanceSaveUI;
        this.f208425d = list;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76492a aVar = this.f208426e.f207845t;
        if (aVar != null) {
            aVar.mo106728c();
            if (i < this.f208425d.size()) {
                WalletBalanceSaveUI walletBalanceSaveUI = this.f208426e;
                walletBalanceSaveUI.f207834f = walletBalanceSaveUI.f207833e.get(i);
                this.f208426e.mo98879M7();
                return;
            }
            WalletBalanceSaveUI walletBalanceSaveUI2 = this.f208426e;
            walletBalanceSaveUI2.f207834f = null;
            walletBalanceSaveUI2.mo98879M7();
        }
    }
}
