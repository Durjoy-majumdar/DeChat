package mf1;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: mf1.e1 */
public final class C10814e1 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final String f32313d;

    /* renamed from: e */
    public final C32224a<C13598b0> f32314e;

    public C10814e1(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(aVar, "loadMore");
        this.f32313d = str;
        this.f32314e = aVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        if (i == 0 || i == 2) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            boolean z = false;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int C = gridLayoutManager.mo16957C();
            int E = gridLayoutManager.mo16959E();
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99248O4.mo60266n().intValue();
            boolean z2 = E != -1 && itemCount - E <= intValue && itemCount > 0;
            if (z2) {
                this.f32314e.invoke();
                z = true;
            }
            String str = this.f32313d;
            Log.m105924i(str, "checkPreload: preloadSuccess = " + z + ", enablePreload = " + z2 + ", newState = " + i + ", firstPos = " + C + ", endPos = " + E + ", preloadThreshold = " + intValue + ", itemCount = " + itemCount);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderGridFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
