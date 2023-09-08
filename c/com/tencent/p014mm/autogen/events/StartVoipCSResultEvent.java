package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartVoipCSResultEvent */
public final class StartVoipCSResultEvent extends IEvent {

    /* renamed from: d */
    public C1146a f9556d = new C1146a();

    /* renamed from: com.tencent.mm.autogen.events.StartVoipCSResultEvent$a */
    public static final class C1146a {

        /* renamed from: a */
        public int f9557a;
    }

    public StartVoipCSResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartVoipCSResultEvent)) {
            return false;
        }
        C1146a aVar = ((StartVoipCSResultEvent) iEvent).f9556d;
        this.f9556d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f9556d.f9557a), Integer.valueOf(aVar.f9557a));
    }
}
