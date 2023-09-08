package com.tencent.p014mm.plugin.finder.nearby.live;

import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51942x91;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.b */
public final class C3301b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f15645d;

    /* renamed from: e */
    public final /* synthetic */ C51942x91 f15646e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3301b(NearbyLivePresenter nearbyLivePresenter, C51942x91 x912) {
        super(0);
        this.f15645d = nearbyLivePresenter;
        this.f15646e = x912;
    }

    public Object invoke() {
        C39818r rVar = C39818r.f106831a;
        Fragment fragment = this.f15645d.f15611i;
        C87412m.m108591d(fragment);
        Fragment parentFragment = fragment.getParentFragment();
        C87412m.m108591d(parentFragment);
        ((NearbyLiveSquareUIC) rVar.mo62445d(parentFragment).mo75002a(NearbyLiveSquareUIC.class)).mo3609i3(this.f15646e.f144531d);
        return C13598b0.f38549a;
    }
}
