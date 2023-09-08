package vt0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vt0.i */
public class C111613i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22784g f334108d;

    public C111613i(C22784g gVar) {
        this.f334108d = gVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C22784g gVar = this.f334108d;
        C17925e eVar = gVar.f65511d;
        gVar.mo35923c(true, eVar == null ? null : eVar.currentValue());
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
