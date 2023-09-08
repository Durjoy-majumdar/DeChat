package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent */
public final class CloseAAUrgeNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40054a f107414d = new C40054a();

    /* renamed from: com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent$a */
    public static final class C40054a {

        /* renamed from: a */
        public String f107415a;

        /* renamed from: b */
        public String f107416b;

        /* renamed from: c */
        public long f107417c;
    }

    public CloseAAUrgeNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CloseAAUrgeNotifyEvent)) {
            return false;
        }
        C40054a aVar = ((CloseAAUrgeNotifyEvent) iEvent).f107414d;
        return C46238a.m51546a(this.f107414d.f107415a, aVar.f107415a) && C46238a.m51546a(this.f107414d.f107416b, aVar.f107416b) && C46238a.m51546a(Long.valueOf(this.f107414d.f107417c), Long.valueOf(aVar.f107417c));
    }
}
