package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.e0 */
public class C115551e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346573d;

    public C115551e0(C115538c0 c0Var) {
        this.f346573d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115538c0 c0Var = this.f346573d;
        c0Var.mo175576r(14, c0Var.f346551t.f346592f, true);
        this.f346573d.mo175578t();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
