package qk1;

import android.view.View;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63238n;
import rx3.C13598b0;
import te3.C51059r51;

/* renamed from: qk1.r */
public final class C63251r implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63238n f179487d;

    /* renamed from: e */
    public final /* synthetic */ C63238n.C63239a f179488e;

    public C63251r(C63238n nVar, C63238n.C63239a aVar) {
        this.f179487d = nVar;
        this.f179488e = aVar;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C32228q<? super C51059r51, ? super View, ? super Integer, C13598b0> qVar = this.f179487d.f179459o;
        if (qVar != null) {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLivePromoteInfoAnchor");
            qVar.invoke((C51059r51) tag, view, Integer.valueOf(this.f179488e.mo17363j()));
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
