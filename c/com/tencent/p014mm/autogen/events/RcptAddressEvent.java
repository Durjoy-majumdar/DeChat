package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RcptAddressEvent */
public final class RcptAddressEvent extends IEvent {

    /* renamed from: d */
    public C28790a f78894d = new C28790a();

    /* renamed from: e */
    public C28791b f78895e = new C28791b();

    /* renamed from: com.tencent.mm.autogen.events.RcptAddressEvent$a */
    public static final class C28790a {

        /* renamed from: a */
        public String f78896a;
    }

    /* renamed from: com.tencent.mm.autogen.events.RcptAddressEvent$b */
    public static final class C28791b {
    }

    public RcptAddressEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RcptAddressEvent)) {
            return false;
        }
        RcptAddressEvent rcptAddressEvent = (RcptAddressEvent) iEvent;
        if (!C46238a.m51546a(this.f78894d.f78896a, rcptAddressEvent.f78894d.f78896a)) {
            return false;
        }
        C28791b bVar = rcptAddressEvent.f78895e;
        this.f78895e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
