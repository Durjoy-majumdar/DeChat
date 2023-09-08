package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$d */
public class LuckyMoneyNewYearSendUIV2$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200373d;

    public LuckyMoneyNewYearSendUIV2$$d(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200373d = luckyMoneyNewYearSendUIV2;
    }

    public void run() {
        this.f200373d.f200288L.setVisibility(0);
        this.f200373d.f200274E.setVisibility(0);
        this.f200373d.f200290M.setVisibility(0);
        this.f200373d.f200272D.setVisibility(0);
        View view = this.f200373d.f200366z;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f200373d.f200284J.setVisibility(0);
        this.f200373d.f200286K.setVisibility(8);
        this.f200373d.f200292N.setVisibility(8);
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200373d;
        luckyMoneyNewYearSendUIV2.mo95682e8(true, luckyMoneyNewYearSendUIV2.f200288L);
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200373d;
        luckyMoneyNewYearSendUIV22.mo95682e8(true, luckyMoneyNewYearSendUIV22.f200295P);
        this.f200373d.mo95669R7();
    }
}
