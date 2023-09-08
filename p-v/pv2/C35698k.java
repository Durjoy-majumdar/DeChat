package pv2;

import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pv2.k */
public class C35698k extends IStaticListener<DynamicConfigUpdatedEvent> {
    public boolean callback(IEvent iEvent) {
        DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent;
        Log.m105924i("MicroMsg.SoterDynamicConfigUpdatedEventListener", "alvinluo dynamic config updated.");
        C77292s.m93119f();
        return true;
    }
}
