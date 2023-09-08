package cs0;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: cs0.v */
public final class C7127v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f25094d;

    public C7127v(C32224a<C13598b0> aVar) {
        this.f25094d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/UserInfoManageAreaAdapter$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f25094d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/UserInfoManageAreaAdapter$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
