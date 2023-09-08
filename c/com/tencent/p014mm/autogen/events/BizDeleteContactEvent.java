package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BizDeleteContactEvent */
public final class BizDeleteContactEvent extends IEvent {

    /* renamed from: d */
    public C40039a f107367d = new C40039a();

    /* renamed from: com.tencent.mm.autogen.events.BizDeleteContactEvent$a */
    public static final class C40039a {

        /* renamed from: a */
        public String f107368a;
    }

    public BizDeleteContactEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizDeleteContactEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107367d.f107368a, ((BizDeleteContactEvent) iEvent).f107367d.f107368a);
    }
}
