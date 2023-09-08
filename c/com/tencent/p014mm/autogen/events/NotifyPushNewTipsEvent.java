package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyPushNewTipsEvent */
public final class NotifyPushNewTipsEvent extends IEvent {

    /* renamed from: d */
    public C67742a f193768d = new C67742a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyPushNewTipsEvent$a */
    public static final class C67742a {

        /* renamed from: a */
        public String f193769a;
    }

    public NotifyPushNewTipsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyPushNewTipsEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193768d.f193769a, ((NotifyPushNewTipsEvent) iEvent).f193768d.f193769a);
    }
}
