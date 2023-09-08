package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C64514l50;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.m2 */
public class C71811m2 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C64514l50 f208347a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208348b;

    public C71811m2(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C64514l50 l502) {
        this.f208348b = walletLqtSaveFetchUI;
        this.f208347a = l502;
    }

    public void onClick(View view) {
        C75228t.m90221N(this.f208348b.getContext(), this.f208347a.f184040f, true);
        C115669n.INSTANCE.mo160131h(20287, 7);
    }
}
