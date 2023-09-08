package t11;

import gy3.C8480h;
import gy3.C87412m;
import u11.C111099b;
import wx3.C66206a;
import wx3.C66212f;

/* renamed from: t11.b */
public final class C110892b extends C66206a {

    /* renamed from: e */
    public static final C110898b f331701e = new C110898b((C8480h) null);

    /* renamed from: f */
    public static final C110892b f331702f = new C110892b(C110893a.C110894a.f331704a);

    /* renamed from: d */
    public final C110893a f331703d;

    /* renamed from: t11.b$a */
    public static abstract class C110893a {

        /* renamed from: t11.b$a$a */
        public static final class C110894a extends C110893a {

            /* renamed from: a */
            public static final C110894a f331704a = new C110894a();
        }

        /* renamed from: t11.b$a$b */
        public static final class C110895b extends C110893a {
            public C110895b(C111099b.C111100a aVar) {
                C87412m.m108594g(aVar, "renderTarget");
            }
        }

        /* renamed from: t11.b$a$c */
        public static final class C110896c extends C110893a {

            /* renamed from: a */
            public final C111099b.C111100a f331705a;

            public C110896c(C111099b.C111100a aVar) {
                C87412m.m108594g(aVar, "renderTarget");
                this.f331705a = aVar;
            }
        }

        /* renamed from: t11.b$a$d */
        public static final class C110897d extends C110893a {

            /* renamed from: a */
            public static final C110897d f331706a = new C110897d();
        }
    }

    /* renamed from: t11.b$b */
    public static final class C110898b implements C66212f.C15602c<C110892b> {
        public C110898b(C8480h hVar) {
        }
    }

    static {
        new C110892b(C110893a.C110897d.f331706a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110892b(C110893a aVar) {
        super(f331701e);
        C87412m.m108594g(aVar, "strategy");
        this.f331703d = aVar;
    }

    public String toString() {
        return "PreferDispatchStrategyElement()";
    }
}
