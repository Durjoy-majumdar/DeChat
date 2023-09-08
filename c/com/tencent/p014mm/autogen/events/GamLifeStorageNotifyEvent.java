package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GamLifeStorageNotifyEvent */
public final class GamLifeStorageNotifyEvent extends IEvent {

    /* renamed from: d */
    public C28749a f78809d = new C28749a();

    /* renamed from: com.tencent.mm.autogen.events.GamLifeStorageNotifyEvent$a */
    public static final class C28749a {
    }

    public GamLifeStorageNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GamLifeStorageNotifyEvent)) {
            return false;
        }
        C28749a aVar = ((GamLifeStorageNotifyEvent) iEvent).f78809d;
        this.f78809d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
