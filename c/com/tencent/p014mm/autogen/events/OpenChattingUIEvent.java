package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenChattingUIEvent */
public final class OpenChattingUIEvent extends IEvent {

    /* renamed from: d */
    public C40150a f107684d = new C40150a();

    /* renamed from: com.tencent.mm.autogen.events.OpenChattingUIEvent$a */
    public static final class C40150a {

        /* renamed from: a */
        public String f107685a;
    }

    public OpenChattingUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenChattingUIEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107684d.f107685a, ((OpenChattingUIEvent) iEvent).f107684d.f107685a);
    }
}
