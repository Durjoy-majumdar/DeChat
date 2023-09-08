package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent */
public final class RequestFaceVerifyForPayEvent extends IEvent {

    /* renamed from: d */
    public C1117a f9431d = new C1117a();

    /* renamed from: e */
    public C1118b f9432e = new C1118b();

    /* renamed from: com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent$a */
    public static final class C1117a {

        /* renamed from: a */
        public int f9433a;

        /* renamed from: b */
        public String f9434b;

        /* renamed from: c */
        public String f9435c;

        /* renamed from: d */
        public String f9436d;

        /* renamed from: e */
        public String f9437e;

        /* renamed from: f */
        public String f9438f;

        /* renamed from: g */
        public String f9439g;

        /* renamed from: h */
        public int f9440h;

        /* renamed from: i */
        public Activity f9441i;
    }

    /* renamed from: com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent$b */
    public static final class C1118b {

        /* renamed from: a */
        public boolean f9442a;

        /* renamed from: b */
        public Bundle f9443b;
    }

    public RequestFaceVerifyForPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RequestFaceVerifyForPayEvent)) {
            return false;
        }
        RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = (RequestFaceVerifyForPayEvent) iEvent;
        C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
        if (!C46238a.m51546a(Integer.valueOf(this.f9431d.f9433a), Integer.valueOf(aVar.f9433a)) || !C46238a.m51546a(this.f9431d.f9434b, aVar.f9434b) || !C46238a.m51546a(this.f9431d.f9435c, aVar.f9435c) || !C46238a.m51546a(this.f9431d.f9436d, aVar.f9436d) || !C46238a.m51546a(this.f9431d.f9437e, aVar.f9437e) || !C46238a.m51546a(this.f9431d.f9438f, aVar.f9438f) || !C46238a.m51546a(this.f9431d.f9439g, aVar.f9439g) || !C46238a.m51546a(Integer.valueOf(this.f9431d.f9440h), Integer.valueOf(aVar.f9440h)) || !C46238a.m51546a(this.f9431d.f9441i, aVar.f9441i)) {
            return false;
        }
        C1118b bVar = requestFaceVerifyForPayEvent.f9432e;
        return C46238a.m51546a(Boolean.valueOf(this.f9432e.f9442a), Boolean.valueOf(bVar.f9442a)) && C46238a.m51546a(this.f9432e.f9443b, bVar.f9443b);
    }
}
