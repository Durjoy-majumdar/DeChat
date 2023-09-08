package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SwitcherEvent */
public final class SwitcherEvent extends IEvent {

    /* renamed from: d */
    public C40174a f107783d = new C40174a();

    /* renamed from: com.tencent.mm.autogen.events.SwitcherEvent$a */
    public static final class C40174a {

        /* renamed from: a */
        public int f107784a = 0;

        /* renamed from: b */
        public String f107785b;
    }

    public SwitcherEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SwitcherEvent)) {
            return false;
        }
        C40174a aVar = ((SwitcherEvent) iEvent).f107783d;
        return C46238a.m51546a(Integer.valueOf(this.f107783d.f107784a), Integer.valueOf(aVar.f107784a)) && C46238a.m51546a(this.f107783d.f107785b, aVar.f107785b);
    }
}
