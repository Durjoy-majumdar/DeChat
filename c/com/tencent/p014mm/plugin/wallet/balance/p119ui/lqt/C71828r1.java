package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.r1 */
public class C71828r1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ int f208374a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208375b;

    public C71828r1(WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i) {
        this.f208375b = walletLqtSaveFetchUI;
        this.f208374a = i;
    }

    public void onClick(View view) {
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208375b;
        WalletFormView walletFormView = walletLqtSaveFetchUI.f208199i;
        walletFormView.setText(C75228t.m90260n(walletLqtSaveFetchUI.mo98975N7(this.f208374a + "", "100", 2)));
        this.f208375b.f208199i.getContentEt().requestFocus();
        this.f208375b.showWcKb();
    }
}
