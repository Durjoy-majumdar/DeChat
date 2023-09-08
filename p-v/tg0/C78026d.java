package tg0;

import com.tencent.p014mm.autogen.events.GetSafeDeviceNameEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import rg0.C13002g;

/* renamed from: tg0.d */
public class C78026d extends IStaticListener<GetSafeDeviceNameEvent> {
    public boolean callback(IEvent iEvent) {
        GetSafeDeviceNameEvent getSafeDeviceNameEvent = (GetSafeDeviceNameEvent) iEvent;
        getSafeDeviceNameEvent.f193658e.f193660a = C13002g.m12461a(getSafeDeviceNameEvent.f193657d.f193659a);
        return false;
    }
}
