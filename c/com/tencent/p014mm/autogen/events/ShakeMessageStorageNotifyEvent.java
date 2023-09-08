package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShakeMessageStorageNotifyEvent */
public final class ShakeMessageStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public C67788a f193932d = new C67788a();

    /* renamed from: com.tencent.mm.autogen.events.ShakeMessageStorageNotifyEvent$a */
    public static final class C67788a {

        /* renamed from: a */
        public String f193933a;
    }

    public ShakeMessageStorageNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShakeMessageStorageNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193932d.f193933a, ((ShakeMessageStorageNotifyEvent) iEvent).f193932d.f193933a);
    }
}
