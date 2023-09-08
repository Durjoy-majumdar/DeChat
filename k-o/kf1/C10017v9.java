package kf1;

import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kf1.v9 */
public final class C10017v9 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C9957r9 f30716d;

    public C10017v9(C9957r9 r9Var) {
        this.f30716d = r9Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f30716d.f30611i -= i2;
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
