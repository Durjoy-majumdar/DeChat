package cp1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cp1.i */
public final class C57948i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57941h f165846d;

    public C57948i(C57941h hVar) {
        this.f165846d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f165846d.f165833e.mo82766b();
        this.f165846d.mo82741o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayMiniView$miniWindowClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
