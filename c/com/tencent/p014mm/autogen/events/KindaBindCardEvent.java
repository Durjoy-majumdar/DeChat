package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KindaBindCardEvent */
public final class KindaBindCardEvent extends IEvent {

    /* renamed from: d */
    public C67721a f193698d = new C67721a();

    /* renamed from: com.tencent.mm.autogen.events.KindaBindCardEvent$a */
    public static final class C67721a {

        /* renamed from: a */
        public boolean f193699a = false;

        /* renamed from: b */
        public boolean f193700b = false;

        /* renamed from: c */
        public String f193701c;

        /* renamed from: d */
        public String f193702d;

        /* renamed from: e */
        public String f193703e;

        /* renamed from: f */
        public String f193704f;

        /* renamed from: g */
        public String f193705g;

        /* renamed from: h */
        public String f193706h;

        /* renamed from: i */
        public String f193707i;

        /* renamed from: j */
        public String f193708j;
    }

    public KindaBindCardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KindaBindCardEvent)) {
            return false;
        }
        C67721a aVar = ((KindaBindCardEvent) iEvent).f193698d;
        return C46238a.m51546a(Boolean.valueOf(this.f193698d.f193699a), Boolean.valueOf(aVar.f193699a)) && C46238a.m51546a(Boolean.valueOf(this.f193698d.f193700b), Boolean.valueOf(aVar.f193700b)) && C46238a.m51546a(this.f193698d.f193701c, aVar.f193701c) && C46238a.m51546a(this.f193698d.f193702d, aVar.f193702d) && C46238a.m51546a(this.f193698d.f193703e, aVar.f193703e) && C46238a.m51546a(this.f193698d.f193704f, aVar.f193704f) && C46238a.m51546a(this.f193698d.f193705g, aVar.f193705g) && C46238a.m51546a(this.f193698d.f193706h, aVar.f193706h) && C46238a.m51546a(this.f193698d.f193707i, aVar.f193707i) && C46238a.m51546a(this.f193698d.f193708j, aVar.f193708j);
    }
}
