package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdListScrollEvent */
public final class SnsAdListScrollEvent extends IEvent {

    /* renamed from: d */
    public C92569a f265121d = new C92569a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdListScrollEvent$a */
    public static final class C92569a {

        /* renamed from: a */
        public boolean f265122a;
    }

    public SnsAdListScrollEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdListScrollEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f265121d.f265122a), Boolean.valueOf(((SnsAdListScrollEvent) iEvent).f265121d.f265122a));
    }
}
