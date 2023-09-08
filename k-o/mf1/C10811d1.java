package mf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import up1.C37521f;

/* renamed from: mf1.d1 */
public final class C10811d1 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final String f32309d;

    /* renamed from: e */
    public final RefreshLoadMoreLayout f32310e;

    /* renamed from: f */
    public int f32311f;

    public C10811d1(String str, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
        this.f32309d = str;
        this.f32310e = refreshLoadMoreLayout;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView2, "recyclerView");
        if (i2 == 0 || i2 == 2) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof FinderStaggeredGridLayoutManager ? (FinderStaggeredGridLayoutManager) layoutManager : null;
            if (finderStaggeredGridLayoutManager == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i3 = finderStaggeredGridLayoutManager.f44890d;
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            finderStaggeredGridLayoutManager.mo17394A(iArr);
            finderStaggeredGridLayoutManager.mo17395B(iArr2);
            int i4 = iArr2[1];
            int i5 = this.f32311f;
            if (i5 <= 0) {
                C37521f.f99374d.getClass();
                i5 = C37521f.f99248O4.mo60266n().intValue() - 1;
            }
            View refreshHeader = this.f32310e.getRefreshHeader();
            boolean z = !(refreshHeader != null && refreshHeader.getVisibility() == 0);
            boolean z2 = i4 != -1 && (itemCount + -1) - i4 <= i5 && itemCount > 0 && z;
            boolean D = z2 ? this.f32310e.mo82438D(true) : false;
            Log.m105924i(this.f32309d, "checkPreload: preloadSuccess = " + D + ", enablePreload = " + z2 + ", newState = " + i2 + ", firstPos = " + iArr[0] + ", endPos = " + i4 + ", preloadThreshold = " + i5 + ", customPreloadThreshold=" + this.f32311f + ", itemCount = " + itemCount + ", refreshProgressIsGone=" + z);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderFlowPreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
