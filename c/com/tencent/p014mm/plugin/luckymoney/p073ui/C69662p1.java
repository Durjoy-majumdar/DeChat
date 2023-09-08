package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyMyRecordUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.p1 */
public class C69662p1 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyMyRecordUI.C69425i f201050d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyMyRecordUI f201051e;

    public C69662p1(LuckyMoneyMyRecordUI luckyMoneyMyRecordUI, LuckyMoneyMyRecordUI.C69425i iVar) {
        this.f201051e = luckyMoneyMyRecordUI;
        this.f201050d = iVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f201051e.dismissDialog(1);
        String str = this.f201050d.f200057d.get(i);
        this.f201050d.f200058e = i;
        if (!str.equals(this.f201051e.f200025B)) {
            LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f201051e;
            luckyMoneyMyRecordUI.f200025B = str;
            luckyMoneyMyRecordUI.f200038r.setText(luckyMoneyMyRecordUI.getString(C0966R.string.giq, new Object[]{str}));
            LuckyMoneyMyRecordUI luckyMoneyMyRecordUI2 = this.f201051e;
            luckyMoneyMyRecordUI2.f200043w = 0;
            ((LinkedList) luckyMoneyMyRecordUI2.f200044x).clear();
            ((HashMap) this.f201051e.f200045y).clear();
            this.f201051e.mo95604J7();
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.f201051e.f200030g == 1 ? 8 : 9);
        objArr[1] = 0;
        objArr[2] = 0;
        objArr[3] = 0;
        objArr[4] = 3;
        objArr[5] = str;
        nVar.mo160131h(11701, objArr);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
