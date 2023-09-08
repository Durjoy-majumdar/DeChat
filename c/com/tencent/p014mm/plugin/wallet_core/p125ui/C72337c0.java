package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import android.widget.AdapterView;
import b63.C67200r;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.c0 */
public class C72337c0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72371d0 f210351d;

    public C72337c0(C72371d0 d0Var) {
        this.f210351d = d0Var;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C72371d0.C72372a aVar = this.f210351d.f210514i;
        C67200r<String> rVar = aVar.f210519g;
        C67200r.C67201a aVar2 = C67200r.C67201a.UNCHECKED;
        C67200r.C67201a aVar3 = C67200r.C67201a.CHECKED;
        if (i < rVar.f192932c.size()) {
            C67200r.C67201a aVar4 = rVar.f192932c.get(i).f192939b;
            for (int i2 = 0; i2 < rVar.f192932c.size(); i2++) {
                rVar.mo91310b(i2, aVar2);
            }
            int ordinal = aVar4.ordinal();
            if (ordinal == 1) {
                rVar.mo91310b(i, aVar2);
            } else if (ordinal == 2) {
                rVar.mo91310b(i, aVar3);
            }
        }
        aVar.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
