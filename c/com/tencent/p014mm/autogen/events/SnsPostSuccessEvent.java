package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsPostSuccessEvent */
public final class SnsPostSuccessEvent extends IEvent {

    /* renamed from: d */
    public C28830a f78999d = new C28830a();

    /* renamed from: com.tencent.mm.autogen.events.SnsPostSuccessEvent$a */
    public static final class C28830a {

        /* renamed from: a */
        public long f79000a = -1;
    }

    public SnsPostSuccessEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsPostSuccessEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f78999d.f79000a), Long.valueOf(((SnsPostSuccessEvent) iEvent).f78999d.f79000a));
    }
}
