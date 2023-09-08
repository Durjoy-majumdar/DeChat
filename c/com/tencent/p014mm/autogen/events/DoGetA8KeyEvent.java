package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DoGetA8KeyEvent */
public final class DoGetA8KeyEvent extends IEvent {

    /* renamed from: d */
    public C28729a f78772d = new C28729a();

    /* renamed from: com.tencent.mm.autogen.events.DoGetA8KeyEvent$a */
    public static final class C28729a {
    }

    public DoGetA8KeyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DoGetA8KeyEvent)) {
            return false;
        }
        C28729a aVar = ((DoGetA8KeyEvent) iEvent).f78772d;
        this.f78772d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78772d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78772d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
