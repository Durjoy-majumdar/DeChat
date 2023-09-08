package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenImUrlNotifyEvent */
public final class OpenImUrlNotifyEvent extends IEvent {

    /* renamed from: d */
    public C28787a f78890d = new C28787a();

    /* renamed from: com.tencent.mm.autogen.events.OpenImUrlNotifyEvent$a */
    public static final class C28787a {

        /* renamed from: a */
        public String f78891a;
    }

    public OpenImUrlNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenImUrlNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78890d.f78891a, ((OpenImUrlNotifyEvent) iEvent).f78890d.f78891a);
    }
}
