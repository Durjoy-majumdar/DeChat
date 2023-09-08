package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BankEditSelectedEvent */
public final class BankEditSelectedEvent extends IEvent {

    /* renamed from: d */
    public C67660a f193483d = new C67660a();

    /* renamed from: com.tencent.mm.autogen.events.BankEditSelectedEvent$a */
    public static final class C67660a {

        /* renamed from: a */
        public String f193484a;

        /* renamed from: b */
        public String f193485b;

        /* renamed from: c */
        public String f193486c;
    }

    public BankEditSelectedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BankEditSelectedEvent)) {
            return false;
        }
        C67660a aVar = ((BankEditSelectedEvent) iEvent).f193483d;
        return C46238a.m51546a(this.f193483d.f193484a, aVar.f193484a) && C46238a.m51546a(this.f193483d.f193485b, aVar.f193485b) && C46238a.m51546a(this.f193483d.f193486c, aVar.f193486c);
    }
}
