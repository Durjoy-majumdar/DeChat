package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AddFMessageCardClickEvent */
public final class AddFMessageCardClickEvent extends IEvent {

    /* renamed from: d */
    public C67656a f193470d = new C67656a();

    /* renamed from: com.tencent.mm.autogen.events.AddFMessageCardClickEvent$a */
    public static final class C67656a {

        /* renamed from: a */
        public int f193471a = 0;
    }

    public AddFMessageCardClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AddFMessageCardClickEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193470d.f193471a), Integer.valueOf(((AddFMessageCardClickEvent) iEvent).f193470d.f193471a));
    }
}
