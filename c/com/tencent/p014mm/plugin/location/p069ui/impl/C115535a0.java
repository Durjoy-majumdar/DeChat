package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.a0 */
public class C115535a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346492d;

    public C115535a0(C115538c0 c0Var) {
        this.f346492d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f346492d.f346551t.getCount() == 0) {
            this.f346492d.mo175578t();
        } else {
            this.f346492d.mo175583y(C115538c0.C115548i.COLLAPSED);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
