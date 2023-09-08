package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import c42.C67339b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$k */
public class LuckyMoneyNewYearSendUIV2$$k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200381d;

    public LuckyMoneyNewYearSendUIV2$$k(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200381d = luckyMoneyNewYearSendUIV2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200381d;
        int i = LuckyMoneyNewYearSendUIV2.f200265V1;
        C67339b.m79676a(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.f200327f1);
        luckyMoneyNewYearSendUIV2.f200329g1.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
