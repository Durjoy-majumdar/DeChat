package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader;
import gy3.C87412m;
import je1.C9360p1;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.b0 */
public final class C2779b0 implements C9360p1.C9361a {

    /* renamed from: d */
    public final /* synthetic */ C13910j<C0740i2> f13962d;

    /* renamed from: e */
    public final /* synthetic */ C14121l f13963e;

    public C2779b0(C13910j<C0740i2> jVar, C14121l lVar) {
        this.f13962d = jVar;
        this.f13963e = lVar;
    }

    /* renamed from: a */
    public void mo2805a(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "info");
        boolean z = dVar.f13971h != 0;
        FinderLbsStreamFeedLoader.C2706b bVar = new FinderLbsStreamFeedLoader.C2706b(dVar.f13964a, dVar.f13965b, dVar.f13966c, 0);
        bVar.setIncrementList(dVar.f13968e);
        bVar.setPullType(i);
        bVar.setLastBuffer(dVar.f13977n);
        bVar.setHasMore(z);
        this.f13962d.onFetchDone(bVar);
        this.f13963e.mo11853b(C65234n.OK);
    }
}
