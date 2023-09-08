package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.C0966R;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.k1 */
public class C5752k1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f21805d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanDetailUI f21806e;

    public C5752k1(WalletLqtPlanDetailUI walletLqtPlanDetailUI, List list) {
        this.f21806e = walletLqtPlanDetailUI;
        this.f21805d = list;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        for (Integer intValue : this.f21805d) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 1) {
                e0Var.mo107125a(intValue2, C0966R.string.ky6);
            } else if (intValue2 == 2) {
                e0Var.mo107142f(intValue2, this.f21806e.getString(C0966R.string.ky7));
            } else if (intValue2 == 3) {
                e0Var.mo107140d(intValue2, this.f21806e.getContext().getResources().getColor(C0966R.color.f2966ao), this.f21806e.getString(C0966R.string.ky4));
            } else if (intValue2 == 4) {
                e0Var.mo107125a(intValue2, C0966R.string.ky5);
            }
        }
    }
}
