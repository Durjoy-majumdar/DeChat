package p738wg;

import com.tencent.p014mm.autogen.events.ExtRequestAccountSyncEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: wg.x */
public class C38121x extends IStaticListener<ExtRequestAccountSyncEvent> {
    public boolean callback(IEvent iEvent) {
        ExtRequestAccountSyncEvent extRequestAccountSyncEvent = (ExtRequestAccountSyncEvent) iEvent;
        Log.m105924i("MicroMsg.RequestAccountSyncEventListener", "requestAccountSync()");
        if (MMApplicationContext.getContext() != null) {
            return true;
        }
        Log.m105928w("MicroMsg.RequestAccountSyncEventListener", "MMApplicationContext.getContext() == null");
        return false;
    }
}
