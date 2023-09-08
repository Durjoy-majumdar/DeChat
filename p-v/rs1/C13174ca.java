package rs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.ca */
public final class C13174ca implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13572z9 f37476d;

    public C13174ca(C13572z9 z9Var) {
        this.f37476d = z9Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSlideMoreGuideUIC$showGuide$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13572z9 z9Var = this.f37476d;
        C13572z9.m12884d3(z9Var, z9Var.f38504i, Integer.MAX_VALUE);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSlideMoreGuideUIC$showGuide$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
