package kf1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C76912y0;
import te3.C50542nh0;
import te3.C51954xc1;

/* renamed from: kf1.o7 */
public final class C9911o7 implements C8794p5<C51954xc1> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30535d;

    public C9911o7(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        this.f30535d = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C51954xc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        if (nh02.f138603e == 0) {
            C76912y0.makeText((Context) this.f30535d.f13136d, (int) C0966R.string.d8t, 0).show();
            return;
        }
        C76912y0.makeText((Context) this.f30535d.f13136d, (int) C0966R.string.d8s, 0).show();
        String str = this.f30535d.f13140h;
        Log.m105924i(str, "finder_feed_close_comment_ok " + nh02.f138603e);
    }
}
