package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C64483k33;
import te3.C64578nc0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.q2 */
public class C57492q2 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C64578nc0 f164709g;

    /* renamed from: h */
    public final /* synthetic */ WalletLqtSaveFetchUI f164710h;

    public C57492q2(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C64578nc0 nc02) {
        this.f164710h = walletLqtSaveFetchUI;
        this.f164709g = nc02;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C64483k33 k332 = this.f164709g.f184459d;
        int i = k332.f183889h;
        if (i != 1) {
            if (i == 2) {
                C75228t.m90219L(this.f164710h.getContext(), this.f164709g.f184459d.f183887f, true);
            } else if (i == 3) {
                C75228t.m90224Q(k332.f183890i, k332.f183887f, 0, 1061);
            }
        }
    }
}
