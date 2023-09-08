package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.k */
public class C69623k implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyBusiDetailUI f200984d;

    public C69623k(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI) {
        this.f200984d = luckyMoneyBusiDetailUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f200984d;
        int i2 = LuckyMoneyBusiDetailUI.f199679P;
        luckyMoneyBusiDetailUI.mo95531J7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
