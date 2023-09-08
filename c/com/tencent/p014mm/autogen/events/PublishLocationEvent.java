package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PublishLocationEvent */
public final class PublishLocationEvent extends IEvent {

    /* renamed from: d */
    public C67758a f193834d = new C67758a();

    /* renamed from: e */
    public C67759b f193835e = new C67759b();

    /* renamed from: com.tencent.mm.autogen.events.PublishLocationEvent$a */
    public static final class C67758a {

        /* renamed from: a */
        public int f193836a = 0;

        /* renamed from: b */
        public double f193837b = -1.0d;

        /* renamed from: c */
        public double f193838c = -1.0d;

        /* renamed from: d */
        public int f193839d = 10;

        /* renamed from: e */
        public String f193840e;

        /* renamed from: f */
        public String f193841f;

        /* renamed from: g */
        public String f193842g;

        /* renamed from: h */
        public String f193843h;
    }

    /* renamed from: com.tencent.mm.autogen.events.PublishLocationEvent$b */
    public static final class C67759b {
    }

    public PublishLocationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PublishLocationEvent)) {
            return false;
        }
        PublishLocationEvent publishLocationEvent = (PublishLocationEvent) iEvent;
        C67758a aVar = publishLocationEvent.f193834d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193834d.f193836a), Integer.valueOf(aVar.f193836a)) || !C46238a.m51546a(Double.valueOf(this.f193834d.f193837b), Double.valueOf(aVar.f193837b)) || !C46238a.m51546a(Double.valueOf(this.f193834d.f193838c), Double.valueOf(aVar.f193838c)) || !C46238a.m51546a(Integer.valueOf(this.f193834d.f193839d), Integer.valueOf(aVar.f193839d)) || !C46238a.m51546a(this.f193834d.f193840e, aVar.f193840e) || !C46238a.m51546a(this.f193834d.f193841f, aVar.f193841f) || !C46238a.m51546a(this.f193834d.f193842g, aVar.f193842g) || !C46238a.m51546a(this.f193834d.f193843h, aVar.f193843h)) {
            return false;
        }
        C67759b bVar = publishLocationEvent.f193835e;
        this.f193835e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
