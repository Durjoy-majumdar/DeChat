package cn1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.commonview.IndicatorView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cn1.i */
public final class C0842i extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C0821e f1988d;

    /* renamed from: e */
    public final /* synthetic */ IndicatorView f1989e;

    public C0842i(C0821e eVar, IndicatorView indicatorView) {
        this.f1988d = eVar;
        this.f1989e = indicatorView;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || !(layoutManager instanceof StaggeredGridLayoutManager)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            this.f1988d.getClass();
            int[] iArr = new int[1];
            ((StaggeredGridLayoutManager) layoutManager).mo17394A(iArr);
            int i2 = iArr[0];
            IndicatorView indicatorView = this.f1989e;
            if (indicatorView != null) {
                indicatorView.setSelectPoint(i2);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
