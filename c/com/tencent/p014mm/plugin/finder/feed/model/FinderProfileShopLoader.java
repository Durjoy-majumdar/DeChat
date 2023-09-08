package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0728e2;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46539u3;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C51707vl0;
import te3.C64370fp1;
import tf1.C13896d;
import tf1.C13911k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileShopLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileShopLoader */
public final class FinderProfileShopLoader extends BaseFinderFeedLoader {

    /* renamed from: d */
    public final long f158731d;

    /* renamed from: e */
    public final int f158732e;

    /* renamed from: f */
    public final String f158733f;

    /* renamed from: g */
    public final String f158734g;

    /* renamed from: h */
    public C32224a<C13598b0> f158735h;

    /* renamed from: i */
    public List<C0728e2> f158736i;

    /* renamed from: j */
    public C89349b f158737j;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileShopLoader$a */
    public final class C55755a extends C13896d {
        public C55755a() {
        }

        public IResponse<C0740i2> callInit() {
            C55756b bVar = new C55756b(0, 0, "");
            FinderProfileShopLoader finderProfileShopLoader = FinderProfileShopLoader.this;
            bVar.setIncrementList(finderProfileShopLoader.f158736i);
            bVar.setLastBuffer(finderProfileShopLoader.f158737j);
            return bVar;
        }

        public IResponse<C0740i2> dealOnSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (!(yVar instanceof C46539u3)) {
                return null;
            }
            C55756b bVar = new C55756b(i, i2, str);
            C46539u3 u3Var = (C46539u3) yVar;
            C47465a aVar = u3Var.f125398i.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
            boolean z = true;
            if (((C51707vl0) aVar).f143546f != 1) {
                z = false;
            }
            bVar.setHasMore(z);
            C47465a aVar2 = u3Var.f125398i.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
            LinkedList<C64370fp1> linkedList = ((C51707vl0) aVar2).f143544d;
            C87412m.m108593f(linkedList, "commReqResp.responseProt…roductsResponse).products");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C64370fp1 e2Var : linkedList) {
                arrayList.add(new C0728e2(e2Var));
            }
            bVar.setIncrementList(arrayList);
            C47465a aVar3 = u3Var.f125398i.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
            bVar.setLastBuffer(((C51707vl0) aVar3).f143545e);
            bVar.setPullType(u3Var.f125397h);
            return bVar;
        }

        public C117747y genLoadMoreNetScene() {
            FinderProfileShopLoader finderProfileShopLoader = FinderProfileShopLoader.this;
            C46539u3 u3Var = new C46539u3(finderProfileShopLoader.f158731d, finderProfileShopLoader.f158732e, finderProfileShopLoader.f158733f, finderProfileShopLoader.f158734g, finderProfileShopLoader.getLastBuffer(), FinderProfileShopLoader.this.getContextObj());
            u3Var.f125397h = 2;
            return u3Var;
        }

        public C117747y genRefreshNetScene() {
            FinderProfileShopLoader finderProfileShopLoader = FinderProfileShopLoader.this;
            C46539u3 u3Var = new C46539u3(finderProfileShopLoader.f158731d, finderProfileShopLoader.f158732e, finderProfileShopLoader.f158733f, finderProfileShopLoader.f158734g, (C89349b) null, finderProfileShopLoader.getContextObj());
            u3Var.f125397h = 0;
            return u3Var;
        }

        public List<Integer> getCmdIds() {
            return C26236u.m33719b(5244);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileShopLoader$b */
    public static final class C55756b extends IResponse<C0740i2> {
        public C55756b(int i, int i2, String str) {
            super(i, i2, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileShopLoader(long j, int i, String str, String str2, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "ecSource");
        this.f158731d = j;
        this.f158732e = i;
        this.f158733f = str;
        this.f158734g = str2;
    }

    public C13911k<C0740i2> createDataFetch() {
        return new C55755a();
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        if (!isInitOperation(iResponse) && !iResponse.getHasMore() && (aVar = this.f158735h) != null) {
            aVar.invoke();
        }
    }
}
