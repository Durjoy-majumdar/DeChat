package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveUninterestedEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader$liveUninterestedListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveUninterestedEvent;", "callback", "", "event", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader$liveUninterestedListener$1 */
public final class BaseFinderFeedLoader$liveUninterestedListener$1 extends IListener<FinderLiveUninterestedEvent> {
    public final /* synthetic */ BaseFinderFeedLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$liveUninterestedListener$1(BaseFinderFeedLoader baseFinderFeedLoader, C40008f fVar) {
        super(fVar);
        this.this$0 = baseFinderFeedLoader;
    }

    public boolean callback(FinderLiveUninterestedEvent finderLiveUninterestedEvent) {
        C87412m.m108594g(finderLiveUninterestedEvent, "event");
        C61926c.m72668M(new BaseFinderFeedLoader$liveUninterestedListener$1$callback$1(this.this$0, finderLiveUninterestedEvent.f9222d.f9223a));
        return true;
    }
}
