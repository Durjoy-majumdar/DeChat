package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AccountExpiredEvent */
public final class AccountExpiredEvent extends IEvent {

    /* renamed from: d */
    public C28699a f78702d = new C28699a();

    /* renamed from: com.tencent.mm.autogen.events.AccountExpiredEvent$a */
    public static final class C28699a {

        /* renamed from: a */
        public int f78703a;

        /* renamed from: b */
        public int f78704b;

        /* renamed from: c */
        public String f78705c;
    }

    public AccountExpiredEvent() {
        this.order = true;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AccountExpiredEvent)) {
            return false;
        }
        C28699a aVar = ((AccountExpiredEvent) iEvent).f78702d;
        return C46238a.m51546a(Integer.valueOf(this.f78702d.f78703a), Integer.valueOf(aVar.f78703a)) && C46238a.m51546a(Integer.valueOf(this.f78702d.f78704b), Integer.valueOf(aVar.f78704b)) && C46238a.m51546a(this.f78702d.f78705c, aVar.f78705c);
    }
}
