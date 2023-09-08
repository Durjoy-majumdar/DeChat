package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetNewContactEvent */
public final class GetNewContactEvent extends IEvent {

    /* renamed from: d */
    public C67712a f193654d = new C67712a();

    /* renamed from: com.tencent.mm.autogen.events.GetNewContactEvent$a */
    public static final class C67712a {

        /* renamed from: a */
        public String f193655a;

        /* renamed from: b */
        public String f193656b;
    }

    public GetNewContactEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetNewContactEvent)) {
            return false;
        }
        C67712a aVar = ((GetNewContactEvent) iEvent).f193654d;
        return C46238a.m51546a(this.f193654d.f193655a, aVar.f193655a) && C46238a.m51546a(this.f193654d.f193656b, aVar.f193656b);
    }
}
