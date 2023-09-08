package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Ljava/lang/Void;", "it", "Lrx3/b0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$3 */
public final class FinderLikedFeedContract$LikedTimelineViewCallback$initView$3 extends C87413o implements C32226l<Void, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelineViewCallback f16044d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelineViewCallback$initView$3(FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback) {
        super(1);
        this.f16044d = likedTimelineViewCallback;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        BaseFeedLoader.requestInit$default(this.f16044d.f15988e.f15978g, false, 1, (Object) null);
        return C13598b0.f38549a;
    }
}
