package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LoginDisasterEvent */
public final class LoginDisasterEvent extends IEvent {

    /* renamed from: d */
    public C114679a f343570d = new C114679a();

    /* renamed from: com.tencent.mm.autogen.events.LoginDisasterEvent$a */
    public static final class C114679a {

        /* renamed from: a */
        public String f343571a;

        /* renamed from: b */
        public String f343572b;
    }

    public LoginDisasterEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LoginDisasterEvent)) {
            return false;
        }
        C114679a aVar = ((LoginDisasterEvent) iEvent).f343570d;
        return C46238a.m51546a(this.f343570d.f343571a, aVar.f343571a) && C46238a.m51546a(this.f343570d.f343572b, aVar.f343572b);
    }
}
