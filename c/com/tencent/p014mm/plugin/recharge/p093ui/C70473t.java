package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.recharge.ui.t */
public class C70473t implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RechargeUI f203668d;

    public C70473t(RechargeUI rechargeUI) {
        this.f203668d = rechargeUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/RechargeUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f203668d.dismissDialog(1);
        Log.m105918d("MicroMsg.MallRechargeUI", "onItemClick : " + i);
        Log.m105918d("MicroMsg.MallRechargeUI", "checkProduct: " + this.f203668d.f203587v);
        RechargeUI rechargeUI = this.f203668d;
        rechargeUI.f203587v = rechargeUI.f203580o.f203604d.get(i);
        this.f203668d.f203580o.mo97070a(i);
        this.f203668d.f203580o.notifyDataSetChanged();
        Log.m105918d("MicroMsg.MallRechargeUI", "checkProduct: " + this.f203668d.f203587v);
        this.f203668d.mo97057Q7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
