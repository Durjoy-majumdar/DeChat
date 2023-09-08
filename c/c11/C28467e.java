package c11;

import com.tencent.p014mm.autogen.events.InitEndEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import eb0.C45612m0;

/* renamed from: c11.e */
public class C28467e extends IStaticListener<InitEndEvent> {
    public boolean callback(IEvent iEvent) {
        if (!((InitEndEvent) iEvent).f78840d.f78841a) {
            return false;
        }
        C45612m0.m50685b(true);
        return false;
    }
}
