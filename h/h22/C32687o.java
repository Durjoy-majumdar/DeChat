package h22;

import com.tencent.p014mm.autogen.events.FinderSyncEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import gf1.C59418i;
import gy3.C87412m;
import te3.C49712hj1;

/* renamed from: h22.o */
public final class C32687o extends IStaticListener<FinderSyncEvent> {
    public boolean callback(IEvent iEvent) {
        FinderSyncEvent finderSyncEvent = (FinderSyncEvent) iEvent;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(finderSyncEvent, "event");
        if (finderSyncEvent.f78804d.f78805a) {
            C59418i iVar = ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n;
            FinderSyncEvent.C28747a aVar = finderSyncEvent.f78804d;
            iVar.mo84538g(aVar.f78806b, aVar.f78807c, (C49712hj1) null);
            return true;
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84538g(506365, 3, (C49712hj1) null);
        return true;
    }
}
