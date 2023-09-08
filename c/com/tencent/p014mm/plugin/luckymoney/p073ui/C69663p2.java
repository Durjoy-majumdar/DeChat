package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.p2 */
public class C69663p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f201052d;

    public C69663p2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f201052d = luckyMoneyNewYearSendUIV2;
    }

    public void run() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f201052d;
        String d = C69218g1.m81557d(luckyMoneyNewYearSendUIV2.f200315W0, luckyMoneyNewYearSendUIV2.f200364y0);
        if (!Util.isNullOrNil(d)) {
            View view = this.f201052d.f200297Q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$29", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$29", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f201052d.f200334j;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$29", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$29", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f201052d.f200341o;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$29", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$29", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f201052d.f200364y0.equals("loop")) {
                if (this.f201052d.f200300R.getVisibility() == 0) {
                    LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f201052d;
                    C69218g1.m81564k(luckyMoneyNewYearSendUIV22.f200364y0, d, luckyMoneyNewYearSendUIV22.f200300R, luckyMoneyNewYearSendUIV22.f200303S, luckyMoneyNewYearSendUIV22.f200306T, luckyMoneyNewYearSendUIV22.f200309U);
                    return;
                }
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f201052d;
                C69218g1.m81564k(luckyMoneyNewYearSendUIV23.f200364y0, d, luckyMoneyNewYearSendUIV23.f200303S, luckyMoneyNewYearSendUIV23.f200300R, luckyMoneyNewYearSendUIV23.f200306T, luckyMoneyNewYearSendUIV23.f200309U);
            } else if (this.f201052d.f200300R.getVisibility() == 0) {
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f201052d;
                C69218g1.m81564k(luckyMoneyNewYearSendUIV24.f200364y0, d, luckyMoneyNewYearSendUIV24.f200303S, luckyMoneyNewYearSendUIV24.f200300R, luckyMoneyNewYearSendUIV24.f200306T, luckyMoneyNewYearSendUIV24.f200309U);
            } else {
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f201052d;
                C69218g1.m81564k(luckyMoneyNewYearSendUIV25.f200364y0, d, luckyMoneyNewYearSendUIV25.f200300R, luckyMoneyNewYearSendUIV25.f200303S, luckyMoneyNewYearSendUIV25.f200306T, luckyMoneyNewYearSendUIV25.f200309U);
            }
        } else {
            this.f201052d.mo95668Q7(6);
        }
    }
}
