package com.tencent.p014mm.plugin.finder.nearby.live;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.e */
public final class C3304e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f15649d;

    /* renamed from: e */
    public final /* synthetic */ NearbyLivePresenter f15650e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3304e(boolean z, NearbyLivePresenter nearbyLivePresenter) {
        super(0);
        this.f15649d = z;
        this.f15650e = nearbyLivePresenter;
    }

    public Object invoke() {
        if (this.f15649d) {
            this.f15650e.requestRefresh();
        } else {
            this.f15650e.mo3595u0();
        }
        return C13598b0.f38549a;
    }
}
