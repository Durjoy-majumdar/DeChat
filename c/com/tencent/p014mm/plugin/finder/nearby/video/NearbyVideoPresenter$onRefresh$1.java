package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$onRefresh$1 */
public final class NearbyVideoPresenter$onRefresh$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ NearbyVideoPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyVideoPresenter$onRefresh$1(NearbyVideoPresenter nearbyVideoPresenter) {
        super(0);
        this.this$0 = nearbyVideoPresenter;
    }

    public final void invoke() {
        RefreshLoadMoreLayout c = this.this$0.getViewCallback().mo3668c();
        final NearbyVideoPresenter nearbyVideoPresenter = this.this$0;
        c.postDelayed(new Runnable() {
            public final void run() {
                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
                cVar.f24947b = -2;
                nearbyVideoPresenter.getViewCallback().mo3668c().mo82443I(cVar);
            }
        }, 200);
    }
}
