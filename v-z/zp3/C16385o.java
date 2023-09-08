package zp3;

import androidx.recyclerview.widget.RecyclerView;
import gy3.C8478d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zp3.o */
public final class C16385o extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f43785d;

    public C16385o(C8478d0 d0Var) {
        this.f43785d = d0Var;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/ExposeElvesKt$setOnRecyclerViewChildExposedListener$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        this.f43785d.f27483d = i;
        C117292a.m165361g(this, "com/tencent/mm/view/ExposeElvesKt$setOnRecyclerViewChildExposedListener$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/ExposeElvesKt$setOnRecyclerViewChildExposedListener$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/view/ExposeElvesKt$setOnRecyclerViewChildExposedListener$1$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
