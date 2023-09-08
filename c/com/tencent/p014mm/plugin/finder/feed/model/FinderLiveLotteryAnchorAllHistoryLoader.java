package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0713b1;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
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
import sx3.C26236u;
import sx3.C36907w;
import te3.C49088d31;
import te3.C49712hj1;
import te3.C50060k01;
import tf1.C13896d;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryAnchorAllHistoryLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryAnchorAllHistoryLoader */
public final class FinderLiveLotteryAnchorAllHistoryLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final long f13721d;

    /* renamed from: e */
    public final long f13722e;

    /* renamed from: f */
    public final int f13723f;

    /* renamed from: g */
    public final int f13724g;

    /* renamed from: h */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13725h;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryAnchorAllHistoryLoader$a */
    public final class C2715a extends C13896d {
        public C2715a() {
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            String tag = getTAG();
            Log.m105924i(tag, "onSceneEnd: errType " + i + ", errCode " + i2 + " errMsg " + str);
            C2716b bVar = new C2716b(i, i2, str);
            if ((yVar instanceof C7345m1) && i == 0 && i2 == 0) {
                C7345m1 m1Var = (C7345m1) yVar;
                C47465a aVar = m1Var.f25466g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetLotteryHistoryResponse");
                bVar.setLastBuffer(((C50060k01) aVar).f136492e);
                C47465a aVar2 = m1Var.f25466g.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetLotteryHistoryResponse");
                boolean z = true;
                if (((C50060k01) aVar2).f136493f != 1) {
                    z = false;
                }
                bVar.setHasMore(z);
                LinkedList<C49088d31> l1 = m1Var.mo8519l1();
                ArrayList arrayList = new ArrayList(C36907w.m41090l(l1, 10));
                for (C49088d31 d312 : l1) {
                    C87412m.m108593f(d312, LocaleUtil.ITALIAN);
                    arrayList.add(new C0713b1(d312));
                }
                bVar.setIncrementList(arrayList);
                bVar.setPullType(m1Var.f25468i);
            }
            return bVar;
        }

        public C117747y genLoadMoreNetScene() {
            FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader = FinderLiveLotteryAnchorAllHistoryLoader.this;
            C7345m1 m1Var = new C7345m1(finderLiveLotteryAnchorAllHistoryLoader.f13723f, finderLiveLotteryAnchorAllHistoryLoader.f13722e, finderLiveLotteryAnchorAllHistoryLoader.f13721d, "", finderLiveLotteryAnchorAllHistoryLoader.getLastBuffer(), 1, FinderLiveLotteryAnchorAllHistoryLoader.this.f13724g);
            m1Var.f25468i = 2;
            return m1Var;
        }

        public C117747y genRefreshNetScene() {
            FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader = FinderLiveLotteryAnchorAllHistoryLoader.this;
            C7345m1 m1Var = new C7345m1(finderLiveLotteryAnchorAllHistoryLoader.f13723f, finderLiveLotteryAnchorAllHistoryLoader.f13722e, finderLiveLotteryAnchorAllHistoryLoader.f13721d, "", finderLiveLotteryAnchorAllHistoryLoader.getLastBuffer(), 1, FinderLiveLotteryAnchorAllHistoryLoader.this.f13724g);
            m1Var.f25468i = 0;
            return m1Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(6484);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryAnchorAllHistoryLoader$b */
    public static final class C2716b extends IResponse<C0740i2> {
        public C2716b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryAnchorAllHistoryLoader$c */
    public static final class C2717c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLotteryAnchorAllHistoryLoader f13727d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<C0740i2> f13728e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2717c(FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader, IResponse<C0740i2> iResponse) {
            super(0);
            this.f13727d = finderLiveLotteryAnchorAllHistoryLoader;
            this.f13728e = iResponse;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13727d.f13725h;
            if (lVar != null) {
                lVar.invoke(this.f13728e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLotteryAnchorAllHistoryLoader(long j, long j2, String str, int i, int i2) {
        super((C49712hj1) null);
        C87412m.m108594g(str, "nonceId");
        this.f13721d = j;
        this.f13722e = j2;
        this.f13723f = i;
        this.f13724g = i2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2715a();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryAnchorAllHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (isInitOperation(iResponse)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryAnchorAllHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
            return;
        }
        iResponse.getHasMore();
        C61926c.m72668M(new C2717c(this, iResponse));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryAnchorAllHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
