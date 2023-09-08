package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScannerAutoFocusControlEvent */
public final class ScannerAutoFocusControlEvent extends IEvent {

    /* renamed from: d */
    public C1129a f9474d = new C1129a();

    /* renamed from: com.tencent.mm.autogen.events.ScannerAutoFocusControlEvent$a */
    public static final class C1129a {
    }

    public ScannerAutoFocusControlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScannerAutoFocusControlEvent)) {
            return false;
        }
        C1129a aVar = ((ScannerAutoFocusControlEvent) iEvent).f9474d;
        this.f9474d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
