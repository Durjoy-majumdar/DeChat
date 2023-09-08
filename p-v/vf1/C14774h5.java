package vf1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.h5 */
public final class C14774h5 implements View.OnLongClickListener {

    /* renamed from: d */
    public static final C14774h5 f40755d = new C14774h5();

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$addAllMenu$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$addAllMenu$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
