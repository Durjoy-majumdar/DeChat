package kf1;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0716c;
import cm1.C0731g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58403t;
import dp1.C58417y0;
import dp1.C7459y1;
import eb0.C31543z5;
import fe1.C8014g;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import os1.C11739f;
import rs1.C13442s8;
import rx3.C13598b0;
import up1.C14362s;
import up1.C37521f;
import zp3.C16389w;

/* renamed from: kf1.r9 */
public final class C9957r9 implements C9930p9<C0716c> {

    /* renamed from: d */
    public final MMActivity f30606d;

    /* renamed from: e */
    public FinderLbsLoader f30607e;

    /* renamed from: f */
    public C9940q9<C0716c> f30608f;

    /* renamed from: g */
    public final C11739f f30609g;

    /* renamed from: h */
    public final boolean f30610h;

    /* renamed from: i */
    public int f30611i;

    /* renamed from: j */
    public long f30612j = -1;

    /* renamed from: n */
    public boolean f30613n;

    /* renamed from: o */
    public boolean f30614o;

    /* renamed from: p */
    public C0731g f30615p = new C0731g((CharSequence) null, 0, 0, 7, (C8480h) null);

    /* renamed from: q */
    public C16389w f30616q = new C9963f(this);

    /* renamed from: kf1.r9$a */
    public static final class C9958a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f30617d;

        /* renamed from: e */
        public final /* synthetic */ boolean f30618e;

        public C9958a(RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z) {
            this.f30617d = refreshLoadMoreLayout;
            this.f30618e = z;
        }

        public final void run() {
            this.f30617d.mo82439E(this.f30618e, false);
        }
    }

    /* renamed from: kf1.r9$b */
    public static final class C9959b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9957r9 f30619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9959b(C9957r9 r9Var) {
            super(0);
            this.f30619d = r9Var;
        }

        public Object invoke() {
            RefreshLoadMoreLayout c = this.f30619d.mo10460t().mo10293c();
            if (c != null) {
                c.postDelayed(new C10058y9(this.f30619d), 200);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.r9$c */
    public static final class C9960c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9957r9 f30620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9960c(C9957r9 r9Var) {
            super(0);
            this.f30620d = r9Var;
        }

        public Object invoke() {
            C9957r9 r9Var = this.f30620d;
            if (!r9Var.f30613n) {
                r9Var.f30613n = true;
                C61926c.m72657B("LbsPresenter_requestLbs", true, new C9638ba(r9Var));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.r9$d */
    public static final class C9961d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9957r9 f30621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9961d(C9957r9 r9Var) {
            super(0);
            this.f30621d = r9Var;
        }

        public Object invoke() {
            this.f30621d.mo10459q().requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.r9$e */
    public static final class C9962e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C9962e f30622d = new C9962e();

        public C9962e() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.r9$f */
    public static final class C9963f implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ C9957r9 f30623d;

        public C9963f(C9957r9 r9Var) {
            this.f30623d = r9Var;
        }

        /* renamed from: a */
        public final WxRecyclerAdapter<?> mo10463a() {
            RecyclerView recyclerView = this.f30623d.mo10460t().getRecyclerView();
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter instanceof WxRecyclerAdapter) {
                return (WxRecyclerAdapter) adapter;
            }
            return null;
        }

        public void onChanged() {
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                c.onChanged();
            }
            C9957r9 r9Var = this.f30623d;
            r9Var.getClass();
            C61926c.m72668M(new C9976s9((RefreshLoadMoreLayout.C7080c<Object>) null, r9Var));
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10463a();
                c.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10463a();
                c.onItemRangeInserted(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10463a();
                int i4 = 0;
                int c6 = i + (a != null ? a.mo85796c6() : 0);
                WxRecyclerAdapter<?> a2 = mo10463a();
                if (a2 != null) {
                    i4 = a2.mo85796c6();
                }
                c.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10463a();
                c.onItemRangeRemoved(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                c.mo82441G(cVar);
            }
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                c.onPreFinishLoadMoreSmooth(cVar);
            }
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                c.onPreFinishRefresh(cVar);
            }
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout c = this.f30623d.mo10460t().mo10293c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10463a();
                c.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2, obj);
            }
        }
    }

    public C9957r9(MMActivity mMActivity, FinderHomeTabFragment finderHomeTabFragment) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f30606d = mMActivity;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        C11739f fVar = (C11739f) a;
        this.f30609g = fVar;
        this.f30610h = fVar.mo11603f3(1000);
    }

    /* renamed from: e */
    public void mo10457e(long j, boolean z) {
        RefreshLoadMoreLayout c = mo10460t().mo10293c();
        if (c != null) {
            c.postDelayed(new C9958a(c, z), j);
        }
    }

    /* renamed from: k1 */
    public void mo10320k1(FinderLbsCardActionReportStruct finderLbsCardActionReportStruct, C14362s sVar, int i) {
        C87412m.m108594g(finderLbsCardActionReportStruct, "struct");
        C87412m.m108594g(sVar, "lbsItem");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30606d);
        C58403t k3 = f != null ? f.mo12855k3(-1) : null;
        if (k3 instanceof C7459y1) {
            finderLbsCardActionReportStruct.f9820g = this.f30612j;
            C7459y1 y1Var = (C7459y1) k3;
            y1Var.getClass();
            y1Var.mo8610P1(finderLbsCardActionReportStruct);
            y1Var.mo8609N1(finderLbsCardActionReportStruct, sVar);
            if (i >= 0 && i < sVar.f39920b.size()) {
                finderLbsCardActionReportStruct.f9827n = (long) i;
                BaseFinderFeed baseFinderFeed = sVar.f39920b.get(i);
                C87412m.m108593f(baseFinderFeed, "lbsItem.feedList[feedIndex]");
                y1Var.mo8611Q1(finderLbsCardActionReportStruct, baseFinderFeed);
            }
            finderLbsCardActionReportStruct.mo86054n();
        }
    }

    /* renamed from: n */
    public final int mo10458n(RecyclerView recyclerView) {
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
        mo10459q().unregister(this.f30616q);
        ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11604g3(1000);
    }

    public void onLoadMore() {
        BaseFeedLoader.requestLoadMore$default(mo10459q(), false, 1, (Object) null);
    }

    public void onRefresh() {
        C9959b bVar = new C9959b(this);
        C9960c cVar = new C9960c(this);
        C9961d dVar = new C9961d(this);
        C8014g gVar = (C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class);
        if (!gVar.mo9103H()) {
            bVar.invoke();
            return;
        }
        C37521f.f99374d.getClass();
        if (C31543z5.m39451a() - gVar.mo9106t1() < ((long) C37521f.f99296U)) {
            dVar.invoke();
        } else {
            cVar.invoke();
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        RefreshLoadMoreLayout c;
        RefreshLoadMoreLayout c2;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f30612j = C31543z5.m39453c();
        if (cVar.f24953h <= 0 && (c2 = mo10460t().mo10293c()) != null) {
            C37521f.f99374d.getClass();
            c2.mo82448Q(C37521f.f99287T, C9962e.f30622d);
        }
        if (cVar.f24951f) {
            RefreshLoadMoreLayout c3 = mo10460t().mo10293c();
            boolean z = false;
            if ((c3 != null && !c3.f165608I) && (c = mo10460t().mo10293c()) != null) {
                c.setHasBottomMore(true);
            }
            RefreshLoadMoreLayout c4 = mo10460t().mo10293c();
            if (c4 != null && !c4.getEnableLoadMore()) {
                z = true;
            }
            if (z) {
                RefreshLoadMoreLayout c5 = mo10460t().mo10293c();
                if (c5 != null) {
                    c5.setEnableLoadMore(true);
                }
                RefreshLoadMoreLayout c6 = mo10460t().mo10293c();
                if (c6 != null) {
                    View inflate = C85868k2.m106137b(this.f30606d).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                    C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
                    c6.setLoadMoreFooter(inflate);
                }
            }
        }
        C61926c.m72668M(new C9976s9(cVar, this));
    }

    /* renamed from: q */
    public final FinderLbsLoader mo10459q() {
        FinderLbsLoader finderLbsLoader = this.f30607e;
        if (finderLbsLoader != null) {
            return finderLbsLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: t */
    public final C9940q9<C0716c> mo10460t() {
        C9940q9<C0716c> q9Var = this.f30608f;
        if (q9Var != null) {
            return q9Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: x */
    public void mo10461x(boolean z) {
        Class cls = C58417y0.class;
        RecyclerView recyclerView = mo10460t().getRecyclerView();
        if (recyclerView != null) {
            int n = mo10458n(recyclerView);
            Log.m105924i("Finder.FinderTimelineLbsMixPresenter", "[onActionbarClick] position=" + n + " isDouble=" + z);
            if (n <= 12) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
            if (z) {
                if (n <= 12) {
                    mo10457e(20, false);
                } else {
                    mo10457e(600, false);
                }
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30606d);
                if (f != null) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    ((C58417y0) c).zx0(f.mo12861q3(), 5, 0);
                    return;
                }
                return;
            }
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f30606d);
            if (f2 != null) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c2).zx0(f2.mo12861q3(), 1, 0);
            }
        }
    }
}
