package com.tencent.p014mm.plugin.finder.nearby.live;

import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderFluentSwitchInterceptEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import ok1.C62042e;
import ps3.C12005b;
import te3.C49712hj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$1", "Lcom/tencent/mm/plugin/finder/nearby/live/NearbyLiveFeedLoader;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 */
public final class NearbyLivePresenter$createFeedLoader$1 extends NearbyLiveFeedLoader {

    /* renamed from: x */
    public final /* synthetic */ NearbyLivePresenter f15637x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLivePresenter$createFeedLoader$1(NearbyLivePresenter nearbyLivePresenter, C49712hj1 hj12, int i, int i2, int i3, String str) {
        super(hj12, i, i2, i3, str);
        this.f15637x = nearbyLivePresenter;
    }

    public void onFetchDone(IResponse<C0740i2> iResponse) {
        C87412m.m108594g(iResponse, "response");
        super.onFetchDone(iResponse);
        this.f15637x.getClass();
        int refreshInterval = iResponse.getRefreshInterval();
        if (refreshInterval > 0) {
            C62042e.f176370a.mo87106p0().putInt("finder_live_watch_count_down_refresh_interval", refreshInterval);
        }
        this.f15637x.f15618s = iResponse.getLastBuffer();
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15637x.f15620u;
        boolean z = false;
        if (nearbyLiveFeedLoader != null && nearbyLiveFeedLoader.isInsertSpecifyOperation(iResponse)) {
            z = true;
        }
        if (z) {
            NearbyLivePresenter nearbyLivePresenter = this.f15637x;
            nearbyLivePresenter.getClass();
            Log.m105924i("Finder.NearbyLivePresenter", "handleRecomResponse lastResponseBuffer " + nearbyLivePresenter.f15618s);
            ((C12005b) C86312j.m106911c(C12005b.class)).Nk0(iResponse);
        }
        this.f15637x.getClass();
        if (1 == iResponse.getPullType() || iResponse.getPullType() == 0) {
            FinderFluentSwitchInterceptEvent finderFluentSwitchInterceptEvent = new FinderFluentSwitchInterceptEvent();
            finderFluentSwitchInterceptEvent.f9212d.f9213a = true;
            Log.m105924i("Finder.NearbyLivePresenter", "handleFluentSwitch intercept exit");
            finderFluentSwitchInterceptEvent.publish();
        }
    }
}
