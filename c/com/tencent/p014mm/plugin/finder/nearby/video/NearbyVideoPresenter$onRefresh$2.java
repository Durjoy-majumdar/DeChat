package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.plugin.finder.utils.FinderLbsLogic;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$2 */
public final class NearbyVideoPresenter$onRefresh$2 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ NearbyVideoPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyVideoPresenter$onRefresh$2(NearbyVideoPresenter nearbyVideoPresenter) {
        super(0);
        this.this$0 = nearbyVideoPresenter;
    }

    public final void invoke() {
        if (!this.this$0.isRequestingLbs()) {
            this.this$0.setRequestingLbs(true);
            final NearbyVideoPresenter nearbyVideoPresenter = this.this$0;
            C61926c.m72657B("LbsPresenter_requestLbs", true, new C32224a<C13598b0>() {
                public final void invoke() {
                    final boolean c = FinderLbsLogic.f17479a.mo4231c();
                    nearbyVideoPresenter.setRequestingLbs(false);
                    final NearbyVideoPresenter nearbyVideoPresenter = nearbyVideoPresenter;
                    C61926c.m72668M(new C32224a<C13598b0>() {
                        public final void invoke() {
                            if (c) {
                                nearbyVideoPresenter.requestRefresh();
                            } else {
                                nearbyVideoPresenter.requestRefreshNoPermission();
                            }
                        }
                    });
                }
            });
        }
    }
}
