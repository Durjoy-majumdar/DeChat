package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScreenCastEvent */
public final class ScreenCastEvent extends IEvent {

    /* renamed from: d */
    public C1130a f9475d = new C1130a();

    /* renamed from: com.tencent.mm.autogen.events.ScreenCastEvent$a */
    public static final class C1130a {

        /* renamed from: a */
        public boolean f9476a = false;
    }

    public ScreenCastEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScreenCastEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9475d.f9476a), Boolean.valueOf(((ScreenCastEvent) iEvent).f9475d.f9476a));
    }
}
