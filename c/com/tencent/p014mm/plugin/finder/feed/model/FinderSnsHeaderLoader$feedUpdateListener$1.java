package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderSnsHeaderLoader$feedUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderSnsHeaderLoader$feedUpdateListener$1 */
public final class FinderSnsHeaderLoader$feedUpdateListener$1 extends IListener<FeedUpdateEvent> {
    public FinderSnsHeaderLoader$feedUpdateListener$1(C2806l0 l0Var, C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        if (aVar.f9174a == 0 || aVar.f9177d != 1 || aVar.f9175b != 8) {
            return false;
        }
        throw null;
    }
}
