package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.FinderNextTabPreloadEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC$onCreateAfter$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderNextTabPreloadEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$onCreateAfter$1 */
public final class FinderTwoFlowTimelineUIC$onCreateAfter$1 extends IListener<FinderNextTabPreloadEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderTwoFlowTimelineUIC f18801d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTwoFlowTimelineUIC$onCreateAfter$1(FinderTwoFlowTimelineUIC finderTwoFlowTimelineUIC, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f18801d = finderTwoFlowTimelineUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderNextTabPreloadEvent finderNextTabPreloadEvent = (FinderNextTabPreloadEvent) iEvent;
        C87412m.m108594g(finderNextTabPreloadEvent, "event");
        if (finderNextTabPreloadEvent.f9236d.f9237a != this.f18801d.mo5178c3()) {
            return false;
        }
        C61926c.m72668M(new C4339p(this.f18801d));
        return false;
    }
}
