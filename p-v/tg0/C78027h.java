package tg0;

import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import rg0.C13002g;

/* renamed from: tg0.h */
public class C78027h extends IStaticListener<UpdateLocalVerifySwitchEvent> {
    public boolean callback(IEvent iEvent) {
        UpdateLocalVerifySwitchEvent.C67808a aVar = ((UpdateLocalVerifySwitchEvent) iEvent).f193987d;
        C13002g.m12462b(aVar.f193988a, aVar.f193989b);
        return false;
    }
}
