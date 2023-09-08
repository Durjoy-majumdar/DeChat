package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$2$onLoadMoreBegin$1 */
public final class C3409xdc96b4d4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelineViewCallback f16042d;

    public C3409xdc96b4d4(FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback) {
        this.f16042d = likedTimelineViewCallback;
    }

    public final void run() {
        C0740i2 i2Var = (C0740i2) this.f16042d.f15988e.f15978g.getLast();
        if (!this.f16042d.f15988e.f15978g.getDataList().isEmpty() && i2Var != null) {
            BaseFeedLoader.requestLoadMore$default(this.f16042d.f15988e.f15978g, false, 1, (Object) null);
        }
    }
}
