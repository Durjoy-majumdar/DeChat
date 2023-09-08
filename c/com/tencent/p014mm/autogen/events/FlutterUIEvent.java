package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FlutterUIEvent */
public final class FlutterUIEvent extends IEvent {

    /* renamed from: d */
    public C55138a f154819d = new C55138a();

    /* renamed from: com.tencent.mm.autogen.events.FlutterUIEvent$a */
    public static final class C55138a {
    }

    public FlutterUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FlutterUIEvent)) {
            return false;
        }
        C55138a aVar = ((FlutterUIEvent) iEvent).f154819d;
        this.f154819d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
