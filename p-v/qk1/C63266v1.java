package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49765hx0;

/* renamed from: qk1.v1 */
public final class C63266v1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63262u1 f179547d;

    /* renamed from: e */
    public final /* synthetic */ int f179548e;

    public C63266v1(C63262u1 u1Var, int i) {
        this.f179547d = u1Var;
        this.f179548e = i;
    }

    public final void onClick(View view) {
        C32226l<? super C49765hx0, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveLinkInviteAnchorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C49765hx0 hx02 = (C49765hx0) C110818d0.m150917O(this.f179547d.f179532d, this.f179548e);
        if (!(hx02 == null || (lVar = this.f179547d.f179535g) == null)) {
            lVar.invoke(hx02);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveLinkInviteAnchorAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
