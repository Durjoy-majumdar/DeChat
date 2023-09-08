package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import hp3.C87581a;
import te3.C51776w3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.m0 */
public class C43351m0 implements C87581a<Object, C51776w3> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117223a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f117224b;

    public C43351m0(WalletLqtPlanAddUI walletLqtPlanAddUI, Dialog dialog) {
        this.f117224b = walletLqtPlanAddUI;
        this.f117223a = dialog;
    }

    public Object call(Object obj) {
        C51776w3 w3Var = (C51776w3) obj;
        this.f117223a.dismiss();
        this.f117224b.setResult(-1);
        this.f117224b.finish();
        return null;
    }
}
