package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FMsgGetNameEvent */
public final class FMsgGetNameEvent extends IEvent {

    /* renamed from: d */
    public C67698a f193611d = new C67698a();

    /* renamed from: e */
    public C67699b f193612e = new C67699b();

    /* renamed from: com.tencent.mm.autogen.events.FMsgGetNameEvent$a */
    public static final class C67698a {

        /* renamed from: a */
        public String f193613a;

        /* renamed from: b */
        public String f193614b;
    }

    /* renamed from: com.tencent.mm.autogen.events.FMsgGetNameEvent$b */
    public static final class C67699b {

        /* renamed from: a */
        public String f193615a;
    }

    public FMsgGetNameEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FMsgGetNameEvent)) {
            return false;
        }
        FMsgGetNameEvent fMsgGetNameEvent = (FMsgGetNameEvent) iEvent;
        C67698a aVar = fMsgGetNameEvent.f193611d;
        if (!C46238a.m51546a(this.f193611d.f193613a, aVar.f193613a) || !C46238a.m51546a(this.f193611d.f193614b, aVar.f193614b)) {
            return false;
        }
        return C46238a.m51546a(this.f193612e.f193615a, fMsgGetNameEvent.f193612e.f193615a);
    }
}
