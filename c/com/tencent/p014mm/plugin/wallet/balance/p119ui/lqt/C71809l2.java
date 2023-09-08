package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import qo3.C101218e0;
import te3.C64514l50;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.l2 */
public class C71809l2 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C64514l50 f208343a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0 f208344b;

    /* renamed from: c */
    public final /* synthetic */ WalletLqtSaveFetchUI f208345c;

    public C71809l2(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C64514l50 l502, C101218e0 e0Var) {
        this.f208345c = walletLqtSaveFetchUI;
        this.f208343a = l502;
        this.f208344b = e0Var;
    }

    public void onClick(View view) {
        C75228t.m90220M(this.f208345c.getContext(), this.f208343a.f184040f, true, 1);
        C115669n.INSTANCE.mo160131h(20287, 7);
        this.f208344b.mo140680z();
    }
}
