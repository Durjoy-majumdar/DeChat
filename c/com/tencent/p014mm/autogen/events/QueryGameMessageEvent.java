package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QueryGameMessageEvent */
public final class QueryGameMessageEvent extends IEvent {

    /* renamed from: d */
    public C40156a f107710d = new C40156a();

    /* renamed from: com.tencent.mm.autogen.events.QueryGameMessageEvent$a */
    public static final class C40156a {

        /* renamed from: a */
        public int f107711a = 0;

        /* renamed from: b */
        public String f107712b;

        /* renamed from: c */
        public String f107713c;

        /* renamed from: d */
        public String f107714d;

        /* renamed from: e */
        public int f107715e;

        /* renamed from: f */
        public int f107716f;

        /* renamed from: g */
        public boolean f107717g;

        /* renamed from: h */
        public int f107718h;

        /* renamed from: i */
        public long f107719i;

        /* renamed from: j */
        public String f107720j;

        /* renamed from: k */
        public String f107721k;

        /* renamed from: l */
        public boolean f107722l;

        /* renamed from: m */
        public int f107723m;

        /* renamed from: n */
        public int f107724n;

        /* renamed from: o */
        public long f107725o = 0;

        /* renamed from: p */
        public String f107726p;
    }

    public QueryGameMessageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QueryGameMessageEvent)) {
            return false;
        }
        C40156a aVar = ((QueryGameMessageEvent) iEvent).f107710d;
        return C46238a.m51546a(Integer.valueOf(this.f107710d.f107711a), Integer.valueOf(aVar.f107711a)) && C46238a.m51546a(this.f107710d.f107712b, aVar.f107712b) && C46238a.m51546a(this.f107710d.f107713c, aVar.f107713c) && C46238a.m51546a(this.f107710d.f107714d, aVar.f107714d) && C46238a.m51546a(Integer.valueOf(this.f107710d.f107715e), Integer.valueOf(aVar.f107715e)) && C46238a.m51546a(Integer.valueOf(this.f107710d.f107716f), Integer.valueOf(aVar.f107716f)) && C46238a.m51546a(Boolean.valueOf(this.f107710d.f107717g), Boolean.valueOf(aVar.f107717g)) && C46238a.m51546a(Integer.valueOf(this.f107710d.f107718h), Integer.valueOf(aVar.f107718h)) && C46238a.m51546a(Long.valueOf(this.f107710d.f107719i), Long.valueOf(aVar.f107719i)) && C46238a.m51546a(this.f107710d.f107720j, aVar.f107720j) && C46238a.m51546a(this.f107710d.f107721k, aVar.f107721k) && C46238a.m51546a(Boolean.valueOf(this.f107710d.f107722l), Boolean.valueOf(aVar.f107722l)) && C46238a.m51546a(Integer.valueOf(this.f107710d.f107723m), Integer.valueOf(aVar.f107723m)) && C46238a.m51546a(Integer.valueOf(this.f107710d.f107724n), Integer.valueOf(aVar.f107724n)) && C46238a.m51546a(Long.valueOf(this.f107710d.f107725o), Long.valueOf(aVar.f107725o)) && C46238a.m51546a(this.f107710d.f107726p, aVar.f107726p);
    }
}
