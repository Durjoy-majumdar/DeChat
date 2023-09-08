package qj1;

import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.g5 */
public final class C12421g5 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f35783d;

    public C12421g5(C12322e5 e5Var) {
        this.f35783d = e5Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        if (i == 1) {
            this.f35783d.f35505B = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
