package kf1;

import ak1.C0075i;
import ak1.C54067f0;
import bl3.C39818r;
import c30.C104289g;
import cm1.C0740i2;
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
import er1.C58784w3;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import nj3.C76874e0;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import te3.C49712hj1;
import tf0.C13887q1;
import vq1.C65854g;

/* renamed from: kf1.t1 */
public final class C9980t1 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final int f30664t;

    /* renamed from: u */
    public final C55776r f30665u;

    /* renamed from: v */
    public final C8819z2 f30666v;

    /* renamed from: w */
    public C58555d f30667w;

    /* renamed from: kf1.t1$a */
    public static final class C9981a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C9980t1 f30668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9981a(C9980t1 t1Var) {
            super(1);
            this.f30668d = t1Var;
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
                kf1.t1 r1 = r2.f30668d
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
                kf1.t1 r1 = r2.f30668d
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
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9980t1.C9981a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.t1$b */
    public static final class C9982b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C9980t1 f30669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9982b(C9980t1 t1Var) {
            super(2);
            this.f30669d = t1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f30669d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9980t1(MMActivity mMActivity, int i) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f30664t = i;
        C39818r rVar = C39818r.f106831a;
        this.f30665u = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f30666v = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onDetach() {
        C58553c a;
        C58553c a2;
        C58553c a3;
        this.f30665u.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a3.mo83453d(this.f30665u);
        }
        this.f30666v.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f30666v.mo9650n());
        }
        C13442s8 f3 = aVar.mo12873f(this.f29961d);
        if (!(f3 == null || (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
            C58555d dVar = this.f30667w;
            if (dVar != null) {
                a.mo83453d(dVar);
            } else {
                C87412m.m108603p("observerForExposeReport");
                throw null;
            }
        }
        super.onDetach();
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
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
        if (C58784w3.f168295a.mo83924e(baseFinderFeed.mo3513o().getFeedObject())) {
            C65854g gVar = C65854g.f189373e;
            if (!C65854g.f189373e.mo89893c(baseFinderFeed.mo3513o().getFeedObject())) {
                mo10473x1("fav", false, i);
            } else {
                mo10473x1("unfav", false, i);
            }
        }
        C7435f2.f25626a.mo8580d(((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), i == 1 ? "forward" : "tridot", true, new C104289g());
    }

    public void requestRefresh() {
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C58553c a3;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f30665u.mo77389H1(this.f30664t, this.f29962e, new C9981a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a3.mo83450a(this.f30665u);
        }
        this.f30667w = new C7430d1(((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3()).f25618b;
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            C58555d dVar = this.f30667w;
            if (dVar != null) {
                a2.mo83450a(dVar);
            } else {
                C87412m.m108603p("observerForExposeReport");
                throw null;
            }
        }
        C8819z2 z2Var = this.f30666v;
        C9982b bVar = new C9982b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f3 = aVar.mo12873f(this.f29961d);
        if (f3 != null && (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f30666v.mo9650n());
        }
    }

    /* renamed from: x1 */
    public final void mo10473x1(String str, boolean z, int i) {
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3();
        C104289g gVar = new C104289g();
        gVar.put("ref_eid", i == 1 ? "forward" : "tridot");
        C7435f2.f25626a.mo8580d(q3, str, z, gVar);
    }
}
