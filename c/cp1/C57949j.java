package cp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ks3.C61162l;

/* renamed from: cp1.j */
public final class C57949j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57941h f165847d;

    public C57949j(C57941h hVar) {
        this.f165847d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowCloseClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f165847d.f165833e.mo82767c(C61162l.Invalid);
        this.f165847d.mo82741o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowCloseClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
