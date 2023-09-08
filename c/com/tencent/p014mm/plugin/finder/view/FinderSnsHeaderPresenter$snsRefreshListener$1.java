package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsTimelineRefreshEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/FinderSnsHeaderPresenter$snsRefreshListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsTimelineRefreshEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderPresenter$snsRefreshListener$1 */
public final class FinderSnsHeaderPresenter$snsRefreshListener$1 extends IListener<SnsTimelineRefreshEvent> {
    public FinderSnsHeaderPresenter$snsRefreshListener$1(C4020b5 b5Var, C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsTimelineRefreshEvent snsTimelineRefreshEvent = (SnsTimelineRefreshEvent) iEvent;
        C87412m.m108594g(snsTimelineRefreshEvent, "event");
        if (snsTimelineRefreshEvent.f265197d.f265198a != 1) {
            return false;
        }
        throw null;
    }
}
