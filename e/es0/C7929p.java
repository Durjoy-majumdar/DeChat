package es0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: es0.p */
public final class C7929p implements View.OnLongClickListener {

    /* renamed from: d */
    public static final C7929p f26615d = new C7929p();

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$initHeaderTagView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic$initHeaderTagView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
