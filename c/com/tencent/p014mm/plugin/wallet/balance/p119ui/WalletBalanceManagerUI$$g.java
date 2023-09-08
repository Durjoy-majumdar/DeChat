package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$g */
public class WalletBalanceManagerUI$$g extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceManagerUI f207816g;

    public WalletBalanceManagerUI$$g(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f207816g = walletBalanceManagerUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/kfweb/helpcenter/dispatch?scene_code=CommIssueChange");
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        intent.putExtra(C74928u.C45093i.f122326r, true);
        C75228t.m90217J(this.f207816g.getContext(), intent);
        C75228t.m90243e0(17, 1);
    }
}
