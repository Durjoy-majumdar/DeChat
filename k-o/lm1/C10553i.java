package lm1;

import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;

/* renamed from: lm1.i */
public final class C10553i implements C113177k.C113181e {

    /* renamed from: a */
    public final /* synthetic */ NearbyLivePresenter f31842a;

    public C10553i(NearbyLivePresenter nearbyLivePresenter) {
        this.f31842a = nearbyLivePresenter;
    }

    public final void onOp(Boolean bool) {
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        if (bool.booleanValue()) {
            NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f31842a.f15620u;
            C87412m.m108591d(nearbyLiveFeedLoader);
            nearbyLiveFeedLoader.mo3561e(this.f31842a.mo3582j0(), this.f31842a.mo3573N(), this.f31842a.f15612j);
            return;
        }
        NearbyLivePresenter nearbyLivePresenter = this.f31842a;
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
        cVar.f24947b = -2;
        nearbyLivePresenter.mo3590q(cVar);
    }
}
