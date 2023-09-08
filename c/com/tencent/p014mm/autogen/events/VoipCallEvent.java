package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.VoipCallEvent */
public final class VoipCallEvent extends IEvent {

    /* renamed from: d */
    public C80744a f236298d = new C80744a();

    /* renamed from: com.tencent.mm.autogen.events.VoipCallEvent$a */
    public static final class C80744a {

        /* renamed from: a */
        public boolean f236299a;
    }

    public VoipCallEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof VoipCallEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f236298d.f236299a), Boolean.valueOf(((VoipCallEvent) iEvent).f236298d.f236299a));
    }
}
