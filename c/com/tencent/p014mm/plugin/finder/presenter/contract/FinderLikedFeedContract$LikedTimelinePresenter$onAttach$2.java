package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.Metadata;
import tf0.C13887q1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"", "firstItemPos", "lastItemPos", "Ljava/util/LinkedList;", "Lcm1/i2;", "invoke", "(II)Ljava/util/LinkedList;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2 */
public final class FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2 extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(2);
        this.f16037d = likedTimelinePresenter;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f16037d.f15978g, ((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
