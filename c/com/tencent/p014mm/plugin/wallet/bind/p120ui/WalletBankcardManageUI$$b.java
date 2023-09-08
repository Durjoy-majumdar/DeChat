package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$b */
public class WalletBankcardManageUI$$b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBankcardManageUI f208466d;

    public WalletBankcardManageUI$$b(WalletBankcardManageUI walletBankcardManageUI) {
        this.f208466d = walletBankcardManageUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f208466d.finish();
        C115669n.INSTANCE.mo160131h(14422, 4);
        return true;
    }
}
