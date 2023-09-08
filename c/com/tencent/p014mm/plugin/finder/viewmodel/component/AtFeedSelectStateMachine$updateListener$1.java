package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderAtFeedUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/AtFeedSelectStateMachine$updateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderAtFeedUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine$updateListener$1 */
public final class AtFeedSelectStateMachine$updateListener$1 extends IListener<FinderAtFeedUpdateEvent> {
    public AtFeedSelectStateMachine$updateListener$1(AtFeedSelectStateMachine atFeedSelectStateMachine, C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        FinderAtFeedUpdateEvent finderAtFeedUpdateEvent = (FinderAtFeedUpdateEvent) iEvent;
        C87412m.m108594g(finderAtFeedUpdateEvent, "event");
        if (finderAtFeedUpdateEvent.f9187d == null) {
            return true;
        }
        Log.m105924i("Finder.AtFeedSelectStateMachine", "onEvent type :0 feedId:null pos:0");
        return true;
    }
}
