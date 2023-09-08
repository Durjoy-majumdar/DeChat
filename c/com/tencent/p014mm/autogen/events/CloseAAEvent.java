package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CloseAAEvent */
public final class CloseAAEvent extends IEvent {

    /* renamed from: d */
    public C40053a f107410d = new C40053a();

    /* renamed from: com.tencent.mm.autogen.events.CloseAAEvent$a */
    public static final class C40053a {

        /* renamed from: a */
        public String f107411a;

        /* renamed from: b */
        public String f107412b;

        /* renamed from: c */
        public long f107413c;
    }

    public CloseAAEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CloseAAEvent)) {
            return false;
        }
        C40053a aVar = ((CloseAAEvent) iEvent).f107410d;
        return C46238a.m51546a(this.f107410d.f107411a, aVar.f107411a) && C46238a.m51546a(this.f107410d.f107412b, aVar.f107412b) && C46238a.m51546a(Long.valueOf(this.f107410d.f107413c), Long.valueOf(aVar.f107413c));
    }
}
