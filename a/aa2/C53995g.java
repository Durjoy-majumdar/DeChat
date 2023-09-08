package aa2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.MinusScreenGridLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: aa2.g */
public final class C53995g extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C112765c f151263d;

    public C53995g(C112765c cVar) {
        this.f151263d = cVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initAdapter$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initAdapter$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initAdapter$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        MinusScreenGridLayoutManager minusScreenGridLayoutManager = layoutManager instanceof MinusScreenGridLayoutManager ? (MinusScreenGridLayoutManager) layoutManager : null;
        if (minusScreenGridLayoutManager != null) {
            this.f151263d.mo164516F3(recyclerView, minusScreenGridLayoutManager);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initAdapter$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
