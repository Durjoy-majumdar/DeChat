package l82;

import gy3.C8480h;
import gy3.C87412m;
import m82.C109548c;
import wx3.C66206a;
import wx3.C66212f;

/* renamed from: l82.b */
public final class C109284b extends C66206a {

    /* renamed from: e */
    public static final C109290b f327183e = new C109290b((C8480h) null);

    /* renamed from: f */
    public static final C109284b f327184f = new C109284b(C109285a.C109286a.f327187a);

    /* renamed from: g */
    public static final C109284b f327185g = new C109284b(C109285a.C109289d.f327189a);

    /* renamed from: d */
    public final C109285a f327186d;

    /* renamed from: l82.b$a */
    public static abstract class C109285a {

        /* renamed from: l82.b$a$a */
        public static final class C109286a extends C109285a {

            /* renamed from: a */
            public static final C109286a f327187a = new C109286a();
        }

        /* renamed from: l82.b$a$b */
        public static final class C109287b extends C109285a {
            public C109287b(C109548c.C109549a aVar) {
                C87412m.m108594g(aVar, "renderTarget");
            }
        }

        /* renamed from: l82.b$a$c */
        public static final class C109288c extends C109285a {

            /* renamed from: a */
            public final C109548c.C109549a f327188a;

            public C109288c(C109548c.C109549a aVar) {
                C87412m.m108594g(aVar, "renderTarget");
                this.f327188a = aVar;
            }
        }

        /* renamed from: l82.b$a$d */
        public static final class C109289d extends C109285a {

            /* renamed from: a */
            public static final C109289d f327189a = new C109289d();
        }
    }

    /* renamed from: l82.b$b */
    public static final class C109290b implements C66212f.C15602c<C109284b> {
        public C109290b(C8480h hVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109284b(C109285a aVar) {
        super(f327183e);
        C87412m.m108594g(aVar, "strategy");
        this.f327186d = aVar;
    }

    public String toString() {
        return "PreferDispatchStrategyElement()";
    }
}
