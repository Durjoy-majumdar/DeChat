package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent */
public final class MMFinderUIScreenShotEvent extends IEvent {

    /* renamed from: d */
    public C55144a f154834d = new C55144a();

    /* renamed from: com.tencent.mm.autogen.events.MMFinderUIScreenShotEvent$a */
    public static final class C55144a {

        /* renamed from: a */
        public String f154835a;

        /* renamed from: b */
        public long f154836b;
    }

    public MMFinderUIScreenShotEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MMFinderUIScreenShotEvent)) {
            return false;
        }
        C55144a aVar = ((MMFinderUIScreenShotEvent) iEvent).f154834d;
        return C46238a.m51546a(this.f154834d.f154835a, aVar.f154835a) && C46238a.m51546a(Long.valueOf(this.f154834d.f154836b), Long.valueOf(aVar.f154836b));
    }
}
