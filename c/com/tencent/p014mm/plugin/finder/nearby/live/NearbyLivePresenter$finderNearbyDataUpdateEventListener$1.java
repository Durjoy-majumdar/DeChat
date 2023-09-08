package com.tencent.p014mm.plugin.finder.nearby.live;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderNearbyDataUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import tf1.C13897e;
import tf1.C13920p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$finderNearbyDataUpdateEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderNearbyDataUpdateEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$finderNearbyDataUpdateEventListener$1 */
public final class NearbyLivePresenter$finderNearbyDataUpdateEventListener$1 extends IListener<FinderNearbyDataUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f15638d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLivePresenter$finderNearbyDataUpdateEventListener$1(NearbyLivePresenter nearbyLivePresenter, C40008f fVar) {
        super(fVar);
        this.f15638d = nearbyLivePresenter;
    }

    public boolean callback(IEvent iEvent) {
        C13897e merger;
        FinderNearbyDataUpdateEvent finderNearbyDataUpdateEvent = (FinderNearbyDataUpdateEvent) iEvent;
        C87412m.m108594g(finderNearbyDataUpdateEvent, "event");
        if (!this.f15638d.f15601C || finderNearbyDataUpdateEvent.f9225d.f9228c == null) {
            return true;
        }
        Log.m105924i("Finder.NearbyLivePresenter", " receive FinderNearbyDataUpdateEvent");
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15638d.f15620u;
        if (nearbyLiveFeedLoader == null || (merger = nearbyLiveFeedLoader.getMerger()) == null) {
            return true;
        }
        Object obj = finderNearbyDataUpdateEvent.f9225d.f9228c;
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.IResponse<com.tencent.mm.plugin.finder.model.RVFeed>");
        FinderNearbyDataUpdateEvent.C1053a aVar = finderNearbyDataUpdateEvent.f9225d;
        merger.mergeInsertSpecifiedLocation((IResponse) obj, new C13920p(aVar.f9226a, aVar.f9227b), new C3302c(this.f15638d));
        return true;
    }
}
