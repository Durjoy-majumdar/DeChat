package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C12855y1;
import rx3.C13598b0;
import te3.C49765hx0;

/* renamed from: qk1.c2 */
public final class C12797c2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12855y1 f36632d;

    /* renamed from: e */
    public final /* synthetic */ C12855y1.C12858c f36633e;

    public C12797c2(C12855y1 y1Var, C12855y1.C12858c cVar) {
        this.f36632d = y1Var;
        this.f36633e = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$fillStickView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<? super C49765hx0, C13598b0> lVar = this.f36632d.f36809y;
        if (lVar != null) {
            lVar.invoke(this.f36633e.f36812a);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$fillStickView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
