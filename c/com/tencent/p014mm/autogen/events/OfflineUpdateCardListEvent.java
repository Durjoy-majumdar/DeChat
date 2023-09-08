package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OfflineUpdateCardListEvent */
public final class OfflineUpdateCardListEvent extends IEvent {

    /* renamed from: d */
    public C28784a f78882d = new C28784a();

    /* renamed from: com.tencent.mm.autogen.events.OfflineUpdateCardListEvent$a */
    public static final class C28784a {

        /* renamed from: a */
        public int f78883a;

        /* renamed from: b */
        public String f78884b;
    }

    public OfflineUpdateCardListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OfflineUpdateCardListEvent)) {
            return false;
        }
        C28784a aVar = ((OfflineUpdateCardListEvent) iEvent).f78882d;
        return C46238a.m51546a(Integer.valueOf(this.f78882d.f78883a), Integer.valueOf(aVar.f78883a)) && C46238a.m51546a(this.f78882d.f78884b, aVar.f78884b);
    }
}
