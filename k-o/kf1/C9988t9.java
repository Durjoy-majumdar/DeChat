package kf1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import os1.C11739f;
import tf1.C13913l;

/* renamed from: kf1.t9 */
public final class C9988t9 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ FinderLbsLoader f30673a;

    /* renamed from: b */
    public final /* synthetic */ C9957r9 f30674b;

    /* renamed from: kf1.t9$a */
    public static final class C9989a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.LayoutManager f30675d;

        /* renamed from: e */
        public final /* synthetic */ int f30676e;

        /* renamed from: f */
        public final /* synthetic */ int f30677f;

        public C9989a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
            this.f30675d = layoutManager;
            this.f30676e = i;
            this.f30677f = i2;
        }

        public final void run() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f30675d;
            int i = this.f30676e;
            int i2 = this.f30677f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    public C9988t9(FinderLbsLoader finderLbsLoader, C9957r9 r9Var) {
        this.f30673a = finderLbsLoader;
        this.f30674b = r9Var;
    }

    public void call(int i) {
        int i2 = i;
        String tag = this.f30673a.getTAG();
        Log.m105924i(tag, "[initData] canTimelineRefresh=" + this.f30674b.f30610h + ", incrementCount=" + i2);
        C9957r9 r9Var = this.f30674b;
        if (r9Var.f30610h) {
            r9Var.mo10457e(0, false);
        } else {
            C11739f.C11740a c3 = r9Var.f30609g.mo11600c3(1000);
            int i3 = c3.f34371d;
            int i4 = c3.f34372e;
            String tag2 = this.f30673a.getTAG();
            Log.m105924i(tag2, "[initData] canTimelineRefresh " + this.f30674b.f30610h + " lastPos=" + i3 + " fromTopPixel=" + i4);
            RecyclerView recyclerView = this.f30674b.mo10460t().getRecyclerView();
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            this.f30674b.f30611i = i4;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i4));
                aVar.mo10233c(Integer.valueOf(i3));
                C9556a aVar2 = aVar;
                C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                RecyclerView recyclerView2 = this.f30674b.mo10460t().getRecyclerView();
                if (recyclerView2 != null) {
                    recyclerView2.post(new C9989a(layoutManager, i3, i4));
                }
            }
        }
        if (i2 <= 0) {
            C9957r9 r9Var2 = this.f30674b;
            C61926c.m72668M(new C9976s9(r9Var2.f30610h ? new RefreshLoadMoreLayout.C7080c(0) : null, r9Var2));
        }
    }
}
