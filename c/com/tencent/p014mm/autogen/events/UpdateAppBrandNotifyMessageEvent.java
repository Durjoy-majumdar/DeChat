package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent */
public final class UpdateAppBrandNotifyMessageEvent extends IEvent {

    /* renamed from: d */
    public C67804a f193976d = new C67804a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent$a */
    public static final class C67804a {

        /* renamed from: a */
        public String f193977a;

        /* renamed from: b */
        public boolean f193978b;
    }

    public UpdateAppBrandNotifyMessageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateAppBrandNotifyMessageEvent)) {
            return false;
        }
        C67804a aVar = ((UpdateAppBrandNotifyMessageEvent) iEvent).f193976d;
        return C46238a.m51546a(this.f193976d.f193977a, aVar.f193977a) && C46238a.m51546a(Boolean.valueOf(this.f193976d.f193978b), Boolean.valueOf(aVar.f193978b));
    }
}
