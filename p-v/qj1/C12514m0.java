package qj1;

import android.os.Bundle;
import android.view.View;
import d60.C58124b;
import dh1.C7329b;
import fj1.C45795b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.m0 */
public final class C12514m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12490l0 f35976d;

    public C12514m0(C12490l0 l0Var) {
        this.f35976d = l0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin$promoteEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58124b bVar = this.f35976d.f35926p;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_ANCHOR_PROMOTE_SHOW, (Bundle) null, 2, (Object) null);
        }
        C45795b A0 = this.f35976d.mo87684A0();
        if (A0 != null) {
            C7329b.m7473b(C7329b.f25441a, A0, 2, 0, (String) null, 0, 28, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin$promoteEntrance$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
