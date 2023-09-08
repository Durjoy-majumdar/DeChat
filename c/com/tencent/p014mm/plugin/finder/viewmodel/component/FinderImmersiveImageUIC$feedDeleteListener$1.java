package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveImageUIC$feedDeleteListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedDeleteEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC$feedDeleteListener$1 */
public final class FinderImmersiveImageUIC$feedDeleteListener$1 extends IListener<FeedDeleteEvent> {

    /* renamed from: p */
    public final /* synthetic */ FinderImmersiveImageUIC f74783p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImmersiveImageUIC$feedDeleteListener$1(FinderImmersiveImageUIC finderImmersiveImageUIC, C40008f fVar) {
        super(fVar);
        this.f74783p = finderImmersiveImageUIC;
    }

    public boolean callback(IEvent iEvent) {
        FeedDeleteEvent feedDeleteEvent = (FeedDeleteEvent) iEvent;
        C87412m.m108594g(feedDeleteEvent, "event");
        C61926c.m72668M(new C26894a0(this.f74783p, feedDeleteEvent));
        return false;
    }
}
