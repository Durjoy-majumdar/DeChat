package kf1;

import android.view.MenuItem;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FeedRemoveEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import ef1.C58553c;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import je1.C46515d1;
import jq3.C60905o;
import rs1.C13133c1;
import rs1.C13442s8;
import te3.C49712hj1;
import tf0.C13887q1;
import zc1.C66785b;

/* renamed from: kf1.a */
public final class C9616a extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final String f29924t;

    /* renamed from: u */
    public final int f29925u;

    /* renamed from: v */
    public final int f29926v;

    /* renamed from: w */
    public final C49712hj1 f29927w;

    /* renamed from: x */
    public final C55776r f29928x;

    /* renamed from: y */
    public final C8819z2 f29929y;

    /* renamed from: kf1.a$a */
    public static final class C9617a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C9616a f29930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9617a(C9616a aVar) {
            super(1);
            this.f29930d = aVar;
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
                kf1.a r1 = r2.f29930d
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
                kf1.a r1 = r2.f29930d
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
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9616a.C9617a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.a$b */
    public static final class C9618b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C9616a f29931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9618b(C9616a aVar) {
            super(2);
            this.f29931d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f29931d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9616a(MMActivity mMActivity, boolean z, String str, int i, int i2, C49712hj1 hj12) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str, "username");
        this.f29924t = str;
        this.f29925u = i;
        this.f29926v = i2;
        this.f29927w = hj12;
        C39818r rVar = C39818r.f106831a;
        this.f29928x = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f29929y = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
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
        this.f29928x.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f29928x);
        }
        this.f29929y.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f29929y.mo9650n());
        }
        super.onDetach();
    }

    public void requestRefresh() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f29928x.mo77389H1(this.f29925u, this.f29962e, new C9617a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(this.f29928x);
        }
        C8819z2 z2Var = this.f29929y;
        C9618b bVar = new C9618b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f29929y.mo9650n());
        }
    }

    /* renamed from: x */
    public void mo2647x(BaseFinderFeed baseFinderFeed, MenuItem menuItem, int i, int i2, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(menuItem, "menuItem");
        C87412m.m108594g(oVar, "holder");
        super.mo2647x(baseFinderFeed, menuItem, i, i2, oVar);
        if (menuItem.getItemId() == 108) {
            if (this.f29926v == 1) {
                C115669n.INSTANCE.mo160131h(21206, Integer.valueOf(C87412m.m108589b(this.f29924t, C66785b.f191882e.mo90662O5()) ? 1 : 0), 3);
            }
            BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
            BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader instanceof BaseFinderFeedLoader ? (BaseFinderFeedLoader) baseFeedLoader : null;
            if (baseFinderFeedLoader != null) {
                baseFinderFeedLoader.remove(baseFinderFeed.getItemId(), true);
            }
            new C46515d1(1, baseFinderFeed.getItemId(), (String) null, (LinkedList) null, this.f29927w, 12, (C8480h) null).mo9225i();
            FeedRemoveEvent feedRemoveEvent = new FeedRemoveEvent();
            feedRemoveEvent.f9167d.f9168a = baseFinderFeed.getItemId();
            feedRemoveEvent.publish();
        }
    }
}
