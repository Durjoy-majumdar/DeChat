package lp1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lp1.e */
public final class C10611e extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C10612f f31990d;

    public C10611e(C10612f fVar) {
        this.f31990d = fVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideManageUIC$initRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView recyclerView2 = this.f31990d.f31992e;
            if (recyclerView2 != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int E = linearLayoutManager.mo16959E();
                int D = linearLayoutManager.mo16958D();
                if (E > 0 && D >= 0) {
                    this.f31990d.f31994g = true;
                }
            } else {
                C87412m.m108603p("shareRecyclerView");
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideManageUIC$initRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideManageUIC$initRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideManageUIC$initRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
