package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpenCanvasEvent */
public final class OpenCanvasEvent extends IEvent {

    /* renamed from: d */
    public C1103a f9369d = new C1103a();

    /* renamed from: e */
    public C1104b f9370e = new C1104b();

    /* renamed from: com.tencent.mm.autogen.events.OpenCanvasEvent$a */
    public static final class C1103a {

        /* renamed from: a */
        public String f9371a;

        /* renamed from: b */
        public String f9372b;

        /* renamed from: c */
        public int f9373c;

        /* renamed from: d */
        public int f9374d;

        /* renamed from: e */
        public int f9375e;

        /* renamed from: f */
        public int f9376f;

        /* renamed from: g */
        public String f9377g;

        /* renamed from: h */
        public String f9378h;

        /* renamed from: i */
        public int f9379i;
    }

    /* renamed from: com.tencent.mm.autogen.events.OpenCanvasEvent$b */
    public static final class C1104b {

        /* renamed from: a */
        public String f9380a;
    }

    public OpenCanvasEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpenCanvasEvent)) {
            return false;
        }
        OpenCanvasEvent openCanvasEvent = (OpenCanvasEvent) iEvent;
        C1103a aVar = openCanvasEvent.f9369d;
        if (!C46238a.m51546a(this.f9369d.f9371a, aVar.f9371a) || !C46238a.m51546a(this.f9369d.f9372b, aVar.f9372b) || !C46238a.m51546a(Integer.valueOf(this.f9369d.f9373c), Integer.valueOf(aVar.f9373c)) || !C46238a.m51546a(Integer.valueOf(this.f9369d.f9374d), Integer.valueOf(aVar.f9374d)) || !C46238a.m51546a(Integer.valueOf(this.f9369d.f9375e), Integer.valueOf(aVar.f9375e)) || !C46238a.m51546a(Integer.valueOf(this.f9369d.f9376f), Integer.valueOf(aVar.f9376f)) || !C46238a.m51546a(this.f9369d.f9377g, aVar.f9377g) || !C46238a.m51546a(this.f9369d.f9378h, aVar.f9378h) || !C46238a.m51546a(Integer.valueOf(this.f9369d.f9379i), Integer.valueOf(aVar.f9379i))) {
            return false;
        }
        return C46238a.m51546a(this.f9370e.f9380a, openCanvasEvent.f9370e.f9380a);
    }
}
