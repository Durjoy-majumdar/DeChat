package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$b */
public class WalletBalanceManagerUI$$b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceManagerUI f207810d;

    public WalletBalanceManagerUI$$b(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f207810d = walletBalanceManagerUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        if (!Util.isNullOrNil(this.f207810d.f207797q.f209419n2)) {
            Log.m105925i("MicroMsg.WalletBalanceManagerUI", "carson: entry_url: %s", this.f207810d.f207797q.f209419n2);
            intent.putExtra("rawUrl", this.f207810d.f207797q.f209419n2);
        } else {
            intent.putExtra("rawUrl", this.f207810d.f207797q.f209418m2);
        }
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        intent.putExtra("KPublisherId", "pay_blance_list");
        intent.putExtra("geta8key_scene", 33);
        intent.putExtra(C74928u.C45093i.f122326r, true);
        C75228t.m90217J(this.f207810d.getContext(), intent);
        C75228t.m90243e0(16, 1);
        C115669n.INSTANCE.mo160131h(16503, 1, "balanceBill");
        return true;
    }
}
