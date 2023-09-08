package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0733g1;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C20480e0;
import ef1.C58553c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8808v4;
import je1.C46547x1;
import jq3.C9500j;
import kf1.C9695e3;
import kf1.C9707f;
import kf1.C9740g3;
import kf1.C9854m5;
import mf1.C10820g1;
import nr3.C89059e;
import o40.C61926c;
import pe3.C89349b;
import rs1.C13133c1;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49946j51;
import tf1.C13913l;
import up1.C37521f;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter */
public final class FinderHalfScreenContract$Presenter extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: A */
    public final C13601g f13085A;

    /* renamed from: B */
    public boolean f13086B;

    /* renamed from: C */
    public final C13601g f13087C;

    /* renamed from: t */
    public final String f13088t = "FinderHalfScreenContract";

    /* renamed from: u */
    public long f13089u;

    /* renamed from: v */
    public String f13090v = "";

    /* renamed from: w */
    public String f13091w = "";

    /* renamed from: x */
    public C32227p<? super Integer, ? super String, C13598b0> f13092x;

    /* renamed from: y */
    public C32226l<? super FinderObject, C13598b0> f13093y;

    /* renamed from: z */
    public BaseFinderFeed f13094z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter$a */
    public static final class C2519a extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f13095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2519a(MMActivity mMActivity) {
            super(0);
            this.f13095d = mMActivity;
        }

        public Object invoke() {
            return ((C13133c1) C39818r.f106831a.mo62444c(this.f13095d).mo75002a(C13133c1.class)).f37371d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter$b */
    public static final class C2520b extends C87413o implements C32224a<C0733g1> {

        /* renamed from: d */
        public static final C2520b f13096d = new C2520b();

        public C2520b() {
            super(0);
        }

        public Object invoke() {
            return new C0733g1();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter$c */
    public static final class C2521c implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderHalfScreenContract$Presenter f13097a;

        public C2521c(FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
            this.f13097a = finderHalfScreenContract$Presenter;
        }

        public void call(int i) {
            if (i > 0) {
                this.f13097a.mo2548x1();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter$d */
    public static final class C2522d extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ FinderHalfScreenContract$Presenter f13098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2522d(FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
            super(1);
            this.f13098d = finderHalfScreenContract$Presenter;
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
                com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter r1 = r2.f13098d
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
                com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter r1 = r2.f13098d
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter.C2522d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract$Presenter$e */
    public static final class C2523e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHalfScreenContract$Presenter f13099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2523e(FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
            super(0);
            this.f13099d = finderHalfScreenContract$Presenter;
        }

        public Object invoke() {
            BaseFeedLoader<C0740i2> baseFeedLoader = this.f13099d.f13124s;
            C87412m.m108592e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader");
            FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter = this.f13099d;
            ((FinderFeedShareRelativeListLoader) baseFeedLoader).f13561d = finderHalfScreenContract$Presenter.f13089u;
            BaseFeedLoader<C0740i2> baseFeedLoader2 = finderHalfScreenContract$Presenter.f13124s;
            if (baseFeedLoader2 != null) {
                baseFeedLoader2.requestRefresh();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHalfScreenContract$Presenter(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f13085A = C36568h.m40985a(new C2519a(mMActivity));
        this.f13087C = C36568h.m40985a(C2520b.f13096d);
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        mo2548x1();
    }

    /* renamed from: N */
    public String mo2546N() {
        return this.f13088t;
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderHalfScreenContract$Presenter$buildItemCoverts$1(this);
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
        mo2549y1().onDetach();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
        if (!(f == null || (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a.mo83453d(mo2549y1());
        }
        super.onDetach();
    }

    public void requestRefresh() {
        boolean z;
        C2523e eVar = new C2523e(this);
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).Sn0()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99180G6.mo60266n().intValue() == 1) {
                C61926c.m72668M(new C9695e3(this));
                return;
            }
        }
        long j = this.f13089u;
        String str = this.f13090v;
        int i = this.f29962e;
        String str2 = this.f13091w;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
        C46547x1 x1Var = new C46547x1(j, str, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 118720, (C8480h) null);
        C20480e0 e0Var = C20480e0.f57583a;
        int i2 = this.f29967j;
        boolean z2 = false;
        boolean z3 = this.f13089u != 0;
        if (this.f13091w.length() > 0) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        e0Var.mo32038k(i2, z, z3, z2);
        C89059e i3 = x1Var.mo9225i();
        i3.mo11397F(this.f29961d);
        i3.mo123062e(new C9740g3(this, eVar));
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        baseFinderFeedLoader.setInitDone(new C2521c(this));
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        mo2549y1().mo77389H1(2, this.f29962e, new C2522d(this));
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
        if (!(f == null || (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a.mo83450a(mo2549y1());
        }
        RecyclerView recyclerView = m5Var.mo10308D().getRecyclerView();
        String str = this.f13088t;
        RefreshLoadMoreLayout D = m5Var.mo10308D();
        C37521f.f99374d.getClass();
        recyclerView.mo17043c(new C10820g1(str, D, C37521f.f99256P4.mo60266n().intValue()));
    }

    /* renamed from: x1 */
    public final void mo2548x1() {
        DataBuffer<C0740i2> dataListJustForAdapter;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        if (!this.f13086B) {
            this.f13086B = true;
            BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
            if (baseFeedLoader != null && (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) != null && dataListJustForAdapter.size() > 1) {
                dataListJustForAdapter.add(1, (C0733g1) ((C36570n) this.f13087C).getValue());
                C9707f fVar = this.f29964g;
                if (fVar != null && (recyclerView = fVar.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemInserted(1);
                }
            }
        }
    }

    /* renamed from: y1 */
    public final C55776r mo2549y1() {
        return (C55776r) ((C36570n) this.f13085A).getValue();
    }
}
