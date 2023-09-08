package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderFeedSnsAdHandler$feedUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$feedUpdateListener$1 */
public final class FinderFeedSnsAdHandler$feedUpdateListener$1 extends IListener<FeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSnsAdHandler f13042d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedSnsAdHandler$feedUpdateListener$1(FinderFeedSnsAdHandler finderFeedSnsAdHandler, C40008f fVar) {
        super(fVar);
        this.f13042d = finderFeedSnsAdHandler;
    }

    public boolean callback(IEvent iEvent) {
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        if (aVar != null && aVar.f9175b == 22) {
            this.f13042d.mo2507k();
        }
        return false;
    }
}
