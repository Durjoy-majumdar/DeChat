package kd1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kd1.h */
public final class C9587h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4191v0 f29826d;

    public C9587h(C4191v0 v0Var) {
        this.f29826d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/FinderActivityUtils$showAccountBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f29826d.mo5072g();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/FinderActivityUtils$showAccountBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
