package ha3;

import com.tencent.p014mm.autogen.events.ScanQrcodeExtDeviceLoginEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import eb0.C97625j3;
import fa3.C31984g;

/* renamed from: ha3.d */
public class C32755d extends IStaticListener<ScanQrcodeExtDeviceLoginEvent> {
    public boolean callback(IEvent iEvent) {
        ScanQrcodeExtDeviceLoginEvent scanQrcodeExtDeviceLoginEvent = (ScanQrcodeExtDeviceLoginEvent) iEvent;
        if (scanQrcodeExtDeviceLoginEvent == null) {
            return false;
        }
        C31984g gVar = new C31984g(scanQrcodeExtDeviceLoginEvent.f78966d.f78967a);
        C97625j3.m125815e().mo123455a(971, new C59808c(this, gVar, scanQrcodeExtDeviceLoginEvent));
        C97625j3.m125815e().mo123460f(gVar);
        return false;
    }
}
