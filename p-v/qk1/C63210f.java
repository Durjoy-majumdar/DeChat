package qk1;

import al1.C54130j;
import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: qk1.f */
public final class C63210f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63203e f179368d;

    /* renamed from: e */
    public final /* synthetic */ int f179369e;

    public C63210f(C63203e eVar, int i) {
        this.f179368d = eVar;
        this.f179369e = i;
    }

    public final void onClick(View view) {
        C32226l<? super C54130j, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorApplyLinkAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54130j jVar = (C54130j) C110818d0.m150917O(this.f179368d.f179327d, this.f179369e);
        if (!(jVar == null || (lVar = this.f179368d.f179329f) == null)) {
            lVar.invoke(jVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorApplyLinkAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
