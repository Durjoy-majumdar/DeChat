package mo1;

import android.content.Intent;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import tf0.C13887q1;

/* renamed from: mo1.r1 */
public final class C11048r1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Intent f32797d;

    /* renamed from: e */
    public final /* synthetic */ long f32798e;

    /* renamed from: f */
    public final /* synthetic */ FinderProfileReplayLiveUIC f32799f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11048r1(Intent intent, long j, FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(0);
        this.f32797d = intent;
        this.f32798e = j;
        this.f32799f = finderProfileReplayLiveUIC;
    }

    public Object invoke() {
        this.f32797d.putExtra("CURRENT_FEED_ID", this.f32798e);
        this.f32797d.putExtra("LAUNCH_WITH_ANIM", true);
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1.C13888a.m13308d((C13887q1) c, this.f32799f.getActivity(), this.f32797d, false, 4, (Object) null);
        return C13598b0.f38549a;
    }
}
