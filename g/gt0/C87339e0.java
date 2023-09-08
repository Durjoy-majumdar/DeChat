package gt0;

import android.view.View;
import fy3.C32226l;
import gt0.C87330d0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: gt0.e0 */
public final class C87339e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87330d0.C87331a f253122d;

    /* renamed from: e */
    public final /* synthetic */ C87330d0.C87337f f253123e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<ArrayList<Integer>, C13598b0> f253124f;

    /* renamed from: g */
    public final /* synthetic */ int f253125g;

    public C87339e0(C87330d0.C87331a aVar, C87330d0.C87337f fVar, C32226l<? super ArrayList<Integer>, C13598b0> lVar, int i) {
        this.f253122d = aVar;
        this.f253123e = fVar;
        this.f253124f = lVar;
        this.f253125g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87330d0.C87331a aVar = this.f253122d;
        aVar.f253107f = true;
        C87330d0.C87337f fVar = this.f253123e;
        int i = C87330d0.C87337f.f253117C;
        fVar.mo121745z(true, aVar);
        ArrayList arrayList2 = new ArrayList();
        List<C87330d0.C87331a> list = this.f253123e.f253118A;
        int i2 = this.f253125g;
        int i3 = 0;
        for (T next : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C87330d0.C87331a aVar2 = (C87330d0.C87331a) next;
                arrayList2.add(Integer.valueOf(i3));
                if (i2 != i3) {
                    if (aVar2 != null && aVar2.f253107f) {
                        aVar2.f253107f = false;
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        this.f253124f.invoke(arrayList2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
