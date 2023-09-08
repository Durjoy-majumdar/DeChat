package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import b63.C67197o;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.n1 */
public class C71812n1 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ Dialog f208349a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanHomeUI f208350b;

    public C71812n1(WalletLqtPlanHomeUI walletLqtPlanHomeUI, Dialog dialog) {
        this.f208350b = walletLqtPlanHomeUI;
        this.f208349a = dialog;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        this.f208349a.dismiss();
        if (obj instanceof C67197o) {
            ((C67197o) obj).mo91297a(this.f208350b.getContext(), false);
        }
    }
}
