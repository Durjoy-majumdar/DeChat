package com.tencent.p014mm.plugin.finder.live.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/model/FinderLiveService$multiTalkActionListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MultiTalkActionEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$multiTalkActionListener$1 */
public final class FinderLiveService$multiTalkActionListener$1 extends IListener<MultiTalkActionEvent> {
    public FinderLiveService$multiTalkActionListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        MultiTalkActionEvent multiTalkActionEvent = (MultiTalkActionEvent) iEvent;
        C87412m.m108594g(multiTalkActionEvent, "event");
        if (C86709a0.m107522a()) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            if (FinderLiveService.f159348A != null && multiTalkActionEvent.f154837d.f107635a == 3 && !FinderLiveService.f159380h) {
                FinderLiveService.m63768J(finderLiveService, false, (C32224a) null, 3, (Object) null);
            }
        }
        return false;
    }
}
