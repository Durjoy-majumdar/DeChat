package xk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C110818d0;
import xk1.C15775s1;
import xk1.C66297d2;

/* renamed from: xk1.r1 */
public final class C15770r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15775s1 f42505d;

    /* renamed from: e */
    public final /* synthetic */ int f42506e;

    public C15770r1(C15775s1 s1Var, int i) {
        this.f42505d = s1Var;
        this.f42506e = i;
    }

    public final void onClick(View view) {
        C32226l<? super C66297d2.C15723c, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66297d2.C15723c cVar = (C66297d2.C15723c) C110818d0.m150917O(this.f42505d.f42529f, this.f42506e);
        if (!(cVar == null || (lVar = this.f42505d.f42530g) == null)) {
            ((C15775s1.C15778c) lVar).invoke(cVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
