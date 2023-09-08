package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdEggCardEncoreEvent */
public final class SnsAdEggCardEncoreEvent extends IEvent {

    /* renamed from: d */
    public C92566a f265113d = new C92566a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdEggCardEncoreEvent$a */
    public static final class C92566a {

        /* renamed from: a */
        public int f265114a;
    }

    public SnsAdEggCardEncoreEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdEggCardEncoreEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f265113d.f265114a), Integer.valueOf(((SnsAdEggCardEncoreEvent) iEvent).f265113d.f265114a));
    }
}
