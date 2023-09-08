package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import je1.C9342n1;
import je1.C9360p1;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C51847wl1;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.n0 */
public final class C2810n0 implements C9360p1.C9361a {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineFeedLoader.C2752b f14041d;

    /* renamed from: e */
    public final /* synthetic */ Object f14042e;

    /* renamed from: f */
    public final /* synthetic */ C13910j<C0740i2> f14043f;

    /* renamed from: g */
    public final /* synthetic */ C14121l f14044g;

    /* renamed from: h */
    public final /* synthetic */ FinderTimelineFeedLoader f14045h;

    public C2810n0(FinderTimelineFeedLoader.C2752b bVar, Object obj, C13910j<C0740i2> jVar, C14121l lVar, FinderTimelineFeedLoader finderTimelineFeedLoader) {
        this.f14041d = bVar;
        this.f14042e = obj;
        this.f14043f = jVar;
        this.f14044g = lVar;
        this.f14045h = finderTimelineFeedLoader;
    }

    /* renamed from: a */
    public void mo2805a(C2781d dVar, int i) {
        List incrementList;
        C0740i2 i2Var;
        C32227p<? super String, ? super BaseFinderFeed, C13598b0> pVar;
        C49842ig0 ig02;
        C87412m.m108594g(dVar, "info");
        String tag = this.f14041d.getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("[call] onFetchDone... pullType=");
        sb.append(i);
        sb.append(", isPreloadMore=");
        ((FinderTimelineFeedLoader.C2756c) this.f14042e).getClass();
        int i2 = 0;
        sb.append(false);
        Log.m105924i(tag, sb.toString());
        boolean z = dVar.f13971h != 0;
        FinderTimelineFeedLoader.C2757d dVar2 = new FinderTimelineFeedLoader.C2757d(dVar.f13964a, dVar.f13965b, dVar.f13966c, (Object) null, 8, (C8480h) null);
        dVar2.setIncrementList(dVar.f13968e);
        dVar2.setPullType(i);
        dVar2.setHasMore(z);
        dVar2.setNeedClear(dVar.f13972i);
        dVar2.f13872a = dVar.f13976m;
        C51847wl1 wl12 = null;
        dVar2.f13873b = null;
        Object obj = this.f14042e;
        FinderTimelineFeedLoader.C2756c cVar = (FinderTimelineFeedLoader.C2756c) obj;
        C9342n1.C9346d dVar3 = dVar.f13979p;
        cVar.f13870c = (dVar3 == null || (ig02 = dVar3.mo10088b().f145372g) == null) ? 0 : ig02.f135317i;
        C9342n1.C9346d dVar4 = dVar.f13979p;
        cVar.f13871d = dVar4 != null ? dVar4.mo10088b().f145364J : null;
        dVar2.setRequest(obj);
        C9342n1.C9346d dVar5 = dVar.f13979p;
        dVar2.f13874c = dVar5 != null ? dVar5.f146066D : null;
        if (dVar5 != null) {
            wl12 = dVar5.f146068F;
        }
        dVar2.f13875d = wl12;
        dVar2.setLastBuffer(dVar.f13977n);
        if (!((i != 0 && i != 1) || (incrementList = dVar2.getIncrementList()) == null || (i2Var = (C0740i2) C110818d0.m150916N(incrementList)) == null)) {
            FinderTimelineFeedLoader finderTimelineFeedLoader = this.f14045h;
            if ((i2Var instanceof BaseFinderFeed) && (pVar = finderTimelineFeedLoader.f13844g) != null) {
                pVar.invoke("onFetchDone", i2Var);
            }
        }
        List incrementList2 = dVar2.getIncrementList();
        if (incrementList2 != null) {
            FinderTimelineFeedLoader.C2752b bVar = this.f14041d;
            C49712hj1 contextObj = this.f14045h.getContextObj();
            if (contextObj != null) {
                i2 = contextObj.f134675i;
            }
            bVar.mo2806b(i2, incrementList2);
        }
        this.f14043f.onFetchDone(dVar2);
        this.f14044g.mo11853b(C65234n.OK);
    }
}
