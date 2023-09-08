package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "it", "Lrx3/b0;", "invoke", "(Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$5 */
public final class C3404x28461505 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f16025d;

    /* renamed from: e */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16026e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3404x28461505(FinderFullSeekBarLayout finderFullSeekBarLayout, FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(1);
        this.f16025d = finderFullSeekBarLayout;
        this.f16026e = likedTimelinePresenter;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        this.f16025d.mo4259i(this.f16026e.f15983o);
        return C13598b0.f38549a;
    }
}
