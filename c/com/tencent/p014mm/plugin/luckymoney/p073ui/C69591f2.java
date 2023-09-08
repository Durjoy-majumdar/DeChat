package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.f2 */
public class C69591f2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200907d;

    public C69591f2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200907d = luckyMoneyNewYearSendUIV2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(1, this.f200907d.getContext().getResources().getString(C0966R.string.f360998nf2));
        e0Var.mo107140d(2, -65536, this.f200907d.getContext().getResources().getString(C0966R.string.f356909new));
    }
}
