package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.recharge.ui.u */
public class C70474u implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RechargeUI f203669d;

    public C70474u(RechargeUI rechargeUI) {
        this.f203669d = rechargeUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$14", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f203669d.dismissDialog(1);
        Log.m105918d("MicroMsg.MallRechargeUI", "onItemClick : " + i);
        RechargeUI rechargeUI = this.f203669d;
        rechargeUI.f203587v = rechargeUI.f203581p.f203604d.get(i);
        this.f203669d.f203581p.mo97070a(i);
        this.f203669d.f203581p.notifyDataSetChanged();
        RechargeUI rechargeUI2 = this.f203669d;
        Map<String, Integer> map = rechargeUI2.f203566A;
        MallRechargeProduct mallRechargeProduct = rechargeUI2.f203587v;
        ((HashMap) map).remove(rechargeUI2.mo97050J7(mallRechargeProduct.f203478r, mallRechargeProduct.f203469f, rechargeUI2.mo97051K7()));
        this.f203669d.mo97048H7();
        this.f203669d.mo97057Q7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$14", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
