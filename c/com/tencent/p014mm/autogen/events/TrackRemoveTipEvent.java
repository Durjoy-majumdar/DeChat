package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TrackRemoveTipEvent */
public final class TrackRemoveTipEvent extends IEvent {

    /* renamed from: d */
    public C67799a f193959d = new C67799a();

    /* renamed from: com.tencent.mm.autogen.events.TrackRemoveTipEvent$a */
    public static final class C67799a {

        /* renamed from: a */
        public String f193960a;
    }

    public TrackRemoveTipEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TrackRemoveTipEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193959d.f193960a, ((TrackRemoveTipEvent) iEvent).f193959d.f193960a);
    }
}
