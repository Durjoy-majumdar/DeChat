package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MsgSynchronizeABTestEvent */
public final class MsgSynchronizeABTestEvent extends IEvent {

    /* renamed from: d */
    public C1092a f9327d = new C1092a();

    /* renamed from: com.tencent.mm.autogen.events.MsgSynchronizeABTestEvent$a */
    public static final class C1092a {

        /* renamed from: a */
        public int f9328a;

        /* renamed from: b */
        public int f9329b;

        /* renamed from: c */
        public int f9330c;
    }

    public MsgSynchronizeABTestEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MsgSynchronizeABTestEvent)) {
            return false;
        }
        C1092a aVar = ((MsgSynchronizeABTestEvent) iEvent).f9327d;
        return C46238a.m51546a(Integer.valueOf(this.f9327d.f9328a), Integer.valueOf(aVar.f9328a)) && C46238a.m51546a(Integer.valueOf(this.f9327d.f9329b), Integer.valueOf(aVar.f9329b)) && C46238a.m51546a(Integer.valueOf(this.f9327d.f9330c), Integer.valueOf(aVar.f9330c));
    }
}
