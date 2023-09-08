package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.v0 */
public class C71838v0 implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C7045j f208389a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f208390b;

    public C71838v0(WalletLqtPlanAddUI walletLqtPlanAddUI, C7045j jVar) {
        this.f208390b = walletLqtPlanAddUI;
        this.f208389a = jVar;
    }

    public void onResult(boolean z, Object obj, Object obj2) {
        this.f208389a.mo8101d();
        if (z) {
            this.f208390b.f208003I.f228571d = this.f208389a.mo8099b() + 1;
            this.f208390b.mo98935Q7();
            WalletLqtPlanAddUI.m84212J7(this.f208390b);
        }
    }
}
