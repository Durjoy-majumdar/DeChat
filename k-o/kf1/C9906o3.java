package kf1;

import ak1.C0075i;
import ak1.C54067f0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
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
import dp1.C20480e0;
import ef1.C58553c;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import jq3.C60905o;
import nj3.C76874e0;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import te3.C49712hj1;
import tf0.C13887q1;

/* renamed from: kf1.o3 */
public final class C9906o3 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final int f30527t;

    /* renamed from: u */
    public final C55776r f30528u;

    /* renamed from: v */
    public final C8819z2 f30529v;

    /* renamed from: kf1.o3$a */
    public static final class C9907a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C9906o3 f30530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9907a(C9906o3 o3Var) {
            super(1);
            this.f30530d = o3Var;
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
                kf1.o3 r1 = r2.f30530d
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
                kf1.o3 r1 = r2.f30530d
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
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9906o3.C9907a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.o3$b */
    public static final class C9908b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C9906o3 f30531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9908b(C9906o3 o3Var) {
            super(2);
            this.f30531d = o3Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f30531d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9906o3(MMActivity mMActivity, int i, int i2, int i3, C8480h hVar) {
        super(mMActivity);
        i2 = (i3 & 4) != 0 ? 0 : i2;
        C87412m.m108594g(mMActivity, "context");
        this.f30527t = i;
        this.f29967j = i2;
        C39818r rVar = C39818r.f106831a;
        this.f30528u = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f30529v = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C20480e0.m22094n(C20480e0.f57583a, 2, false, (C49712hj1) null, false, 0, false, 60, (Object) null);
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
        this.f30528u.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        C49712hj1 hj12 = null;
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f30528u);
        }
        this.f30529v.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f30529v.mo9650n());
        }
        C20480e0 e0Var = C20480e0.f57583a;
        C13442s8 f3 = aVar.mo12873f(this.f29961d);
        if (f3 != null) {
            hj12 = f3.mo12861q3();
        }
        e0Var.mo32047v(2, hj12);
        super.onDetach();
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C20480e0.m22094n(C20480e0.f57583a, 2, false, ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), false, 0, false, 56, (Object) null);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "16", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
    }

    public void requestRefresh() {
    }

    /* renamed from: t */
    public void mo2496t(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        super.mo2496t(baseFinderFeed, e0Var, nVar, oVar);
        if (!C58784w3.f168295a.mo83897Q0(baseFinderFeed)) {
            e0Var.mo107144g(99, this.f29961d.getString(C0966R.string.gvx), C58739j4.f168176a.mo83686O(baseFinderFeed) ? C0966R.raw.finder_live_dislike : C0966R.raw.finder_feed_dislike_new);
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f30528u.mo77389H1(this.f30527t, this.f29962e, new C9907a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(this.f30528u);
        }
        C8819z2 z2Var = this.f30529v;
        C9908b bVar = new C9908b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f30529v.mo9650n());
        }
    }
}
