package com.tencent.p014mm.plugin.finder.viewmodel.component;

import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import os1.C11737e;
import rs1.C13442s8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderLikeGuideUIC$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC$listener$1 */
public final class FinderLikeGuideUIC$listener$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikeGuideUIC f18762d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikeGuideUIC$listener$1(FinderLikeGuideUIC finderLikeGuideUIC, C40008f fVar) {
        super(fVar);
        this.f18762d = finderLikeGuideUIC;
    }

    public boolean callback(IEvent iEvent) {
        FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = (FeedMegaVideoAnimPlayEvent) iEvent;
        C87412m.m108594g(feedMegaVideoAnimPlayEvent, "event");
        C39818r rVar = C39818r.f106831a;
        if (!(((C11737e) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11737e.class)).mo11599c3(((C13442s8) rVar.mo62443b(this.f18762d.getContext()).mo75002a(C13442s8.class)).mo12861q3()).f34350a != 0)) {
            FeedMegaVideoAnimPlayEvent.C1038a aVar = feedMegaVideoAnimPlayEvent.f9160d;
            if (!aVar.f9163c && aVar.f9164d && !this.f18762d.f18760f.contains(Long.valueOf(aVar.f9161a))) {
                if (!feedMegaVideoAnimPlayEvent.f9160d.f9162b) {
                    C61926c.m72668M(new C4330d(this.f18762d, feedMegaVideoAnimPlayEvent));
                }
                this.f18762d.f18760f.add(Long.valueOf(feedMegaVideoAnimPlayEvent.f9160d.f9161a));
            }
        }
        return false;
    }
}
