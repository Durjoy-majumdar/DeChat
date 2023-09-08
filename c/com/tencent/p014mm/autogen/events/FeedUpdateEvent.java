package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedUpdateEvent */
public final class FeedUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1041a f9173d = new C1041a();

    /* renamed from: com.tencent.mm.autogen.events.FeedUpdateEvent$a */
    public static final class C1041a {

        /* renamed from: a */
        public long f9174a;

        /* renamed from: b */
        public int f9175b;

        /* renamed from: c */
        public int f9176c;

        /* renamed from: d */
        public int f9177d;

        /* renamed from: e */
        public int f9178e;

        /* renamed from: f */
        public int f9179f;

        /* renamed from: g */
        public int f9180g;

        /* renamed from: h */
        public String f9181h;

        /* renamed from: i */
        public int f9182i;

        /* renamed from: j */
        public int f9183j;

        /* renamed from: k */
        public long f9184k;

        /* renamed from: l */
        public int f9185l;

        /* renamed from: m */
        public String f9186m;
    }

    public FeedUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedUpdateEvent)) {
            return false;
        }
        C1041a aVar = ((FeedUpdateEvent) iEvent).f9173d;
        if (!C46238a.m51546a(Long.valueOf(this.f9173d.f9174a), Long.valueOf(aVar.f9174a)) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9175b), Integer.valueOf(aVar.f9175b)) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9176c), Integer.valueOf(aVar.f9176c)) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9177d), Integer.valueOf(aVar.f9177d)) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9178e), Integer.valueOf(aVar.f9178e)) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9179f), Integer.valueOf(aVar.f9179f)) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9180g), Integer.valueOf(aVar.f9180g))) {
            return false;
        }
        this.f9173d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9173d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f9173d.f9181h, aVar.f9181h) || !C46238a.m51546a(Integer.valueOf(this.f9173d.f9182i), Integer.valueOf(aVar.f9182i))) {
            return false;
        }
        this.f9173d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9173d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f9173d.f9183j), Integer.valueOf(aVar.f9183j)) && C46238a.m51546a(Long.valueOf(this.f9173d.f9184k), Long.valueOf(aVar.f9184k)) && C46238a.m51546a(Integer.valueOf(this.f9173d.f9185l), Integer.valueOf(aVar.f9185l)) && C46238a.m51546a(this.f9173d.f9186m, aVar.f9186m);
    }
}
