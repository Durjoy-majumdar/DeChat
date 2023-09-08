package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.MenuItem;
import k53.C76492a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.x */
public class C71862x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceSaveUI f208424d;

    public C71862x(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f208424d = walletBalanceSaveUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76492a aVar = this.f208424d.f207845t;
        if (aVar != null) {
            aVar.mo106728c();
            WalletBalanceSaveUI walletBalanceSaveUI = this.f208424d;
            walletBalanceSaveUI.f207834f = null;
            walletBalanceSaveUI.mo98879M7();
        }
    }
}
