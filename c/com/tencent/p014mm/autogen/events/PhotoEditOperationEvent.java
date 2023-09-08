package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PhotoEditOperationEvent */
public final class PhotoEditOperationEvent extends IEvent {

    /* renamed from: d */
    public C55154a f154856d = new C55154a();

    /* renamed from: com.tencent.mm.autogen.events.PhotoEditOperationEvent$a */
    public static final class C55154a {
    }

    public PhotoEditOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PhotoEditOperationEvent)) {
            return false;
        }
        C55154a aVar = ((PhotoEditOperationEvent) iEvent).f154856d;
        this.f154856d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
