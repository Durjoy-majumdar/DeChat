package com.tencent.p014mm.plugin.finder.live.model;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import h81.C32735h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/model/FinderLiveService$voipCallEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/VoipEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$voipCallEvent$1 */
public final class FinderLiveService$voipCallEvent$1 extends IListener<VoipEvent> {
    public FinderLiveService$voipCallEvent$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        VoipEvent voipEvent = (VoipEvent) iEvent;
        Class cls = C54116w.class;
        C87412m.m108594g(voipEvent, "event");
        if (!C86709a0.m107522a()) {
            return false;
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        if (FinderLiveService.f159348A == null) {
            return false;
        }
        if (voipEvent.f194019d.f194022b == 3 && !FinderLiveService.f159380h) {
            C54067f0.C54079q0 q0Var = C54067f0.C54079q0.CloseTypeLiveBreak;
            ((C54116w) C86312j.m106911c(cls)).Gy0(q0Var);
            Context context = null;
            FinderLiveService.m63768J(finderLiveService, false, (C32224a) null, 3, (Object) null);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_data_report_live_voip_replenish_break, false)) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                C56032b bVar = FinderLiveService.f159379g;
                if (bVar != null) {
                    context = bVar.getContext();
                }
                C54116w.wy0(wVar, context, q0Var, (Bundle) null, false, 12, (Object) null);
            }
        }
        return true;
    }
}
