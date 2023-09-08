package com.tencent.p014mm.plugin.finder.nearby.live;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderNearbyRefreshEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$finderNearbyRefreshEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderNearbyRefreshEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyRefreshEventListener$1 */
public final class NearbyLivePresenter$finderNearbyRefreshEventListener$1 extends IListener<FinderNearbyRefreshEvent> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f15639d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLivePresenter$finderNearbyRefreshEventListener$1(NearbyLivePresenter nearbyLivePresenter, C40008f fVar) {
        super(fVar);
        this.f15639d = nearbyLivePresenter;
    }

    public boolean callback(IEvent iEvent) {
        FinderNearbyRefreshEvent finderNearbyRefreshEvent = (FinderNearbyRefreshEvent) iEvent;
        C87412m.m108594g(finderNearbyRefreshEvent, "event");
        Log.m105924i("Finder.NearbyLivePresenter", " receive FinderNearbyRefreshEvent objectId = " + finderNearbyRefreshEvent.f9229d.f9230a + " , " + this.f15639d.f15601C);
        NearbyLivePresenter nearbyLivePresenter = this.f15639d;
        if (!nearbyLivePresenter.f15601C) {
            return true;
        }
        nearbyLivePresenter.mo3578a1(16, finderNearbyRefreshEvent.f9229d.f9230a, nearbyLivePresenter.f15618s);
        return true;
    }
}
