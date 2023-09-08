package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import b63.C67197o;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.n0 */
public class C43353n0 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117227a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f117228b;

    public C43353n0(WalletLqtPlanAddUI walletLqtPlanAddUI, Dialog dialog) {
        this.f117228b = walletLqtPlanAddUI;
        this.f117227a = dialog;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        this.f117227a.dismiss();
        if (obj instanceof C67197o) {
            ((C67197o) obj).mo91297a(this.f117228b.getContext(), false);
        }
    }
}
