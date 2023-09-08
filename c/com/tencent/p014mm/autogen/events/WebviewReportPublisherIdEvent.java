package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent */
public final class WebviewReportPublisherIdEvent extends IEvent {

    /* renamed from: d */
    public C92611a f265259d = new C92611a();

    /* renamed from: com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a */
    public static final class C92611a {

        /* renamed from: a */
        public String f265260a;

        /* renamed from: b */
        public String f265261b;

        /* renamed from: c */
        public String f265262c;

        /* renamed from: d */
        public String f265263d;

        /* renamed from: e */
        public String f265264e;

        /* renamed from: f */
        public int f265265f;

        /* renamed from: g */
        public String f265266g;

        /* renamed from: h */
        public String f265267h;

        /* renamed from: i */
        public int f265268i;

        /* renamed from: j */
        public int f265269j;

        /* renamed from: k */
        public int f265270k;

        /* renamed from: l */
        public String f265271l;

        /* renamed from: m */
        public String f265272m;

        /* renamed from: n */
        public String f265273n;

        /* renamed from: o */
        public String f265274o;
    }

    public WebviewReportPublisherIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebviewReportPublisherIdEvent)) {
            return false;
        }
        C92611a aVar = ((WebviewReportPublisherIdEvent) iEvent).f265259d;
        if (!C46238a.m51546a(this.f265259d.f265260a, aVar.f265260a) || !C46238a.m51546a(this.f265259d.f265261b, aVar.f265261b) || !C46238a.m51546a(this.f265259d.f265262c, aVar.f265262c) || !C46238a.m51546a(this.f265259d.f265263d, aVar.f265263d) || !C46238a.m51546a(this.f265259d.f265264e, aVar.f265264e) || !C46238a.m51546a(Integer.valueOf(this.f265259d.f265265f), Integer.valueOf(aVar.f265265f)) || !C46238a.m51546a(this.f265259d.f265266g, aVar.f265266g) || !C46238a.m51546a(this.f265259d.f265267h, aVar.f265267h) || !C46238a.m51546a(Integer.valueOf(this.f265259d.f265268i), Integer.valueOf(aVar.f265268i)) || !C46238a.m51546a(Integer.valueOf(this.f265259d.f265269j), Integer.valueOf(aVar.f265269j)) || !C46238a.m51546a(Integer.valueOf(this.f265259d.f265270k), Integer.valueOf(aVar.f265270k)) || !C46238a.m51546a(this.f265259d.f265271l, aVar.f265271l) || !C46238a.m51546a(this.f265259d.f265272m, aVar.f265272m) || !C46238a.m51546a(this.f265259d.f265273n, aVar.f265273n)) {
            return false;
        }
        this.f265259d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(this.f265259d.f265274o, aVar.f265274o);
    }
}
