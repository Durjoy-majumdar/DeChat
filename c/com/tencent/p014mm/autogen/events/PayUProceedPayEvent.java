package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PayUProceedPayEvent */
public final class PayUProceedPayEvent extends IEvent {

    /* renamed from: d */
    public C1107a f9386d = new C1107a();

    /* renamed from: com.tencent.mm.autogen.events.PayUProceedPayEvent$a */
    public static final class C1107a {

        /* renamed from: a */
        public String f9387a;

        /* renamed from: b */
        public String f9388b;

        /* renamed from: c */
        public String f9389c;

        /* renamed from: d */
        public String f9390d;

        /* renamed from: e */
        public String f9391e;

        /* renamed from: f */
        public String f9392f;

        /* renamed from: g */
        public String f9393g;

        /* renamed from: h */
        public String f9394h;

        /* renamed from: i */
        public String f9395i;

        /* renamed from: j */
        public int f9396j;

        /* renamed from: k */
        public int f9397k;

        /* renamed from: l */
        public int f9398l;
    }

    public PayUProceedPayEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PayUProceedPayEvent)) {
            return false;
        }
        C1107a aVar = ((PayUProceedPayEvent) iEvent).f9386d;
        return C46238a.m51546a(this.f9386d.f9387a, aVar.f9387a) && C46238a.m51546a(this.f9386d.f9388b, aVar.f9388b) && C46238a.m51546a(this.f9386d.f9389c, aVar.f9389c) && C46238a.m51546a(this.f9386d.f9390d, aVar.f9390d) && C46238a.m51546a(this.f9386d.f9391e, aVar.f9391e) && C46238a.m51546a(this.f9386d.f9392f, aVar.f9392f) && C46238a.m51546a(this.f9386d.f9393g, aVar.f9393g) && C46238a.m51546a(this.f9386d.f9394h, aVar.f9394h) && C46238a.m51546a(this.f9386d.f9395i, aVar.f9395i) && C46238a.m51546a(Integer.valueOf(this.f9386d.f9396j), Integer.valueOf(aVar.f9396j)) && C46238a.m51546a(Integer.valueOf(this.f9386d.f9397k), Integer.valueOf(aVar.f9397k)) && C46238a.m51546a(Integer.valueOf(this.f9386d.f9398l), Integer.valueOf(aVar.f9398l));
    }
}
