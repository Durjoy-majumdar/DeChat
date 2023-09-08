package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.f1 */
public class C71796f1 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f208325a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f208326b;

    public C71796f1(WalletLqtPlanAddUI walletLqtPlanAddUI, C101218e0 e0Var) {
        this.f208326b = walletLqtPlanAddUI;
        this.f208325a = e0Var;
    }

    /* renamed from: a */
    public void mo2001a() {
        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "click agree ");
        WalletLqtPlanAddUI walletLqtPlanAddUI = this.f208326b;
        if (walletLqtPlanAddUI.f207997C == 1) {
            walletLqtPlanAddUI.mo98932N7(0);
        } else {
            walletLqtPlanAddUI.mo98932N7(4);
        }
        this.f208325a.mo140680z();
    }
}
