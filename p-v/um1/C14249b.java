package um1;

import android.view.View;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Iterator;
import km1.C10361l;
import km1.C10363m;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: um1.b */
public final class C14249b extends NearbyLivePresenter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14249b(MMActivity mMActivity, Fragment fragment, C49712hj1 hj12, C51942x91 x912, String str) {
        super(mMActivity, hj12, str);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(fragment, "fragment");
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(str, "by_pass");
        this.f15611i = fragment;
        this.f15612j = x912;
    }

    /* renamed from: f0 */
    public int mo3580f0() {
        C51942x91 x912 = this.f15612j;
        return (x912 != null ? x912.f144531d : 0) + 15;
    }

    public int getCommentScene() {
        return this.f15607e.f134675i;
    }

    public void onDetach() {
        C39818r rVar = C39818r.f106831a;
        Fragment fragment = this.f15611i;
        C87412m.m108591d(fragment);
        Fragment parentFragment = fragment.getParentFragment();
        C87412m.m108591d(parentFragment);
        ((C14248a) rVar.mo62445d(parentFragment).mo75002a(C14248a.class)).f39775d.mo10662e();
        super.onDetach();
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        Fragment fragment;
        Fragment parentFragment;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        super.onRefreshEnd(cVar);
        int i = this.f15607e.f134675i;
        if (!(i == 9500001 || i == 9500002 || i == 9500004 || i == 9500003)) {
            if (!(this.f15607e.f134675i == 112) && (fragment = this.f15611i) != null && (parentFragment = fragment.getParentFragment()) != null) {
                NearbyLiveSquareUIC nearbyLiveSquareUIC = (NearbyLiveSquareUIC) C39818r.f106831a.mo62445d(parentFragment).mo75002a(NearbyLiveSquareUIC.class);
                Fragment fragment2 = this.f15611i;
                C87412m.m108592e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment");
                NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = (NearbyLiveSquareTabFragment) fragment2;
                nearbyLiveSquareUIC.getClass();
                Iterator<NearbyLiveSquareTabFragment> it = nearbyLiveSquareUIC.f15663o.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (nearbyLiveSquareTabFragment.f15690r.f144531d == it.next().f15690r.f144531d) {
                        break;
                    }
                    i2++;
                }
                NearbyLiveSquareTabFragment f3 = nearbyLiveSquareUIC.mo3607f3(i2 + 1);
                C10361l lVar = ((C14248a) C39818r.f106831a.mo62445d(parentFragment).mo75002a(C14248a.class)).f39775d;
                lVar.getClass();
                Log.m105924i("FinderLivePageScrollGuideHelper", "start delayMs:" + lVar.f31541b + " maxCnt:" + lVar.f31540a);
                View view = lVar.f31543d;
                if (view != null) {
                    view.getLocationOnScreen(lVar.f31544e);
                }
                lVar.f31545f = f3;
                int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC, 0);
                boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, true);
                Log.m105924i("FinderLivePageScrollGuideHelper", "start scrollGuideCnt:" + j + " isNeverScroll:" + g + " pos[" + lVar.f31544e[0] + ", " + lVar.f31544e[1] + ']');
                if (f3 == null) {
                    Log.m105924i("FinderLivePageScrollGuideHelper", "start return for nextPageFragment:" + f3);
                } else if (!g) {
                    Log.m105924i("FinderLivePageScrollGuideHelper", "start return for isNeverScroll:" + g);
                } else if (j > lVar.f31540a) {
                    Log.m105924i("FinderLivePageScrollGuideHelper", "start return for scrollGuideCnt:" + j);
                } else {
                    long j2 = (long) lVar.f31541b;
                    Runnable runnable = lVar.f31550k;
                    if (runnable != null) {
                        lVar.f31549j.removeCallbacks(runnable);
                        lVar.f31550k = null;
                    }
                    C10363m mVar = new C10363m(lVar);
                    lVar.f31550k = mVar;
                    lVar.f31549j.postDelayed(mVar, j2);
                }
            }
        }
    }

    /* renamed from: s3 */
    public int mo3593s3() {
        C51942x91 x912 = this.f15612j;
        return (x912 != null ? x912.f144531d : 0) + 1001;
    }
}
