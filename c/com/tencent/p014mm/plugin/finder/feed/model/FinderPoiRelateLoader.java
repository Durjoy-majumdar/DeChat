package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C0800z1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
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
import je1.C9301d4;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C51285sq3;
import te3.C51764w02;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;
import tf1.C13923t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiRelateLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader */
public final class FinderPoiRelateLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final String f13789d;

    /* renamed from: e */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13790e;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader$a */
    public static final class C2732a extends IResponse<C0740i2> {
        public C2732a(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader$b */
    public final class C2733b extends C13896d {
        public C2733b() {
        }

        public IResponse<C0740i2> callInit() {
            C2732a aVar = new C2732a(0, 0, "");
            FinderPoiRelateLoader finderPoiRelateLoader = FinderPoiRelateLoader.this;
            C2819w0 cache = finderPoiRelateLoader.getCache();
            C89349b bVar = null;
            aVar.setIncrementList(cache != null ? cache.f14079a : null);
            C2819w0 cache2 = finderPoiRelateLoader.getCache();
            if (cache2 != null) {
                bVar = cache2.f14080b;
            }
            aVar.setLastBuffer(bVar);
            return aVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            ArrayList arrayList = null;
            if (!(yVar instanceof C9301d4)) {
                return null;
            }
            boolean z = true;
            if (i == 0 && i2 == 0) {
                C47465a aVar = ((C9301d4) yVar).f29077g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderRelativePoiListResponse");
                if (((C51764w02) aVar).f143797f == 0) {
                    z = false;
                }
            }
            C2732a aVar2 = new C2732a(i, i2, str);
            aVar2.setHasMore(z);
            C9301d4 d4Var = (C9301d4) yVar;
            C47465a aVar3 = d4Var.f29077g.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderRelativePoiListResponse");
            LinkedList<C51285sq3> linkedList = ((C51764w02) aVar3).f143795d;
            if (linkedList != null) {
                arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C51285sq3 z1Var : linkedList) {
                    arrayList.add(new C0800z1(z1Var));
                }
            }
            aVar2.setIncrementList(arrayList);
            C47465a aVar4 = d4Var.f29077g.f127056b.f127083a;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderRelativePoiListResponse");
            aVar2.setLastBuffer(((C51764w02) aVar4).f143796e);
            aVar2.setPullType(d4Var.f29079i);
            return aVar2;
        }

        public C117747y genLoadMoreNetScene() {
            FinderPoiRelateLoader finderPoiRelateLoader = FinderPoiRelateLoader.this;
            C9301d4 d4Var = new C9301d4(finderPoiRelateLoader.f13789d, finderPoiRelateLoader.getLastBuffer(), FinderPoiRelateLoader.this.getContextObj());
            d4Var.f29079i = 2;
            return d4Var;
        }

        public C117747y genRefreshNetScene() {
            FinderPoiRelateLoader finderPoiRelateLoader = FinderPoiRelateLoader.this;
            C9301d4 d4Var = new C9301d4(finderPoiRelateLoader.f13789d, finderPoiRelateLoader.getLastBuffer(), FinderPoiRelateLoader.this.getContextObj());
            d4Var.f29079i = 0;
            return d4Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(6208);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader$c */
    public static final class C2734c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderPoiRelateLoader f13792a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader$c$a */
        public static final class C2735a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C2734c f13793d;

            /* renamed from: e */
            public final /* synthetic */ C13923t<C0740i2> f13794e;

            /* renamed from: f */
            public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13795f;

            /* renamed from: g */
            public final /* synthetic */ FinderPoiRelateLoader f13796g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<IResponse<C0740i2>, C13598b0> f13797h;

            /* renamed from: i */
            public final /* synthetic */ IResponse<C0740i2> f13798i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2735a(C2734c cVar, C13923t<C0740i2> tVar, RefreshLoadMoreLayout.C7080c<Object> cVar2, FinderPoiRelateLoader finderPoiRelateLoader, C32226l<? super IResponse<C0740i2>, C13598b0> lVar, IResponse<C0740i2> iResponse) {
                super(0);
                this.f13793d = cVar;
                this.f13794e = tVar;
                this.f13795f = cVar2;
                this.f13796g = finderPoiRelateLoader;
                this.f13797h = lVar;
                this.f13798i = iResponse;
            }

            public Object invoke() {
                this.f13793d.convertOpToReason(this.f13794e, this.f13795f);
                this.f13796g.dispatcher().mo13381g(this.f13795f);
                C32226l<IResponse<C0740i2>, C13598b0> lVar = this.f13797h;
                if (lVar != null) {
                    lVar.invoke(this.f13798i);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2734c(FinderPoiRelateLoader finderPoiRelateLoader) {
            super(finderPoiRelateLoader, false, 1, (C8480h) null);
            this.f13792a = finderPoiRelateLoader;
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
            String tag = this.f13792a.getTAG();
            Log.m105924i(tag, "[onFetchRefreshDone]  reason=" + cVar);
            List<C0740i2> incrementList = iResponse.getIncrementList();
            int size = incrementList != null ? incrementList.size() : 0;
            if (iResponse.getHasMore()) {
                if (size <= this.f13792a.getDataList().size()) {
                    i = 2;
                    C61926c.m72668M(new C2735a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13792a, lVar, iResponse));
                }
            } else if (this.f13792a.getDataList().size() == 0 || size == 0 || this.f13792a.getDataList().size() <= size) {
                List<C0740i2> incrementList2 = iResponse.getIncrementList();
                if (incrementList2 == null || !incrementList2.containsAll(C110818d0.m150953y0(this.f13792a.getDataList()))) {
                    z = false;
                }
                if (z) {
                    i = 6;
                    C61926c.m72668M(new C2735a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13792a, lVar, iResponse));
                }
            }
            i = 4;
            C61926c.m72668M(new C2735a(this, new C13923t(i, iResponse.getIncrementList(), iResponse.isNeedClear(), (Object) null, 8, (C8480h) null), cVar, this.f13792a, lVar, iResponse));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPoiRelateLoader(String str, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "targetUsername");
        this.f13789d = str;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2733b();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C2734c(this);
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse)) {
            iResponse.getHasMore();
            if (!iResponse.getHasMore() && (lVar = this.f13790e) != null) {
                lVar.invoke(iResponse);
            }
        }
    }
}
