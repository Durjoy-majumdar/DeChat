package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ModNewContactEvent */
public final class ModNewContactEvent extends IEvent {

    /* renamed from: d */
    public C67732a f193738d = new C67732a();

    /* renamed from: com.tencent.mm.autogen.events.ModNewContactEvent$a */
    public static final class C67732a {

        /* renamed from: a */
        public String f193739a;

        /* renamed from: b */
        public String f193740b;
    }

    public ModNewContactEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ModNewContactEvent)) {
            return false;
        }
        C67732a aVar = ((ModNewContactEvent) iEvent).f193738d;
        return C46238a.m51546a(this.f193738d.f193739a, aVar.f193739a) && C46238a.m51546a(this.f193738d.f193740b, aVar.f193740b);
    }
}
