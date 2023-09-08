package im1;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: im1.d */
public final class C9202d {

    /* renamed from: a */
    public int f28941a;

    /* renamed from: b */
    public int f28942b;

    /* renamed from: im1.d$a */
    public static final class C9203a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C9202d f28943d;

        public C9203a(C9202d dVar) {
            this.f28943d = dVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C9202d dVar = this.f28943d;
            dVar.getClass();
            if (i != 0) {
                Log.m105924i("NearbyRVPositionHelper", "handleOnScrollStateChanged return for newState:" + i);
            } else {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
                FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (FinderStaggeredGridLayoutManager) layoutManager;
                finderStaggeredGridLayoutManager.mo17394A(new int[2]);
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                int i3 = 0;
                if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                    int[] iArr = new int[2];
                    ((StaggeredGridLayoutManager) layoutManager2).mo17394A(iArr);
                    i2 = iArr[0];
                } else {
                    i2 = layoutManager2 instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager2).mo16957C() : 0;
                }
                dVar.f28941a = i2;
                View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(i2);
                if (findViewByPosition != null) {
                    i3 = findViewByPosition.getTop();
                }
                dVar.f28942b = i3;
                Log.m105924i("NearbyRVPositionHelper", "computeRecyclerViewPosAndOffset position:" + dVar.f28941a + " offset:" + dVar.f28942b);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/base/NearbyRVPositionHelper$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C9202d(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        recyclerView.mo17043c(new C9203a(this));
    }
}
