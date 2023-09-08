package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnlineVideoEvent */
public final class OnlineVideoEvent extends IEvent {

    /* renamed from: d */
    public C92538a f264965d = new C92538a();

    /* renamed from: com.tencent.mm.autogen.events.OnlineVideoEvent$a */
    public static final class C92538a {

        /* renamed from: a */
        public int f264966a;

        /* renamed from: b */
        public int f264967b;

        /* renamed from: c */
        public String f264968c;

        /* renamed from: d */
        public int f264969d;

        /* renamed from: e */
        public int f264970e;

        /* renamed from: f */
        public long f264971f;

        /* renamed from: g */
        public boolean f264972g = false;

        /* renamed from: h */
        public String f264973h;

        /* renamed from: i */
        public int f264974i;

        /* renamed from: j */
        public int f264975j;

        /* renamed from: k */
        public String f264976k;

        /* renamed from: l */
        public String f264977l;
    }

    public OnlineVideoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnlineVideoEvent)) {
            return false;
        }
        C92538a aVar = ((OnlineVideoEvent) iEvent).f264965d;
        return C46238a.m51546a(Integer.valueOf(this.f264965d.f264966a), Integer.valueOf(aVar.f264966a)) && C46238a.m51546a(Integer.valueOf(this.f264965d.f264967b), Integer.valueOf(aVar.f264967b)) && C46238a.m51546a(this.f264965d.f264968c, aVar.f264968c) && C46238a.m51546a(Integer.valueOf(this.f264965d.f264969d), Integer.valueOf(aVar.f264969d)) && C46238a.m51546a(Integer.valueOf(this.f264965d.f264970e), Integer.valueOf(aVar.f264970e)) && C46238a.m51546a(Long.valueOf(this.f264965d.f264971f), Long.valueOf(aVar.f264971f)) && C46238a.m51546a(Boolean.valueOf(this.f264965d.f264972g), Boolean.valueOf(aVar.f264972g)) && C46238a.m51546a(this.f264965d.f264973h, aVar.f264973h) && C46238a.m51546a(Integer.valueOf(this.f264965d.f264974i), Integer.valueOf(aVar.f264974i)) && C46238a.m51546a(Integer.valueOf(this.f264965d.f264975j), Integer.valueOf(aVar.f264975j)) && C46238a.m51546a(this.f264965d.f264976k, aVar.f264976k) && C46238a.m51546a(this.f264965d.f264977l, aVar.f264977l);
    }
}
