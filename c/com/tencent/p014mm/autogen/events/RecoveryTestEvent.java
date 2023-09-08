package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RecoveryTestEvent */
public final class RecoveryTestEvent extends IEvent {

    /* renamed from: d */
    public C80735a f236265d = new C80735a();

    /* renamed from: com.tencent.mm.autogen.events.RecoveryTestEvent$a */
    public static final class C80735a {

        /* renamed from: a */
        public int f236266a;
    }

    public RecoveryTestEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecoveryTestEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f236265d.f236266a), Integer.valueOf(((RecoveryTestEvent) iEvent).f236265d.f236266a));
    }
}
