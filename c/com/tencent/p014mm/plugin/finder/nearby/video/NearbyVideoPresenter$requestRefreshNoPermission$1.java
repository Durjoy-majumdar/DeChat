package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$requestRefreshNoPermission$1 */
public final class NearbyVideoPresenter$requestRefreshNoPermission$1 implements Runnable {
    public final /* synthetic */ NearbyVideoPresenter this$0;

    public NearbyVideoPresenter$requestRefreshNoPermission$1(NearbyVideoPresenter nearbyVideoPresenter) {
        this.this$0 = nearbyVideoPresenter;
    }

    public final void run() {
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24947b = -2;
        this.this$0.getViewCallback().mo3668c().mo82443I(cVar);
    }
}
