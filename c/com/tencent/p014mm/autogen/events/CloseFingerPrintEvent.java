package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CloseFingerPrintEvent */
public final class CloseFingerPrintEvent extends IEvent {

    /* renamed from: d */
    public C28724a f78759d = new C28724a();

    /* renamed from: e */
    public C28725b f78760e = new C28725b();

    /* renamed from: com.tencent.mm.autogen.events.CloseFingerPrintEvent$a */
    public static final class C28724a {

        /* renamed from: a */
        public int f78761a = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.CloseFingerPrintEvent$b */
    public static final class C28725b {

        /* renamed from: a */
        public int f78762a = 0;
    }

    public CloseFingerPrintEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CloseFingerPrintEvent)) {
            return false;
        }
        CloseFingerPrintEvent closeFingerPrintEvent = (CloseFingerPrintEvent) iEvent;
        if (!C46238a.m51546a(Integer.valueOf(this.f78759d.f78761a), Integer.valueOf(closeFingerPrintEvent.f78759d.f78761a))) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78760e.f78762a), Integer.valueOf(closeFingerPrintEvent.f78760e.f78762a));
    }
}
