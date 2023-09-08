package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b0 */
public class WalletLqtSaveFetchUI$$b0 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtSaveFetchUI f208229a;

    public WalletLqtSaveFetchUI$$b0(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208229a = walletLqtSaveFetchUI;
    }

    public void onClick(View view) {
        C115669n.INSTANCE.mo160131h(17084, 33, 0);
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208229a;
        walletLqtSaveFetchUI.f208199i.setText(C75228t.m90260n(walletLqtSaveFetchUI.f208171S.f209415j2));
        this.f208229a.f208199i.getContentEt().requestFocus();
        this.f208229a.showNormalStWcKb();
    }
}
