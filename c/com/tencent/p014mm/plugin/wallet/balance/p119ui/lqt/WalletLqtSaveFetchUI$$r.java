package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$r */
public class WalletLqtSaveFetchUI$$r implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtSaveFetchUI f208282a;

    public WalletLqtSaveFetchUI$$r(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208282a = walletLqtSaveFetchUI;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click balance limit wording");
        C75228t.m90220M(this.f208282a.getContext(), C71654w.f207659q.f207671j, true, 1);
    }
}
