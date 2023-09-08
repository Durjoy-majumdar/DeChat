package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyExposeAdEvent */
public final class NotifyExposeAdEvent extends IEvent {

    /* renamed from: d */
    public C92534a f264940d = new C92534a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyExposeAdEvent$a */
    public static final class C92534a {

        /* renamed from: a */
        public int f264941a;
    }

    public NotifyExposeAdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyExposeAdEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f264940d.f264941a), Integer.valueOf(((NotifyExposeAdEvent) iEvent).f264940d.f264941a));
    }
}
