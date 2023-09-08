package com.tencent.p014mm.plugin.finder.nearby.video;

import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderFluentSwitchInterceptEvent;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C9311g2;
import je1.C9360p1;
import ln1.C10583e;
import te3.C49712hj1;
import tf1.C13910j;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.g */
public final class C3348g implements C9360p1.C9361a {

    /* renamed from: d */
    public final /* synthetic */ NearbyVideoFeedLoader.C3330a f15793d;

    /* renamed from: e */
    public final /* synthetic */ Object f15794e;

    /* renamed from: f */
    public final /* synthetic */ NearbyVideoFeedLoader f15795f;

    /* renamed from: g */
    public final /* synthetic */ C13910j<C0740i2> f15796g;

    /* renamed from: h */
    public final /* synthetic */ C14121l f15797h;

    public C3348g(NearbyVideoFeedLoader.C3330a aVar, Object obj, NearbyVideoFeedLoader nearbyVideoFeedLoader, C13910j<C0740i2> jVar, C14121l lVar) {
        this.f15793d = aVar;
        this.f15794e = obj;
        this.f15795f = nearbyVideoFeedLoader;
        this.f15796g = jVar;
        this.f15797h = lVar;
    }

    /* renamed from: a */
    public void mo2805a(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "info");
        boolean z = dVar.f13971h != 0;
        String tag = this.f15793d.getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("[call] onFetchDone... pullType=");
        sb.append(i);
        sb.append(", isPreloadMore=");
        ((NearbyVideoFeedLoader.C3332b) this.f15794e).getClass();
        sb.append(false);
        sb.append(" hasMore:");
        sb.append(z);
        sb.append("  list:");
        sb.append(C9311g2.f29093a.mo10063b(dVar.f13968e));
        Log.m105924i(tag, sb.toString());
        NearbyVideoFeedLoader.C3333c cVar = new NearbyVideoFeedLoader.C3333c(dVar.f13964a, dVar.f13965b, dVar.f13966c, (Object) null, 8, (C8480h) null);
        cVar.setIncrementList(dVar.f13968e);
        cVar.setPullType(i);
        cVar.setHasMore(z);
        cVar.setNeedClear(dVar.f13972i);
        C10583e eVar = C10583e.f31911a;
        C49712hj1 contextObj = this.f15795f.getContextObj();
        eVar.mo10840h(contextObj != null ? contextObj.f134675i : -1, dVar.f13968e);
        this.f15796g.onFetchDone(cVar);
        this.f15797h.mo11853b(C65234n.OK);
        NearbyVideoFeedLoader nearbyVideoFeedLoader = this.f15795f;
        int i2 = NearbyVideoFeedLoader.f15759g;
        nearbyVideoFeedLoader.getClass();
        if (1 == cVar.getPullType() || cVar.getPullType() == 0) {
            FinderFluentSwitchInterceptEvent finderFluentSwitchInterceptEvent = new FinderFluentSwitchInterceptEvent();
            finderFluentSwitchInterceptEvent.f9212d.f9213a = true;
            Log.m105924i("Finder.NearbyLivePresenter", "handleFluentSwitch intercept exit");
            finderFluentSwitchInterceptEvent.publish();
        }
    }
}
