package com.tencent.p014mm.plugin.finder.nearby.live;

import cm1.C0717c0;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import je1.C9311g2;
import lm1.C10546d;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;
import vp1.C14937o;
import vp1.C14944s;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.a */
public final class C3300a implements C10546d.C10547a {

    /* renamed from: d */
    public final /* synthetic */ NearbyLiveFeedLoader.C3274b f15641d;

    /* renamed from: e */
    public final /* synthetic */ NearbyLiveFeedLoader f15642e;

    /* renamed from: f */
    public final /* synthetic */ C13910j<C0740i2> f15643f;

    /* renamed from: g */
    public final /* synthetic */ C14121l f15644g;

    public C3300a(NearbyLiveFeedLoader.C3274b bVar, NearbyLiveFeedLoader nearbyLiveFeedLoader, C13910j<C0740i2> jVar, C14121l lVar) {
        this.f15641d = bVar;
        this.f15642e = nearbyLiveFeedLoader;
        this.f15643f = jVar;
        this.f15644g = lVar;
    }

    /* renamed from: a */
    public void mo3601a(NearbyLiveFeedLoader.C3278d dVar, NearbyLiveFeedLoader.C3277c cVar) {
        C49712hj1 contextObj;
        C87412m.m108594g(dVar, "response");
        C87412m.m108594g(cVar, "request");
        String tag = this.f15641d.getTAG();
        Log.m105924i(tag, "[call] onFetchDone... pullType: " + dVar.getPullType() + "  hasMore: " + dVar.getHasMore() + "list: " + C9311g2.f29093a.mo10063b(dVar.getIncrementList()) + "lastBuffer: " + dVar.getLastBuffer() + "refresh_interval: " + dVar.getRefreshInterval());
        List incrementList = dVar.getIncrementList();
        if (incrementList != null) {
            NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15642e;
            if (((C0740i2) C110818d0.m150916N(nearbyLiveFeedLoader.getDataListJustForAdapter())) == null) {
                if ((!incrementList.isEmpty()) && nearbyLiveFeedLoader.f15531e == 1001) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.addAll(incrementList);
                    dVar.setIncrementList(linkedList);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        this.f15642e.f15538o = dVar.getLastBuffer();
        dVar.setRequest(cVar);
        List<C0740i2> incrementList2 = dVar.getIncrementList();
        if (incrementList2 != null) {
            NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f15642e;
            for (C0740i2 i2Var : incrementList2) {
                if ((i2Var instanceof BaseFinderFeed) && (contextObj = nearbyLiveFeedLoader2.getContextObj()) != null) {
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(((BaseFinderFeed) i2Var).mo3513o().getFeedObject(), contextObj.f134675i);
                }
            }
        }
        if (dVar.getPullType() != 2) {
            LinkedList linkedList2 = new LinkedList();
            List<C0740i2> incrementList3 = dVar.getIncrementList();
            if (incrementList3 != null) {
                NearbyLiveFeedLoader nearbyLiveFeedLoader3 = this.f15642e;
                for (C0740i2 i2Var2 : incrementList3) {
                    if (i2Var2 instanceof C0797z) {
                        linkedList2.add(new C14944s(i2Var2.mo75c(), i2Var2.getItemId(), ((C0797z) i2Var2).mo3513o().getFeedObject(), C58784w3.f168295a.mo83887M1(nearbyLiveFeedLoader3.f15536j), false, 16, (C8480h) null));
                    } else if (i2Var2 instanceof C0717c0) {
                        linkedList2.add(new C14944s(i2Var2.mo75c(), i2Var2.getItemId(), ((C0717c0) i2Var2).mo3513o().getFeedObject(), C58784w3.f168295a.mo83887M1(nearbyLiveFeedLoader3.f15536j), false, 16, (C8480h) null));
                    }
                }
            }
            if (linkedList2.size() > 0) {
                C14937o.f40972a.mo13980a(this.f15642e.f15537n, C66785b.f191882e.mo90662O5(), linkedList2);
            }
            String tag2 = this.f15641d.getTAG();
            Log.m105924i(tag2, "cache FinderPage size: " + linkedList2.size());
        }
        if (BuildInfo.DEBUG) {
            String tag3 = this.f15641d.getTAG();
            Log.m105918d(tag3, "onFetchDone remote list: " + dVar.getIncrementList() + " local list:" + this.f15642e.getDataListJustForAdapter());
        }
        this.f15643f.onFetchDone(dVar);
        this.f15644g.mo11853b(C65234n.OK);
    }
}
