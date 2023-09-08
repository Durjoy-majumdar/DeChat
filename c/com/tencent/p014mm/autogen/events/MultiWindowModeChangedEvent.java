package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MultiWindowModeChangedEvent */
public final class MultiWindowModeChangedEvent extends IEvent {

    /* renamed from: d */
    public C67734a f193745d = new C67734a();

    /* renamed from: com.tencent.mm.autogen.events.MultiWindowModeChangedEvent$a */
    public static final class C67734a {

        /* renamed from: a */
        public boolean f193746a;
    }

    public MultiWindowModeChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MultiWindowModeChangedEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193745d.f193746a), Boolean.valueOf(((MultiWindowModeChangedEvent) iEvent).f193745d.f193746a));
    }
}
