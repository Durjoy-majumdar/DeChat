package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent */
public final class OpenFingerPrintAuthEvent extends IEvent {

    /* renamed from: d */
    public C67748a f193784d = new C67748a();

    /* renamed from: e */
    public C67749b f193785e = new C67749b();

    /* renamed from: com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent$a */
    public static final class C67748a {

        /* renamed from: a */
        public String f193786a;

        /* renamed from: b */
        public int f193787b = 0;

        /* renamed from: c */
        public Runnable f193788c;
    }

    /* renamed from: com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent$b */
    public static final class C67749b {

        /* renamed from: a */
        public int f193789a = -1;

        /* renamed from: b */
        public String f193790b;

        /* renamed from: c */
        public String f193791c;

        /* renamed from: d */
        public String f193792d;

        /* renamed from: e */
        public int f193793e = 0;

        /* renamed from: f */
        public String f193794f;

        /* renamed from: g */
        public int f193795g = 0;
    }

    public OpenFingerPrintAuthEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenFingerPrintAuthEvent)) {
            return false;
        }
        OpenFingerPrintAuthEvent openFingerPrintAuthEvent = (OpenFingerPrintAuthEvent) iEvent;
        C67748a aVar = openFingerPrintAuthEvent.f193784d;
        if (!C46238a.m51546a(this.f193784d.f193786a, aVar.f193786a) || !C46238a.m51546a(Integer.valueOf(this.f193784d.f193787b), Integer.valueOf(aVar.f193787b))) {
            return false;
        }
        this.f193784d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f193784d.f193788c, aVar.f193788c)) {
            return false;
        }
        C67749b bVar = openFingerPrintAuthEvent.f193785e;
        if (!C46238a.m51546a(Integer.valueOf(this.f193785e.f193789a), Integer.valueOf(bVar.f193789a)) || !C46238a.m51546a(this.f193785e.f193790b, bVar.f193790b) || !C46238a.m51546a(this.f193785e.f193791c, bVar.f193791c) || !C46238a.m51546a(this.f193785e.f193792d, bVar.f193792d)) {
            return false;
        }
        this.f193785e.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Integer.valueOf(this.f193785e.f193793e), Integer.valueOf(bVar.f193793e)) && C46238a.m51546a(this.f193785e.f193794f, bVar.f193794f) && C46238a.m51546a(Integer.valueOf(this.f193785e.f193795g), Integer.valueOf(bVar.f193795g));
    }
}
