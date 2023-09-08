package dz2;

import android.view.View;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: dz2.k */
public final class C7571k implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45510m f25846d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f25847e;

    /* renamed from: f */
    public final /* synthetic */ int f25848f;

    public C7571k(C45510m mVar, C60905o oVar, int i) {
        this.f25846d = mVar;
        this.f25847e = oVar;
        this.f25848f = i;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/like/ReferenceItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C32228q<? super View, ? super Integer, ? super Long, Boolean> qVar = this.f25846d.f123178f;
        if (qVar != null) {
            View view2 = this.f25847e.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            Boolean invoke = qVar.invoke(view2, Integer.valueOf(this.f25848f), 0L);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/convert/like/ReferenceItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
