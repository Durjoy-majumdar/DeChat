package com.tencent.p014mm.plugin.finder.live.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveExitAnimateOpUIC$voipCallEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/VoipEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$voipCallEvent$1 */
public final class FinderLiveExitAnimateOpUIC$voipCallEvent$1 extends IListener<VoipEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExitAnimateOpUIC f160029d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveExitAnimateOpUIC$voipCallEvent$1(FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC, C40008f fVar) {
        super(fVar);
        this.f160029d = finderLiveExitAnimateOpUIC;
    }

    public boolean callback(IEvent iEvent) {
        VoipEvent voipEvent = (VoipEvent) iEvent;
        C87412m.m108594g(voipEvent, "event");
        if (!C86709a0.m107522a() || voipEvent.f194019d.f194022b != 3) {
            return false;
        }
        this.f160029d.f160015g = true;
        return true;
    }
}
