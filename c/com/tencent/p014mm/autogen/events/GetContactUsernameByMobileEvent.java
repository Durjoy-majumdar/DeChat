package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent */
public final class GetContactUsernameByMobileEvent extends IEvent {

    /* renamed from: d */
    public C28753a f78816d = new C28753a();

    /* renamed from: e */
    public C28754b f78817e = new C28754b();

    /* renamed from: com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent$a */
    public static final class C28753a {

        /* renamed from: a */
        public String f78818a;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetContactUsernameByMobileEvent$b */
    public static final class C28754b {

        /* renamed from: a */
        public String f78819a;
    }

    public GetContactUsernameByMobileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetContactUsernameByMobileEvent)) {
            return false;
        }
        GetContactUsernameByMobileEvent getContactUsernameByMobileEvent = (GetContactUsernameByMobileEvent) iEvent;
        if (!C46238a.m51546a(this.f78816d.f78818a, getContactUsernameByMobileEvent.f78816d.f78818a)) {
            return false;
        }
        return C46238a.m51546a(this.f78817e.f78819a, getContactUsernameByMobileEvent.f78817e.f78819a);
    }
}
