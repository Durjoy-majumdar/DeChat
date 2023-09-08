package p670qx;

import com.tencent.p014mm.autogen.events.ReportCCDataByFinderEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35711g;
import zt3.C119157j;

/* renamed from: qx.x */
public class C36174x extends IStaticListener<ReportCCDataByFinderEvent> {
    public boolean callback(IEvent iEvent) {
        ReportCCDataByFinderEvent.C28800a aVar;
        ReportCCDataByFinderEvent reportCCDataByFinderEvent = (ReportCCDataByFinderEvent) iEvent;
        if (reportCCDataByFinderEvent == null || (aVar = reportCCDataByFinderEvent.f78922d) == null) {
            return false;
        }
        int i = aVar.f78923a;
        ((C119157j) C119157j.f356862d).mo183876g(new C35711g(i), "SIRWorker");
        return false;
    }
}
