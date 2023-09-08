package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetHbCoverStateEvent */
public final class GetHbCoverStateEvent extends IEvent {

    /* renamed from: d */
    public C92524a f264892d = new C92524a();

    /* renamed from: com.tencent.mm.autogen.events.GetHbCoverStateEvent$a */
    public static final class C92524a {

        /* renamed from: a */
        public String f264893a;

        /* renamed from: b */
        public int f264894b;
    }

    public GetHbCoverStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetHbCoverStateEvent)) {
            return false;
        }
        C92524a aVar = ((GetHbCoverStateEvent) iEvent).f264892d;
        return C46238a.m51546a(this.f264892d.f264893a, aVar.f264893a) && C46238a.m51546a(Integer.valueOf(this.f264892d.f264894b), Integer.valueOf(aVar.f264894b));
    }
}
