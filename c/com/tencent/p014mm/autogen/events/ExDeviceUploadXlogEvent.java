package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceUploadXlogEvent */
public final class ExDeviceUploadXlogEvent extends IEvent {

    /* renamed from: d */
    public C28736a f78782d = new C28736a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceUploadXlogEvent$a */
    public static final class C28736a {
    }

    public ExDeviceUploadXlogEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceUploadXlogEvent)) {
            return false;
        }
        C28736a aVar = ((ExDeviceUploadXlogEvent) iEvent).f78782d;
        this.f78782d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
