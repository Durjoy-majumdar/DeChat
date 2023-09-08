package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetEntranceStateEvent */
public final class GetEntranceStateEvent extends IEvent {

    /* renamed from: d */
    public C40121a f107593d = new C40121a();

    /* renamed from: com.tencent.mm.autogen.events.GetEntranceStateEvent$a */
    public static final class C40121a {

        /* renamed from: a */
        public boolean f107594a = false;
    }

    public GetEntranceStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetEntranceStateEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107593d.f107594a), Boolean.valueOf(((GetEntranceStateEvent) iEvent).f107593d.f107594a));
    }
}
