package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C50560nl;

/* renamed from: com.tencent.mm.autogen.events.BypNotifyEvent */
public final class BypNotifyEvent extends IEvent {

    /* renamed from: d */
    public C28714a f78733d = new C28714a();

    /* renamed from: com.tencent.mm.autogen.events.BypNotifyEvent$a */
    public static final class C28714a {

        /* renamed from: a */
        public C50560nl f78734a;
    }

    public BypNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BypNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78733d.f78734a, ((BypNotifyEvent) iEvent).f78733d.f78734a);
    }
}
