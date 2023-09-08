package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.finder.view.a7 */
public final class C4017a7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4226y6 f18073d;

    public C4017a7(C4226y6 y6Var) {
        this.f18073d = y6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$createSelectView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12925w wVar = this.f18073d.f18537c;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$createSelectView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
