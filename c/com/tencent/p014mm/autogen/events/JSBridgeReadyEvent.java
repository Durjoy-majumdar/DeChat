package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.JSBridgeReadyEvent */
public final class JSBridgeReadyEvent extends IEvent {

    /* renamed from: d */
    public C28765a f78842d = new C28765a();

    /* renamed from: com.tencent.mm.autogen.events.JSBridgeReadyEvent$a */
    public static final class C28765a {
    }

    public JSBridgeReadyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof JSBridgeReadyEvent)) {
            return false;
        }
        C28765a aVar = ((JSBridgeReadyEvent) iEvent).f78842d;
        this.f78842d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
