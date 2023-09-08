package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RequestStartFaceManageEvent */
public final class RequestStartFaceManageEvent extends IEvent {

    /* renamed from: d */
    public C67779a f193913d = new C67779a();

    /* renamed from: e */
    public C67780b f193914e = new C67780b();

    /* renamed from: com.tencent.mm.autogen.events.RequestStartFaceManageEvent$a */
    public static final class C67779a {

        /* renamed from: a */
        public Context f193915a;
    }

    /* renamed from: com.tencent.mm.autogen.events.RequestStartFaceManageEvent$b */
    public static final class C67780b {

        /* renamed from: a */
        public boolean f193916a;
    }

    public RequestStartFaceManageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RequestStartFaceManageEvent)) {
            return false;
        }
        RequestStartFaceManageEvent requestStartFaceManageEvent = (RequestStartFaceManageEvent) iEvent;
        if (!C46238a.m51546a(this.f193913d.f193915a, requestStartFaceManageEvent.f193913d.f193915a)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193914e.f193916a), Boolean.valueOf(requestStartFaceManageEvent.f193914e.f193916a));
    }
}
