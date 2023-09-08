package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.FinderTimelineRefreshEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderTimelineRefreshEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1 */
public final class FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1 extends IListener<FinderTimelineRefreshEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13073d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter, MMActivity mMActivity) {
        super(mMActivity);
        this.f13073d = finderFollowFeedUIContract$Presenter;
    }

    public boolean callback(IEvent iEvent) {
        FinderTimelineRefreshEvent finderTimelineRefreshEvent = (FinderTimelineRefreshEvent) iEvent;
        C87412m.m108594g(finderTimelineRefreshEvent, "event");
        C61926c.m72668M(new C2650j(finderTimelineRefreshEvent, this.f13073d));
        return false;
    }
}
