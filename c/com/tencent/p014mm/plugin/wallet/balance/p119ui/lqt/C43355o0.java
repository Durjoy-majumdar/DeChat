package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import hp3.C87581a;
import te3.C49074d03;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.o0 */
public class C43355o0 implements C87581a<Object, C49074d03> {

    /* renamed from: a */
    public final /* synthetic */ Dialog f117231a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtPlanAddUI f117232b;

    public C43355o0(WalletLqtPlanAddUI walletLqtPlanAddUI, Dialog dialog) {
        this.f117232b = walletLqtPlanAddUI;
        this.f117231a = dialog;
    }

    public Object call(Object obj) {
        C49074d03 d032 = (C49074d03) obj;
        this.f117231a.dismiss();
        this.f117232b.setResult(-1);
        this.f117232b.finish();
        return null;
    }
}
