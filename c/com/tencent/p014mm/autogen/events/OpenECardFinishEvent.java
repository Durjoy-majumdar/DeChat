package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenECardFinishEvent */
public final class OpenECardFinishEvent extends IEvent {

    /* renamed from: d */
    public C40151a f107686d = new C40151a();

    /* renamed from: com.tencent.mm.autogen.events.OpenECardFinishEvent$a */
    public static final class C40151a {
    }

    public OpenECardFinishEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenECardFinishEvent)) {
            return false;
        }
        C40151a aVar = ((OpenECardFinishEvent) iEvent).f107686d;
        this.f107686d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f107686d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
