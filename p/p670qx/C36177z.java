package p670qx;

import com.tencent.p014mm.autogen.events.ReportCCDataByPayEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35707c;
import zt3.C119157j;

/* renamed from: qx.z */
public class C36177z extends IStaticListener<ReportCCDataByPayEvent> {
    public boolean callback(IEvent iEvent) {
        ReportCCDataByPayEvent reportCCDataByPayEvent = (ReportCCDataByPayEvent) iEvent;
        ((C119157j) C119157j.f356862d).mo183876g(new C35707c(), "SIRWorker");
        return false;
    }
}
