package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderTagClickEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kf1.C10029wa;
import kf1.C9639bb;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTimelineMachinePresenter$onAttach$3", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderTagClickEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelineMachinePresenter$onAttach$3 */
public final class FinderTimelineMachinePresenter$onAttach$3 extends IListener<FinderTagClickEvent> {

    /* renamed from: d */
    public final /* synthetic */ C10029wa f13238d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTimelineMachinePresenter$onAttach$3(C10029wa waVar, C40008f fVar) {
        super(fVar);
        this.f13238d = waVar;
    }

    public boolean callback(IEvent iEvent) {
        FinderTagClickEvent finderTagClickEvent = (FinderTagClickEvent) iEvent;
        C87412m.m108594g(finderTagClickEvent, "event");
        C61926c.m72668M(new C9639bb(finderTagClickEvent, this.f13238d));
        return true;
    }
}
