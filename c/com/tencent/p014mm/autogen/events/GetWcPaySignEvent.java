package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetWcPaySignEvent */
public final class GetWcPaySignEvent extends IEvent {

    /* renamed from: d */
    public C40124a f107602d = new C40124a();

    /* renamed from: e */
    public C40125b f107603e = new C40125b();

    /* renamed from: com.tencent.mm.autogen.events.GetWcPaySignEvent$a */
    public static final class C40124a {

        /* renamed from: a */
        public String f107604a;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetWcPaySignEvent$b */
    public static final class C40125b {

        /* renamed from: a */
        public String f107605a;
    }

    public GetWcPaySignEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetWcPaySignEvent)) {
            return false;
        }
        GetWcPaySignEvent getWcPaySignEvent = (GetWcPaySignEvent) iEvent;
        if (!C46238a.m51546a(this.f107602d.f107604a, getWcPaySignEvent.f107602d.f107604a)) {
            return false;
        }
        return C46238a.m51546a(this.f107603e.f107605a, getWcPaySignEvent.f107603e.f107605a);
    }
}
