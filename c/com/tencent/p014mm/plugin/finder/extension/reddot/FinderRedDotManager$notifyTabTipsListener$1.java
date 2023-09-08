package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyTabTipsToShowEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C49170dn1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotManager$notifyTabTipsListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/NotifyTabTipsToShowEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$notifyTabTipsListener$1 */
public final class FinderRedDotManager$notifyTabTipsListener$1 extends IListener<NotifyTabTipsToShowEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotManager f158561d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRedDotManager$notifyTabTipsListener$1(FinderRedDotManager finderRedDotManager, C40008f fVar) {
        super(fVar);
        this.f158561d = finderRedDotManager;
    }

    public boolean callback(IEvent iEvent) {
        NotifyTabTipsToShowEvent notifyTabTipsToShowEvent = (NotifyTabTipsToShowEvent) iEvent;
        C87412m.m108594g(notifyTabTipsToShowEvent, "event");
        NotifyTabTipsToShowEvent.C55151a aVar = notifyTabTipsToShowEvent.f154849d;
        if (aVar == null) {
            return false;
        }
        FinderRedDotManager finderRedDotManager = this.f158561d;
        C49170dn1 dn12 = aVar.f154850a;
        if (dn12 == null) {
            return false;
        }
        finderRedDotManager.mo77225F(dn12, "notify_tab_tips_show", (long) aVar.f154851b);
        return false;
    }
}
