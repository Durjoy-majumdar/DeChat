package kf1;

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
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ef1.C58553c;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import jq3.C60905o;
import nj3.C76874e0;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import tf0.C13887q1;

/* renamed from: kf1.r2 */
public final class C9949r2 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final int f30591t;

    /* renamed from: u */
    public final C55776r f30592u;

    /* renamed from: v */
    public final C8819z2 f30593v;

    /* renamed from: kf1.r2$a */
    public static final class C9950a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C9949r2 f30594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9950a(C9949r2 r2Var) {
            super(1);
            this.f30594d = r2Var;
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
                kf1.r2 r1 = r2.f30594d
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
                kf1.r2 r1 = r2.f30594d
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
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9949r2.C9950a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.r2$b */
    public static final class C9951b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C9949r2 f30595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9951b(C9949r2 r2Var) {
            super(2);
            this.f30595d = r2Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f30595d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9949r2(MMActivity mMActivity, int i) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f30591t = i;
        C39818r rVar = C39818r.f106831a;
        this.f30592u = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f30593v = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C9707f fVar;
        RecyclerView recyclerView;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24951f && (fVar = this.f29964g) != null && (recyclerView = fVar.getRecyclerView()) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
            Log.m105924i("FinderFollowTimelineContract", "[smoothScrollToNextPosition] nextPosition=" + C);
            recyclerView.post(new C9968s2(recyclerView, C));
        }
    }

    /* renamed from: M0 */
    public boolean mo4148M0(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        return !mo10275L0(baseFinderFeed);
    }

    /* renamed from: T0 */
    public void mo10277T0() {
        super.mo10277T0();
    }

    /* renamed from: W0 */
    public void mo10278W0() {
        super.mo10278W0();
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
        this.f30592u.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f30592u);
        }
        this.f30593v.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f30593v.mo9650n());
        }
        super.onDetach();
    }

    public void requestRefresh() {
    }

    /* renamed from: t */
    public void mo2496t(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        if (mo10275L0(baseFinderFeed) && !C58739j4.f168176a.mo83686O(baseFinderFeed)) {
            e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
            MMActivity mMActivity = this.f29961d;
            C87412m.m108594g(mMActivity, "context");
            if (baseFinderFeed.mo3513o().isCommentClose() || !C58784w3.f168295a.mo83889N0()) {
                e0Var.mo107144g(107, mMActivity.getString(C0966R.string.d9v), C0966R.raw.icons_outlined_comment);
            } else {
                e0Var.mo107144g(106, mMActivity.getString(C0966R.string.d8r), C0966R.raw.icons_outlined_comment_close);
            }
        }
        super.mo2496t(baseFinderFeed, e0Var, nVar, oVar);
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f30592u.mo77389H1(this.f30591t, this.f29962e, new C9950a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(this.f30592u);
        }
        C8819z2 z2Var = this.f30593v;
        C9951b bVar = new C9951b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f30593v.mo9650n());
        }
    }
}
