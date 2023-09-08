package hl1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qj1.C62699d4;
import qj1.C62741dg;

/* renamed from: hl1.f3 */
public final class C59973f3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171119d;

    /* renamed from: e */
    public final /* synthetic */ int f171120e;

    public C59973f3(C59988k kVar, int i) {
        this.f171119d = kVar;
        this.f171120e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C62699d4 B = this.f171119d.mo84867B();
        if (B != null) {
            B.f178029r.mo78802a();
        }
        C62741dg dgVar = this.f171119d.f171228m1;
        if (dgVar != null) {
            dgVar.f178124s.mo85497a(this.f171120e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
