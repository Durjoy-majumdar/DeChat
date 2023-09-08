package bz0;

import android.view.View;
import android.widget.TextView;
import bz0.C79866k;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bz0.m */
public final class C79869m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79866k f234022d;

    public C79869m(C79866k kVar) {
        this.f234022d = kVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditKeyboardController$initKeyboardLayoutForType$btnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79866k.C79867a aVar = this.f234022d.f234019c;
        if (aVar != null) {
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
            aVar.mo110034b(((TextView) view).getText().charAt(0));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditKeyboardController$initKeyboardLayoutForType$btnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
