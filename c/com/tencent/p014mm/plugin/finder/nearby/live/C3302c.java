package com.tencent.p014mm.plugin.finder.nearby.live;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import oe1.C35152b;
import rx3.C13598b0;
import tf1.C13900g;
import vc1.C37715b;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.c */
public final class C3302c extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f15647d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3302c(NearbyLivePresenter nearbyLivePresenter) {
        super(1);
        this.f15647d = nearbyLivePresenter;
    }

    public Object invoke(Object obj) {
        NearbyLiveFeedLoader nearbyLiveFeedLoader;
        C13900g dispatcher;
        C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
        C37715b bVar = C37715b.f99914a;
        boolean z = true;
        if (C35152b.f94274b.mo60266n().intValue() != 1) {
            z = false;
        }
        if (!(z || (nearbyLiveFeedLoader = this.f15647d.f15620u) == null || (dispatcher = nearbyLiveFeedLoader.dispatcher()) == null)) {
            dispatcher.mo13376a();
        }
        Log.m105924i("Finder.NearbyLivePresenter", " receive FinderNearbyDataUpdateEvent mergeInsert done");
        return C13598b0.f38549a;
    }
}
