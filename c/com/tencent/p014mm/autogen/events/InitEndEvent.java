package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.InitEndEvent */
public final class InitEndEvent extends IEvent {

    /* renamed from: d */
    public C28764a f78840d = new C28764a();

    /* renamed from: com.tencent.mm.autogen.events.InitEndEvent$a */
    public static final class C28764a {

        /* renamed from: a */
        public boolean f78841a;
    }

    public InitEndEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof InitEndEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78840d.f78841a), Boolean.valueOf(((InitEndEvent) iEvent).f78840d.f78841a));
    }
}
