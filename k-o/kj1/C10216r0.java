package kj1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import kj1.C10222s0;
import nj3.C11184p0;
import nj3.C76875f0;

/* renamed from: kj1.r0 */
public final class C10216r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10222s0.C10223a f31200d;

    /* renamed from: e */
    public final /* synthetic */ C76875f0 f31201e;

    /* renamed from: f */
    public final /* synthetic */ int f31202f;

    public C10216r0(C10222s0.C10223a aVar, C76875f0 f0Var, int i) {
        this.f31200d = aVar;
        this.f31201e = f0Var;
        this.f31202f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11184p0 p0Var = this.f31200d.f31230e;
        if (p0Var != null) {
            p0Var.onMMMenuItemSelected(this.f31201e, this.f31202f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
