package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MStorageNotifyEvent */
public final class MStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40134a f107633d = new C40134a();

    /* renamed from: com.tencent.mm.autogen.events.MStorageNotifyEvent$a */
    public static final class C40134a {

        /* renamed from: a */
        public IEvent f107634a;
    }

    public MStorageNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MStorageNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107633d.f107634a, ((MStorageNotifyEvent) iEvent).f107633d.f107634a);
    }
}
