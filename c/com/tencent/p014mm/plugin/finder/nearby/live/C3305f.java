package com.tencent.p014mm.plugin.finder.nearby.live;

import com.tencent.p014mm.plugin.finder.utils.FinderLbsLogic;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.f */
public final class C3305f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f15651d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3305f(NearbyLivePresenter nearbyLivePresenter) {
        super(0);
        this.f15651d = nearbyLivePresenter;
    }

    public Object invoke() {
        boolean c = FinderLbsLogic.f17479a.mo4231c();
        NearbyLivePresenter nearbyLivePresenter = this.f15651d;
        nearbyLivePresenter.f15623x = false;
        C61926c.m72668M(new C3304e(c, nearbyLivePresenter));
        return C13598b0.f38549a;
    }
}
