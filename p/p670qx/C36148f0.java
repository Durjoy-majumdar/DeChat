package p670qx;

import com.tencent.p014mm.autogen.events.ReportTuringOwnerDataEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35709e;
import zt3.C119157j;

/* renamed from: qx.f0 */
public class C36148f0 extends IStaticListener<ReportTuringOwnerDataEvent> {
    public boolean callback(IEvent iEvent) {
        byte[] bArr = ((ReportTuringOwnerDataEvent) iEvent).f78930d.f78931a;
        ((C119157j) C119157j.f356862d).mo183876g(new C35709e(bArr), "SIRWorker");
        return false;
    }
}
