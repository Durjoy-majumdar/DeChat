package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LuckSightRecorderEvent */
public final class LuckSightRecorderEvent extends IEvent {

    /* renamed from: d */
    public C28775a f78865d = new C28775a();

    /* renamed from: com.tencent.mm.autogen.events.LuckSightRecorderEvent$a */
    public static final class C28775a {
    }

    public LuckSightRecorderEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LuckSightRecorderEvent)) {
            return false;
        }
        C28775a aVar = ((LuckSightRecorderEvent) iEvent).f78865d;
        this.f78865d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78865d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
