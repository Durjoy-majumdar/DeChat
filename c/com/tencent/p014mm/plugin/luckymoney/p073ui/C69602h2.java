package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.h2 */
public class C69602h2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200952d;

    public C69602h2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200952d = luckyMoneyNewYearSendUIV2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (Util.isEqual(this.f200952d.f200323b1, 1)) {
            e0Var.mo107125a(1, C0966R.string.ghp);
        }
        e0Var.mo107125a(2, C0966R.string.giz);
    }
}
