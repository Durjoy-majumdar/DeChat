package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanDarkDetectEvent */
public final class ScanDarkDetectEvent extends IEvent {

    /* renamed from: d */
    public C17688a f48120d = new C17688a();

    /* renamed from: com.tencent.mm.autogen.events.ScanDarkDetectEvent$a */
    public static final class C17688a {

        /* renamed from: a */
        public boolean f48121a;
    }

    public ScanDarkDetectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanDarkDetectEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f48120d.f48121a), Boolean.valueOf(((ScanDarkDetectEvent) iEvent).f48120d.f48121a));
    }
}
