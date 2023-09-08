package ut2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ut2.p */
public final class C65478p extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ ImproveMainUIC f188432d;

    public C65478p(ImproveMainUIC improveMainUIC) {
        this.f188432d = improveMainUIC;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$setupRecyclerView$1");
        C87412m.m108594g(recyclerView, "recyclerView");
        ImproveMainUIC.m122709d3(this.f188432d, recyclerView, i);
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$setupRecyclerView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$setupRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
