package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GiftCardEvent */
public final class GiftCardEvent extends IEvent {

    /* renamed from: d */
    public C67716a f193670d = new C67716a();

    /* renamed from: com.tencent.mm.autogen.events.GiftCardEvent$a */
    public static final class C67716a {

        /* renamed from: a */
        public String f193671a;

        /* renamed from: b */
        public long f193672b;

        /* renamed from: c */
        public String f193673c;
    }

    public GiftCardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GiftCardEvent)) {
            return false;
        }
        C67716a aVar = ((GiftCardEvent) iEvent).f193670d;
        return C46238a.m51546a(this.f193670d.f193671a, aVar.f193671a) && C46238a.m51546a(Long.valueOf(this.f193670d.f193672b), Long.valueOf(aVar.f193672b)) && C46238a.m51546a(this.f193670d.f193673c, aVar.f193673c);
    }
}
