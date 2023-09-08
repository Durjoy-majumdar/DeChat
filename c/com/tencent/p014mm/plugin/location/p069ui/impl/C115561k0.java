package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.FinishSelectPOIStruct;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.k0 */
public class C115561k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346587d;

    public C115561k0(C115538c0 c0Var) {
        this.f346587d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115538c0 c0Var = this.f346587d;
        FinishSelectPOIStruct finishSelectPOIStruct = c0Var.f346556x0;
        finishSelectPOIStruct.f343725d = (long) 2;
        finishSelectPOIStruct.f343729h = (long) c0Var.f346554w.getShowTimes();
        finishSelectPOIStruct.f343730i = (long) this.f346587d.f346554w.getClickTimes();
        finishSelectPOIStruct.mo86054n();
        C115538c0 c0Var2 = this.f346587d;
        c0Var2.mo175576r(12, c0Var2.f346550s.f346592f, false);
        C115538c0.m162437p(this.f346587d);
        this.f346587d.f346582d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
