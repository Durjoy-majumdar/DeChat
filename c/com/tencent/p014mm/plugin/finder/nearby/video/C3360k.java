package com.tencent.p014mm.plugin.finder.nearby.video;

import cm1.C0740i2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.k */
public final class C3360k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C3352j f15821d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3360k(C3352j jVar) {
        super(0);
        this.f15821d = jVar;
    }

    public Object invoke() {
        C3342a<C0740i2> aVar = this.f15821d.f15807g;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter");
        ((NearbyVideoPresenter) aVar).getFeedLoader().requestRefresh();
        return C13598b0.f38549a;
    }
}
