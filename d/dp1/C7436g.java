package dp1;

import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import te3.C49712hj1;

/* renamed from: dp1.g */
public final class C7436g extends C58398q1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7436g(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12) {
        super(mMFragmentActivity, hj12);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        this.f167332p = false;
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        super.mo2332C1();
        Log.m105924i("Finder.FinderCampaignTwoFeedFlowReporter", "onRelease");
    }

    /* renamed from: J1 */
    public void mo8581J1() {
        if (this.f167332p) {
            super.mo8581J1();
        } else {
            Log.m105924i("Finder.FinderCampaignTwoFeedFlowReporter", "onInvisible");
        }
    }

    /* renamed from: P1 */
    public void mo8582P1(String str) {
        C87412m.m108594g(str, "invokeSource");
        if (!C87412m.m108589b(str, "onRelease")) {
            super.mo8582P1(str);
        }
    }
}
