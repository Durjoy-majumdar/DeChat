package vf1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: vf1.s5 */
public final class C14827s5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f40824d;

    public C14827s5(C77407n nVar) {
        this.f40824d = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$setIconMenu$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40824d.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$setIconMenu$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
