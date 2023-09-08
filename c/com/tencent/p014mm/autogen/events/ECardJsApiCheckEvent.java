package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.autogen.events.ECardJsApiCheckEvent */
public final class ECardJsApiCheckEvent extends IEvent {

    /* renamed from: d */
    public C1003a f9049d = new C1003a();

    /* renamed from: e */
    public C1004b f9050e = new C1004b();

    /* renamed from: com.tencent.mm.autogen.events.ECardJsApiCheckEvent$a */
    public static final class C1003a {

        /* renamed from: a */
        public String f9051a;

        /* renamed from: b */
        public String f9052b;

        /* renamed from: c */
        public String f9053c;

        /* renamed from: d */
        public String f9054d;

        /* renamed from: e */
        public String f9055e;

        /* renamed from: f */
        public String f9056f;

        /* renamed from: g */
        public String f9057g;

        /* renamed from: h */
        public String f9058h;

        /* renamed from: i */
        public String f9059i;

        /* renamed from: j */
        public WeakReference f9060j;

        /* renamed from: k */
        public String f9061k;

        /* renamed from: l */
        public Runnable f9062l;

        /* renamed from: m */
        public int f9063m = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.ECardJsApiCheckEvent$b */
    public static final class C1004b {

        /* renamed from: a */
        public int f9064a = 0;
    }

    public ECardJsApiCheckEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ECardJsApiCheckEvent)) {
            return false;
        }
        ECardJsApiCheckEvent eCardJsApiCheckEvent = (ECardJsApiCheckEvent) iEvent;
        C1003a aVar = eCardJsApiCheckEvent.f9049d;
        if (!C46238a.m51546a(this.f9049d.f9051a, aVar.f9051a) || !C46238a.m51546a(this.f9049d.f9052b, aVar.f9052b) || !C46238a.m51546a(this.f9049d.f9053c, aVar.f9053c) || !C46238a.m51546a(this.f9049d.f9054d, aVar.f9054d) || !C46238a.m51546a(this.f9049d.f9055e, aVar.f9055e) || !C46238a.m51546a(this.f9049d.f9056f, aVar.f9056f) || !C46238a.m51546a(this.f9049d.f9057g, aVar.f9057g) || !C46238a.m51546a(this.f9049d.f9058h, aVar.f9058h) || !C46238a.m51546a(this.f9049d.f9059i, aVar.f9059i) || !C46238a.m51546a(this.f9049d.f9060j, aVar.f9060j) || !C46238a.m51546a(this.f9049d.f9061k, aVar.f9061k) || !C46238a.m51546a(this.f9049d.f9062l, aVar.f9062l) || !C46238a.m51546a(Integer.valueOf(this.f9049d.f9063m), Integer.valueOf(aVar.f9063m))) {
            return false;
        }
        if (!C46238a.m51546a(Integer.valueOf(this.f9050e.f9064a), Integer.valueOf(eCardJsApiCheckEvent.f9050e.f9064a))) {
            return false;
        }
        this.f9050e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
