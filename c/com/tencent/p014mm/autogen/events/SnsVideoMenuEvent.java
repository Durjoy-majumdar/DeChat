package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsVideoMenuEvent */
public final class SnsVideoMenuEvent extends IEvent {

    /* renamed from: d */
    public C92599a f265214d = new C92599a();

    /* renamed from: com.tencent.mm.autogen.events.SnsVideoMenuEvent$a */
    public static final class C92599a {

        /* renamed from: a */
        public int f265215a;

        /* renamed from: b */
        public int f265216b;

        /* renamed from: c */
        public boolean f265217c;

        /* renamed from: d */
        public String f265218d;

        /* renamed from: e */
        public int f265219e;
    }

    public SnsVideoMenuEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsVideoMenuEvent)) {
            return false;
        }
        C92599a aVar = ((SnsVideoMenuEvent) iEvent).f265214d;
        return C46238a.m51546a(Integer.valueOf(this.f265214d.f265215a), Integer.valueOf(aVar.f265215a)) && C46238a.m51546a(Integer.valueOf(this.f265214d.f265216b), Integer.valueOf(aVar.f265216b)) && C46238a.m51546a(Boolean.valueOf(this.f265214d.f265217c), Boolean.valueOf(aVar.f265217c)) && C46238a.m51546a(this.f265214d.f265218d, aVar.f265218d) && C46238a.m51546a(Integer.valueOf(this.f265214d.f265219e), Integer.valueOf(aVar.f265219e));
    }
}
