package wn1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import tn1.C14058m;

/* renamed from: wn1.n */
public final class C15565n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14058m f42170d;

    public C15565n(C14058m mVar) {
        this.f42170d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/order/ui/SpuCollapseConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42170d.f39437e.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/ui/SpuCollapseConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
