package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent */
public final class ExDeviceScanNetworkDeviceResultEvent extends IEvent {

    /* renamed from: d */
    public C92483a f264720d = new C92483a();

    /* renamed from: e */
    public C92484b f264721e = new C92484b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent$a */
    public static final class C92483a {

        /* renamed from: a */
        public List f264722a;

        /* renamed from: b */
        public List f264723b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent$b */
    public static final class C92484b {
    }

    public ExDeviceScanNetworkDeviceResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceScanNetworkDeviceResultEvent)) {
            return false;
        }
        ExDeviceScanNetworkDeviceResultEvent exDeviceScanNetworkDeviceResultEvent = (ExDeviceScanNetworkDeviceResultEvent) iEvent;
        C92483a aVar = exDeviceScanNetworkDeviceResultEvent.f264720d;
        if (!C46238a.m51546a(this.f264720d.f264722a, aVar.f264722a) || !C46238a.m51546a(this.f264720d.f264723b, aVar.f264723b)) {
            return false;
        }
        C92484b bVar = exDeviceScanNetworkDeviceResultEvent.f264721e;
        this.f264721e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
