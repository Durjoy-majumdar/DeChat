package vf1;

import ak1.C0075i;
import ak1.C54067f0;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dp1.C7430d1;
import dp1.C7435f2;
import ef1.C58553c;
import ef1.C58555d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import ht1.C8817y2;
import ht1.C8819z2;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kf1.C9707f;
import kf1.C9854m5;
import nj3.C76874e0;
import o40.C61926c;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import rx3.C13598b0;
import tf0.C13887q1;

/* renamed from: vf1.a4 */
public final class C14719a4 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final int f40678t;

    /* renamed from: u */
    public final List<Long> f40679u;

    /* renamed from: v */
    public final long f40680v;

    /* renamed from: w */
    public final C55776r f40681w;

    /* renamed from: x */
    public final C8819z2 f40682x;

    /* renamed from: y */
    public C58555d f40683y;

    /* renamed from: vf1.a4$a */
    public static final class C14720a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14719a4 f40684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14720a(C14719a4 a4Var) {
            super(0);
            this.f40684d = a4Var;
        }

        public Object invoke() {
            View findViewById;
            C9707f fVar = this.f40684d.f29964g;
            C14729b4 b4Var = fVar instanceof C14729b4 ? (C14729b4) fVar : null;
            if (!(b4Var == null || (findViewById = b4Var.f30122d.findViewById(C0966R.C0970id.g3t)) == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onBeginInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onBeginInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vf1.a4$b */
    public static final class C14721b extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C14719a4 f40685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14721b(C14719a4 a4Var) {
            super(1);
            this.f40685d = a4Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r1 = r1.getDataListJustForAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r0 = 0
                if (r3 < 0) goto L_0x0032
                vf1.a4 r1 = r2.f40685d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x001a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
                if (r1 == 0) goto L_0x001a
                int r1 = r1.size()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r3 >= r1) goto L_0x0032
                vf1.a4 r1 = r2.f40685d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x002a
                java.lang.Object r3 = r1.get(r3)
                cm1.i2 r3 = (cm1.C0740i2) r3
                goto L_0x002b
            L_0x002a:
                r3 = r0
            L_0x002b:
                boolean r1 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r1 == 0) goto L_0x0032
                r0 = r3
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vf1.C14719a4.C14721b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vf1.a4$c */
    public static final class C14722c extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C14719a4 f40686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14722c(C14719a4 a4Var) {
            super(2);
            this.f40686d = a4Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f40686d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: vf1.a4$d */
    public static final class C14723d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14719a4 f40687d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f40688e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14723d(C14719a4 a4Var, RefreshLoadMoreLayout.C7080c<Object> cVar) {
            super(0);
            this.f40687d = a4Var;
            this.f40688e = cVar;
        }

        public Object invoke() {
            TextView textView;
            TextView textView2;
            C9707f fVar = this.f40687d.f29964g;
            View view = null;
            C14729b4 b4Var = fVar instanceof C14729b4 ? (C14729b4) fVar : null;
            if (b4Var != null) {
                RefreshLoadMoreLayout.C7080c<Object> cVar = this.f40688e;
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
                b4Var.mo10308D().setEnableLoadMore(cVar.f24951f);
                if (!cVar.f24951f) {
                    View loadMoreFooter = b4Var.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    View loadMoreFooter2 = b4Var.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(b4Var.f30122d.getResources().getColor(C0966R.color.FG_2));
                    }
                    View loadMoreFooter3 = b4Var.mo10308D().getLoadMoreFooter();
                    TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    View loadMoreFooter4 = b4Var.mo10308D().getLoadMoreFooter();
                    if (loadMoreFooter4 != null) {
                        view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                    }
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                RecyclerView recyclerView = b4Var.getRecyclerView();
                recyclerView.post(new C14740c4(recyclerView, b4Var));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vf1.a4$e */
    public static final class C14724e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14719a4 f40689d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f40690e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14724e(C14719a4 a4Var, RefreshLoadMoreLayout.C7080c<Object> cVar) {
            super(0);
            this.f40689d = a4Var;
            this.f40690e = cVar;
        }

        public Object invoke() {
            C9707f fVar = this.f40689d.f29964g;
            C14729b4 b4Var = fVar instanceof C14729b4 ? (C14729b4) fVar : null;
            if (b4Var != null) {
                RefreshLoadMoreLayout.C7080c<Object> cVar = this.f40690e;
                C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
                b4Var.mo10308D().setEnableRefresh(cVar.f24951f);
                if (!cVar.f24951f) {
                    RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = b4Var.mo10308D().getStickTopLoadingLayout();
                    if (stickTopLoadingLayout != null) {
                        stickTopLoadingLayout.setVisibility(8);
                    }
                    b4Var.mo10308D().setStickTopLoadingLayout((RefreshLoadMoreLayout.StickTopLoadingLayout) null);
                }
                RecyclerView recyclerView = b4Var.getRecyclerView();
                recyclerView.post(new C14747d4(recyclerView));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14719a4(MMActivity mMActivity, int i, List<Long> list, int i2, int i3, long j, boolean z) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(list, "feedIdList");
        this.f40678t = i;
        this.f40679u = list;
        this.f40680v = j;
        C39818r rVar = C39818r.f106831a;
        this.f40681w = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f40682x = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C61926c.m72668M(new C14723d(this, cVar));
    }

    /* renamed from: n0 */
    public void mo2493n0() {
        RefreshLoadMoreLayout D;
        BaseFeedLoader<C0740i2> baseFeedLoader;
        C9707f fVar = this.f29964g;
        if (!(fVar == null || (D = fVar.mo10308D()) == null || (baseFeedLoader = this.f13124s) == null)) {
            baseFeedLoader.register(D);
        }
        C9707f fVar2 = this.f29964g;
        C87412m.m108591d(fVar2);
        BaseFeedLoader<C0740i2> baseFeedLoader2 = this.f13124s;
        C87412m.m108591d(baseFeedLoader2);
        fVar2.mo5183d(baseFeedLoader2.getDataListJustForAdapter());
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onDetach() {
        RefreshLoadMoreLayout D;
        BaseFeedLoader<C0740i2> baseFeedLoader;
        C58553c a;
        C58553c a2;
        C58553c a3;
        this.f40681w.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a3.mo83453d(this.f40681w);
        }
        this.f40682x.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f40682x.mo9650n());
        }
        C13442s8 f3 = aVar.mo12873f(this.f29961d);
        if (!(f3 == null || (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
            C58555d dVar = this.f40683y;
            if (dVar != null) {
                a.mo83453d(dVar);
            } else {
                C87412m.m108603p("observerForExposeReport");
                throw null;
            }
        }
        C9707f fVar = this.f29964g;
        if (!(fVar == null || (D = fVar.mo10308D()) == null || (baseFeedLoader = this.f13124s) == null)) {
            baseFeedLoader.unregister(D);
        }
        super.onDetach();
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C61926c.m72668M(new C14724e(this, cVar));
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9707f fVar = this.f29964g;
        C8777j5.C8778a.m8602c(j5Var, fVar != null ? fVar.getRecyclerView() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "21", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
    }

    /* renamed from: q */
    public void mo4150q(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        super.mo4150q(baseFinderFeed, e0Var, nVar, i);
        C7435f2.f25626a.mo8580d(((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), i == 1 ? "forward" : "tridot", true, new C104289g());
    }

    public void requestRefresh() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    /* renamed from: s1 */
    public void mo2565s1() {
        super.mo2565s1();
        C61926c.m72668M(new C14720a(this));
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C58553c a3;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f40681w.mo77389H1(this.f40678t, this.f29962e, new C14721b(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a3.mo83450a(this.f40681w);
        }
        this.f40683y = new C7430d1(((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3()).f25618b;
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            C58555d dVar = this.f40683y;
            if (dVar != null) {
                a2.mo83450a(dVar);
            } else {
                C87412m.m108603p("observerForExposeReport");
                throw null;
            }
        }
        C8819z2 z2Var = this.f40682x;
        C14722c cVar = new C14722c(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(cVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f3 = aVar.mo12873f(this.f29961d);
        if (f3 != null && (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f40682x.mo9650n());
        }
    }
}
