package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent */
public final class NotifyCanPullVoiceTransResEvent extends IEvent {

    /* renamed from: d */
    public C67736a f193749d = new C67736a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyCanPullVoiceTransResEvent$a */
    public static final class C67736a {

        /* renamed from: a */
        public int f193750a = 0;

        /* renamed from: b */
        public int f193751b = 0;
    }

    public NotifyCanPullVoiceTransResEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyCanPullVoiceTransResEvent)) {
            return false;
        }
        C67736a aVar = ((NotifyCanPullVoiceTransResEvent) iEvent).f193749d;
        return C46238a.m51546a(Integer.valueOf(this.f193749d.f193750a), Integer.valueOf(aVar.f193750a)) && C46238a.m51546a(Integer.valueOf(this.f193749d.f193751b), Integer.valueOf(aVar.f193751b));
    }
}
