package qo0;

import android.view.View;
import ej0.C86525c;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo0.C89741g;
import rx3.C13598b0;

/* renamed from: qo0.h */
public final class C89745h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C89741g f258078d;

    /* renamed from: e */
    public final /* synthetic */ int f258079e;

    /* renamed from: f */
    public final /* synthetic */ C89741g.C89742a f258080f;

    /* renamed from: g */
    public final /* synthetic */ int f258081g;

    public C89745h(C89741g gVar, int i, C89741g.C89742a aVar, int i2) {
        this.f258078d = gVar;
        this.f258079e = i;
        this.f258080f = aVar;
        this.f258081g = i2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$RecycleViewAdapter$bindDeviceViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C89741g gVar = this.f258078d;
        if (gVar.f258066v != null) {
            if (!(!gVar.f258052e.f258034e.isEmpty()) || this.f258079e > this.f258078d.f258052e.f258034e.size()) {
                C32227p<? super C86525c, ? super Integer, C13598b0> pVar = this.f258078d.f258066v;
                C87412m.m108591d(pVar);
                pVar.invoke(this.f258080f.mo124038F4(this.f258079e).f258045a, Integer.valueOf(this.f258081g));
            } else {
                C32227p<? super C86525c, ? super Integer, C13598b0> pVar2 = this.f258078d.f258066v;
                C87412m.m108591d(pVar2);
                pVar2.invoke(this.f258080f.mo124038F4(this.f258079e).f258045a, Integer.valueOf(this.f258081g));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$RecycleViewAdapter$bindDeviceViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
