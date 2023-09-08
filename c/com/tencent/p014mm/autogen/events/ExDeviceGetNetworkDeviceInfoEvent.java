package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent */
public final class ExDeviceGetNetworkDeviceInfoEvent extends IEvent {

    /* renamed from: d */
    public C92481a f264711d = new C92481a();

    /* renamed from: e */
    public C92482b f264712e = new C92482b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$a */
    public static final class C92481a {

        /* renamed from: a */
        public long f264713a;

        /* renamed from: b */
        public String f264714b;

        /* renamed from: c */
        public String f264715c;

        /* renamed from: d */
        public String f264716d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$b */
    public static final class C92482b {

        /* renamed from: a */
        public List f264717a;

        /* renamed from: b */
        public List f264718b;

        /* renamed from: c */
        public boolean f264719c;
    }

    public ExDeviceGetNetworkDeviceInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetNetworkDeviceInfoEvent)) {
            return false;
        }
        ExDeviceGetNetworkDeviceInfoEvent exDeviceGetNetworkDeviceInfoEvent = (ExDeviceGetNetworkDeviceInfoEvent) iEvent;
        C92481a aVar = exDeviceGetNetworkDeviceInfoEvent.f264711d;
        if (!C46238a.m51546a(Long.valueOf(this.f264711d.f264713a), Long.valueOf(aVar.f264713a)) || !C46238a.m51546a(this.f264711d.f264714b, aVar.f264714b) || !C46238a.m51546a(this.f264711d.f264715c, aVar.f264715c) || !C46238a.m51546a(this.f264711d.f264716d, aVar.f264716d)) {
            return false;
        }
        C92482b bVar = exDeviceGetNetworkDeviceInfoEvent.f264712e;
        return C46238a.m51546a(this.f264712e.f264717a, bVar.f264717a) && C46238a.m51546a(this.f264712e.f264718b, bVar.f264718b) && C46238a.m51546a(Boolean.valueOf(this.f264712e.f264719c), Boolean.valueOf(bVar.f264719c));
    }
}
