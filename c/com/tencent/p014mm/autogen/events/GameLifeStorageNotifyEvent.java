package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent */
public final class GameLifeStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public C40105a f107551d = new C40105a();

    /* renamed from: com.tencent.mm.autogen.events.GameLifeStorageNotifyEvent$a */
    public static final class C40105a {

        /* renamed from: a */
        public String f107552a;
    }

    public GameLifeStorageNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GameLifeStorageNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107551d.f107552a, ((GameLifeStorageNotifyEvent) iEvent).f107551d.f107552a);
    }
}
