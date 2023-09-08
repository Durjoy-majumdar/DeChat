package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtConnectWifiEvent */
public final class ExtConnectWifiEvent extends IEvent {

    /* renamed from: d */
    public C92490a f264746d = new C92490a();

    /* renamed from: e */
    public C92491b f264747e = new C92491b();

    /* renamed from: com.tencent.mm.autogen.events.ExtConnectWifiEvent$a */
    public static final class C92490a {

        /* renamed from: a */
        public int f264748a = 1;

        /* renamed from: b */
        public String f264749b;

        /* renamed from: c */
        public String f264750c;

        /* renamed from: d */
        public int f264751d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtConnectWifiEvent$b */
    public static final class C92491b {
    }

    public ExtConnectWifiEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtConnectWifiEvent)) {
            return false;
        }
        ExtConnectWifiEvent extConnectWifiEvent = (ExtConnectWifiEvent) iEvent;
        C92490a aVar = extConnectWifiEvent.f264746d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264746d.f264748a), Integer.valueOf(aVar.f264748a)) || !C46238a.m51546a(this.f264746d.f264749b, aVar.f264749b) || !C46238a.m51546a(this.f264746d.f264750c, aVar.f264750c) || !C46238a.m51546a(Integer.valueOf(this.f264746d.f264751d), Integer.valueOf(aVar.f264751d))) {
            return false;
        }
        C92491b bVar = extConnectWifiEvent.f264747e;
        this.f264747e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f264747e.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f264747e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
