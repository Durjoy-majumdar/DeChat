package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent */
public final class DoOfflineShowCodeEventEvent extends IEvent {

    /* renamed from: d */
    public C67677a f193545d = new C67677a();

    /* renamed from: com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent$a */
    public static final class C67677a {

        /* renamed from: a */
        public int f193546a = 0;
    }

    public DoOfflineShowCodeEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DoOfflineShowCodeEventEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193545d.f193546a), Integer.valueOf(((DoOfflineShowCodeEventEvent) iEvent).f193545d.f193546a));
    }
}
