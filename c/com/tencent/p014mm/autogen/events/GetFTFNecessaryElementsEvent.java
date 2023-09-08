package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetFTFNecessaryElementsEvent */
public final class GetFTFNecessaryElementsEvent extends IEvent {

    /* renamed from: d */
    public C67708a f193646d = new C67708a();

    /* renamed from: com.tencent.mm.autogen.events.GetFTFNecessaryElementsEvent$a */
    public static final class C67708a {

        /* renamed from: a */
        public String f193647a;

        /* renamed from: b */
        public String f193648b;
    }

    public GetFTFNecessaryElementsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetFTFNecessaryElementsEvent)) {
            return false;
        }
        C67708a aVar = ((GetFTFNecessaryElementsEvent) iEvent).f193646d;
        return C46238a.m51546a(this.f193646d.f193647a, aVar.f193647a) && C46238a.m51546a(this.f193646d.f193648b, aVar.f193648b);
    }
}
