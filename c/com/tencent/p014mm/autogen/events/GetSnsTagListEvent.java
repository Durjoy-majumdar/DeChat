package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetSnsTagListEvent */
public final class GetSnsTagListEvent extends IEvent {

    /* renamed from: d */
    public C1085a f9308d = new C1085a();

    /* renamed from: com.tencent.mm.autogen.events.GetSnsTagListEvent$a */
    public static final class C1085a {

        /* renamed from: a */
        public int f9309a = 0;
    }

    public GetSnsTagListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSnsTagListEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9308d.f9309a), Integer.valueOf(((GetSnsTagListEvent) iEvent).f9308d.f9309a));
    }
}
