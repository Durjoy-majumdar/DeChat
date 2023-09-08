package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C51892wy;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.s1 */
public class C71831s1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C51892wy f208380a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208381b;

    public C71831s1(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C51892wy wyVar) {
        this.f208381b = walletLqtSaveFetchUI;
        this.f208380a = wyVar;
    }

    public void onClick(View view) {
        C115669n.INSTANCE.mo160131h(17084, 26);
        this.f208381b.f208195g.f207646e.mo67530b(1, 0);
        C51892wy wyVar = this.f208380a;
        int i = wyVar.f144347f;
        if (i == 1) {
            this.f208381b.mo98984W7((String) null, 1);
        } else if (i == 2) {
            C75228t.m90219L(this.f208381b.getContext(), this.f208380a.f144348g, true);
        } else if (i == 3) {
            C75228t.m90224Q(wyVar.f144349h, wyVar.f144348g, 0, 1000);
        }
    }
}
