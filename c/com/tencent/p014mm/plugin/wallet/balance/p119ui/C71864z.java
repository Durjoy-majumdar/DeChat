package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import java.util.List;
import k53.C76492a;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.z */
public class C71864z implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ List f208427a;

    /* renamed from: b */
    public final /* synthetic */ WalletBalanceSaveUI f208428b;

    public C71864z(WalletBalanceSaveUI walletBalanceSaveUI, List list) {
        this.f208428b = walletBalanceSaveUI;
        this.f208427a = list;
    }

    /* renamed from: a */
    public void mo2001a() {
        C76492a aVar = this.f208428b.f207845t;
        if (aVar != null) {
            aVar.mo106728c();
            int i = this.f208428b.f207845t.f223933m;
            if (i < 0 || i >= this.f208427a.size()) {
                WalletBalanceSaveUI walletBalanceSaveUI = this.f208428b;
                walletBalanceSaveUI.f207834f = null;
                walletBalanceSaveUI.mo98879M7();
                return;
            }
            WalletBalanceSaveUI walletBalanceSaveUI2 = this.f208428b;
            walletBalanceSaveUI2.f207834f = walletBalanceSaveUI2.f207833e.get(walletBalanceSaveUI2.f207845t.f223933m);
            this.f208428b.mo98879M7();
        }
    }
}
