package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ActivateEvent */
public final class ActivateEvent extends IEvent {

    /* renamed from: d */
    public C28700a f78706d = new C28700a();

    /* renamed from: com.tencent.mm.autogen.events.ActivateEvent$a */
    public static final class C28700a {

        /* renamed from: a */
        public boolean f78707a;
    }

    public ActivateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ActivateEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78706d.f78707a), Boolean.valueOf(((ActivateEvent) iEvent).f78706d.f78707a));
    }
}
