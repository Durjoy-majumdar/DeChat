package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import x22.C118805o;
import x22.C118809p;
import x22.C118810q;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.u */
public class C115577u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RealTimeLocationUI f346635d;

    public C115577u(RealTimeLocationUI realTimeLocationUI) {
        this.f346635d = realTimeLocationUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C118805o oVar = this.f346635d.f346467Y;
        C76879j.m92707A(oVar.f355453a, oVar.f355455c.getString(C0966R.string.gbk), "", oVar.f355455c.getString(C0966R.string.f7963xl), oVar.f355455c.getString(C0966R.string.f7926wf), new C118809p(oVar), new C118810q(oVar));
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
