package h41;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: h41.d */
public class C117069d extends RecyclerView.C0130p {

    /* renamed from: d */
    public int f350811d = 0;

    /* renamed from: e */
    public int f350812e = 0;

    public C117069d(C117067b bVar) {
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        this.f350811d += i;
        this.f350812e += i2;
        C117067b.vx0(C117067b.wx0(), recyclerView, this.f350811d, this.f350812e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
