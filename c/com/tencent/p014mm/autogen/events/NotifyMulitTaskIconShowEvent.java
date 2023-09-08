package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent */
public final class NotifyMulitTaskIconShowEvent extends IEvent {

    /* renamed from: d */
    public C67741a f193766d = new C67741a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent$a */
    public static final class C67741a {

        /* renamed from: a */
        public boolean f193767a;
    }

    public NotifyMulitTaskIconShowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyMulitTaskIconShowEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193766d.f193767a), Boolean.valueOf(((NotifyMulitTaskIconShowEvent) iEvent).f193766d.f193767a));
    }
}
