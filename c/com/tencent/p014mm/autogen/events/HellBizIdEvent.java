package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HellBizIdEvent */
public final class HellBizIdEvent extends IEvent {

    /* renamed from: d */
    public C92529a f264903d = new C92529a();

    /* renamed from: com.tencent.mm.autogen.events.HellBizIdEvent$a */
    public static final class C92529a {

        /* renamed from: a */
        public String f264904a;

        /* renamed from: b */
        public String f264905b;
    }

    public HellBizIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HellBizIdEvent)) {
            return false;
        }
        C92529a aVar = ((HellBizIdEvent) iEvent).f264903d;
        return C46238a.m51546a(this.f264903d.f264904a, aVar.f264904a) && C46238a.m51546a(this.f264903d.f264905b, aVar.f264905b);
    }
}
