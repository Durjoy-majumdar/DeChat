package com.tencent.p014mm.plugin.finder.live.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderFluentSwitchInterceptEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveExitAnimateOpUIC$interceptEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderFluentSwitchInterceptEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$interceptEvent$1 */
public final class FinderLiveExitAnimateOpUIC$interceptEvent$1 extends IListener<FinderFluentSwitchInterceptEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f15366d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveExitAnimateOpUIC$interceptEvent$1(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C40008f fVar) {
        super(fVar);
        this.f15366d = finderLiveExitAnimateOpUIC;
    }

    public boolean callback(IEvent iEvent) {
        FinderFluentSwitchInterceptEvent finderFluentSwitchInterceptEvent = (FinderFluentSwitchInterceptEvent) iEvent;
        C87412m.m108594g(finderFluentSwitchInterceptEvent, "event");
        FinderFluentSwitchInterceptEvent.C1048a aVar = finderFluentSwitchInterceptEvent.f9212d;
        if (aVar == null) {
            return false;
        }
        FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f15366d;
        finderLiveExitAnimateOpUIC.f160020o = aVar.f9213a;
        String str = finderLiveExitAnimateOpUIC.f160012d;
        Log.m105924i(str, "receive FinderFluentSwitchInterceptEvent isEventIntercept: " + this.f15366d.f160020o);
        return true;
    }
}