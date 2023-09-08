package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DoingInitContactEvent */
public final class DoingInitContactEvent extends IEvent {

    /* renamed from: d */
    public C1002a f9047d = new C1002a();

    /* renamed from: com.tencent.mm.autogen.events.DoingInitContactEvent$a */
    public static final class C1002a {

        /* renamed from: a */
        public int f9048a;
    }

    public DoingInitContactEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DoingInitContactEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9047d.f9048a), Integer.valueOf(((DoingInitContactEvent) iEvent).f9047d.f9048a));
    }
}
