package com.tencent.p014mm.plugin.finder.live.loader;

import cm1.C0740i2;
import cm1.C0782u0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import qg1.C12222g0;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C50102ka1;
import te3.C64273c21;
import tf1.C13896d;
import tf1.C13897e;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader */
public final class FinderProfileLiveUserPageLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final String f15080d;

    /* renamed from: e */
    public final String f15081e;

    /* renamed from: f */
    public final boolean f15082f;

    /* renamed from: g */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f15083g;

    /* renamed from: h */
    public List<C0782u0> f15084h;

    /* renamed from: i */
    public C89349b f15085i;

    /* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader$a */
    public final class C3153a extends C13896d {
        public C3153a() {
        }

        public IResponse<C0740i2> callInit() {
            C3154b bVar = new C3154b(0, 0, "");
            FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = FinderProfileLiveUserPageLoader.this;
            bVar.setIncrementList(finderProfileLiveUserPageLoader.f15084h);
            bVar.setLastBuffer(finderProfileLiveUserPageLoader.f15085i);
            return bVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (!(yVar instanceof C12222g0)) {
                return null;
            }
            C3154b bVar = new C3154b(i, i2, str);
            C12222g0 g0Var = (C12222g0) yVar;
            C47465a aVar = g0Var.f35288i.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            bVar.setHasMore(((C50102ka1) aVar).f136635g == 1);
            List<FinderObject> l1 = g0Var.mo11954l1();
            ArrayList arrayList = new ArrayList();
            for (T next : l1) {
                C64273c21 c212 = ((FinderObject) next).liveInfo;
                if (!(c212 != null && c212.f182366L == 6)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C0782u0((FinderObject) it.next()));
            }
            bVar.setIncrementList(arrayList2);
            C47465a aVar2 = g0Var.f35288i.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            bVar.setLastBuffer(((C50102ka1) aVar2).f136634f);
            bVar.setPullType(g0Var.f35287h);
            return bVar;
        }

        public C117747y genLoadMoreNetScene() {
            FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = FinderProfileLiveUserPageLoader.this;
            C12222g0 g0Var = new C12222g0(finderProfileLiveUserPageLoader.f15080d, finderProfileLiveUserPageLoader.f15081e, finderProfileLiveUserPageLoader.getLastBuffer(), FinderProfileLiveUserPageLoader.this.getContextObj());
            g0Var.f35287h = 2;
            return g0Var;
        }

        public C117747y genRefreshNetScene() {
            FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = FinderProfileLiveUserPageLoader.this;
            C12222g0 g0Var = new C12222g0(finderProfileLiveUserPageLoader.f15080d, finderProfileLiveUserPageLoader.f15081e, (C89349b) null, finderProfileLiveUserPageLoader.getContextObj());
            g0Var.f35287h = 0;
            return g0Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(5870);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader$b */
    public static final class C3154b extends IResponse<C0740i2> {
        public C3154b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader$c */
    public static final class C3155c extends BaseFeedLoader<C0740i2>.a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileLiveUserPageLoader f15087a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3155c(FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader) {
            super(finderProfileLiveUserPageLoader, false, 1, (C8480h) null);
            this.f15087a = finderProfileLiveUserPageLoader;
        }

        public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
            C87412m.m108594g(iResponse, "response");
            super.mergeRefresh(iResponse, lVar);
            this.f15087a.getDataList().clear();
            DataBuffer dataList = this.f15087a.getDataList();
            List<C0740i2> incrementList = iResponse.getIncrementList();
            dataList.addAll(incrementList != null ? C110818d0.m150953y0(incrementList) : new ArrayList<>());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileLiveUserPageLoader(String str, String str2, boolean z, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "targetUsername");
        C87412m.m108594g(str2, "myUsername");
        this.f15080d = str;
        this.f15081e = str2;
        this.f15082f = z;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C3153a();
    }

    public C13897e<C0740i2> createDataMerger() {
        return new C3155c(this);
    }

    public void onDead() {
        super.onDead();
        this.f15083g = null;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        if (this.f15082f) {
            super.onFetchDone(iResponse);
            if (isInitOperation(iResponse)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
                return;
            }
        }
        C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f15083g;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/loader/FinderProfileLiveUserPageLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
