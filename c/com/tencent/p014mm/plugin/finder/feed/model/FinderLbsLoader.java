package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0716c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9336m0;
import je1.C9360p1;
import jp3.C46566c;
import jp3.C9486a;
import ke1.C9595n;
import ke1.C9599o;
import ke1.C9601q;
import ke1.C9602r;
import kotlin.Metadata;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import u60.C14121l;
import u60.C65233m;
import vp1.C14937o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLbsLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/c;", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader */
public final class FinderLbsLoader extends BaseFeedLoader<C0716c> {

    /* renamed from: d */
    public C32226l<? super IResponse<C0716c>, C13598b0> f13670d;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$a */
    public static final class C2698a extends IResponse<C0716c> {
        public C2698a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$b */
    public static final class C2699b {

        /* renamed from: a */
        public final int f13671a;

        public C2699b(int i) {
            this.f13671a = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$c */
    public final class C2700c extends C13911k<C0716c> {

        /* renamed from: d */
        public C65233m f13672d;

        /* renamed from: e */
        public C9595n f13673e;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$c$a */
        public static final class C2701a extends C87413o implements C32226l<C14121l, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2700c f13675d;

            /* renamed from: e */
            public final /* synthetic */ Object f13676e;

            /* renamed from: f */
            public final /* synthetic */ C13910j<C0716c> f13677f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2701a(C2700c cVar, Object obj, C13910j<C0716c> jVar) {
                super(1);
                this.f13675d = cVar;
                this.f13676e = obj;
                this.f13677f = jVar;
            }

            public Object invoke(Object obj) {
                C14121l lVar = (C14121l) obj;
                C87412m.m108594g(lVar, "task");
                String tag = this.f13675d.getTAG();
                Log.m105924i(tag, "[call] pullType=" + ((C2699b) this.f13676e).f13671a);
                C9595n nVar = this.f13675d.f13673e;
                C87412m.m108591d(nVar);
                C2699b bVar = (C2699b) this.f13676e;
                C2700c cVar = this.f13675d;
                C2828z zVar = new C2828z(cVar, this.f13677f, lVar);
                int i = bVar.f13671a;
                C2777a0 a0Var = new C2777a0(cVar, lVar);
                C87412m.m108594g(bVar, "request");
                C9595n.C9597b bVar2 = nVar.f29845i;
                int i2 = bVar2.f29850a;
                if (i2 == 1) {
                    new C9336m0(i != 2 ? null : bVar2.f29851b, new C9599o(nVar, zVar, a0Var), i, a0Var, nVar.f29844h).mo9225i().mo11397F(nVar.f29846j);
                } else {
                    C9602r rVar = new C9602r(nVar, i, zVar);
                    if (i2 == 2) {
                        new C9360p1(new C9601q(nVar, rVar), i, nVar.f29843g, a0Var, nVar.f29845i.f29852c, false, nVar.f29844h).mo9225i().mo11397F(nVar.f29846j);
                    } else {
                        C9595n.m9271y1(nVar, rVar, nVar.f29848o, i, (List) null, false, nVar.f29849p, (C9360p1.C9362b) null, 64, (Object) null);
                        nVar.f29848o = false;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C2700c() {
        }

        public void alive() {
            super.alive();
            this.f13673e = new C9595n(2, FinderLbsLoader.this.getContextObj());
            C65233m mVar = new C65233m("FinderFollowTlSingleExecutor");
            mVar.mo89361d();
            this.f13672d = mVar;
            new C9595n(2, FinderLbsLoader.this.getContextObj());
        }

        public void dead() {
            C46566c<C9486a> cVar;
            super.dead();
            C9595n nVar = this.f13673e;
            if (!(nVar == null || (cVar = nVar.f29846j) == null)) {
                cVar.dead();
            }
            C65233m mVar = this.f13672d;
            if (mVar != null) {
                mVar.reset();
            }
            this.f13672d = null;
        }

        public void fetch(Object obj, C13910j<C0716c> jVar, boolean z) {
            C65233m mVar;
            C87412m.m108594g(jVar, "callback");
            if ((obj instanceof C2699b) && (mVar = this.f13672d) != null) {
                mVar.mo11856a(new C14121l(new C2701a(this, obj, jVar), (String) null, 2, (C8480h) null));
            }
        }

        public void fetchInit(C13910j<C0716c> jVar) {
            C9595n.C9597b bVar;
            C89349b bVar2;
            C87412m.m108594g(jVar, "callback");
            LinkedList linkedList = new LinkedList();
            try {
                linkedList.addAll(C14937o.f40972a.mo13989k(9));
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_LBS_SECTION_LASTBUF_STRING_SYNC, "");
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                byte[] decodeHexString = Util.decodeHexString((String) f);
                C9595n nVar = this.f13673e;
                byte[] bArr = null;
                C9595n.C9597b bVar3 = nVar != null ? nVar.f29845i : null;
                if (bVar3 != null) {
                    bVar3.f29851b = C89349b.m111674a(decodeHexString);
                }
                String tag = getTAG();
                StringBuilder sb = new StringBuilder();
                sb.append("FinderLbsLoader load init data from FirstPage, size:");
                sb.append(linkedList.size());
                sb.append(", lastBuffer:");
                C9595n nVar2 = this.f13673e;
                if (!(nVar2 == null || (bVar = nVar2.f29845i) == null || (bVar2 = bVar.f29851b) == null)) {
                    bArr = bVar2.mo123703f();
                }
                sb.append(Util.encodeHexString(bArr));
                Log.m105924i(tag, sb.toString());
            } catch (Throwable th) {
                Log.printErrStackTrace(getTAG(), th, "lxl FinderLbsLoader load init data exception", new Object[0]);
            }
            C2698a aVar = new C2698a(0, 0, "");
            aVar.setPullType(1000);
            aVar.setIncrementList(linkedList);
            jVar.onFetchDone(aVar);
        }

        public void fetchLoadMore(C13910j<C0716c> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            C13911k.fetch$default(this, new C2699b(2), jVar, false, 4, (Object) null);
        }

        public void fetchRefresh(C13910j<C0716c> jVar) {
            C87412m.m108594g(jVar, "callback");
            C13911k.fetch$default(this, new C2699b(4), jVar, false, 4, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$d */
    public static final class C2702d extends BaseFeedLoader<C0716c>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderLbsLoader f13678a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$d$a */
        public static final class C2703a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2702d f13679d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0716c> f13680e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13681f;

            /* renamed from: g */
            public final /* synthetic */ FinderLbsLoader f13682g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0716c>, C13598b0> f13683h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0716c> f13684i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2703a(C2702d dVar, C13923t<C0716c> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderLbsLoader finderLbsLoader, C32226l<? super IResponse<C0716c>, C13598b0> lVar, IResponse<C0716c> iResponse) {
                super(0);
                this.f13679d = dVar;
                this.f13680e = tVar;
                this.f13681f = cVar;
                this.f13682g = finderLbsLoader;
                this.f13683h = lVar;
                this.f13684i = iResponse;
            }

            public Object invoke() {
                this.f13679d.convertOpToReason(this.f13680e, this.f13681f);
                this.f13682g.dispatcher().mo13381g(this.f13681f);
                C32226l<IResponse<C0716c>, C13598b0> lVar = this.f13683h;
                if (lVar != null) {
                    lVar.invoke(this.f13684i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2702d(FinderLbsLoader finderLbsLoader) {
            super(finderLbsLoader, false, 1, (C8480h) null);
            this.f13678a = finderLbsLoader;
        }

        public void mergeRefresh(IResponse<C0716c> iResponse, C32226l<? super IResponse<C0716c>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            boolean z = false;
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
            if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
                cVar.f24947b = 1;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esd);
                cVar.f24947b = -1;
            }
            if (iResponse.getPullType() != 0) {
                z = true;
            }
            cVar.f24952g = z;
            cVar.f24951f = iResponse.getHasMore();
            if (cVar.f24953h > 0 || this.f13678a.getDataListJustForAdapter().size() <= 0) {
                cVar.f24948c = null;
            } else {
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esf);
            }
            C61926c.m72668M(new C2703a(this, new C13923t(4, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), cVar, this.f13678a, lVar, iResponse));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader$e */
    public static final class C2704e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ IResponse<C0716c> f13685d;

        /* renamed from: e */
        public final /* synthetic */ FinderLbsLoader f13686e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2704e(IResponse<C0716c> iResponse, FinderLbsLoader finderLbsLoader) {
            super(0);
            this.f13685d = iResponse;
            this.f13686e = finderLbsLoader;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0716c>, C13598b0> lVar;
            if (!this.f13685d.getHasMore() && (lVar = this.f13686e.f13670d) != null) {
                lVar.invoke(this.f13685d);
            }
            return C13598b0.f38549a;
        }
    }

    public FinderLbsLoader() {
        this((C49712hj1) null, 1, (C8480h) null);
    }

    public FinderLbsLoader(C49712hj1 hj12) {
        super(hj12);
    }

    public C13911k<C0716c> createDataFetch() {
        return new C2700c();
    }

    public C13897e<C0716c> createDataMerger() {
        return new C2702d(this);
    }

    public void onFetchDone(IResponse<C0716c> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/FinderLbsLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (isInitOperation(iResponse)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLbsLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
            return;
        }
        C61926c.m72668M(new C2704e(iResponse, this));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLbsLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLbsLoader(C49712hj1 hj12, int i, C8480h hVar) {
        super((i & 1) != 0 ? null : hj12);
    }
}
