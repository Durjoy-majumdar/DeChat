package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderSysNotificationEvent */
public final class FinderSysNotificationEvent extends IEvent {

    /* renamed from: d */
    public C40103a f107540d = new C40103a();

    /* renamed from: com.tencent.mm.autogen.events.FinderSysNotificationEvent$a */
    public static final class C40103a {

        /* renamed from: a */
        public String f107541a;

        /* renamed from: b */
        public long f107542b;
    }

    public FinderSysNotificationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSysNotificationEvent)) {
            return false;
        }
        C40103a aVar = ((FinderSysNotificationEvent) iEvent).f107540d;
        return C46238a.m51546a(this.f107540d.f107541a, aVar.f107541a) && C46238a.m51546a(Long.valueOf(this.f107540d.f107542b), Long.valueOf(aVar.f107542b));
    }
}
