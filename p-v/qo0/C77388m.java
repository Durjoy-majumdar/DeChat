package qo0;

import android.view.View;
import ej0.C86525c;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qo0.m */
public final class C77388m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C89741g f225617d;

    public C77388m(C89741g gVar) {
        this.f225617d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f225617d.getClass();
        C32227p<? super C86525c, ? super Integer, C13598b0> pVar = this.f225617d.f258066v;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(null, 0);
        }
        this.f225617d.mo124036e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
