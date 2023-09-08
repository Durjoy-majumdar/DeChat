package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RecordStateChangeEvent */
public final class RecordStateChangeEvent extends IEvent {

    /* renamed from: d */
    public C67772a f193878d = new C67772a();

    /* renamed from: com.tencent.mm.autogen.events.RecordStateChangeEvent$a */
    public static final class C67772a {

        /* renamed from: a */
        public int f193879a = 0;
    }

    public RecordStateChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecordStateChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193878d.f193879a), Integer.valueOf(((RecordStateChangeEvent) iEvent).f193878d.f193879a));
    }
}
