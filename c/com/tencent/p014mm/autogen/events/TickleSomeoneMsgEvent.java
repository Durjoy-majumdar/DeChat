package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TickleSomeoneMsgEvent */
public final class TickleSomeoneMsgEvent extends IEvent {

    /* renamed from: d */
    public C40176a f107788d = new C40176a();

    /* renamed from: com.tencent.mm.autogen.events.TickleSomeoneMsgEvent$a */
    public static final class C40176a {

        /* renamed from: a */
        public String f107789a;

        /* renamed from: b */
        public long f107790b = 0;
    }

    public TickleSomeoneMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TickleSomeoneMsgEvent)) {
            return false;
        }
        C40176a aVar = ((TickleSomeoneMsgEvent) iEvent).f107788d;
        return C46238a.m51546a(this.f107788d.f107789a, aVar.f107789a) && C46238a.m51546a(Long.valueOf(this.f107788d.f107790b), Long.valueOf(aVar.f107790b));
    }
}
