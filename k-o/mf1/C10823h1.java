package mf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qq3.C63318b;
import up1.C37521f;

/* renamed from: mf1.h1 */
public final class C10823h1 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final String f32329d;

    /* renamed from: e */
    public final WxRefreshLayout f32330e;

    /* renamed from: f */
    public final int f32331f;

    public C10823h1(String str, WxRefreshLayout wxRefreshLayout, int i) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(wxRefreshLayout, "rlLayout");
        this.f32329d = str;
        this.f32330e = wxRefreshLayout;
        this.f32331f = i;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderNewFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        if (i == 0 || i == 2) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof FinderStaggeredGridLayoutManager ? (FinderStaggeredGridLayoutManager) layoutManager : null;
            if (finderStaggeredGridLayoutManager == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderNewFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i2 = this.f32331f;
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            finderStaggeredGridLayoutManager.mo17394A(iArr);
            finderStaggeredGridLayoutManager.mo17395B(iArr2);
            boolean z = true;
            int i3 = iArr2[this.f32331f - 1];
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99248O4.mo60266n().intValue();
            boolean z2 = i3 != -1 && itemCount - i3 <= intValue && itemCount > 0;
            if (z2) {
                C63318b bVar = this.f32330e.f56672p;
                if (bVar != null) {
                    bVar.onLoadMore();
                }
            } else {
                z = false;
            }
            String str = this.f32329d;
            Log.m105924i(str, "checkPreload: preloadSuccess = " + z + ", enablePreload = " + z2 + ", newState = " + i + ", firstPos = " + iArr[0] + ", endPos = " + i3 + ", preloadThreshold = " + intValue + ", itemCount = " + itemCount);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderNewFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderNewFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderNewFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
