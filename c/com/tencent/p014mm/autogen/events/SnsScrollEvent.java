package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsScrollEvent */
public final class SnsScrollEvent extends IEvent {

    /* renamed from: d */
    public C92592a f265195d = new C92592a();

    /* renamed from: com.tencent.mm.autogen.events.SnsScrollEvent$a */
    public static final class C92592a {

        /* renamed from: a */
        public int f265196a;
    }

    public SnsScrollEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsScrollEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f265195d.f265196a), Integer.valueOf(((SnsScrollEvent) iEvent).f265195d.f265196a));
    }
}
