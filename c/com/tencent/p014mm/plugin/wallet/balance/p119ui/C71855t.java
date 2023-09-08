package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.t */
public class C71855t extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceManagerUI$$k f208412g;

    /* renamed from: h */
    public final /* synthetic */ WalletBalanceManagerUI f208413h;

    public C71855t(WalletBalanceManagerUI walletBalanceManagerUI, WalletBalanceManagerUI$$k walletBalanceManagerUI$$k) {
        this.f208413h = walletBalanceManagerUI;
        this.f208412g = walletBalanceManagerUI$$k;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        WalletBalanceManagerUI$$k walletBalanceManagerUI$$k = this.f208412g;
        int i = walletBalanceManagerUI$$k.f207820a;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f208412g.f207821b);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C75228t.m90217J(this.f208413h.getContext(), intent);
        } else if (i == 2) {
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            WalletBalanceManagerUI$$k walletBalanceManagerUI$$k2 = this.f208412g;
            aVar.f9526a = walletBalanceManagerUI$$k2.f207822c;
            aVar.f9527b = walletBalanceManagerUI$$k2.f207823d;
            aVar.f9529d = 1034;
            aVar.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
        } else if (i != 3) {
            Log.m105924i("MicroMsg.WalletBalanceManagerUI", "unknown entrance type");
        } else if (walletBalanceManagerUI$$k.f207821b.equals("wxpay://lqp/balanceQuotaState")) {
            C88144b.m109791i(this.f208413h.getContext(), "wallet_ecard", ".ui.WalletECardLogoutUI", new Intent(), (Bundle) null);
        }
        C75228t.m90243e0(46, 1);
    }
}
