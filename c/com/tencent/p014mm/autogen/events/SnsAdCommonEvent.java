package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdCommonEvent */
public final class SnsAdCommonEvent extends IEvent {

    /* renamed from: d */
    public C1137a f9511d = new C1137a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdCommonEvent$a */
    public static final class C1137a {
    }

    public SnsAdCommonEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdCommonEvent)) {
            return false;
        }
        C1137a aVar = ((SnsAdCommonEvent) iEvent).f9511d;
        this.f9511d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9511d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9511d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9511d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9511d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
