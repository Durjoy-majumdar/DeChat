package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.p7 */
public final class C9929p7 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f30566d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30567e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9929p7(FinderFullSeekBarLayout finderFullSeekBarLayout, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        super(1);
        this.f30566d = finderFullSeekBarLayout;
        this.f30567e = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        this.f30566d.mo4259i(this.f30567e.f13140h);
        return C13598b0.f38549a;
    }
}
