package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import di3.C86312j;
import ie3.C76324c;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.aa.ui.s1 */
public class C68333s1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196356a;

    public C68333s1(PaylistAAUI paylistAAUI) {
        this.f196356a = paylistAAUI;
    }

    public void onClick(View view) {
        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "onClick() mBottomTipTv");
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startWalletBalanceEntryUseCase(this.f196356a)) {
            Intent intent = new Intent();
            intent.putExtra("key_scene_balance_manager", 0);
            C88144b.m109791i(this.f196356a, "wallet", ".balance.ui.WalletBalanceManagerUI", intent, (Bundle) null);
        }
        C115669n.INSTANCE.mo160131h(13721, 4, 4, Integer.valueOf(this.f196356a.f196247Q));
    }
}
