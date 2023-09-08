package px0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: px0.n */
public final class C22050n extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C22055p f62396d;

    public C22050n(C22055p pVar) {
        this.f62396d = pVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initRv$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxLinearLayoutManager");
        WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) layoutManager;
        View findViewByPosition = wxLinearLayoutManager.findViewByPosition(this.f62396d.f62414a.f50954d.f51454y);
        this.f62396d.f62414a.f50954d.f51454y = wxLinearLayoutManager.mo16957C();
        this.f62396d.f62414a.f50954d.f51455z = findViewByPosition != null ? findViewByPosition.getRight() : 0;
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initRv$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initRv$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initRv$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
