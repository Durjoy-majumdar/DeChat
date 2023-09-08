package bt0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public class b$$g implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnLongClickListener f233913d;

    public b$$g(C79808b bVar, View.OnLongClickListener onLongClickListener) {
        this.f233913d = onLongClickListener;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        View.OnLongClickListener onLongClickListener = this.f233913d;
        if (onLongClickListener != null) {
            boolean onLongClick = onLongClickListener.onLongClick(view);
            C117292a.m165362h(onLongClick, this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return onLongClick;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
