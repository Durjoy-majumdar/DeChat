package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetCardCountEvent */
public final class GetCardCountEvent extends IEvent {

    /* renamed from: d */
    public C28751a f78812d = new C28751a();

    /* renamed from: com.tencent.mm.autogen.events.GetCardCountEvent$a */
    public static final class C28751a {

        /* renamed from: a */
        public boolean f78813a = false;
    }

    public GetCardCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetCardCountEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78812d.f78813a), Boolean.valueOf(((GetCardCountEvent) iEvent).f78812d.f78813a));
    }
}
