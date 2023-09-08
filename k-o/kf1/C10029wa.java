package kf1;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0735h;
import cm1.C0738i;
import cm1.C0741j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderTagClickEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.view.FinderTagView;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import ke1.C9603s;
import os1.C11739f;
import os1.C11752r;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49203dy1;
import te3.C50159kp0;
import te3.C50862pq3;
import te3.C51270sn1;
import te3.C51969xg0;
import te3.C52112yg0;
import te3.db4;
import tf1.C13908i;
import tf1.C13913l;
import up1.C37521f;
import zp3.C16389w;

/* renamed from: kf1.wa */
public final class C10029wa implements C9990ta {

    /* renamed from: d */
    public final MMActivity f30732d;

    /* renamed from: e */
    public final FinderFeedRelTimelineLoader f30733e;

    /* renamed from: f */
    public final C11739f f30734f;

    /* renamed from: g */
    public final C11752r f30735g;

    /* renamed from: h */
    public final boolean f30736h;

    /* renamed from: i */
    public C10005ua f30737i;

    /* renamed from: j */
    public int f30738j;

    /* renamed from: n */
    public final C0738i f30739n = new C0738i();

    /* renamed from: o */
    public C52112yg0 f30740o;

    /* renamed from: p */
    public C51270sn1 f30741p;

    /* renamed from: q */
    public final FinderTimelineFeedLoader f30742q;

    /* renamed from: r */
    public C16389w f30743r;

    /* renamed from: s */
    public C0741j f30744s;

    /* renamed from: t */
    public IListener<FinderTagClickEvent> f30745t;

    /* renamed from: u */
    public final C0735h f30746u;

    /* renamed from: kf1.wa$a */
    public static final class C10030a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderTimelineFeedLoader f30747a;

        /* renamed from: b */
        public final /* synthetic */ C10029wa f30748b;

        /* renamed from: kf1.wa$a$a */
        public static final class C10031a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView.LayoutManager f30749d;

            /* renamed from: e */
            public final /* synthetic */ int f30750e;

            /* renamed from: f */
            public final /* synthetic */ int f30751f;

            public C10031a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
                this.f30749d = layoutManager;
                this.f30750e = i;
                this.f30751f = i2;
            }

            public final void run() {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f30749d;
                int i = this.f30750e;
                int i2 = this.f30751f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1$call$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }

        public C10030a(FinderTimelineFeedLoader finderTimelineFeedLoader, C10029wa waVar) {
            this.f30747a = finderTimelineFeedLoader;
            this.f30748b = waVar;
        }

        public void call(int i) {
            String tag = this.f30747a.getTAG();
            Log.m105924i(tag, "[initData] canTimelineRefresh=" + this.f30748b.f30736h + ", incrementCount=" + i);
            C10029wa waVar = this.f30748b;
            boolean z = false;
            if (waVar.f30736h) {
                if (i <= 0) {
                    z = true;
                }
                RefreshLoadMoreLayout c = waVar.mo10486e().mo10303c();
                c.postDelayed(new C10018va(c, z), 0);
                return;
            }
            C11739f.C11740a c3 = waVar.f30734f.mo11600c3(4);
            int i2 = c3.f34371d;
            int i3 = c3.f34372e;
            this.f30748b.f30738j = i3;
            String tag2 = this.f30747a.getTAG();
            Log.m105924i(tag2, "[initData] canTimelineRefresh " + this.f30748b.f30736h + " lastPos=" + i2 + " fromTopPixel=" + i3);
            RecyclerView.LayoutManager layoutManager = this.f30748b.mo10486e().getRecyclerView().getLayoutManager();
            C10029wa waVar2 = this.f30748b;
            C11752r.C11753a aVar = waVar2.f30735g.f34408d.get(4);
            if (aVar == null) {
                aVar = new C11752r.C11753a(4);
            }
            waVar2.f30740o = aVar.f34410b;
            this.f30748b.mo10487n();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i3));
                aVar2.mo10233c(Integer.valueOf(i2));
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = staggeredGridLayoutManager;
                C117292a.m165358d(staggeredGridLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager2, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$feedLoader$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                this.f30748b.mo10486e().getRecyclerView().post(new C10031a(layoutManager, i2, i3));
            }
        }
    }

    /* renamed from: kf1.wa$b */
    public static final class C10032b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C10032b f30752d = new C10032b();

        public C10032b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.wa$c */
    public static final class C10033c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.LayoutManager f30753d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f30754e;

        public C10033c(RecyclerView.LayoutManager layoutManager, C32224a<C13598b0> aVar) {
            this.f30753d = layoutManager;
            this.f30754e = aVar;
        }

        public final void run() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f30753d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(0);
            C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$scrollToTop$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$scrollToTop$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            C32224a<C13598b0> aVar2 = this.f30754e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }

    /* renamed from: kf1.wa$d */
    public static final class C10034d implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ C10029wa f30755d;

        public C10034d(C10029wa waVar) {
            this.f30755d = waVar;
        }

        /* renamed from: a */
        public final WxRecyclerAdapter<?> mo10491a() {
            return this.f30755d.mo10486e().mo10305d0();
        }

        public void onChanged() {
            int size = this.f30755d.f30742q.getSize();
            this.f30755d.f30742q.getDataListJustForAdapter().clear();
            onItemRangeRemoved(0, size);
            this.f30755d.f30742q.getDataListJustForAdapter().addAll(this.f30755d.f30733e.getDataListJustForAdapter());
            onItemRangeInserted(0, this.f30755d.f30733e.getSize());
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30755d.mo10486e().mo10303c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10491a();
                c.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30755d.mo10486e().mo10303c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10491a();
                c.onItemRangeInserted(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout c = this.f30755d.mo10486e().mo10303c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10491a();
                int i4 = 0;
                int c6 = i + (a != null ? a.mo85796c6() : 0);
                WxRecyclerAdapter<?> a2 = mo10491a();
                if (a2 != null) {
                    i4 = a2.mo85796c6();
                }
                c.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout c = this.f30755d.mo10486e().mo10303c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10491a();
                c.onItemRangeRemoved(i + (a != null ? a.mo85796c6() : 0), i2);
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout c = this.f30755d.mo10486e().mo10303c();
            c.getClass();
            c.mo82441G(cVar);
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30755d.mo10486e().mo10303c().onPreFinishLoadMoreSmooth(cVar);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30755d.mo10486e().mo10303c().onPreFinishRefresh(cVar);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout c = this.f30755d.mo10486e().mo10303c();
            if (c != null) {
                WxRecyclerAdapter<?> a = mo10491a();
                c.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2, obj);
            }
        }
    }

    public C10029wa(MMActivity mMActivity) {
        MMActivity mMActivity2 = mMActivity;
        Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
        Class cls2 = C13442s8.class;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f30732d = mMActivity2;
        C13908i.C13909a aVar = C13908i.f39090e;
        int i = aVar.mo13382a(4).f39109d;
        C39818r rVar = C39818r.f106831a;
        Class cls3 = cls2;
        C13908i.C13909a aVar2 = aVar;
        this.f30733e = new FinderFeedRelTimelineLoader(0, "", 4, (String) null, i, false, (C89349b) null, (C49203dy1) null, (C89349b) null, (db4) null, 0, (C50159kp0) null, ((C13442s8) rVar.mo62444c(mMActivity2).mo75002a(cls2)).mo12861q3(), 0.0f, 0.0f, 28648, (C8480h) null);
        C39818r rVar2 = rVar;
        C39622i0 a = rVar2.mo62446e(cls).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        C11739f fVar = (C11739f) a;
        this.f30734f = fVar;
        C39622i0 a2 = rVar2.mo62446e(cls).mo75002a(C11752r.class);
        C87412m.m108593f(a2, "UICProvider.of(FinderCom…erTagCacheVM::class.java)");
        this.f30735g = (C11752r) a2;
        boolean f3 = fVar.mo11603f3(4);
        this.f30736h = f3;
        FinderTimelineFeedLoader finderTimelineFeedLoader = new FinderTimelineFeedLoader(aVar2.mo13382a(4), f3 ^ true ? 1 : 0, ((C13442s8) rVar2.mo62444c(mMActivity2).mo75002a(cls3)).mo12861q3(), (C9603s) null, (C32227p) null, 24, (C8480h) null);
        finderTimelineFeedLoader.setInitDone(new C10030a(finderTimelineFeedLoader, this));
        this.f30742q = finderTimelineFeedLoader;
        this.f30743r = new C10034d(this);
        this.f30744s = new C0741j(new C50862pq3());
        this.f30746u = new C0735h();
    }

    /* renamed from: e */
    public final C10005ua mo10486e() {
        C10005ua uaVar = this.f30737i;
        if (uaVar != null) {
            return uaVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public List<C60898l.C60899a> getHeaderInfo() {
        LinkedList linkedList = new LinkedList();
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        int j5 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        C0735h hVar = this.f30746u;
        hVar.f1753d = j + j2 + j3 + j4 + j5;
        hVar.f1755f = j;
        hVar.f1756g = j5;
        hVar.f1754e = j2 + j3 + j4;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        hVar.getClass();
        hVar.f1757h = (String) f;
        linkedList.add(this.f30746u);
        linkedList.add(this.f30739n);
        linkedList.add(this.f30744s);
        return linkedList;
    }

    /* renamed from: n */
    public final void mo10487n() {
        if (this.f30740o != null) {
            C50862pq3 pq32 = new C50862pq3();
            pq32.f139904d = new LinkedList<>();
            C52112yg0 yg02 = this.f30740o;
            C87412m.m108591d(yg02);
            LinkedList<C51969xg0> linkedList = yg02.f145273d;
            C87412m.m108593f(linkedList, "tagsData!!.categoryInfo");
            for (C51969xg0 xg02 : linkedList) {
                C51270sn1 sn12 = new C51270sn1();
                sn12.f141617d = xg02.f144637d;
                pq32.f139904d.add(sn12);
            }
            C0741j jVar = this.f30744s;
            jVar.getClass();
            jVar.f1762d = pq32;
            C60898l.m71332k6(mo10486e().mo10305d0(), (long) this.f30744s.hashCode(), false, 2, (Object) null);
            View b = mo10486e().mo2654b();
            FinderTagView.f17945w.mo4748a();
            View findViewById = b.findViewById(C0966R.C0970id.d_0);
            if (findViewById != null) {
                View b2 = mo10486e().mo2654b();
                C87412m.m108592e(b2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) b2).removeView(findViewById);
            }
            C60898l.m71328U5(mo10486e().mo10305d0(), this.f30744s, false, 2, (Object) null);
        }
    }

    public void onDetach() {
        this.f30742q.unregister(mo10486e().mo10303c());
        IListener<FinderTagClickEvent> iListener = this.f30745t;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void onLoadMore() {
        if (this.f30741p != null) {
            Log.m105918d("Finder.TimelineMachinePresenter", "loadMore category feed:" + this.f30741p);
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f30733e;
            C51270sn1 sn12 = this.f30741p;
            finderFeedRelTimelineLoader.f13542g = sn12 != null ? sn12.f141617d : null;
            finderFeedRelTimelineLoader.f13543h = 1;
            BaseFeedLoader.requestLoadMore$default(finderFeedRelTimelineLoader, false, 1, (Object) null);
            return;
        }
        Log.m105918d("Finder.TimelineMachinePresenter", "loadMore tl feed:");
        BaseFeedLoader.requestLoadMore$default(this.f30742q, false, 1, (Object) null);
    }

    public void onRefresh() {
        if (this.f30741p != null) {
            Log.m105918d("Finder.TimelineMachinePresenter", "refresh category feed:" + this.f30741p);
            FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f30733e;
            C51270sn1 sn12 = this.f30741p;
            finderFeedRelTimelineLoader.f13542g = sn12 != null ? sn12.f141617d : null;
            finderFeedRelTimelineLoader.f13543h = 1;
            finderFeedRelTimelineLoader.requestRefresh();
            return;
        }
        Log.m105918d("Finder.TimelineMachinePresenter", "refresh tl feed:");
        this.f30742q.requestRefresh();
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24953h <= 0) {
            RefreshLoadMoreLayout c = mo10486e().mo10303c();
            C37521f.f99374d.getClass();
            c.mo82448Q(C37521f.f99287T, C10032b.f30752d);
        }
    }

    /* renamed from: q */
    public final void mo10488q(C32224a<C13598b0> aVar) {
        RecyclerView.LayoutManager layoutManager = mo10486e().getRecyclerView().getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            aVar2.mo10233c(0);
            C117292a.m165358d(staggeredGridLayoutManager, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.mo17414U(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
            C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter", "scrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            mo10486e().getRecyclerView().post(new C10033c(layoutManager, aVar));
        }
    }
}
