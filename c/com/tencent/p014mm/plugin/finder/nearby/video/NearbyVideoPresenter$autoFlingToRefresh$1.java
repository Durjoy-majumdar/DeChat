package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$autoFlingToRefresh$1 */
public final class NearbyVideoPresenter$autoFlingToRefresh$1 implements Runnable {
    public final /* synthetic */ boolean $isSilence;
    public final /* synthetic */ RefreshLoadMoreLayout $rlLayout;

    public NearbyVideoPresenter$autoFlingToRefresh$1(RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z) {
        this.$rlLayout = refreshLoadMoreLayout;
        this.$isSilence = z;
    }

    public final void run() {
        this.$rlLayout.mo82439E(this.$isSilence, false);
    }
}
