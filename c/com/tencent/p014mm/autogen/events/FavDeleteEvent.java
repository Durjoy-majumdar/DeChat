package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FavDeleteEvent */
public final class FavDeleteEvent extends IEvent {

    /* renamed from: d */
    public C92509a f264807d = new C92509a();

    /* renamed from: com.tencent.mm.autogen.events.FavDeleteEvent$a */
    public static final class C92509a {

        /* renamed from: a */
        public String f264808a;
    }

    public FavDeleteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavDeleteEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f264807d.f264808a, ((FavDeleteEvent) iEvent).f264807d.f264808a);
    }
}
