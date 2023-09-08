package com.tencent.p014mm.live.model;

import c50.C54655b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LiveStateActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import p50.C62197e;
import p744wt.C66190c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/live/model/RoomLiveService$mCheckDeviceLsn$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/LiveStateActionEvent;", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.model.RoomLiveService$mCheckDeviceLsn$1 */
public final class RoomLiveService$mCheckDeviceLsn$1 extends IListener<LiveStateActionEvent> {
    public RoomLiveService$mCheckDeviceLsn$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        LiveStateActionEvent liveStateActionEvent = (LiveStateActionEvent) iEvent;
        Class cls = C66190c.class;
        C87412m.m108594g(liveStateActionEvent, "event");
        LiveStateActionEvent.C55143a aVar = liveStateActionEvent.f154829d;
        boolean z = false;
        if (aVar != null) {
            aVar.f154830a = ((C66190c) C86312j.m106911c(cls)).mo89931F() || ((C66190c) C86312j.m106911c(cls)).mo89933L5();
        }
        if (RoomLiveService.f157197h.f133050d != 0) {
            C62197e eVar = C62197e.f176819i1;
            if (eVar != null) {
                LiveStateActionEvent.C55143a aVar2 = liveStateActionEvent.f154829d;
                if (aVar2 != null) {
                    aVar2.f154831b = false;
                }
                if (aVar2 != null) {
                    if (eVar == null) {
                        C62197e.f176819i1 = new C62197e();
                    }
                    C62197e eVar2 = C62197e.f176819i1;
                    C87412m.m108591d(eVar2);
                    aVar2.f154832c = eVar2.f172989A.mo82882d();
                }
                LiveStateActionEvent.C55143a aVar3 = liveStateActionEvent.f154829d;
                if (aVar3 != null) {
                    if (C62197e.f176819i1 == null) {
                        C62197e.f176819i1 = new C62197e();
                    }
                    C62197e eVar3 = C62197e.f176819i1;
                    C87412m.m108591d(eVar3);
                    aVar3.f154833d = eVar3.f172989A.mo82884f();
                }
            } else {
                C54655b bVar = C54655b.f153178f1;
                if (bVar != null) {
                    z = true;
                }
                if (z) {
                    LiveStateActionEvent.C55143a aVar4 = liveStateActionEvent.f154829d;
                    if (aVar4 != null) {
                        aVar4.f154831b = true;
                    }
                    if (aVar4 != null) {
                        if (bVar == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C54655b bVar2 = C54655b.f153178f1;
                        C87412m.m108591d(bVar2);
                        aVar4.f154832c = bVar2.f172989A.mo82882d();
                    }
                    LiveStateActionEvent.C55143a aVar5 = liveStateActionEvent.f154829d;
                    if (aVar5 != null) {
                        if (C54655b.f153178f1 == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C54655b bVar3 = C54655b.f153178f1;
                        C87412m.m108591d(bVar3);
                        aVar5.f154833d = bVar3.f172989A.mo82884f();
                    }
                }
            }
        }
        return true;
    }
}
