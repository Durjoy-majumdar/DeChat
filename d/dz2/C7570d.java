package dz2;

import android.view.View;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: dz2.d */
public final class C7570d implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45505f f25843d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f25844e;

    /* renamed from: f */
    public final /* synthetic */ int f25845f;

    public C7570d(C45505f fVar, C60905o oVar, int i) {
        this.f25843d = fVar;
        this.f25844e = oVar;
        this.f25845f = i;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C32228q<? super View, ? super Integer, ? super Long, Boolean> qVar = this.f25843d.f123169f;
        if (qVar != null) {
            View view2 = this.f25844e.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            Boolean invoke = qVar.invoke(view2, Integer.valueOf(this.f25845f), 0L);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
