package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MediaInfoRptEvent */
public final class MediaInfoRptEvent extends IEvent {

    /* renamed from: d */
    public C92530a f264906d = new C92530a();

    /* renamed from: com.tencent.mm.autogen.events.MediaInfoRptEvent$a */
    public static final class C92530a {

        /* renamed from: a */
        public String f264907a;

        /* renamed from: b */
        public String f264908b;

        /* renamed from: c */
        public int f264909c;

        /* renamed from: d */
        public String f264910d;

        /* renamed from: e */
        public int f264911e;

        /* renamed from: f */
        public long f264912f;

        /* renamed from: g */
        public long f264913g;

        /* renamed from: h */
        public String f264914h;

        /* renamed from: i */
        public String[] f264915i;

        /* renamed from: j */
        public String f264916j;

        /* renamed from: k */
        public int f264917k;

        /* renamed from: l */
        public int f264918l;

        /* renamed from: m */
        public String f264919m;
    }

    public MediaInfoRptEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MediaInfoRptEvent)) {
            return false;
        }
        C92530a aVar = ((MediaInfoRptEvent) iEvent).f264906d;
        if (!C46238a.m51546a(this.f264906d.f264907a, aVar.f264907a) || !C46238a.m51546a(this.f264906d.f264908b, aVar.f264908b) || !C46238a.m51546a(Integer.valueOf(this.f264906d.f264909c), Integer.valueOf(aVar.f264909c)) || !C46238a.m51546a(this.f264906d.f264910d, aVar.f264910d) || !C46238a.m51546a(Integer.valueOf(this.f264906d.f264911e), Integer.valueOf(aVar.f264911e))) {
            return false;
        }
        this.f264906d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool) && C46238a.m51546a(Long.valueOf(this.f264906d.f264912f), Long.valueOf(aVar.f264912f)) && C46238a.m51546a(Long.valueOf(this.f264906d.f264913g), Long.valueOf(aVar.f264913g)) && C46238a.m51546a(this.f264906d.f264914h, aVar.f264914h) && C46238a.m51546a(this.f264906d.f264915i, aVar.f264915i) && C46238a.m51546a(this.f264906d.f264916j, aVar.f264916j) && C46238a.m51546a(Integer.valueOf(this.f264906d.f264917k), Integer.valueOf(aVar.f264917k)) && C46238a.m51546a(Integer.valueOf(this.f264906d.f264918l), Integer.valueOf(aVar.f264918l)) && C46238a.m51546a(this.f264906d.f264919m, aVar.f264919m);
    }
}
