package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyFragmentChangeEvent */
public final class NotifyFragmentChangeEvent extends IEvent {

    /* renamed from: d */
    public C1099a f9354d = new C1099a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyFragmentChangeEvent$a */
    public static final class C1099a {
    }

    public NotifyFragmentChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyFragmentChangeEvent)) {
            return false;
        }
        C1099a aVar = ((NotifyFragmentChangeEvent) iEvent).f9354d;
        this.f9354d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9354d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9354d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
