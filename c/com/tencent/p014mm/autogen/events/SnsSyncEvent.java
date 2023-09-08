package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsSyncEvent */
public final class SnsSyncEvent extends IEvent {

    /* renamed from: d */
    public C28831a f79001d = new C28831a();

    /* renamed from: com.tencent.mm.autogen.events.SnsSyncEvent$a */
    public static final class C28831a {

        /* renamed from: a */
        public int f79002a = 0;
    }

    public SnsSyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsSyncEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f79001d.f79002a), Integer.valueOf(((SnsSyncEvent) iEvent).f79001d.f79002a));
    }
}
