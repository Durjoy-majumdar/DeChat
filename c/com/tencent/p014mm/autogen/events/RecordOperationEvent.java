package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;
import java.util.List;
import se3.C77685c;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C77915dp3;

/* renamed from: com.tencent.mm.autogen.events.RecordOperationEvent */
public final class RecordOperationEvent extends IEvent {

    /* renamed from: d */
    public C92551a f265027d = new C92551a();

    /* renamed from: e */
    public C92552b f265028e = new C92552b();

    /* renamed from: com.tencent.mm.autogen.events.RecordOperationEvent$a */
    public static final class C92551a {

        /* renamed from: a */
        public int f265029a = 0;

        /* renamed from: b */
        public String f265030b;

        /* renamed from: c */
        public C101834rc0 f265031c;

        /* renamed from: d */
        public long f265032d = 0;

        /* renamed from: e */
        public String f265033e;

        /* renamed from: f */
        public String f265034f;

        /* renamed from: g */
        public C101801kd0 f265035g;

        /* renamed from: h */
        public String f265036h;

        /* renamed from: i */
        public String f265037i;

        /* renamed from: j */
        public String f265038j;

        /* renamed from: k */
        public C72963f4 f265039k;

        /* renamed from: l */
        public List<C72963f4> f265040l;

        /* renamed from: m */
        public Context f265041m;

        /* renamed from: n */
        public String f265042n;

        /* renamed from: o */
        public String f265043o;

        /* renamed from: p */
        public DoFavoriteEvent f265044p;

        /* renamed from: q */
        public C77685c f265045q;

        /* renamed from: r */
        public boolean f265046r = false;

        /* renamed from: s */
        public String f265047s;
    }

    /* renamed from: com.tencent.mm.autogen.events.RecordOperationEvent$b */
    public static final class C92552b {

        /* renamed from: a */
        public C77915dp3 f265048a;

        /* renamed from: b */
        public String f265049b;

        /* renamed from: c */
        public String f265050c;

        /* renamed from: d */
        public boolean f265051d = false;

        /* renamed from: e */
        public boolean f265052e = false;

        /* renamed from: f */
        public DoFavoriteEvent f265053f;

        /* renamed from: g */
        public C77685c f265054g;

        /* renamed from: h */
        public long f265055h = 0;

        /* renamed from: i */
        public boolean f265056i = false;
    }

    public RecordOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecordOperationEvent)) {
            return false;
        }
        RecordOperationEvent recordOperationEvent = (RecordOperationEvent) iEvent;
        C92551a aVar = recordOperationEvent.f265027d;
        if (!C46238a.m51546a(Integer.valueOf(this.f265027d.f265029a), Integer.valueOf(aVar.f265029a)) || !C46238a.m51546a(this.f265027d.f265030b, aVar.f265030b) || !C46238a.m51546a(this.f265027d.f265031c, aVar.f265031c) || !C46238a.m51546a(Long.valueOf(this.f265027d.f265032d), Long.valueOf(aVar.f265032d)) || !C46238a.m51546a(this.f265027d.f265033e, aVar.f265033e) || !C46238a.m51546a(this.f265027d.f265034f, aVar.f265034f) || !C46238a.m51546a(this.f265027d.f265035g, aVar.f265035g) || !C46238a.m51546a(this.f265027d.f265036h, aVar.f265036h) || !C46238a.m51546a(this.f265027d.f265037i, aVar.f265037i) || !C46238a.m51546a(this.f265027d.f265038j, aVar.f265038j)) {
            return false;
        }
        this.f265027d.getClass();
        if (!C46238a.m51546a(0, 0) || !C46238a.m51546a(this.f265027d.f265039k, aVar.f265039k) || !C46238a.m51546a(this.f265027d.f265040l, aVar.f265040l) || !C46238a.m51546a(this.f265027d.f265041m, aVar.f265041m) || !C46238a.m51546a(this.f265027d.f265042n, aVar.f265042n) || !C46238a.m51546a(this.f265027d.f265043o, aVar.f265043o) || !C46238a.m51546a(this.f265027d.f265044p, aVar.f265044p) || !C46238a.m51546a(this.f265027d.f265045q, aVar.f265045q) || !C46238a.m51546a(Boolean.valueOf(this.f265027d.f265046r), Boolean.valueOf(aVar.f265046r)) || !C46238a.m51546a(this.f265027d.f265047s, aVar.f265047s)) {
            return false;
        }
        C92552b bVar = recordOperationEvent.f265028e;
        return C46238a.m51546a(this.f265028e.f265048a, bVar.f265048a) && C46238a.m51546a(this.f265028e.f265049b, bVar.f265049b) && C46238a.m51546a(this.f265028e.f265050c, bVar.f265050c) && C46238a.m51546a(Boolean.valueOf(this.f265028e.f265051d), Boolean.valueOf(bVar.f265051d)) && C46238a.m51546a(Boolean.valueOf(this.f265028e.f265052e), Boolean.valueOf(bVar.f265052e)) && C46238a.m51546a(this.f265028e.f265053f, bVar.f265053f) && C46238a.m51546a(this.f265028e.f265054g, bVar.f265054g) && C46238a.m51546a(Long.valueOf(this.f265028e.f265055h), Long.valueOf(bVar.f265055h)) && C46238a.m51546a(Boolean.valueOf(this.f265028e.f265056i), Boolean.valueOf(bVar.f265056i));
    }
}
