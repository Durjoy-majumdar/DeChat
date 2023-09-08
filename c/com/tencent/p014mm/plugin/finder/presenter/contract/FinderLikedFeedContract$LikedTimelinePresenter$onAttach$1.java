package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "pos", "Lcm1/i2;", "invoke", "(I)Lcm1/i2;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$onAttach$1 */
public final class FinderLikedFeedContract$LikedTimelinePresenter$onAttach$1 extends C87413o implements C32226l<Integer, C0740i2> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16036d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelinePresenter$onAttach$1(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(1);
        this.f16036d = likedTimelinePresenter;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue < 0 || intValue >= this.f16036d.f15978g.getDataListJustForAdapter().size()) {
            return null;
        }
        BaseFinderFeedLoader baseFinderFeedLoader = this.f16036d.f15978g;
        C0740i2 i2Var = baseFinderFeedLoader != null ? (C0740i2) baseFinderFeedLoader.get(intValue) : null;
        if (i2Var instanceof BaseFinderFeed) {
            return (BaseFinderFeed) i2Var;
        }
        return null;
    }
}
