package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OtherLogoutEvent */
public final class OtherLogoutEvent extends IEvent {

    /* renamed from: d */
    public C80733a f236259d = new C80733a();

    /* renamed from: com.tencent.mm.autogen.events.OtherLogoutEvent$a */
    public static final class C80733a {

        /* renamed from: a */
        public int f236260a = 0;
    }

    public OtherLogoutEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OtherLogoutEvent)) {
            return false;
        }
        C80733a aVar = ((OtherLogoutEvent) iEvent).f236259d;
        this.f236259d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f236259d.f236260a), Integer.valueOf(aVar.f236260a));
    }
}
