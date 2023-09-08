package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.i0 */
public class C115557i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346579d;

    public C115557i0(C115538c0 c0Var) {
        this.f346579d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f346579d.f346523W0.setText("");
        this.f346579d.mo175571C();
        C115538c0 c0Var = this.f346579d;
        if (c0Var.f346510Q) {
            c0Var.mo175583y(C115538c0.C115548i.OPENED);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
