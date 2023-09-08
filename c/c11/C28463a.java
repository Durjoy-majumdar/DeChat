package c11;

import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45612m0;

/* renamed from: c11.a */
public class C28463a extends IStaticListener<CoreAccountInitializationNotifiedEvent> {
    public boolean callback(IEvent iEvent) {
        CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent = (CoreAccountInitializationNotifiedEvent) iEvent;
        Log.m105924i("MicroMsg.CoreAccountInitializationNotifiedListener", "All account post reset");
        C45612m0.m50685b(false);
        return false;
    }
}
