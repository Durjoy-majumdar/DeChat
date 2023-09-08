package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import p918s2.C90116e;

/* renamed from: com.tencent.mm.autogen.events.AutoNewMessageEvent */
public final class AutoNewMessageEvent extends IEvent {

    /* renamed from: d */
    public C67659a f193479d = new C67659a();

    /* renamed from: com.tencent.mm.autogen.events.AutoNewMessageEvent$a */
    public static final class C67659a {

        /* renamed from: a */
        public String f193480a;

        /* renamed from: b */
        public String f193481b;

        /* renamed from: c */
        public C90116e.C77603e f193482c;
    }

    public AutoNewMessageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AutoNewMessageEvent)) {
            return false;
        }
        C67659a aVar = ((AutoNewMessageEvent) iEvent).f193479d;
        return C46238a.m51546a(this.f193479d.f193480a, aVar.f193480a) && C46238a.m51546a(this.f193479d.f193481b, aVar.f193481b) && C46238a.m51546a(this.f193479d.f193482c, aVar.f193482c);
    }
}
