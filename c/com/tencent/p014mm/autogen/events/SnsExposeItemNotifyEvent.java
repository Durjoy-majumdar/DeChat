package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsExposeItemNotifyEvent */
public final class SnsExposeItemNotifyEvent extends IEvent {

    /* renamed from: d */
    public C55165a f154875d = new C55165a();

    /* renamed from: com.tencent.mm.autogen.events.SnsExposeItemNotifyEvent$a */
    public static final class C55165a {
    }

    public SnsExposeItemNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsExposeItemNotifyEvent)) {
            return false;
        }
        C55165a aVar = ((SnsExposeItemNotifyEvent) iEvent).f154875d;
        this.f154875d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154875d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
