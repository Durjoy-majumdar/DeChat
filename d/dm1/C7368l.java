package dm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dm1.l */
public final class C7368l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f25500d;

    public C7368l(C4191v0 v0Var) {
        this.f25500d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderTopicFollowHelper$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f25500d.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderTopicFollowHelper$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
