package p670qx;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35713i;
import zt3.C119157j;

/* renamed from: qx.p */
public class C36162p extends IStaticListener<ActivateEvent> {
    public boolean callback(IEvent iEvent) {
        if (((ActivateEvent) iEvent).f78706d.f78707a) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C35713i(), "SIRWorker");
        return false;
    }
}
