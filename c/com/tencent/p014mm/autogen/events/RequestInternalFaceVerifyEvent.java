package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RequestInternalFaceVerifyEvent */
public final class RequestInternalFaceVerifyEvent extends IEvent {

    /* renamed from: d */
    public C1119a f9444d = new C1119a();

    /* renamed from: e */
    public C1120b f9445e = new C1120b();

    /* renamed from: com.tencent.mm.autogen.events.RequestInternalFaceVerifyEvent$a */
    public static final class C1119a {

        /* renamed from: a */
        public Context f9446a;

        /* renamed from: b */
        public Bundle f9447b;

        /* renamed from: c */
        public int f9448c;
    }

    /* renamed from: com.tencent.mm.autogen.events.RequestInternalFaceVerifyEvent$b */
    public static final class C1120b {

        /* renamed from: a */
        public boolean f9449a;

        /* renamed from: b */
        public Bundle f9450b;
    }

    public RequestInternalFaceVerifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RequestInternalFaceVerifyEvent)) {
            return false;
        }
        RequestInternalFaceVerifyEvent requestInternalFaceVerifyEvent = (RequestInternalFaceVerifyEvent) iEvent;
        C1119a aVar = requestInternalFaceVerifyEvent.f9444d;
        if (!C46238a.m51546a(this.f9444d.f9446a, aVar.f9446a) || !C46238a.m51546a(this.f9444d.f9447b, aVar.f9447b) || !C46238a.m51546a(Integer.valueOf(this.f9444d.f9448c), Integer.valueOf(aVar.f9448c))) {
            return false;
        }
        C1120b bVar = requestInternalFaceVerifyEvent.f9445e;
        return C46238a.m51546a(Boolean.valueOf(this.f9445e.f9449a), Boolean.valueOf(bVar.f9449a)) && C46238a.m51546a(this.f9445e.f9450b, bVar.f9450b);
    }
}
