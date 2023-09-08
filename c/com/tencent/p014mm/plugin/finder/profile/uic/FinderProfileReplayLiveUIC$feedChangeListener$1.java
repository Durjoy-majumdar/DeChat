package com.tencent.p014mm.plugin.finder.profile.uic;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$feedChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedChangeListener$1 */
public final class FinderProfileReplayLiveUIC$feedChangeListener$1 extends IListener<FeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileReplayLiveUIC f16358d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileReplayLiveUIC$feedChangeListener$1(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC, C40008f fVar) {
        super(fVar);
        this.f16358d = finderProfileReplayLiveUIC;
    }

    public boolean callback(IEvent iEvent) {
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        int i = aVar.f9175b;
        if (i == 24) {
            long j = aVar.f9174a;
            this.f16358d.mo3850d3().post(new C3535k(this.f16358d.mo3849c3().getDataListJustForAdapter(), this.f16358d, j));
            return false;
        } else if (i != 27) {
            return false;
        } else {
            this.f16358d.mo3849c3().requestRefresh();
            return false;
        }
    }
}
