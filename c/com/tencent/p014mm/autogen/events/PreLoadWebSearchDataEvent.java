package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.Map;

/* renamed from: com.tencent.mm.autogen.events.PreLoadWebSearchDataEvent */
public final class PreLoadWebSearchDataEvent extends IEvent {

    /* renamed from: d */
    public C92545a f264991d = new C92545a();

    /* renamed from: com.tencent.mm.autogen.events.PreLoadWebSearchDataEvent$a */
    public static final class C92545a {

        /* renamed from: a */
        public String f264992a;

        /* renamed from: b */
        public String f264993b;

        /* renamed from: c */
        public String f264994c;

        /* renamed from: d */
        public int f264995d;

        /* renamed from: e */
        public String f264996e;

        /* renamed from: f */
        public String f264997f;

        /* renamed from: g */
        public String f264998g;

        /* renamed from: h */
        public int f264999h;

        /* renamed from: i */
        public int f265000i;

        /* renamed from: j */
        public String f265001j;

        /* renamed from: k */
        public Map<String, String> f265002k;
    }

    public PreLoadWebSearchDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PreLoadWebSearchDataEvent)) {
            return false;
        }
        C92545a aVar = ((PreLoadWebSearchDataEvent) iEvent).f264991d;
        return C46238a.m51546a(this.f264991d.f264992a, aVar.f264992a) && C46238a.m51546a(this.f264991d.f264993b, aVar.f264993b) && C46238a.m51546a(this.f264991d.f264994c, aVar.f264994c) && C46238a.m51546a(Integer.valueOf(this.f264991d.f264995d), Integer.valueOf(aVar.f264995d)) && C46238a.m51546a(this.f264991d.f264996e, aVar.f264996e) && C46238a.m51546a(this.f264991d.f264997f, aVar.f264997f) && C46238a.m51546a(this.f264991d.f264998g, aVar.f264998g) && C46238a.m51546a(Integer.valueOf(this.f264991d.f264999h), Integer.valueOf(aVar.f264999h)) && C46238a.m51546a(Integer.valueOf(this.f264991d.f265000i), Integer.valueOf(aVar.f265000i)) && C46238a.m51546a(this.f264991d.f265001j, aVar.f265001j) && C46238a.m51546a(this.f264991d.f265002k, aVar.f265002k);
    }
}
