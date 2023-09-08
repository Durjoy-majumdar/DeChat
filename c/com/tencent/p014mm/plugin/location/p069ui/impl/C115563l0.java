package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import bp3.C79758p;
import j20.C117292a;
import java.util.ArrayList;
import oa1.C117731d;
import tf3.C101877q;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.l0 */
public class C115563l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346588d;

    public C115563l0(C115538c0 c0Var) {
        this.f346588d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115538c0 c0Var = this.f346588d;
        c0Var.getClass();
        C101877q qVar = new C101877q();
        boolean z = true;
        if (!(C117731d.m166007c().mo182440a(qVar) == 1 || C79758p.f233760a.mo109883f(qVar) == 1)) {
            z = false;
        }
        if (c0Var.f346504J) {
            C115565n nVar = c0Var.f346551t;
            int i = nVar.f346592f;
            if (i >= 0 && i < nVar.getCount()) {
                C115568o d = c0Var.f346551t.getItem(i);
                if (z) {
                    c0Var.mo175580v(d);
                } else {
                    c0Var.mo175569A(d, (C42503p) null, false);
                }
            }
        } else {
            C115565n nVar2 = c0Var.f346550s;
            int i2 = nVar2.f346592f;
            if (i2 >= 0 && i2 < nVar2.getCount()) {
                C115568o d2 = c0Var.f346550s.getItem(i2);
                if (i2 == 0 || !z) {
                    c0Var.mo175569A(d2, (C42503p) null, false);
                } else {
                    c0Var.mo175580v(d2);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
