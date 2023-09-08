package com.tencent.p014mm.autogen.events;

import b63.C67175a;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.Show261AlertEvent */
public final class Show261AlertEvent extends IEvent {

    /* renamed from: d */
    public C67789a f193934d = new C67789a();

    /* renamed from: com.tencent.mm.autogen.events.Show261AlertEvent$a */
    public static final class C67789a {

        /* renamed from: a */
        public C67175a f193935a;
    }

    public Show261AlertEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof Show261AlertEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193934d.f193935a, ((Show261AlertEvent) iEvent).f193934d.f193935a);
    }
}
