package com.tencent.p014mm.plugin.finder.feed.model;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import tf1.C13923t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002J2\u0010\t\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\u001a\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¨\u0006\n"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$createDataMerger$1", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader$a;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lcm1/i2;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "response", "Lkotlin/Function1;", "Lrx3/b0;", "next", "mergeRefresh", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$createDataMerger$1 */
public final class FinderProfileFeedLoader$createDataMerger$1 extends BaseFeedLoader<C0740i2>.a {
    public final /* synthetic */ FinderProfileFeedLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedLoader$createDataMerger$1(FinderProfileFeedLoader finderProfileFeedLoader) {
        super(finderProfileFeedLoader, false, 1, (C8480h) null);
        this.this$0 = finderProfileFeedLoader;
    }

    public void mergeRefresh(IResponse<C0740i2> iResponse, C32226l<? super IResponse<C0740i2>, C13598b0> lVar) {
        C87412m.m108594g(iResponse, "response");
        C61926c.m72668M(new FinderProfileFeedLoader$createDataMerger$1$mergeRefresh$1(this, new C13923t(7, iResponse.getIncrementList(), false, (Object) null, 12, (C8480h) null), new RefreshLoadMoreLayout.C7080c(0), this.this$0, lVar, iResponse));
    }
}
