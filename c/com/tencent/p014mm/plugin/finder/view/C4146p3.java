package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.finder.view.p3 */
public final class C4146p3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4179t3 f18370d;

    public C4146p3(C4179t3 t3Var) {
        this.f18370d = t3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPoiClaimPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101218e0 e0Var = this.f18370d.f18433f;
        if (e0Var != null) {
            e0Var.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPoiClaimPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("bottomDialog");
        throw null;
    }
}
