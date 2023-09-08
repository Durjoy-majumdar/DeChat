package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0708a1;
import cm1.C0740i2;
import cm1.C0798z0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dj1.C7345m1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C117747y;
import pe3.C47465a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49088d31;
import te3.C49538gb1;
import te3.C49712hj1;
import te3.C50060k01;
import tf1.C13896d;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader */
public final class FinderLiveLotteryHistoryLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final int f13729d;

    /* renamed from: e */
    public final long f13730e;

    /* renamed from: f */
    public final long f13731f;

    /* renamed from: g */
    public final String f13732g;

    /* renamed from: h */
    public final int f13733h;

    /* renamed from: i */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13734i;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader$a */
    public final class C2718a extends C13896d {
        public C2718a() {
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            LinkedList<C49088d31> linkedList;
            C49088d31 d312;
            LinkedList<C49088d31> linkedList2;
            C49088d31 d313;
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            String tag = getTAG();
            Log.m105924i(tag, "onSceneEnd: errType " + i + ", errCode " + i2 + " errMsg " + str);
            LinkedList<C0798z0> linkedList3 = null;
            C2719b bVar = new C2719b(i, i2, str, (C0708a1) null);
            if (!(yVar instanceof C7345m1) || i != 0 || i2 != 0) {
                return bVar;
            }
            C7345m1 m1Var = (C7345m1) yVar;
            C49088d31 d314 = (C49088d31) C110818d0.m150916N(m1Var.mo8519l1());
            C2719b bVar2 = new C2719b(i, i2, str, d314 != null ? new C0708a1(((long) d314.f132087d) * 1000, d314.f132088e.size()) : null);
            C47465a aVar = m1Var.f25466g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetLotteryHistoryResponse");
            C49538gb1 gb12 = ((C50060k01) aVar).f136491d;
            bVar2.setLastBuffer((gb12 == null || (linkedList2 = gb12.f133948d) == null || (d313 = (C49088d31) C110818d0.m150916N(linkedList2)) == null) ? null : d313.f132093j);
            C47465a aVar2 = m1Var.f25466g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetLotteryHistoryResponse");
            C49538gb1 gb13 = ((C50060k01) aVar2).f136491d;
            Integer valueOf = (gb13 == null || (linkedList = gb13.f133948d) == null || (d312 = (C49088d31) C110818d0.m150916N(linkedList)) == null) ? null : Integer.valueOf(d312.f132092i);
            boolean z = true;
            if (valueOf == null || valueOf.intValue() != 1) {
                z = false;
            }
            bVar2.setHasMore(z);
            if (d314 != null) {
                linkedList3 = C0798z0.f1856g.mo733a(d314.f132096p, d314);
            }
            bVar2.setIncrementList(linkedList3);
            bVar2.setPullType(m1Var.f25468i);
            return bVar2;
        }

        public C117747y genLoadMoreNetScene() {
            FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader = FinderLiveLotteryHistoryLoader.this;
            C7345m1 m1Var = new C7345m1(finderLiveLotteryHistoryLoader.f13729d, finderLiveLotteryHistoryLoader.f13730e, finderLiveLotteryHistoryLoader.f13731f, finderLiveLotteryHistoryLoader.f13732g, finderLiveLotteryHistoryLoader.getLastBuffer(), 0, FinderLiveLotteryHistoryLoader.this.f13733h);
            m1Var.f25468i = 2;
            return m1Var;
        }

        public C117747y genRefreshNetScene() {
            FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader = FinderLiveLotteryHistoryLoader.this;
            C7345m1 m1Var = new C7345m1(finderLiveLotteryHistoryLoader.f13729d, finderLiveLotteryHistoryLoader.f13730e, finderLiveLotteryHistoryLoader.f13731f, finderLiveLotteryHistoryLoader.f13732g, finderLiveLotteryHistoryLoader.getLastBuffer(), 0, FinderLiveLotteryHistoryLoader.this.f13733h);
            m1Var.f25468i = 0;
            return m1Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(6484);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader$b */
    public static final class C2719b extends IResponse<C0740i2> {

        /* renamed from: a */
        public final C0708a1 f13736a;

        public C2719b(int i, int i2, String str, C0708a1 a1Var) {
            super(i, i2, str);
            this.f13736a = a1Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader$c */
    public static final class C2720c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLotteryHistoryLoader f13737d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<C0740i2> f13738e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2720c(FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader, IResponse<C0740i2> iResponse) {
            super(0);
            this.f13737d = finderLiveLotteryHistoryLoader;
            this.f13738e = iResponse;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13737d.f13734i;
            if (lVar != null) {
                lVar.invoke(this.f13738e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLotteryHistoryLoader(int i, long j, long j2, String str, int i2) {
        super((C49712hj1) null);
        C87412m.m108594g(str, "objectNonceId");
        this.f13729d = i;
        this.f13730e = j;
        this.f13731f = j2;
        this.f13732g = str;
        this.f13733h = i2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2718a();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (isInitOperation(iResponse)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
            return;
        }
        iResponse.getHasMore();
        C61926c.m72668M(new C2720c(this, iResponse));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
