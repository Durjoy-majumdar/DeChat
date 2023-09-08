package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.g1 */
public class C43342g1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtPlanAddUI f117210a;

    public C43342g1(WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f117210a = walletLqtPlanAddUI;
    }

    public void onClick(View view) {
        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "click protocal ");
        C75228t.m90219L(this.f117210a.getContext(), this.f117210a.f208002H.f137443e, true);
    }
}
