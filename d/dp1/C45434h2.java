package dp1;

import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dp1.h2 */
public abstract class C45434h2<ID, Data> extends RecyclerView.C0130p {

    /* renamed from: d */
    public RecyclerView f122971d;

    /* renamed from: e */
    public int f122972e = -1;

    /* renamed from: f */
    public int f122973f = -1;

    /* renamed from: g */
    public C45430b<ID> f122974g = new C45430b<>();

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/report/ScrollStatisticListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        recyclerView.post(new C45432g2(recyclerView, this));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/report/ScrollStatisticListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/report/ScrollStatisticListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/report/ScrollStatisticListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
