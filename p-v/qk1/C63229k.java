package qk1;

import android.view.View;
import android.widget.CheckBox;
import cj1.C54768h6;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63224j;
import rx3.C13598b0;

/* renamed from: qk1.k */
public final class C63229k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63224j f179430d;

    /* renamed from: e */
    public final /* synthetic */ C63224j.C63225a f179431e;

    /* renamed from: f */
    public final /* synthetic */ int f179432f;

    /* renamed from: g */
    public final /* synthetic */ C54768h6 f179433g;

    public C63229k(C63224j jVar, C63224j.C63225a aVar, int i, C54768h6 h6Var) {
        this.f179430d = jVar;
        this.f179431e = aVar;
        this.f179432f = i;
        this.f179433g = h6Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63224j jVar = this.f179430d;
        C63224j.C63225a aVar = this.f179431e;
        int i = this.f179432f;
        C54768h6 h6Var = this.f179433g;
        jVar.getClass();
        boolean z = true;
        boolean z2 = !h6Var.f153502e;
        h6Var.f153502e = z2;
        CheckBox checkBox = aVar.f179421z;
        if (!z2) {
            z = false;
        }
        checkBox.setChecked(z);
        C32228q<? super View, ? super Integer, ? super C54768h6, C13598b0> qVar = jVar.f179418i;
        if (qVar != null) {
            View view2 = aVar.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            qVar.invoke(view2, Integer.valueOf(i), h6Var);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
