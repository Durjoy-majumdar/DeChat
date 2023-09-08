package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SupportFingerPrintEvent */
public final class SupportFingerPrintEvent extends IEvent {

    /* renamed from: d */
    public C28837a f79019d = new C28837a();

    /* renamed from: com.tencent.mm.autogen.events.SupportFingerPrintEvent$a */
    public static final class C28837a {

        /* renamed from: a */
        public boolean f79020a = false;
    }

    public SupportFingerPrintEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SupportFingerPrintEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f79019d.f79020a), Boolean.valueOf(((SupportFingerPrintEvent) iEvent).f79019d.f79020a));
    }
}
