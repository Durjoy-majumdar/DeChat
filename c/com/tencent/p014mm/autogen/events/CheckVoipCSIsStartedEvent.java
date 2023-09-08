package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckVoipCSIsStartedEvent */
public final class CheckVoipCSIsStartedEvent extends IEvent {

    /* renamed from: d */
    public C80708a f236161d = new C80708a();

    /* renamed from: com.tencent.mm.autogen.events.CheckVoipCSIsStartedEvent$a */
    public static final class C80708a {

        /* renamed from: a */
        public boolean f236162a = false;
    }

    public CheckVoipCSIsStartedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckVoipCSIsStartedEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f236161d.f236162a), Boolean.valueOf(((CheckVoipCSIsStartedEvent) iEvent).f236161d.f236162a));
    }
}
