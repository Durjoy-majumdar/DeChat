package a92;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import x82.C112080b0;
import x82.C112137z;

/* renamed from: a92.c */
public abstract class C103342c extends RecyclerView.C0130p {

    /* renamed from: d */
    public LinearLayoutManager f304737d;

    public C103342c(LinearLayoutManager linearLayoutManager) {
        this.f304737d = linearLayoutManager;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = this.f304737d;
        C87412m.m108591d(linearLayoutManager);
        int childCount = linearLayoutManager.getChildCount();
        LinearLayoutManager linearLayoutManager2 = this.f304737d;
        C87412m.m108591d(linearLayoutManager2);
        int itemCount = linearLayoutManager2.getItemCount();
        LinearLayoutManager linearLayoutManager3 = this.f304737d;
        C87412m.m108591d(linearLayoutManager3);
        int C = linearLayoutManager3.mo16957C();
        C112080b0 b0Var = ((C112137z) this).f335744e;
        if (!b0Var.f335560p && !b0Var.f335561q && childCount + C >= itemCount && C >= 0) {
            b0Var.f335560p = true;
            b0Var.f335562r++;
            b0Var.mo163780b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
