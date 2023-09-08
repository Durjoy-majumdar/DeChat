package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartFaceScanEvent */
public final class StartFaceScanEvent extends IEvent {

    /* renamed from: d */
    public C1144a f9554d = new C1144a();

    /* renamed from: com.tencent.mm.autogen.events.StartFaceScanEvent$a */
    public static final class C1144a {
    }

    public StartFaceScanEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartFaceScanEvent)) {
            return false;
        }
        C1144a aVar = ((StartFaceScanEvent) iEvent).f9554d;
        this.f9554d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9554d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f9554d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9554d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9554d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
