package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.w7 */
public final class C10026w7 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f30729d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30730e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10026w7(FinderFullSeekBarLayout finderFullSeekBarLayout, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        super(1);
        this.f30729d = finderFullSeekBarLayout;
        this.f30730e = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        this.f30729d.mo4259i(this.f30730e.f13140h);
        return C13598b0.f38549a;
    }
}
