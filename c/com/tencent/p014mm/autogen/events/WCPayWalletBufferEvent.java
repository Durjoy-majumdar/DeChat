package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WCPayWalletBufferEvent */
public final class WCPayWalletBufferEvent extends IEvent {

    /* renamed from: d */
    public C1159a f9578d = new C1159a();

    /* renamed from: e */
    public C1160b f9579e = new C1160b();

    /* renamed from: com.tencent.mm.autogen.events.WCPayWalletBufferEvent$a */
    public static final class C1159a {

        /* renamed from: a */
        public String f9580a;

        /* renamed from: b */
        public String f9581b;

        /* renamed from: c */
        public String f9582c;

        /* renamed from: d */
        public String f9583d;

        /* renamed from: e */
        public String f9584e;

        /* renamed from: f */
        public String f9585f;

        /* renamed from: g */
        public String f9586g;

        /* renamed from: h */
        public String f9587h;

        /* renamed from: i */
        public int f9588i;

        /* renamed from: j */
        public String f9589j;
    }

    /* renamed from: com.tencent.mm.autogen.events.WCPayWalletBufferEvent$b */
    public static final class C1160b {

        /* renamed from: a */
        public int f9590a;

        /* renamed from: b */
        public String f9591b;

        /* renamed from: c */
        public Runnable f9592c;
    }

    public WCPayWalletBufferEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WCPayWalletBufferEvent)) {
            return false;
        }
        WCPayWalletBufferEvent wCPayWalletBufferEvent = (WCPayWalletBufferEvent) iEvent;
        C1159a aVar = wCPayWalletBufferEvent.f9578d;
        if (!C46238a.m51546a(this.f9578d.f9580a, aVar.f9580a) || !C46238a.m51546a(this.f9578d.f9581b, aVar.f9581b) || !C46238a.m51546a(this.f9578d.f9582c, aVar.f9582c) || !C46238a.m51546a(this.f9578d.f9583d, aVar.f9583d) || !C46238a.m51546a(this.f9578d.f9584e, aVar.f9584e) || !C46238a.m51546a(this.f9578d.f9585f, aVar.f9585f) || !C46238a.m51546a(this.f9578d.f9586g, aVar.f9586g) || !C46238a.m51546a(this.f9578d.f9587h, aVar.f9587h) || !C46238a.m51546a(Integer.valueOf(this.f9578d.f9588i), Integer.valueOf(aVar.f9588i)) || !C46238a.m51546a(this.f9578d.f9589j, aVar.f9589j)) {
            return false;
        }
        C1160b bVar = wCPayWalletBufferEvent.f9579e;
        return C46238a.m51546a(Integer.valueOf(this.f9579e.f9590a), Integer.valueOf(bVar.f9590a)) && C46238a.m51546a(this.f9579e.f9591b, bVar.f9591b) && C46238a.m51546a(this.f9579e.f9592c, bVar.f9592c);
    }
}
