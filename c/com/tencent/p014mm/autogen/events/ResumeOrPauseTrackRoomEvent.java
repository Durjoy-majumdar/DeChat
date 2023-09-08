package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent */
public final class ResumeOrPauseTrackRoomEvent extends IEvent {

    /* renamed from: d */
    public C28808a f78939d = new C28808a();

    /* renamed from: com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent$a */
    public static final class C28808a {

        /* renamed from: a */
        public boolean f78940a;
    }

    public ResumeOrPauseTrackRoomEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResumeOrPauseTrackRoomEvent)) {
            return false;
        }
        C28808a aVar = ((ResumeOrPauseTrackRoomEvent) iEvent).f78939d;
        this.f78939d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Boolean.valueOf(this.f78939d.f78940a), Boolean.valueOf(aVar.f78940a));
    }
}
