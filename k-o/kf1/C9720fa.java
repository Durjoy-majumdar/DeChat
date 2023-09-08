package kf1;

import ak1.C0075i;
import ak1.C54067f0;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0731g;
import cm1.C0735h;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import eb0.C31543z5;
import fe1.C8014g;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke1.C9603s;
import o40.C61926c;
import os1.C11739f;
import rs1.C13442s8;
import rx3.C13598b0;
import tf1.C13908i;
import tf1.C13913l;
import up1.C14362s;
import up1.C37521f;
import zp3.C16389w;

/* renamed from: kf1.fa */
public final class C9720fa implements C9930p9<C0740i2> {

    /* renamed from: d */
    public final MMActivity f30147d;

    /* renamed from: e */
    public C9940q9<C0740i2> f30148e;

    /* renamed from: f */
    public final C11739f f30149f;

    /* renamed from: g */
    public final boolean f30150g;

    /* renamed from: h */
    public int f30151h;

    /* renamed from: i */
    public final FinderTimelineFeedLoader f30152i;

    /* renamed from: j */
    public C16389w f30153j = new C9730g(this);

    /* renamed from: n */
    public boolean f30154n;

    /* renamed from: o */
    public boolean f30155o;

    /* renamed from: p */
    public C0731g f30156p = new C0731g((CharSequence) null, 0, 0, 7, (C8480h) null);

    /* renamed from: q */
    public final C0735h f30157q = new C0735h();

    /* renamed from: kf1.fa$a */
    public static final class C9721a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f30158d;

        /* renamed from: e */
        public final /* synthetic */ boolean f30159e;

        public C9721a(RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z) {
            this.f30158d = refreshLoadMoreLayout;
            this.f30159e = z;
        }

        public final void run() {
            this.f30158d.mo82439E(this.f30159e, false);
        }
    }

    /* renamed from: kf1.fa$b */
    public static final class C9722b implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderTimelineFeedLoader f30160a;

        /* renamed from: b */
        public final /* synthetic */ C9720fa f30161b;

        /* renamed from: kf1.fa$b$a */
        public static final class C9723a implements Runnable {

            /* renamed from: d */
            public static final C9723a f30162d = new C9723a();

            public final void run() {
                C20480e0.f57583a.mo32029b(2);
            }
        }

        /* renamed from: kf1.fa$b$b */
        public static final class C9724b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView.LayoutManager f30163d;

            /* renamed from: e */
            public final /* synthetic */ int f30164e;

            /* renamed from: f */
            public final /* synthetic */ int f30165f;

            public C9724b(RecyclerView.LayoutManager layoutManager, int i, int i2) {
                this.f30163d = layoutManager;
                this.f30164e = i;
                this.f30165f = i2;
            }

            public final void run() {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f30163d;
                int i = this.f30164e;
                int i2 = this.f30165f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1$call$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1$call$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }

        /* renamed from: kf1.fa$b$c */
        public static final class C9725c implements Runnable {

            /* renamed from: d */
            public static final C9725c f30166d = new C9725c();

            public final void run() {
                C20480e0.f57583a.mo32030c();
            }
        }

        public C9722b(FinderTimelineFeedLoader finderTimelineFeedLoader, C9720fa faVar) {
            this.f30160a = finderTimelineFeedLoader;
            this.f30161b = faVar;
        }

        public void call(int i) {
            String tag = this.f30160a.getTAG();
            Log.m105924i(tag, "[initData] canTimelineRefresh=" + this.f30161b.f30150g + ", incrementCount=" + i);
            C9720fa faVar = this.f30161b;
            if (faVar.f30150g) {
                faVar.mo10319e(0, false);
                RefreshLoadMoreLayout c = this.f30161b.mo10325q().mo10293c();
                if (c != null) {
                    c.post(C9723a.f30162d);
                }
            } else {
                C11739f.C11740a c3 = faVar.f30149f.mo11600c3(2);
                int i2 = c3.f34371d;
                int i3 = c3.f34372e;
                String tag2 = this.f30160a.getTAG();
                Log.m105924i(tag2, "[initData] canTimelineRefresh " + this.f30161b.f30150g + " lastPos=" + i2 + " fromTopPixel=" + i3);
                RecyclerView recyclerView = this.f30161b.mo10325q().getRecyclerView();
                RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                this.f30161b.f30151h = i3;
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i3));
                    aVar.mo10233c(Integer.valueOf(i2));
                    C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    RecyclerView recyclerView2 = this.f30161b.mo10325q().getRecyclerView();
                    if (recyclerView2 != null) {
                        recyclerView2.post(new C9724b(layoutManager, i2, i3));
                    }
                }
            }
            RefreshLoadMoreLayout c2 = this.f30161b.mo10325q().mo10293c();
            if (c2 != null) {
                c2.post(C9725c.f30166d);
            }
        }
    }

    /* renamed from: kf1.fa$c */
    public static final class C9726c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9720fa f30167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9726c(C9720fa faVar) {
            super(0);
            this.f30167d = faVar;
        }

        public Object invoke() {
            RefreshLoadMoreLayout c = this.f30167d.mo10325q().mo10293c();
            if (c != null) {
                c.postDelayed(new C9802ia(this.f30167d), 200);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.fa$d */
    public static final class C9727d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9720fa f30168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9727d(C9720fa faVar) {
            super(0);
            this.f30168d = faVar;
        }

        public Object invoke() {
            C9720fa faVar = this.f30168d;
            if (!faVar.f30154n) {
                faVar.f30154n = true;
                C61926c.m72657B("LbsPresenter_requestLbs", true, new C9846la(faVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.fa$e */
    public static final class C9728e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9720fa f30169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9728e(C9720fa faVar) {
            super(0);
            this.f30169d = faVar;
        }

        public Object invoke() {
            this.f30169d.f30152i.requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.fa$f */
    public static final class C9729f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C9729f f30170d = new C9729f();

        public C9729f() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.fa$g */
    public static final class C9730g implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ C9720fa f30171d;

        public C9730g(C9720fa faVar) {
            this.f30171d = faVar;
        }

        /* renamed from: a */
        public final WxRecyclerAdapter<?> mo10331a() {
            RecyclerView recyclerView = this.f30171d.mo10325q().getRecyclerView();
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter instanceof WxRecyclerAdapter) {
                return (WxRecyclerAdapter) adapter;
            }
            return null;
        }

        public void onChanged() {
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                c.onChanged();
            }
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10331a();
                c.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10331a();
                c.onItemRangeInserted(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10331a();
                int i4 = 0;
                int c6 = i + (a != null ? a.mo85796c6() : 0);
                WxRecyclerAdapter<?> a2 = mo10331a();
                if (a2 != null) {
                    i4 = a2.mo85796c6();
                }
                c.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10331a();
                c.onItemRangeRemoved(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                c.mo82441G(cVar);
            }
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                c.onPreFinishLoadMoreSmooth(cVar);
            }
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                c.onPreFinishRefresh(cVar);
            }
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout c = this.f30171d.mo10325q().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10331a();
                c.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2, obj);
            }
        }
    }

    public C9720fa(MMActivity mMActivity, FinderHomeTabFragment finderHomeTabFragment) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f30147d = mMActivity;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        C11739f fVar = (C11739f) a;
        this.f30149f = fVar;
        boolean f3 = fVar.mo11603f3(2);
        this.f30150g = f3;
        FinderTimelineFeedLoader finderTimelineFeedLoader = new FinderTimelineFeedLoader(C13908i.f39090e.mo13382a(2), f3 ^ true ? 1 : 0, ((C13442s8) rVar.mo62444c(mMActivity).mo75002a(C13442s8.class)).mo12861q3(), (C9603s) null, (C32227p) null, 24, (C8480h) null);
        finderTimelineFeedLoader.setInitDone(new C9722b(finderTimelineFeedLoader, this));
        this.f30152i = finderTimelineFeedLoader;
    }

    /* renamed from: e */
    public void mo10319e(long j, boolean z) {
        RefreshLoadMoreLayout c = mo10325q().mo10293c();
        if (c != null) {
            c.postDelayed(new C9721a(c, z), j);
        }
    }

    /* renamed from: k1 */
    public void mo10320k1(FinderLbsCardActionReportStruct finderLbsCardActionReportStruct, C14362s sVar, int i) {
        C87412m.m108594g(finderLbsCardActionReportStruct, "struct");
        C87412m.m108594g(sVar, "lbsItem");
    }

    /* renamed from: n */
    public final int mo10321n(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] iArr = new int[2];
            ((StaggeredGridLayoutManager) layoutManager).mo17394A(iArr);
            return iArr[1];
        } else if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).mo16957C();
        } else {
            return 0;
        }
    }

    public void onDetach() {
        this.f30152i.unregister(this.f30153j);
        ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11604g3(2);
    }

    public void onLoadMore() {
        BaseFeedLoader.requestLoadMore$default(this.f30152i, false, 1, (Object) null);
    }

    public void onRefresh() {
        C9726c cVar = new C9726c(this);
        C9727d dVar = new C9727d(this);
        C9728e eVar = new C9728e(this);
        C8014g gVar = (C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class);
        if (!gVar.mo9103H()) {
            cVar.invoke();
            return;
        }
        C37521f.f99374d.getClass();
        if (C31543z5.m39451a() - gVar.mo9106t1() < ((long) C37521f.f99296U)) {
            eVar.invoke();
        } else {
            dVar.invoke();
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        RefreshLoadMoreLayout c;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24953h <= 0 && (c = mo10325q().mo10293c()) != null) {
            C37521f.f99374d.getClass();
            c.mo82448Q(C37521f.f99287T, C9729f.f30170d);
        }
        C61926c.m72668M(new C9749ga(cVar, this));
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("finder_tl_nearby_tab");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77263e("finder_tl_nearby_tab", "onRefreshEnd");
        C7335d c2 = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c2, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_10", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
    }

    /* renamed from: q */
    public final C9940q9<C0740i2> mo10325q() {
        C9940q9<C0740i2> q9Var = this.f30148e;
        if (q9Var != null) {
            return q9Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: t */
    public void mo10326t(boolean z) {
        Class cls = C58417y0.class;
        RecyclerView recyclerView = mo10325q().getRecyclerView();
        if (recyclerView != null) {
            int n = mo10321n(recyclerView);
            Log.m105924i("Finder.TimelineLbsPresenter", "[onActionbarClick] position=" + n + " isDouble=" + z);
            if (n <= 12) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
            if (z) {
                if (n <= 12) {
                    mo10319e(20, false);
                } else {
                    mo10319e(600, false);
                }
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30147d);
                if (f != null) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    ((C58417y0) c).zx0(f.mo12861q3(), 5, 0);
                    return;
                }
                return;
            }
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f30147d);
            if (f2 != null) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c2).zx0(f2.mo12861q3(), 1, 0);
            }
        }
    }
}
