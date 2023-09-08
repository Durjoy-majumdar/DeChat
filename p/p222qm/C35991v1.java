package p222qm;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.TraceOperationEvent;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: qm.v1 */
public class C35991v1 extends IStaticListener<TraceOperationEvent> {
    public boolean callback(IEvent iEvent) {
        C80610p1 p1Var = C80610p1.f235824f;
        if (((TraceOperationEvent) iEvent).f79033d.f79035b != 3) {
            return false;
        }
        NotifyReceiver.m98644b();
        return false;
    }
}
