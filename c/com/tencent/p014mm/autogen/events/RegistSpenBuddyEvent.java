package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RegistSpenBuddyEvent */
public final class RegistSpenBuddyEvent extends IEvent {

    /* renamed from: d */
    public C28797a f78915d = new C28797a();

    /* renamed from: com.tencent.mm.autogen.events.RegistSpenBuddyEvent$a */
    public static final class C28797a {
    }

    public RegistSpenBuddyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RegistSpenBuddyEvent)) {
            return false;
        }
        C28797a aVar = ((RegistSpenBuddyEvent) iEvent).f78915d;
        this.f78915d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78915d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
