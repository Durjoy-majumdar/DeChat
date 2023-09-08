package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RollbackTencentNewsEvent */
public final class RollbackTencentNewsEvent extends IEvent {

    /* renamed from: d */
    public C67783a f193921d = new C67783a();

    /* renamed from: com.tencent.mm.autogen.events.RollbackTencentNewsEvent$a */
    public static final class C67783a {

        /* renamed from: a */
        public long f193922a;
    }

    public RollbackTencentNewsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RollbackTencentNewsEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f193921d.f193922a), Long.valueOf(((RollbackTencentNewsEvent) iEvent).f193921d.f193922a));
    }
}
