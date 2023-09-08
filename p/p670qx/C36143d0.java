package p670qx;

import com.tencent.p014mm.autogen.events.ReportSensorDataEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35708d;
import zt3.C119157j;

/* renamed from: qx.d0 */
public class C36143d0 extends IStaticListener<ReportSensorDataEvent> {
    public boolean callback(IEvent iEvent) {
        ReportSensorDataEvent.C28803a aVar = ((ReportSensorDataEvent) iEvent).f78927d;
        String str = aVar.f78929b;
        byte[] bArr = aVar.f78928a;
        ((C119157j) C119157j.f356862d).mo183876g(new C35708d(str, bArr), "SIRWorker");
        return false;
    }
}
