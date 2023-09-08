package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent */
public final class GameMessageStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40106a f107553d = new C40106a();

    /* renamed from: com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent$a */
    public static final class C40106a {

        /* renamed from: a */
        public String f107554a;
    }

    public GameMessageStorageNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameMessageStorageNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107553d.f107554a, ((GameMessageStorageNotifyEvent) iEvent).f107553d.f107554a);
    }
}
