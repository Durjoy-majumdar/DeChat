package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72996z1;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MsgInsertWithNewContactEvent */
public final class MsgInsertWithNewContactEvent extends IEvent {

    /* renamed from: d */
    public C28778a f78869d = new C28778a();

    /* renamed from: com.tencent.mm.autogen.events.MsgInsertWithNewContactEvent$a */
    public static final class C28778a {

        /* renamed from: a */
        public C72996z1 f78870a;
    }

    public MsgInsertWithNewContactEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MsgInsertWithNewContactEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78869d.f78870a, ((MsgInsertWithNewContactEvent) iEvent).f78869d.f78870a);
    }
}
