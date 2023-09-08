package com.tencent.p014mm.autogen.events;

import android.database.Cursor;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.ExtGetSnsDataEvent */
public final class ExtGetSnsDataEvent extends IEvent {

    /* renamed from: d */
    public C92494a f264756d = new C92494a();

    /* renamed from: e */
    public C92495b f264757e = new C92495b();

    /* renamed from: com.tencent.mm.autogen.events.ExtGetSnsDataEvent$a */
    public static final class C92494a {

        /* renamed from: a */
        public Cursor f264758a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b */
    public static final class C92495b {

        /* renamed from: a */
        public String f264759a;

        /* renamed from: b */
        public int f264760b;

        /* renamed from: c */
        public String f264761c;

        /* renamed from: d */
        public long f264762d;

        /* renamed from: e */
        public int f264763e;

        /* renamed from: f */
        public int f264764f;

        /* renamed from: g */
        public List f264765g;

        /* renamed from: h */
        public List f264766h;

        /* renamed from: i */
        public int f264767i;

        /* renamed from: j */
        public int f264768j;
    }

    public ExtGetSnsDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtGetSnsDataEvent)) {
            return false;
        }
        ExtGetSnsDataEvent extGetSnsDataEvent = (ExtGetSnsDataEvent) iEvent;
        if (!C46238a.m51546a(this.f264756d.f264758a, extGetSnsDataEvent.f264756d.f264758a)) {
            return false;
        }
        C92495b bVar = extGetSnsDataEvent.f264757e;
        return C46238a.m51546a(this.f264757e.f264759a, bVar.f264759a) && C46238a.m51546a(Integer.valueOf(this.f264757e.f264760b), Integer.valueOf(bVar.f264760b)) && C46238a.m51546a(this.f264757e.f264761c, bVar.f264761c) && C46238a.m51546a(Long.valueOf(this.f264757e.f264762d), Long.valueOf(bVar.f264762d)) && C46238a.m51546a(Integer.valueOf(this.f264757e.f264763e), Integer.valueOf(bVar.f264763e)) && C46238a.m51546a(Integer.valueOf(this.f264757e.f264764f), Integer.valueOf(bVar.f264764f)) && C46238a.m51546a(this.f264757e.f264765g, bVar.f264765g) && C46238a.m51546a(this.f264757e.f264766h, bVar.f264766h) && C46238a.m51546a(Integer.valueOf(this.f264757e.f264767i), Integer.valueOf(bVar.f264767i)) && C46238a.m51546a(Integer.valueOf(this.f264757e.f264768j), Integer.valueOf(bVar.f264768j));
    }
}
