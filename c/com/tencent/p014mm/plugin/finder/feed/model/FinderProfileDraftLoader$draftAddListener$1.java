package com.tencent.p014mm.plugin.finder.feed.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderDraftOpEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/model/FinderProfileDraftLoader$draftAddListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderDraftOpEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader$draftAddListener$1 */
public final class FinderProfileDraftLoader$draftAddListener$1 extends IListener<FinderDraftOpEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDraftLoader f158692d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileDraftLoader$draftAddListener$1(FinderProfileDraftLoader finderProfileDraftLoader, C40008f fVar) {
        super(fVar);
        this.f158692d = finderProfileDraftLoader;
    }

    public boolean callback(IEvent iEvent) {
        FinderDraftOpEvent finderDraftOpEvent = (FinderDraftOpEvent) iEvent;
        C87412m.m108594g(finderDraftOpEvent, "event");
        C61926c.m72666K(0, new C55767h0(finderDraftOpEvent, this.f158692d));
        return false;
    }
}
