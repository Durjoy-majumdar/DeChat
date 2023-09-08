package zk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: zk1.g0 */
public final class C16228g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f43458d;

    public C16228g0(C101218e0 e0Var) {
        this.f43458d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43458d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
