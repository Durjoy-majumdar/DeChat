package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: kf1.d8 */
public final class C9688d8 extends C87413o implements C32226l<Integer, C0740i2> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30093d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9688d8(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        super(1);
        this.f30093d = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue < 0 || intValue >= this.f30093d.mo2583x().getDataListJustForAdapter().size()) {
            return null;
        }
        FinderProfileFeedLoader x = this.f30093d.mo2583x();
        C0740i2 i2Var = x != null ? (C0740i2) x.get(intValue) : null;
        if (i2Var instanceof BaseFinderFeed) {
            return (BaseFinderFeed) i2Var;
        }
        return null;
    }
}
