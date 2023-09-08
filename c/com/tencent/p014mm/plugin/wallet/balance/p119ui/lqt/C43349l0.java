package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import b63.C67197o;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.l0 */
public class C43349l0 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117219a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f117220b;

    public C43349l0(WalletLqtPlanAddUI walletLqtPlanAddUI, Dialog dialog) {
        this.f117220b = walletLqtPlanAddUI;
        this.f117219a = dialog;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        this.f117219a.dismiss();
        if (obj instanceof C67197o) {
            ((C67197o) obj).mo91297a(this.f117220b.getContext(), false);
        }
    }
}
