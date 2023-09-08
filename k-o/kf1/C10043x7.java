package kf1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C76912y0;
import te3.C50542nh0;
import te3.C51954xc1;

/* renamed from: kf1.x7 */
public final class C10043x7 implements C8794p5<C51954xc1> {

    /* renamed from: d */
    public final /* synthetic */ Activity f30782d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f30783e;

    public C10043x7(Activity activity, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
        this.f30782d = activity;
        this.f30783e = finderProfileTimelineContract$ProfileTimelinePresenter;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        C87412m.m108594g((C51954xc1) obj, "req");
        C87412m.m108594g(nh02, "ret");
        if (nh02.f138603e == 0) {
            C76912y0.makeText((Context) this.f30782d, (int) C0966R.string.d9x, 0).show();
            return;
        }
        C76912y0.makeText((Context) this.f30782d, (int) C0966R.string.d9w, 0).show();
        String str = this.f30783e.f13140h;
        Log.m105924i(str, "finder_feed_open_comment_no_ok " + nh02.f138603e);
    }
}
