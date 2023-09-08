package qj1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.p1 */
public final class C12593p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f36119d;

    public C12593p1(C12690u1 u1Var) {
        this.f36119d = u1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$showApplaudTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f36119d.f36369x;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$showApplaudTip$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$showApplaudTip$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$showApplaudTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
