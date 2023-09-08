package xr0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import wt0.C78650e;

/* renamed from: xr0.g */
public final class C78971g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91327f f231906d;

    /* renamed from: e */
    public final /* synthetic */ int f231907e;

    public C78971g(C91327f fVar, int i) {
        this.f231906d = fVar;
        this.f231907e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DragSortListView dragSortListView = this.f231906d.f261950e;
        if (dragSortListView != null) {
            int i = this.f231907e;
            dragSortListView.f319759a1 = false;
            dragSortListView.mo154724v(i, 0.0f);
        }
        Context context = this.f231906d.getContext();
        C87412m.m108593f(context, "context");
        C78650e eVar = new C78650e(context, true);
        eVar.mo108614a((String) this.f231906d.f261952g.getValue());
        eVar.mo108615b(1500);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionDragSortAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
