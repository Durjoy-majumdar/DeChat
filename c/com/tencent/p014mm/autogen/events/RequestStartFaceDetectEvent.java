package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RequestStartFaceDetectEvent */
public final class RequestStartFaceDetectEvent extends IEvent {

    /* renamed from: d */
    public C1121a f9451d = new C1121a();

    /* renamed from: e */
    public C1122b f9452e = new C1122b();

    /* renamed from: com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$a */
    public static final class C1121a {

        /* renamed from: a */
        public Context f9453a;

        /* renamed from: b */
        public Bundle f9454b;

        /* renamed from: c */
        public int f9455c;
    }

    /* renamed from: com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$b */
    public static final class C1122b {

        /* renamed from: a */
        public boolean f9456a;

        /* renamed from: b */
        public Bundle f9457b;
    }

    public RequestStartFaceDetectEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RequestStartFaceDetectEvent)) {
            return false;
        }
        RequestStartFaceDetectEvent requestStartFaceDetectEvent = (RequestStartFaceDetectEvent) iEvent;
        C1121a aVar = requestStartFaceDetectEvent.f9451d;
        if (!C46238a.m51546a(this.f9451d.f9453a, aVar.f9453a) || !C46238a.m51546a(this.f9451d.f9454b, aVar.f9454b) || !C46238a.m51546a(Integer.valueOf(this.f9451d.f9455c), Integer.valueOf(aVar.f9455c))) {
            return false;
        }
        C1122b bVar = requestStartFaceDetectEvent.f9452e;
        return C46238a.m51546a(Boolean.valueOf(this.f9452e.f9456a), Boolean.valueOf(bVar.f9456a)) && C46238a.m51546a(this.f9452e.f9457b, bVar.f9457b);
    }
}
