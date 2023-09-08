package ib0;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: ib0.o */
public class C33272o extends IStaticListener<ActivateEvent> {
    public boolean callback(IEvent iEvent) {
        return SubCoreNewABTest.f79467g.callback((ActivateEvent) iEvent);
    }
}
