package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MediaLeakEvent */
public final class MediaLeakEvent extends IEvent {

    /* renamed from: d */
    public C104594a f310003d = new C104594a();

    /* renamed from: com.tencent.mm.autogen.events.MediaLeakEvent$a */
    public static final class C104594a {

        /* renamed from: a */
        public boolean f310004a = false;

        /* renamed from: b */
        public int f310005b;

        /* renamed from: c */
        public boolean f310006c = false;

        /* renamed from: d */
        public int f310007d;

        /* renamed from: e */
        public boolean f310008e = false;

        /* renamed from: f */
        public int f310009f;
    }

    public MediaLeakEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MediaLeakEvent)) {
            return false;
        }
        C104594a aVar = ((MediaLeakEvent) iEvent).f310003d;
        return C46238a.m51546a(Boolean.valueOf(this.f310003d.f310004a), Boolean.valueOf(aVar.f310004a)) && C46238a.m51546a(Integer.valueOf(this.f310003d.f310005b), Integer.valueOf(aVar.f310005b)) && C46238a.m51546a(Boolean.valueOf(this.f310003d.f310006c), Boolean.valueOf(aVar.f310006c)) && C46238a.m51546a(Integer.valueOf(this.f310003d.f310007d), Integer.valueOf(aVar.f310007d)) && C46238a.m51546a(Boolean.valueOf(this.f310003d.f310008e), Boolean.valueOf(aVar.f310008e)) && C46238a.m51546a(Integer.valueOf(this.f310003d.f310009f), Integer.valueOf(aVar.f310009f));
    }
}
