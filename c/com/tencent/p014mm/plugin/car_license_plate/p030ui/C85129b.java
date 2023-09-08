package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import android.view.View;
import bz0.C79889p;
import bz0.C79896s;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.b */
public final class C85129b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CarLicensePlateListUI f248035d;

    public C85129b(CarLicensePlateListUI carLicensePlateListUI) {
        this.f248035d = carLicensePlateListUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1$init$1$2$footer$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79889p pVar = this.f248035d.f248013f;
        if (pVar != null) {
            ((C79896s) pVar).mo110061d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1$init$1$2$footer$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }
}
