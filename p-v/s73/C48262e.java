package s73;

import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;

/* renamed from: s73.e */
public final class C48262e {

    /* renamed from: a */
    public final long f129298a;

    /* renamed from: b */
    public final C48272j f129299b;

    /* renamed from: c */
    public final long f129300c = 1478;

    /* renamed from: s73.e$a */
    public static final class C48263a extends C48271i {
        public C48263a() {
            super(11);
        }
    }

    /* renamed from: s73.e$b */
    public static final class C48264b extends C48271i {
        public C48264b() {
            super(2);
        }
    }

    /* renamed from: s73.e$c */
    public static final class C48265c extends C48271i {
        public C48265c() {
            super(10);
        }
    }

    /* renamed from: s73.e$d */
    public static final class C48266d extends C48271i {
        public C48266d() {
            super(3);
        }
    }

    /* renamed from: s73.e$e */
    public static final class C48267e extends C48271i {
        public C48267e() {
            super(13);
        }
    }

    /* renamed from: s73.e$f */
    public static final class C48268f extends C48271i {
        public C48268f() {
            super(15);
        }
    }

    /* renamed from: s73.e$g */
    public static final class C48269g extends C48271i {
        public C48269g() {
            super(0);
        }
    }

    /* renamed from: s73.e$h */
    public static final class C48270h extends C48271i {
        public C48270h() {
            super(1);
        }
    }

    /* renamed from: s73.e$i */
    public static abstract class C48271i {

        /* renamed from: a */
        public final long f129301a;

        public C48271i(long j) {
            this.f129301a = j;
        }
    }

    /* renamed from: s73.e$j */
    public enum C48272j {
        Main,
        Engine,
        Client
    }

    public C48262e(long j, C48272j jVar) {
        C87412m.m108594g(jVar, "type");
        this.f129298a = j;
        this.f129299b = jVar;
    }

    /* renamed from: a */
    public final void mo73005a(C48271i iVar) {
        C87412m.m108594g(iVar, "item");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175912v(this.f129300c, iVar.f129301a);
        long j = this.f129298a;
        if (j > 0) {
            nVar.mo175912v(j, iVar.f129301a);
        }
    }
}
