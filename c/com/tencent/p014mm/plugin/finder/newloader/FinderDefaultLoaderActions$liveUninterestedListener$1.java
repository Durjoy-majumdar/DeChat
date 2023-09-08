package com.tencent.p014mm.plugin.finder.newloader;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveUninterestedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import on1.C11527h;
import on1.C11533k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/newloader/FinderDefaultLoaderActions$liveUninterestedListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveUninterestedEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1 */
public final class FinderDefaultLoaderActions$liveUninterestedListener$1 extends IListener<FinderLiveUninterestedEvent> {

    /* renamed from: d */
    public final /* synthetic */ C11533k f15827d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDefaultLoaderActions$liveUninterestedListener$1(C11533k kVar, C40008f fVar) {
        super(fVar);
        this.f15827d = kVar;
    }

    public boolean callback(IEvent iEvent) {
        FinderLiveUninterestedEvent finderLiveUninterestedEvent = (FinderLiveUninterestedEvent) iEvent;
        C87412m.m108594g(finderLiveUninterestedEvent, "event");
        C61926c.m72668M(new C11527h(this.f15827d, finderLiveUninterestedEvent.f9222d.f9223a));
        return true;
    }
}
