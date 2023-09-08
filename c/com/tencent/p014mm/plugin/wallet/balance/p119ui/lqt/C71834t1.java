package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C78015xr2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 */
public class C71834t1 implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ C78015xr2 f208385a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208386b;

    public C71834t1(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C78015xr2 xr22) {
        this.f208386b = walletLqtSaveFetchUI;
        this.f208385a = xr22;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click balance limit wording");
        C75228t.m90220M(this.f208386b.getContext(), this.f208385a.f228544p.f185739f, true, 1);
        C115669n.INSTANCE.mo160131h(20216, 1, this.f208385a.f228544p.f185739f);
    }
}
