package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/extension/reddot/DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HomeUITabChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1 */
public final class DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1 extends IListener<HomeUITabChangeEvent> {
    public DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
        C87412m.m108594g(homeUITabChangeEvent, "event");
        if (homeUITabChangeEvent.f78831d.f78832a == 2) {
            return false;
        }
        C2479n0.m2355c(C2479n0.f12955a, "Discovery", (String) null, 2, (Object) null);
        return false;
    }
}
