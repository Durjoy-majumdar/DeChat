package mf1;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: mf1.g1 */
public final class C10820g1 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final String f32321d;

    /* renamed from: e */
    public final RefreshLoadMoreLayout f32322e;

    /* renamed from: f */
    public final int f32323f;

    public C10820g1(String str, RefreshLoadMoreLayout refreshLoadMoreLayout, int i) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
        this.f32321d = str;
        this.f32322e = refreshLoadMoreLayout;
        this.f32323f = i;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderLinearLoadMorePreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        if (i == 0 || i == 2) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderLinearLoadMorePreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            boolean z = false;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int C = linearLayoutManager.mo16957C();
            int E = linearLayoutManager.mo16959E();
            View refreshHeader = this.f32322e.getRefreshHeader();
            boolean z2 = !(refreshHeader != null && refreshHeader.getVisibility() == 0);
            boolean z3 = E != -1 && itemCount - E <= this.f32323f && itemCount > 0 && z2;
            if (z3) {
                z = this.f32322e.mo82438D(true);
            }
            Log.m105918d(this.f32321d, "FinderLinearLoadMorePreloadListener: preloadSuccess = " + z + ", enablePreload = " + z3 + ", newState = " + i + ", firstPos = " + C + ", lastVisibleItem = " + E + ", preloadThreshold = " + this.f32323f + ", itemCount = " + itemCount + ", refreshProgressIsGone=" + z2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderLinearLoadMorePreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FinderLinearLoadMorePreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FinderLinearLoadMorePreloadListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
