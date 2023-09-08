package com.tencent.p014mm.plugin.finder.feed.model;

import a14.C0000n0;
import a14.C53930o0;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C9360p1;
import ke1.C9603s;
import ke1.C9610x;
import kotlin.Metadata;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C49712hj1;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import u60.C14121l;
import u60.C65233m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLbsStreamFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader */
public final class FinderLbsStreamFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: g */
    public static final ConcurrentHashMap<Long, Object> f13687g = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final String f13688d;

    /* renamed from: e */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13689e;

    /* renamed from: f */
    public int f13690f;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader$a */
    public static final class C2705a {

        /* renamed from: a */
        public final C89349b f13691a;

        /* renamed from: b */
        public final int f13692b;

        public C2705a(String str, C89349b bVar, int i) {
            C87412m.m108594g(str, "finderUserName");
            this.f13691a = bVar;
            this.f13692b = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader$b */
    public static final class C2706b extends IResponse<C0740i2> {

        /* renamed from: a */
        public int f13693a;

        public C2706b(int i, int i2, String str, int i3) {
            super(i, i2, str);
            this.f13693a = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader$c */
    public final class C2707c extends C13911k<C0740i2> {

        /* renamed from: d */
        public final C9610x f13694d;

        /* renamed from: e */
        public C65233m f13695e = new C65233m("LbsStreamListData");

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader$c$a */
        public static final class C2708a extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2707c f13697d;

            /* renamed from: e */
            public final /* synthetic */ Object f13698e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0740i2> f13699f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2708a(C2707c cVar, Object obj, C13910j<C0740i2> jVar) {
                super(1);
                this.f13697d = cVar;
                this.f13698e = obj;
                this.f13699f = jVar;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                C9610x xVar = this.f13697d.f13694d;
                C2779b0 b0Var = new C2779b0(this.f13699f, lVar);
                C2705a aVar = (C2705a) this.f13698e;
                C9610x.m9284y1(xVar, b0Var, aVar.f13692b, (C9360p1.C9362b) null, aVar.f13691a, false, false, (List) null, 48, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C2707c() {
            this.f13694d = new C9610x(2, FinderLbsStreamFeedLoader.this.getContextObj(), (C9603s) null);
        }

        public void alive() {
            super.alive();
            this.f13695e.mo89361d();
        }

        public void dead() {
            super.dead();
            this.f13694d.f29915j.dead();
            C0000n0 n0Var = this.f13694d.f29916n;
            C53930o0.m60557d(n0Var, getTAG() + ":onDead", (Throwable) null, 2, (Object) null);
            this.f13695e.mo89362e();
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            if (obj instanceof C2705a) {
                this.f13695e.mo11856a(new C14121l(new C2708a(this, obj, jVar), (String) null, 2, (C8480h) null));
            }
        }

        public void fetchInit(C13910j<C0740i2> jVar) {
            List list;
            C87412m.m108594g(jVar, "callback");
            C2819w0 cache = FinderLbsStreamFeedLoader.this.getCache();
            if (cache == null || (list = cache.f14079a) == null) {
                list = C64186f0.f181907d;
            }
            String tag = getTAG();
            Log.m105924i(tag, "[fetchInit] ret=" + list);
            C2706b bVar = new C2706b(0, 0, "", list.size());
            FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = FinderLbsStreamFeedLoader.this;
            bVar.setIncrementList(list);
            C2819w0 cache2 = finderLbsStreamFeedLoader.getCache();
            bVar.setLastBuffer(cache2 != null ? cache2.f14080b : null);
            bVar.setPullType(1000);
            jVar.onFetchDone(bVar);
        }

        public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = FinderLbsStreamFeedLoader.this;
            C13911k.fetch$default(this, new C2705a(finderLbsStreamFeedLoader.f13688d, finderLbsStreamFeedLoader.getLastBuffer(), 2), jVar, false, 4, (Object) null);
        }

        public void fetchRefresh(C13910j<C0740i2> jVar) {
            C87412m.m108594g(jVar, "callback");
            FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = FinderLbsStreamFeedLoader.this;
            C13911k.fetch$default(this, new C2705a(finderLbsStreamFeedLoader.f13688d, finderLbsStreamFeedLoader.getLastBuffer(), 0), jVar, false, 4, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader$d */
    public static final class C2709d extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderLbsStreamFeedLoader f13700a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader$d$a */
        public static final class C2710a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2709d f13701d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13702e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13703f;

            /* renamed from: g */
            public final /* synthetic */ FinderLbsStreamFeedLoader f13704g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13705h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13706i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2710a(C2709d dVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderLbsStreamFeedLoader finderLbsStreamFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13701d = dVar;
                this.f13702e = tVar;
                this.f13703f = cVar;
                this.f13704g = finderLbsStreamFeedLoader;
                this.f13705h = lVar;
                this.f13706i = iResponse;
            }

            public Object invoke() {
                this.f13701d.convertOpToReason(this.f13702e, this.f13703f);
                this.f13704g.dispatcher().mo13381g(this.f13703f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13705h;
                if (lVar != null) {
                    lVar.invoke(this.f13706i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2709d(FinderLbsStreamFeedLoader finderLbsStreamFeedLoader) {
            super(finderLbsStreamFeedLoader, false, 1, (C8480h) null);
            this.f13700a = finderLbsStreamFeedLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            int pullType = iResponse.getPullType();
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(pullType);
            boolean z = true;
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.es_);
                cVar.f24947b = 1;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esr);
                cVar.f24947b = -1;
            }
            if (iResponse.getPullType() == 0) {
                z = false;
            }
            cVar.f24952g = z;
            cVar.f24951f = iResponse.getHasMore();
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            String tag = this.f13700a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            C61926c.m72668M(new C2710a(this, new C13923t(iResponse.getHasMore() ? 4 : 6, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13700a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLbsStreamFeedLoader(String str, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "finderUserName");
        C87412m.m108594g(hj12, "contextObj");
        this.f13688d = str;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2707c();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2709d(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (iResponse.getPullType() == 0 && (iResponse instanceof C2706b)) {
            this.f13690f = ((C2706b) iResponse).f13693a;
        }
        if (!isInitOperation(iResponse)) {
            iResponse.getHasMore();
            if (!iResponse.getHasMore() && (lVar = this.f13689e) != null) {
                lVar.invoke(iResponse);
            }
        }
    }
}
