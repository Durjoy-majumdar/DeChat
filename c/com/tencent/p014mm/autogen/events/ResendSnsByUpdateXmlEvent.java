package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent */
public final class ResendSnsByUpdateXmlEvent extends IEvent {

    /* renamed from: d */
    public C28806a f78934d = new C28806a();

    /* renamed from: com.tencent.mm.autogen.events.ResendSnsByUpdateXmlEvent$a */
    public static final class C28806a {

        /* renamed from: a */
        public ArrayList f78935a;

        /* renamed from: b */
        public String f78936b;
    }

    public ResendSnsByUpdateXmlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendSnsByUpdateXmlEvent)) {
            return false;
        }
        C28806a aVar = ((ResendSnsByUpdateXmlEvent) iEvent).f78934d;
        return C46238a.m51546a(this.f78934d.f78935a, aVar.f78935a) && C46238a.m51546a(this.f78934d.f78936b, aVar.f78936b);
    }
}
