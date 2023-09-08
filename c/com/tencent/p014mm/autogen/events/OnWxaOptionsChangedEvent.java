package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent */
public final class OnWxaOptionsChangedEvent extends IEvent {

    /* renamed from: d */
    public C67747a f193781d = new C67747a();

    /* renamed from: com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent$a */
    public static final class C67747a {

        /* renamed from: a */
        public String f193782a;

        /* renamed from: b */
        public int f193783b;
    }

    public OnWxaOptionsChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnWxaOptionsChangedEvent)) {
            return false;
        }
        C67747a aVar = ((OnWxaOptionsChangedEvent) iEvent).f193781d;
        return C46238a.m51546a(this.f193781d.f193782a, aVar.f193782a) && C46238a.m51546a(Integer.valueOf(this.f193781d.f193783b), Integer.valueOf(aVar.f193783b));
    }
}
