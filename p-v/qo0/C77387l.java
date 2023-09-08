package qo0;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qo0.l */
public final class C77387l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C89741g f225616d;

    public C77387l(C89741g gVar) {
        this.f225616d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f225616d.f258068x;
        if (!(aVar == null || aVar == null)) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
