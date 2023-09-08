package nn2;

import com.tencent.p014mm.autogen.events.TVOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import un2.C102057c;

/* renamed from: nn2.o */
public class C100140o extends IStaticListener<TVOperationEvent> {
    public boolean callback(IEvent iEvent) {
        TVOperationEvent tVOperationEvent = (TVOperationEvent) iEvent;
        TVOperationEvent.C92604a aVar = tVOperationEvent.f265232d;
        aVar.getClass();
        C102057c.C102058a b = C102057c.m134444b(aVar.f265235b);
        if (b == null) {
            Log.m105929w("MicroMsg.TVOperationListener", "error, xml[%s] can not parse", tVOperationEvent.f265232d.f265235b);
            tVOperationEvent.f265233e.f265236a = false;
        } else {
            tVOperationEvent.f265233e.f265237b = C102057c.m134445c(tVOperationEvent.f265232d.f265234a, b);
            tVOperationEvent.f265233e.f265238c = C76942m.wx0(b.field_thumburl, "@B");
            tVOperationEvent.f265233e.f265236a = true;
        }
        return false;
    }
}
