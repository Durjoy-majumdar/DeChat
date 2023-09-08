package ge1;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ef1.C58553c;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import kf1.C9707f;
import kf1.C9854m5;
import rs1.C13133c1;
import rs1.C13442s8;
import tf0.C13887q1;

/* renamed from: ge1.d */
public final class C8267d extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final C55776r f27213t;

    /* renamed from: u */
    public final C8819z2 f27214u;

    /* renamed from: ge1.d$a */
    public static final class C8268a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C8267d f27215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8268a(C8267d dVar) {
            super(1);
            this.f27215d = dVar;
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
                ge1.d r1 = r2.f27215d
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
                ge1.d r1 = r2.f27215d
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
            throw new UnsupportedOperationException("Method not decompiled: ge1.C8267d.C8268a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ge1.d$b */
    public static final class C8269b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C8267d f27216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8269b(C8267d dVar) {
            super(2);
            this.f27216d = dVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f27216d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8267d(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        C39818r rVar = C39818r.f106831a;
        this.f27213t = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f27214u = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C9707f fVar;
        RecyclerView recyclerView;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24954i && cVar.f24951f && (fVar = this.f29964g) != null && (recyclerView = fVar.getRecyclerView()) != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
            String str = this.f13123r;
            Log.m105924i(str, "[smoothScrollToNextPosition] nextPosition=" + C);
            recyclerView.post(new C8270e(recyclerView, C));
        }
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
        this.f27213t.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f27213t);
        }
        this.f27214u.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f27214u.mo9650n());
        }
        super.onDetach();
    }

    public void requestRefresh() {
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f27213t.mo77389H1(2, this.f29962e, new C8268a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(this.f27213t);
        }
        C8819z2 z2Var = this.f27214u;
        C8269b bVar = new C8269b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f27214u.mo9650n());
        }
    }
}
