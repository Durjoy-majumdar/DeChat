package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent */
public final class AgreeAuthorizationChangeEvent extends IEvent {

    /* renamed from: d */
    public C0995a f9031d = new C0995a();

    /* renamed from: com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent$a */
    public static final class C0995a {

        /* renamed from: a */
        public int f9032a;

        /* renamed from: b */
        public String f9033b;
    }

    public AgreeAuthorizationChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AgreeAuthorizationChangeEvent)) {
            return false;
        }
        C0995a aVar = ((AgreeAuthorizationChangeEvent) iEvent).f9031d;
        return C46238a.m51546a(Integer.valueOf(this.f9031d.f9032a), Integer.valueOf(aVar.f9032a)) && C46238a.m51546a(this.f9031d.f9033b, aVar.f9033b);
    }
}
