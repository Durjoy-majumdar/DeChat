package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.MenuItem;
import k53.C76492a;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.q0 */
public class C71824q0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtPlanAddUI f208367d;

    public C71824q0(WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f208367d = walletLqtPlanAddUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76492a aVar = this.f208367d.f208019Z;
        if (aVar != null) {
            aVar.mo106728c();
            WalletLqtPlanAddUI.m84211I7(this.f208367d);
        }
    }
}
