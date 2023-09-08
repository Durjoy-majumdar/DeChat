package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsJumpProfileEvent */
public final class SnsJumpProfileEvent extends IEvent {

    /* renamed from: d */
    public C92583a f265167d = new C92583a();

    /* renamed from: com.tencent.mm.autogen.events.SnsJumpProfileEvent$a */
    public static final class C92583a {

        /* renamed from: a */
        public String f265168a;
    }

    public SnsJumpProfileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsJumpProfileEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f265167d.f265168a, ((SnsJumpProfileEvent) iEvent).f265167d.f265168a);
    }
}
