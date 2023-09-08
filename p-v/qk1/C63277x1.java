package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C48868bk1;

/* renamed from: qk1.x1 */
public final class C63277x1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63270w1 f179589d;

    /* renamed from: e */
    public final /* synthetic */ int f179590e;

    public C63277x1(C63270w1 w1Var, int i) {
        this.f179589d = w1Var;
        this.f179590e = i;
    }

    public final void onClick(View view) {
        C32226l<? super C48868bk1, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveLinkInviteAnchorSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C48868bk1 bk12 = (C48868bk1) C110818d0.m150917O(this.f179589d.f179568d, this.f179590e);
        if (!(bk12 == null || (lVar = this.f179589d.f179571g) == null)) {
            lVar.invoke(bk12);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveLinkInviteAnchorSearchAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
