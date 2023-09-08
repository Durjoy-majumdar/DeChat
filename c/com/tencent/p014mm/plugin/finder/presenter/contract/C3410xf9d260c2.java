package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$2$onRefreshBegin$1 */
public final class C3410xf9d260c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelineViewCallback f16043d;

    public C3410xf9d260c2(FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback) {
        this.f16043d = likedTimelineViewCallback;
    }

    public final void run() {
        this.f16043d.f15988e.f15978g.requestRefresh();
    }
}
