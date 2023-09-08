package qj1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.r1 */
public final class C12631r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f36195d;

    public C12631r1(C12690u1 u1Var) {
        this.f36195d = u1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$showApplaudTip$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f36195d.f36367v.performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$showApplaudTip$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
