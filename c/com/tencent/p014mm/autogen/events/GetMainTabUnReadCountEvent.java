package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent */
public final class GetMainTabUnReadCountEvent extends IEvent {

    /* renamed from: d */
    public C67711a f193652d = new C67711a();

    /* renamed from: com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent$a */
    public static final class C67711a {

        /* renamed from: a */
        public int f193653a;
    }

    public GetMainTabUnReadCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetMainTabUnReadCountEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193652d.f193653a), Integer.valueOf(((GetMainTabUnReadCountEvent) iEvent).f193652d.f193653a));
    }
}
