package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9327j4;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49157dk1;
import te3.C49712hj1;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13910j;
import tf1.C13911k;
import tf1.C13923t;
import vp1.C14937o;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderInteractionSearchFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader */
public final class FinderInteractionSearchFeedLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final boolean f13655d;

    /* renamed from: e */
    public final String f13656e;

    /* renamed from: f */
    public final String f13657f;

    /* renamed from: g */
    public final LinkedList<String> f13658g;

    /* renamed from: h */
    public final int f13659h;

    /* renamed from: i */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13660i;

    /* renamed from: j */
    public boolean f13661j;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader$a */
    public final class C2695a extends C13896d {
        public C2695a() {
        }

        public IResponse<C0740i2> callInit() {
            Log.m105924i(getTAG(), "fetchInit initCount ");
            IResponse<C0740i2> iResponse = new IResponse<>(0, 0, "");
            FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = FinderInteractionSearchFeedLoader.this;
            C89349b bVar = null;
            if (finderInteractionSearchFeedLoader.f13655d) {
                C2819w0 cache = finderInteractionSearchFeedLoader.getCache();
                iResponse.setIncrementList(cache != null ? cache.f14079a : null);
                C2819w0 cache2 = finderInteractionSearchFeedLoader.getCache();
                if (cache2 != null) {
                    bVar = cache2.f14080b;
                }
                iResponse.setLastBuffer(bVar);
            } else {
                iResponse.setIncrementList(C14937o.C14938a.m14143i(C14937o.f40972a, 22, (String) null, 2, (Object) null));
            }
            return iResponse;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            Integer num = null;
            if (!(yVar instanceof C9327j4)) {
                return null;
            }
            boolean z = true;
            if (i == 0 && i2 == 0) {
                C47465a aVar = ((C9327j4) yVar).f29141g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInteractionResponse");
                if (((C49157dk1) aVar).f132379e == 0) {
                    z = false;
                }
            }
            FinderInteractionSearchFeedLoader.this.getClass();
            IResponse<C0740i2> iResponse = new IResponse<>(i, i2, str);
            C9327j4 j4Var = (C9327j4) yVar;
            LinkedList<FinderObject> n1 = j4Var.mo10076n1();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
            for (FinderObject a : n1) {
                arrayList.add(C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a(a, 524288)));
            }
            iResponse.setIncrementList(arrayList);
            C15585f.f42211a.mo14343f(j4Var.mo10076n1(), 524288, FinderInteractionSearchFeedLoader.this.getContextObj());
            String tag = getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("incrementList size: ");
            List<C0740i2> incrementList = iResponse.getIncrementList();
            if (incrementList != null) {
                num = Integer.valueOf(incrementList.size());
            }
            sb.append(num);
            Log.m105924i(tag, sb.toString());
            iResponse.setPullType(j4Var.f29144j);
            C47465a aVar2 = j4Var.f29141g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInteractionResponse");
            iResponse.setLastBuffer(((C49157dk1) aVar2).f132380f);
            iResponse.setHasMore(z);
            return iResponse;
        }

        public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
            C87412m.m108594g(jVar, "callback");
            super.fetch(obj, jVar, z);
            FinderInteractionSearchFeedLoader.this.getClass();
        }

        public C117747y genLoadMoreNetScene() {
            FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = FinderInteractionSearchFeedLoader.this;
            C9327j4 j4Var = new C9327j4(finderInteractionSearchFeedLoader.f13656e, finderInteractionSearchFeedLoader.f13659h, finderInteractionSearchFeedLoader.f13657f, finderInteractionSearchFeedLoader.f13658g, finderInteractionSearchFeedLoader.getLastBuffer(), FinderInteractionSearchFeedLoader.this.getContextObj());
            j4Var.f29144j = 2;
            return j4Var;
        }

        public C117747y genRefreshNetScene() {
            FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader = FinderInteractionSearchFeedLoader.this;
            C9327j4 j4Var = new C9327j4(finderInteractionSearchFeedLoader.f13656e, finderInteractionSearchFeedLoader.f13659h, finderInteractionSearchFeedLoader.f13657f, finderInteractionSearchFeedLoader.f13658g, finderInteractionSearchFeedLoader.getLastBuffer(), FinderInteractionSearchFeedLoader.this.getContextObj());
            j4Var.f29144j = 0;
            return j4Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(10834);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader$b */
    public static final class C2696b extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderInteractionSearchFeedLoader f13663a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader$b$a */
        public static final class C2697a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2696b f13664d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13665e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13666f;

            /* renamed from: g */
            public final /* synthetic */ FinderInteractionSearchFeedLoader f13667g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13668h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13669i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2697a(C2696b bVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar, FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13664d = bVar;
                this.f13665e = tVar;
                this.f13666f = cVar;
                this.f13667g = finderInteractionSearchFeedLoader;
                this.f13668h = lVar;
                this.f13669i = iResponse;
            }

            public Object invoke() {
                this.f13664d.convertOpToReason(this.f13665e, this.f13666f);
                this.f13667g.dispatcher().mo13381g(this.f13666f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13668h;
                if (lVar != null) {
                    lVar.invoke(this.f13669i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2696b(FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader) {
            super(finderInteractionSearchFeedLoader, false, 1, (C8480h) null);
            this.f13663a = finderInteractionSearchFeedLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            int i;
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
            cVar.f24952g = iResponse.getPullType() != 0;
            cVar.f24951f = iResponse.getHasMore();
            if ((pullType == 0 || pullType == 4) && cVar.f24953h > 0) {
                cVar.f24948c = null;
            }
            String tag = this.f13663a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f13663a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2697a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13663a, lVar, iResponse));
                }
            } else if (this.f13663a.getDataList().size() == 0 || size == 0 || this.f13663a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null || !incrementList2.containsAll(C110818d0.m150953y0(this.f13663a.getDataList()))) {
                    z = false;
                }
                if (z) {
                    i = 6;
                    C61926c.m72668M(new C2697a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13663a, lVar, iResponse));
                }
            }
            i = 4;
            C61926c.m72668M(new C2697a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13663a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderInteractionSearchFeedLoader(C49712hj1 hj12, boolean z, String str, String str2, LinkedList<String> linkedList, int i) {
        super(hj12);
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "requestId");
        C87412m.m108594g(linkedList, "tags");
        this.f13655d = z;
        this.f13656e = str;
        this.f13657f = str2;
        this.f13658g = linkedList;
        this.f13659h = i;
        new ArrayList();
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2695a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2696b(this);
    }

    public int getPageName() {
        return 22;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            this.f13661j = iResponse.getHasMore();
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13660i;
            if (lVar != null) {
                lVar.invoke(iResponse);
            }
        }
    }

    public void requestLoadMore(boolean z) {
        String tag = getTAG();
        Log.m105924i(tag, "requestLoadMore hasMore:" + this.f13661j);
        if (this.f13655d) {
            super.requestLoadMore(z);
        } else if (this.f13661j) {
            super.requestLoadMore(z);
        }
    }
}
