package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import h81.C32735h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotManager$entryConfigChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ExptChangeEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$entryConfigChangeListener$1 */
public final class FinderRedDotManager$entryConfigChangeListener$1 extends IListener<ExptChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotManager f81096d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRedDotManager$entryConfigChangeListener$1(FinderRedDotManager finderRedDotManager, C40008f fVar) {
        super(fVar);
        this.f81096d = finderRedDotManager;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((ExptChangeEvent) iEvent, "event");
        for (C32735h.C32737c cVar : this.f81096d.f158533j) {
            if (C32735h.C32737c.clicfg_finder_3_day_2_day_enable == cVar) {
                C29946v0 v0Var = C29946v0.f81102a;
                Log.m105924i("Finder.ThreeDayTwoDay", "onConfigChange");
                v0Var.mo57022c();
            }
        }
        return false;
    }
}
