package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.v */
public class C115578v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RealTimeLocationUI f346636d;

    public C115578v(RealTimeLocationUI realTimeLocationUI) {
        this.f346636d = realTimeLocationUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115669n.INSTANCE.mo160131h(10997, "11", 0, 0, 0);
        this.f346636d.f346467Y.mo183512a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/RealTimeLocationUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
