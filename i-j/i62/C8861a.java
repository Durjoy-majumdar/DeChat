package i62;

import com.tencent.p014mm.autogen.events.DoingInitContactEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45628s0;

/* renamed from: i62.a */
public class C8861a extends IStaticListener<DoingInitContactEvent> {
    public boolean callback(IEvent iEvent) {
        int i = ((DoingInitContactEvent) iEvent).f9047d.f9048a;
        if (i == 1) {
            Log.m105924i("MicroMsg.TAG", "do init start");
            C45628s0.f123395a = true;
        } else if (i == 2) {
            Log.m105924i("MicroMsg.TAG", "do init end");
            C45628s0.f123395a = false;
        }
        return false;
    }
}
