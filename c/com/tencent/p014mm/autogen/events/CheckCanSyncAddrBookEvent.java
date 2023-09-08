package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent */
public final class CheckCanSyncAddrBookEvent extends IEvent {

    /* renamed from: d */
    public C0999a f9042d = new C0999a();

    /* renamed from: com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent$a */
    public static final class C0999a {

        /* renamed from: a */
        public boolean f9043a = false;
    }

    public CheckCanSyncAddrBookEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckCanSyncAddrBookEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9042d.f9043a), Boolean.valueOf(((CheckCanSyncAddrBookEvent) iEvent).f9042d.f9043a));
    }
}
