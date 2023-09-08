package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.c2 */
public class C69576c2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUI f200884d;

    public C69576c2(LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f200884d = luckyMoneyNewYearSendUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (Util.isEqual(this.f200884d.f200209K, 1)) {
            e0Var.mo107125a(1, C0966R.string.ghp);
        }
        e0Var.mo107125a(2, C0966R.string.giz);
    }
}
