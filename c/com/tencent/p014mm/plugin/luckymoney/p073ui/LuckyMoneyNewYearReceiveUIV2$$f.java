package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$f */
public class LuckyMoneyNewYearReceiveUIV2$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f115081d;

    public LuckyMoneyNewYearReceiveUIV2$$f(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f115081d = luckyMoneyNewYearReceiveUIV2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "goto BalanceManagerUI!");
        C76331i.m91758b(this.f115081d.getContext(), 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
