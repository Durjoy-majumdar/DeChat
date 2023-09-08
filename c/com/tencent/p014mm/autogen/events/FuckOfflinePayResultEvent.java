package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FuckOfflinePayResultEvent */
public final class FuckOfflinePayResultEvent extends IEvent {

    /* renamed from: d */
    public C67703a f193628d = new C67703a();

    /* renamed from: com.tencent.mm.autogen.events.FuckOfflinePayResultEvent$a */
    public static final class C67703a {

        /* renamed from: a */
        public String f193629a;
    }

    public FuckOfflinePayResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FuckOfflinePayResultEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f193628d.f193629a, ((FuckOfflinePayResultEvent) iEvent).f193628d.f193629a)) {
            return false;
        }
        this.f193628d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
