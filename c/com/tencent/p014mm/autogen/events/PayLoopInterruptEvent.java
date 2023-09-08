package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PayLoopInterruptEvent */
public final class PayLoopInterruptEvent extends IEvent {

    /* renamed from: d */
    public C67754a f193821d = new C67754a();

    /* renamed from: com.tencent.mm.autogen.events.PayLoopInterruptEvent$a */
    public static final class C67754a {

        /* renamed from: a */
        public int f193822a;
    }

    public PayLoopInterruptEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PayLoopInterruptEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193821d.f193822a), Integer.valueOf(((PayLoopInterruptEvent) iEvent).f193821d.f193822a));
    }
}
