package dm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dm1.a */
public final class C7360a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f25487d;

    public C7360a(C4191v0 v0Var) {
        this.f25487d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f25487d.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$showBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
