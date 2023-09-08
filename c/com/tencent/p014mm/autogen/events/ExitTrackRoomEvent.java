package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExitTrackRoomEvent */
public final class ExitTrackRoomEvent extends IEvent {

    /* renamed from: d */
    public C67681a f193553d = new C67681a();

    /* renamed from: com.tencent.mm.autogen.events.ExitTrackRoomEvent$a */
    public static final class C67681a {

        /* renamed from: a */
        public String f193554a;
    }

    public ExitTrackRoomEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExitTrackRoomEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193553d.f193554a, ((ExitTrackRoomEvent) iEvent).f193553d.f193554a);
    }
}
