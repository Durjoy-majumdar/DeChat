package vt0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vt0.j */
public class C111614j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22784g f334109d;

    public C111614j(C22784g gVar) {
        this.f334109d = gVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C22784g gVar = this.f334109d;
        int i = C22784g.f65510w;
        gVar.mo35923c(false, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
