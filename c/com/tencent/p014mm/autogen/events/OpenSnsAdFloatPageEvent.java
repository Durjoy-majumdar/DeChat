package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent */
public final class OpenSnsAdFloatPageEvent extends IEvent {

    /* renamed from: d */
    public C92539a f264978d = new C92539a();

    /* renamed from: com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent$a */
    public static final class C92539a {

        /* renamed from: a */
        public String f264979a;
    }

    public OpenSnsAdFloatPageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenSnsAdFloatPageEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f264978d.f264979a, ((OpenSnsAdFloatPageEvent) iEvent).f264978d.f264979a);
    }
}
