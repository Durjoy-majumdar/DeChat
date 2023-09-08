package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsRepostEvent */
public final class SnsRepostEvent extends IEvent {

    /* renamed from: d */
    public C92591a f265193d = new C92591a();

    /* renamed from: com.tencent.mm.autogen.events.SnsRepostEvent$a */
    public static final class C92591a {

        /* renamed from: a */
        public String f265194a;
    }

    public SnsRepostEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsRepostEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f265193d.f265194a, ((SnsRepostEvent) iEvent).f265193d.f265194a);
    }
}
