package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import cm1.C0791x0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dj1.C7343l1;
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
import te3.C49712hj1;
import te3.C50155ko0;
import te3.C50505n71;
import tf1.C13896d;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader */
public final class FinderLiveWecoinHotLoader extends BaseFeedLoader<C0740i2> {

    /* renamed from: d */
    public final long f13753d;

    /* renamed from: e */
    public final long f13754e;

    /* renamed from: f */
    public final String f13755f;

    /* renamed from: g */
    public final int f13756g;

    /* renamed from: h */
    public final Boolean f13757h;

    /* renamed from: i */
    public C32226l<? super IResponse<C0740i2>, C13598b0> f13758i;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader$a */
    public final class C2724a extends C13896d {
        public C2724a() {
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3 = i;
            int i4 = i2;
            C117747y yVar2 = yVar;
            C87412m.m108594g(yVar2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            Log.m105924i("FinderLiveWecoinHotLoader", "onSceneEnd: errType " + i3 + ", errCode " + i4 + " errMsg " + str);
            C2725b bVar = new C2725b(i, i2, str, new LinkedList(), 0);
            if (!(yVar2 instanceof C7343l1) || i3 != 0 || i4 != 0) {
                return bVar;
            }
            C7343l1 l1Var = (C7343l1) yVar2;
            LinkedList<C50505n71> l1 = l1Var.mo8517l1();
            FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = FinderLiveWecoinHotLoader.this;
            for (C50505n71 x0Var : l1) {
                DataBuffer dataList = finderLiveWecoinHotLoader.getDataList();
                int size = l1Var.mo8517l1().size();
                C47465a aVar = l1Var.f25464g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
                dataList.add(new C0791x0(size, ((C50155ko0) aVar).f136908j, x0Var));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd: getTotalHeat:");
            C47465a aVar2 = l1Var.f25464g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            sb.append(((C50155ko0) aVar2).f136910o);
            sb.append(", ifUseNewHeat:");
            sb.append(FinderLiveWecoinHotLoader.this.f13757h);
            sb.append(", getNewTotalWecoinHot:");
            C47465a aVar3 = l1Var.f25464g.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            sb.append(((C50155ko0) aVar3).f136909n);
            sb.append(",getTotalWecoinHot:");
            C47465a aVar4 = l1Var.f25464g.f127056b.f127083a;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            sb.append(((C50155ko0) aVar4).f136908j);
            Log.m105924i("FinderLiveWecoinHotLoader", sb.toString());
            if (FinderLiveWecoinHotLoader.this.f13756g == 1) {
                LinkedList<C50505n71> l15 = l1Var.mo8517l1();
                C47465a aVar5 = l1Var.f25464g.f127056b.f127083a;
                C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
                return new C2725b(i, i2, str, l15, ((C50155ko0) aVar5).f136909n);
            }
            LinkedList<C50505n71> l16 = l1Var.mo8517l1();
            C47465a aVar6 = l1Var.f25464g.f127056b.f127083a;
            C87412m.m108592e(aVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            return new C2725b(i, i2, str, l16, ((C50155ko0) aVar6).f136910o);
        }

        public C117747y genLoadMoreNetScene() {
            FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = FinderLiveWecoinHotLoader.this;
            return new C7343l1(finderLiveWecoinHotLoader.f13753d, finderLiveWecoinHotLoader.f13754e, finderLiveWecoinHotLoader.f13755f, finderLiveWecoinHotLoader.getLastBuffer(), FinderLiveWecoinHotLoader.this.f13756g);
        }

        public C117747y genRefreshNetScene() {
            FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = FinderLiveWecoinHotLoader.this;
            return new C7343l1(finderLiveWecoinHotLoader.f13753d, finderLiveWecoinHotLoader.f13754e, finderLiveWecoinHotLoader.f13755f, finderLiveWecoinHotLoader.getLastBuffer(), FinderLiveWecoinHotLoader.this.f13756g);
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(4168);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader$b */
    public static final class C2725b extends IResponse<C0740i2> {

        /* renamed from: a */
        public final LinkedList<C50505n71> f13760a;

        /* renamed from: b */
        public final long f13761b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2725b(int i, int i2, String str, LinkedList<C50505n71> linkedList, long j) {
            super(i, i2, str);
            C87412m.m108594g(linkedList, "wecoinHotList");
            this.f13760a = linkedList;
            this.f13761b = j;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader$c */
    public static final class C2726c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveWecoinHotLoader f13762d;

        /* renamed from: e */
        public final /* synthetic */ IResponse<C0740i2> f13763e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2726c(FinderLiveWecoinHotLoader finderLiveWecoinHotLoader, IResponse<C0740i2> iResponse) {
            super(0);
            this.f13762d = finderLiveWecoinHotLoader;
            this.f13763e = iResponse;
        }

        public Object invoke() {
            C32226l<? super IResponse<C0740i2>, C13598b0> lVar = this.f13762d.f13758i;
            if (lVar != null) {
                lVar.invoke(this.f13763e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveWecoinHotLoader(long j, long j2, String str, int i, Boolean bool) {
        super((C49712hj1) null);
        C87412m.m108594g(str, "objectNonceId");
        this.f13753d = j;
        this.f13754e = j2;
        this.f13755f = str;
        this.f13756g = i;
        this.f13757h = bool;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C2724a();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iResponse);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (isInitOperation(iResponse)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
            return;
        }
        C61926c.m72668M(new C2726c(this, iResponse));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveWecoinHotLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
