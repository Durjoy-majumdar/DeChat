package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KillSelfEvent */
public final class KillSelfEvent extends IEvent {

    /* renamed from: d */
    public C114678a f343568d = new C114678a();

    /* renamed from: com.tencent.mm.autogen.events.KillSelfEvent$a */
    public static final class C114678a {

        /* renamed from: a */
        public int f343569a;
    }

    public KillSelfEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KillSelfEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f343568d.f343569a), Integer.valueOf(((KillSelfEvent) iEvent).f343568d.f343569a));
    }
}
