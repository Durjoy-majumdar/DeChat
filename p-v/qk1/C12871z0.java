package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: qk1.z0 */
public final class C12871z0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12850y0 f36842d;

    /* renamed from: e */
    public final /* synthetic */ C49765hx0 f36843e;

    public C12871z0(C12850y0 y0Var, C49765hx0 hx02) {
        this.f36842d = y0Var;
        this.f36843e = hx02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFansListAdapter$bindFansItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C49765hx0, C13598b0> lVar = this.f36842d.f36769f;
        if (lVar != null) {
            lVar.invoke(this.f36843e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFansListAdapter$bindFansItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
