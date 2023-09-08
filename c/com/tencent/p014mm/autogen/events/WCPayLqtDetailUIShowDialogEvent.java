package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C52159yr2;

/* renamed from: com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent */
public final class WCPayLqtDetailUIShowDialogEvent extends IEvent {

    /* renamed from: d */
    public C40180a f107803d = new C40180a();

    /* renamed from: com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent$a */
    public static final class C40180a {

        /* renamed from: a */
        public C52159yr2 f107804a;
    }

    public WCPayLqtDetailUIShowDialogEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WCPayLqtDetailUIShowDialogEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107803d.f107804a, ((WCPayLqtDetailUIShowDialogEvent) iEvent).f107803d.f107804a);
    }
}
