package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64576nb3;

/* renamed from: com.tencent.mm.autogen.events.UpdateGestureProtectInfoEvent */
public final class UpdateGestureProtectInfoEvent extends IEvent {

    /* renamed from: d */
    public C67807a f193985d = new C67807a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateGestureProtectInfoEvent$a */
    public static final class C67807a {

        /* renamed from: a */
        public C64576nb3 f193986a;
    }

    public UpdateGestureProtectInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateGestureProtectInfoEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193985d.f193986a, ((UpdateGestureProtectInfoEvent) iEvent).f193985d.f193986a);
    }
}
