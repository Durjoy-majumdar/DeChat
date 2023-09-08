package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendEntranceStateEvent */
public final class SendEntranceStateEvent extends IEvent {

    /* renamed from: d */
    public C40164a f107751d = new C40164a();

    /* renamed from: com.tencent.mm.autogen.events.SendEntranceStateEvent$a */
    public static final class C40164a {

        /* renamed from: a */
        public boolean f107752a = false;
    }

    public SendEntranceStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendEntranceStateEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107751d.f107752a), Boolean.valueOf(((SendEntranceStateEvent) iEvent).f107751d.f107752a));
    }
}
