package kf1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataStore;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import ef1.C58553c;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.ArrayList;
import java.util.LinkedList;
import os1.C62167s;
import rs1.C13133c1;
import rs1.C13442s8;
import rx3.C13598b0;
import tf0.C13887q1;
import w60.C102354f;

/* renamed from: kf1.g2 */
public final class C9737g2 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final long f30184t;

    /* renamed from: u */
    public final int f30185u;

    /* renamed from: v */
    public final C55776r f30186v;

    /* renamed from: w */
    public final C8819z2 f30187w;

    /* renamed from: x */
    public final C62167s f30188x;

    /* renamed from: kf1.g2$a */
    public static final class C9738a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ C9737g2 f30189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9738a(C9737g2 g2Var) {
            super(1);
            this.f30189d = g2Var;
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
                kf1.g2 r1 = r2.f30189d
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
                kf1.g2 r1 = r2.f30189d
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
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9737g2.C9738a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.g2$b */
    public static final class C9739b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ C9737g2 f30190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9739b(C9737g2 g2Var) {
            super(2);
            this.f30190d = g2Var;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f30190d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9737g2(MMActivity mMActivity, long j, int i) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f30184t = j;
        this.f30185u = i;
        C39818r rVar = C39818r.f106831a;
        this.f30186v = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f30187w = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
        C39622i0 a = rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C62167s.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…neRefCacheVM::class.java)");
        this.f30188x = (C62167s) a;
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onDetach() {
        ArrayList arrayList;
        C58553c a;
        C58553c a2;
        this.f30186v.onDetach();
        C62167s sVar = this.f30188x;
        String valueOf = String.valueOf(this.f30184t);
        DataStore dataStore = this.f13124s;
        if (dataStore == null || (arrayList = dataStore.getDataListJustForAdapter()) == null) {
            arrayList = new ArrayList();
        }
        sVar.getClass();
        C87412m.m108594g(valueOf, "key");
        Log.m105924i("Finder.TimelineCacheVM", "[store] key=" + valueOf + " lastExitPosition=" + 0 + " lastExitFromTopPx=" + 0 + " lastDataList size=" + arrayList.size() + " current=" + C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, System.currentTimeMillis() / ((long) 1000)));
        C102354f<String, C62167s.C11754a> fVar = sVar.f176745e;
        C62167s.C11754a aVar = new C62167s.C11754a(valueOf);
        System.currentTimeMillis();
        C13598b0 b0Var = C13598b0.f38549a;
        fVar.mo141921a(valueOf, aVar);
        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
        C13442s8 f = aVar2.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f30186v);
        }
        this.f30187w.onDetach();
        C13442s8 f2 = aVar2.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f30187w.mo9650n());
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
        this.f30186v.mo77389H1(this.f30185u, this.f29962e, new C9738a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(this.f30186v);
        }
        C8819z2 z2Var = this.f30187w;
        C9739b bVar = new C9739b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f30187w.mo9650n());
        }
    }
}
