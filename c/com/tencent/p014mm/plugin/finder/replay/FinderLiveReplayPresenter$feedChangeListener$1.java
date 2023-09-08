package com.tencent.p014mm.plugin.finder.replay;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import vo1.C14917k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/replay/FinderLiveReplayPresenter$feedChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1 */
public final class FinderLiveReplayPresenter$feedChangeListener$1 extends IListener<FeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveReplayPresenter f16399d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveReplayPresenter$feedChangeListener$1(FinderLiveReplayPresenter finderLiveReplayPresenter, C40008f fVar) {
        super(fVar);
        this.f16399d = finderLiveReplayPresenter;
    }

    public boolean callback(IEvent iEvent) {
        C14917k kVar;
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        int i = aVar.f9175b;
        if (i == 14) {
            FinderLiveReplayPresenter finderLiveReplayPresenter = this.f16399d;
            long j = aVar.f9174a;
            C14917k kVar2 = finderLiveReplayPresenter.f16397g;
            if (kVar2 == null) {
                return false;
            }
            kVar2.mo13969S(j);
            return false;
        } else if (i != 24 || (kVar = this.f16399d.f16397g) == null) {
            return false;
        } else {
            kVar.delete(aVar.f9174a);
            return false;
        }
    }
}
