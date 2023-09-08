package bz0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bz0.h */
public final class C67330h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79856a f193170d;

    /* renamed from: e */
    public final /* synthetic */ int f193171e;

    public C67330h(C79856a aVar, int i) {
        this.f193170d = aVar;
        this.f193171e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditInputLayoutController$init$2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f193170d.mo110035c(this.f193171e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditInputLayoutController$init$2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
